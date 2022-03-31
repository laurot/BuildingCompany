package com.solvd;

import java.util.Scanner;
import org.apache.logging.log4j.*;

import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.TooManyFloorsException;
import com.solvd.interfaces.IIn;
import com.solvd.language.ILanguage;

public class Input implements IIn <Float>{
    static Scanner sc = new Scanner(System.in);
    private static final Logger LOGGER = LogManager.getLogger();
    
    @Override
    public int askBuildingType(ILanguage lang) throws NotValidOptionException {
        int select;

        LOGGER.info(lang.getInputText().get("buildMenu"));
        LOGGER.info(lang.getChangeText().get("comercial"));
        LOGGER.info(lang.getChangeText().get("residential"));
        LOGGER.info(lang.getChangeText().get("industrial"));
        LOGGER.info(lang.getChangeText().get("select"));
        select = sc.nextInt();

        if (select > 3 || select < 1) throw new NotValidOptionException();
        
        return select;
    }

    @Override
    public int askServiceType(ILanguage lang) throws NotValidOptionException {
        int select;

        LOGGER.info(lang.getInputText().get("serviceMenu"));
        LOGGER.info(lang.getChangeText().get("normals"));
        LOGGER.info(lang.getChangeText().get("fasts"));
        LOGGER.info(lang.getChangeText().get("luxuriouss"));
        LOGGER.info(lang.getChangeText().get("select"));
        select = sc.nextInt();

        if (select > 3 || select < 1) throw new NotValidOptionException();

        return select;
    }

    @Override
    public int askWeather(ILanguage lang) throws NotValidOptionException {
        int select;

        LOGGER.info(lang.getInputText().get("weatherMenu"));
        LOGGER.info(lang.getChangeText().get("normalw"));
        LOGGER.info(lang.getChangeText().get("rainyw"));
        LOGGER.info(lang.getChangeText().get("dryw"));
        LOGGER.info(lang.getChangeText().get("select"));
        select = sc.nextInt();


        if (select > 3 || select < 1) throw new NotValidOptionException();


        return select;
    }

    @Override
    public Float askSqMetres(ILanguage lang) throws NegativeNumberException {

        Float sqMetres;
        LOGGER.info(lang.getInputText().get("sqMetres"));
        sqMetres = sc.nextFloat();
        if (sqMetres < 1) throw new NegativeNumberException();
        return sqMetres;
    }

    @Override
    public int askFloors(ILanguage lang) throws NegativeNumberException, TooManyFloorsException {

        int floors;
        LOGGER.info(lang.getInputText().get("floors"));
        floors = sc.nextInt();
        if (floors < 1) throw new NegativeNumberException();
        if (floors > 26) throw new TooManyFloorsException();
        return floors;
    }
}
