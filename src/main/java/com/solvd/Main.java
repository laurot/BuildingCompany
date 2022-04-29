package com.solvd;

//import com.solvd.connections.MockConnection;

public class Main {
    public static void main(String[] args) {
        //App.fileReadToFile();
        //MockConnection.Connection();
        Menu menu1 = new Menu();
        int value;
        do {

            value = menu1.mainMenu();

        } while (value != 0); 

    }
}
