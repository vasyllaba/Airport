package com.solvd.airoport.threads.pool;

import org.apache.log4j.Logger;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PoolMain {
    private static final Logger LOGGER = Logger.getLogger(PoolMain.class);

    public static void main(String[] args) {
        ConnectorMock myDB = new ConnectorMock("myURL", new CopyOnWriteArrayList<String>());
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i <= 6; i++) {
            LOGGER.debug("create " + i + " operation");
            executorService.execute(new MyConnectionService("Operation " + i, myDB));
        }
        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LOGGER.debug("Final data " + myDB.getData());
    }
}

class MyConnectionService extends Thread{
    private static final Logger LOGGER = Logger.getLogger(MyConnectionService.class);
    String data;
    ConnectorMock connectorMock;
    public MyConnectionService(String data, ConnectorMock connectorMock){
        LOGGER.debug("create new connection service");
        this.data = data;
        this.connectorMock = connectorMock;
    }

    @Override
    public void run() {
        LOGGER.debug("start saving data: " + data);
        ConnectorMock conn = connectorMock.getConnection();
        conn.save(data);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
