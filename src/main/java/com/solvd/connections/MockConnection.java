package com.solvd.connections;

import java.util.ArrayList;
import org.apache.logging.log4j.*;

public class MockConnection {

    private static final ConnectionPool connectionPool = ConnectionPool.getInstance();
    private static final Logger LOGGER = LogManager.getLogger();

    public static void Connection() {

        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 1; i < 27; i++) {
            threads.add(new Thread(new QueryOne("Query " + i)));
        }
        threads.stream().forEach(t -> {
            try {
                while (connectionPool.isFull()) {
                    t.join();
                }
                t.start();
            } catch (InterruptedException ie) {
                LOGGER.warn(ie.getMessage());
            }
        });
    }

    public static void makeConnection(String text) throws InterruptedException {

        Connection connection = connectionPool.connect(text);

        Thread.sleep(5000);

        LOGGER.info(connection.getInfo());

        connectionPool.disconnect(text);
    }
}
