package com.solvd;

import org.apache.logging.log4j.*;

public class Main {
    public static void main(String[] args) {
        final Logger LOGGER = LogManager.getLogger();
        try {
            Menu menu1 = new Menu();
            int value;
            do {

                value = menu1.mainMenu();

            } while (value != 0);

        } catch (Exception e) {
            LOGGER.error("Something went wrong");
        }
    }
}
