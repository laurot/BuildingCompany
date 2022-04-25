package com.solvd;

import com.solvd.buildings.*;
import com.solvd.exceptions.*;
import com.solvd.interfaces.IChange;
import com.solvd.language.ILanguage;
import com.solvd.services.*;
import com.solvd.weather.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import org.apache.logging.log4j.*;

public class Change implements IChange {

    private Scanner sc = new Scanner(System.in);
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void changeBuildings(ILanguage lang, Buildings com,Buildings res,Buildings ind) {

        LOGGER.info(lang.getChangeText().get("menu"));
        LOGGER.info(lang.getChangeText().get("which"));
        LOGGER.info(lang.getChangeText().get("comercial"));
        LOGGER.info(lang.getChangeText().get("residential"));
        LOGGER.info(lang.getChangeText().get("industrial"));
        LOGGER.info(lang.getChangeText().get("exit"));
        LOGGER.info(lang.getChangeText().get("select"));
        double newTime;
        double newPrice;
        switch (sc.nextInt()) {
            case 0:
                // Exit
                LOGGER.info("Exiting");
                System.exit(0);

            case 1:
                // Comercial
                com.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                com.changePrice(newPrice);
                com.changeTime(newTime);

                break;
            case 2:
                // Residential
                res.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                res.changePrice(newPrice);
                res.changeTime(newTime);

                break;
            case 3:
                // Industrial
                ind.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                ind.changePrice(newPrice);
                ind.changeTime(newTime);
                break;
            default:
                // In case of invalid number, ask again
                throw new NotValidOptionException();
        }
    }

    @Override
    public void changeServices(ILanguage lang, Service nse, Service fas, Service lux){

        LOGGER.info(lang.getChangeText().get("menu"));
        LOGGER.info(lang.getChangeText().get("which"));
        LOGGER.info(lang.getChangeText().get("normals"));
        LOGGER.info(lang.getChangeText().get("fasts"));
        LOGGER.info(lang.getChangeText().get("luxuriouss"));
        LOGGER.info(lang.getChangeText().get("exit"));
        LOGGER.info(lang.getChangeText().get("select"));
        double newTime;
        Double newPrice;
        switch (sc.nextInt()) {
            case 0:
                // Exit
                LOGGER.info("Exiting");
                System.exit(0);

            case 1:
                // Normal Service
                nse.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                nse.changePrice(newPrice);
                nse.changeTime(newTime);
                break;
            case 2:
                // Fast Service
                fas.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                fas.changePrice(newPrice);
                fas.changeTime(newTime);

                break;
            case 3:

                // Luxurious Service
                lux.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                lux.changePrice(newPrice);
                lux.changeTime(newTime);

                break;
            default:
                // In case of invalid number, ask again
                throw new NotValidOptionException();
        }

    }

    @Override
    public void changeWeather(ILanguage lang, Weather nwe, Weather dry, Weather wet) {

        LOGGER.info(lang.getChangeText().get("menu"));
        LOGGER.info(lang.getChangeText().get("which"));
        LOGGER.info(lang.getChangeText().get("normalw"));
        LOGGER.info(lang.getChangeText().get("rainyw"));
        LOGGER.info(lang.getChangeText().get("dryw"));
        LOGGER.info(lang.getChangeText().get("exit"));
        LOGGER.info(lang.getChangeText().get("select"));

        double newTime;
        Double newPrice;
        switch (sc.nextInt()) {
            case 0:
                // Exit
                LOGGER.info("Exiting");
                System.exit(0);

            case 1:
                // Normal Season
                nwe.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                if (newPrice <= 0)
                    throw new NegativeNumberException();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                nwe.changePrice(newPrice);
                nwe.changeTime(newTime);
                break;
            case 2:
                // Rain Season
                wet.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                wet.changePrice(newPrice);
                wet.changeTime(newTime);

                break;
            case 3:
                // Dry Season
                dry.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextDouble();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextDouble();
                dry.changePrice(newPrice);
                dry.changeTime(newTime);
                break;
            default:
                // In case of invalid number, ask again
                throw new NotValidOptionException();
        }

    }

    @Override
    public Country changeCountry(ILanguage lang){
        try{
            LOGGER.info(lang.getChangeText().get("whatcountry"));
            String countryName = sc.next();
            if (hasNumbers(countryName))
                throw new CountryNameException();
            LOGGER.info(lang.getChangeText().get("newtax"));
            Double countryRate = (sc.nextDouble() / 100) + 1;
            if (countryRate < 1 || countryRate > 2)
                throw new NotValidPercentageException();
            //Country country = new Country(countryName, countryRate);
            //return country;

            //Reflection
            Constructor<?>[] cons = Country.class.getDeclaredConstructors();
            Country count = (Country) cons[0].newInstance(countryName, countryRate);
            return count;
            
        }catch(CountryNameException cne){
            LOGGER.warn("Not a valide name");
            return changeCountry(lang);
        }catch(NotValidPercentageException nvpe){
            LOGGER.warn("Not a valid percentage");
            return changeCountry(lang);
        }catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException e) {
            e.printStackTrace();
            return changeCountry(lang);
        }

    }

    private boolean hasNumbers(String string) {
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        if (sb.toString() != "")
            return true;
        return false;
    }
}