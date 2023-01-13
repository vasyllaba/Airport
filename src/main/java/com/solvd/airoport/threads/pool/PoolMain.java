package com.solvd.airoport.threads.pool;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolMain {
    public static void main(String[] args) {
        ConnectorMock myDB = new ConnectorMock("myURL", new CopyOnWriteArrayList<String>());
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i <= 6; i++) {
            executorService.execute(new MyConnectionService("Operation " + i, myDB));
        }
        System.out.println(myDB.getData());
        executorService.shutdown();
    }
}

class MyConnectionService extends Thread{
    String data;
    ConnectorMock connectorMock;
    public MyConnectionService(String data, ConnectorMock connectorMock){
        this.data = data;
        this.connectorMock = connectorMock;
    }

    @Override
    public void run() {
        ConnectorMock conn = connectorMock.getConnection();
        conn.save(data);
        System.out.println("Thread " + data);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
