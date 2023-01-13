package com.solvd.airoport.threads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ConnectionPool {
    private final String databaseUrl;
    private final String userName;
    private final String password;
    private final int maxPoolSize;
    private int connectionNumber;
    Stack<Connection> freePool = new Stack<>();
    Set<Connection> occupiedPool = new HashSet<>();

    public ConnectionPool(String databaseUrl, String userName, String password, int maxPoolSize) {
        this.databaseUrl = databaseUrl;
        this.userName = userName;
        this.password = password;
        this.maxPoolSize = maxPoolSize;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public synchronized Connection getConnection() throws SQLException {
        Connection conn = null;
        if (isFull()) {
            throw new SQLException("The connection pool is full.");
        }
        conn = getConnectionFromPool();
        if (conn == null) {
            conn = createNewConnectionForPool();
        }
        conn = makeAvailable(conn);
        return conn;
    }

    private Connection createNewConnectionForPool() throws SQLException{
        Connection connection = creatNewConnection();
        connectionNumber++;
        occupiedPool.add(connection);
        return connection;
    }

    private Connection creatNewConnection() throws SQLException{
        Connection connection = null;
        connection = DriverManager.getConnection(databaseUrl, userName, password);
        return connection;
    }

    private Connection getConnectionFromPool(){
        Connection connection = null;
        if (freePool.size() > 0) {
            connection = freePool.pop();
            occupiedPool.add(connection);
        }
        return connection;
    }

    private Connection makeAvailable(Connection connection) throws  SQLException{
        if(isConnectAvailable(connection)){
            return connection;
        }
        occupiedPool.remove(connection);
        connectionNumber--;
        connection.close();
        connection = creatNewConnection();
        occupiedPool.add(connection);
        connectionNumber++;
        return connection;
    }

    private synchronized boolean isFull(){
        return ((freePool.size() == 0) && (connectionNumber >= maxPoolSize));
    }

    private boolean isConnectAvailable(Connection connection){
        try(Statement st = connection.createStatement()){
            st.executeQuery("select 1");
            return true;
        }
        catch (SQLException e){
            return false;
        }
    }

}
