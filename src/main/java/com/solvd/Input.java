package com.solvd;

import java.util.Scanner;
import org.apache.logging.log4j.*;

import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.TooManyFloorsException;
import com.solvd.interfaces.IIn;

public class Input implements IIn <Float>{
    static Scanner sc = new Scanner(System.in);
    private static final Logger LOGGER = LogManager.getLogger();
    
    @Override
    public int askBuildingType() throws NotValidOptionException {
        int select;

        LOGGER.info("What kind of building?");
        LOGGER.info("1. Comercial");
        LOGGER.info("2. Residential");
        LOGGER.info("3. Industrial");
        LOGGER.info("select 0-3:");
        select = sc.nextInt();

        if (select >= 3 || select <= 1) throw new NotValidOptionException();
        
        return select;
    }

    @Override
    public int askServiceType() throws NotValidOptionException {
        int select;

        LOGGER.info("What kind of service?");
        LOGGER.info("1. Normal");
        LOGGER.info("2. Fast");
        LOGGER.info("3. Luxurious");
        LOGGER.info("select 0-3:");
        select = sc.nextInt();

        if (select >= 3 || select <= 1) throw new NotValidOptionException();

        return select;
    }

    @Override
    public int askWeather() throws NotValidOptionException {
        int select;

        LOGGER.info("What kind of weather?");
        LOGGER.info("1. Normal Season");
        LOGGER.info("2. Rainy Season");
        LOGGER.info("3. Dry Season");
        LOGGER.info("select 0-3:");
        select = sc.nextInt();


        if (select >= 3 || select <= 1) throw new NotValidOptionException();


        return select;
    }

    @Override
    public Float askSqMetres() throws NegativeNumberException {

        Float sqMetres;
        LOGGER.info("How many square metres?");
        sqMetres = sc.nextFloat();
        if (sqMetres < 1) throw new NegativeNumberException();
        return sqMetres;
    }

    @Override
    public int askFloors() throws NegativeNumberException, TooManyFloorsException {

        int floors;
        LOGGER.info("How many floors?");
        floors = sc.nextInt();
        if (floors < 1) throw new NegativeNumberException();
        if (floors > 26) throw new TooManyFloorsException();
        return floors;
    }
}
