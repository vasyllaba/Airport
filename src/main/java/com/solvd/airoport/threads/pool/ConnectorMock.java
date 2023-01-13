package com.solvd.airoport.threads.pool;

import org.apache.log4j.Logger;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectorMock {
    private static final Logger LOGGER = Logger.getLogger(ConnectorMock.class);

    private String url;
    private String connection;
    private CopyOnWriteArrayList dbMock;

    public ConnectorMock(String url, CopyOnWriteArrayList dbMock) {
        LOGGER.info("create new connection");
        this.url = url;
        connection = "Connection success";
        this.dbMock = dbMock;
    }

    public ConnectorMock getConnection() {
        LOGGER.info("get connection");
        return this;
    }

    public void save(String data){
        LOGGER.info("save " + data + " to dbMock");
        dbMock.add(data);
    }

    public CopyOnWriteArrayList getData(){
        LOGGER.info("get data");
        return dbMock;
    }
}
