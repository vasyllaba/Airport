package com.solvd.airoport.threads.pool;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectorMock {
    private String url;
    private String connection;
    private CopyOnWriteArrayList dbMock;

    public ConnectorMock(String url, CopyOnWriteArrayList dbMock) {
        this.url = url;
        connection = "Connection success";
        this.dbMock = dbMock;
    }

    public ConnectorMock getConnection() {
        return this;
    }

    public void save(String data){
        dbMock.add(data);
    }

    public CopyOnWriteArrayList getData(){
        return dbMock;
    }
}
