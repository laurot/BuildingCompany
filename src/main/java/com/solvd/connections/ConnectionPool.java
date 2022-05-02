package com.solvd.connections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConnectionPool {
    private final int limitConnections;
    private final Map<String, Connection> concurrentMap;
    private static ConnectionPool instance;

    private static final Logger LOGGER = LogManager.getLogger();

    private ConnectionPool(int limitThreads) {
        this.limitConnections = limitThreads;
        this.concurrentMap = new ConcurrentHashMap<String, Connection>();
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool(5);
        }
        return instance;
    }

    public synchronized Connection connect(String text) {
        Connection connection = new Connection(text);
        concurrentMap.put(text, connection);
        return connection;

    }

    public Boolean isFull() {
        return getConcurrentMapSize() >= limitConnections;
    }

    public int getConcurrentMapSize() {
        return concurrentMap.size();
    }

    public synchronized void disconnect(String text) {
        LOGGER.debug("Connection finished for " + text);
        concurrentMap.remove(text);
    }
}