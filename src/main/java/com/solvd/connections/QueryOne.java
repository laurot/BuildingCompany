package com.solvd.connections;

import org.apache.logging.log4j.*;

public class QueryOne implements Runnable {

    private String text;
    private final Logger LOGGER = LogManager.getLogger();

    public QueryOne(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        try {
            MockConnection.makeConnection(text);
        } catch (InterruptedException e) {
            LOGGER.warn(e.getMessage());
        }
    }
}
