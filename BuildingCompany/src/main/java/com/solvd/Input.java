package com.solvd;

import java.util.Scanner;
import org.apache.logging.log4j.*;
import com.solvd.interfaces.IIn;

public class Input implements IIn {
    static Scanner sc = new Scanner(System.in);

    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public int askBuildingType() {
        int select;

        LOGGER.info("What kind of building?");
        LOGGER.info("1. Comercial");
        LOGGER.info("2. Residential");
        LOGGER.info("3. Industrial");
        LOGGER.info("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 1, 2, 3:
                //Accepted buildings
                break;
            default:
                //In case of invalid number, ask again
                LOGGER.warn("Not valid");
                askBuildingType();
        }
        return select;
    }

    @Override
    public int askServiceType() {
        int select;

        LOGGER.info("What kind of service?");
        LOGGER.info("1. Normal");
        LOGGER.info("2. Fast");
        LOGGER.info("3. Luxurious");
        LOGGER.info("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 1, 2, 3:
                //Accepted Services
                break;
            default:
                //In case of invalid number, ask again
                LOGGER.warn("Not valid");
                askServiceType();
        }

        return select;
    }

    @Override
    public int askWeather() {
        int select;

        LOGGER.info("What kind of weather?");
        LOGGER.info("1. Normal Season");
        LOGGER.info("2. Rainy Season");
        LOGGER.info("3. Dry Season");
        LOGGER.info("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 1, 2, 3:
                //Accepted Seasons
                break;
            default:
                //In case of invalid number, ask again
                LOGGER.warn("Not valid");
                askWeather();
        }

        return select;
    }

    @Override
    public float askSqMetres() {

        int sqMetres;
        LOGGER.info("How many square metres?");
        sqMetres = sc.nextInt();

        return sqMetres;
    }

    @Override
    public int askFloors() {

        int floors;
        LOGGER.info("How many floors?");
        floors = sc.nextInt();

        return floors;
    }
}
