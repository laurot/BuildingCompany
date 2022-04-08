package com.solvd;

public class Main {
    public static void main(String[] args) {
        App.Text();
        Menu menu1 = new Menu();
        int value;
        do {

            value = menu1.mainMenu();

        } while (value != 0);

    }
}
