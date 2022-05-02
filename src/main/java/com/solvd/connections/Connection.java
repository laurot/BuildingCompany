package com.solvd.connections;

public class Connection {

    private String name;

    public Connection(String name) {
        this.name = name;
        authorize();
        connect();
    }

    public String getInfo() {
        return name;
    }

    private void authorize() {
    }

    private void connect() {
    }
}
