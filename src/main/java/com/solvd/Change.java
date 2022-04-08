package com.solvd;

import com.solvd.buildings.*;
import com.solvd.exceptions.CountryNameException;
import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.NotValidPercentageException;
import com.solvd.interfaces.IChange;
import com.solvd.language.ILanguage;
import com.solvd.services.*;
import com.solvd.weather.*;
import java.util.Scanner;
import org.apache.logging.log4j.*;

public class Change implements IChange {

    private Scanner sc = new Scanner(System.in);
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void changeBuildings(ILanguage lang) {

        LOGGER.info(lang.getChangeText().get("menu"));
        LOGGER.info(lang.getChangeText().get("which"));
        LOGGER.info(lang.getChangeText().get("comercial"));
        LOGGER.info(lang.getChangeText().get("residential"));
        LOGGER.info(lang.getChangeText().get("industrial"));
        LOGGER.info(lang.getChangeText().get("exit"));
        LOGGER.info(lang.getChangeText().get("select"));
        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
                // Exit
                LOGGER.info("Exiting");
                System.exit(0);

            case 1:
                // Comercial
                Comercial.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                Comercial.changePrice(newPrice);
                Comercial.changeTime(newTime);

                break;
            case 2:
                // Residential
                Residential.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                Residential.changePrice(newPrice);
                Residential.changeTime(newTime);

                break;
            case 3:
                // Industrial
                Industrial.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                Industrial.changePrice(newPrice);
                Industrial.changeTime(newTime);
                break;
            default:
                // In case of invalid number, ask again
                throw new NotValidOptionException();
        }
    }

    @Override
    public void changeServices(ILanguage lang) throws NotValidOptionException {

        LOGGER.info(lang.getChangeText().get("menu"));
        LOGGER.info(lang.getChangeText().get("which"));
        LOGGER.info(lang.getChangeText().get("normals"));
        LOGGER.info(lang.getChangeText().get("fasts"));
        LOGGER.info(lang.getChangeText().get("luxuriouss"));
        LOGGER.info(lang.getChangeText().get("exit"));
        LOGGER.info(lang.getChangeText().get("select"));
        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
                // Exit
                LOGGER.info("Exiting");
                System.exit(0);

            case 1:
                // Normal Service
                NormalService.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                NormalService.changePrice(newPrice);
                NormalService.changeTime(newTime);
                break;
            case 2:
                // Fast Service
                FastService.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                FastService.changePrice(newPrice);
                FastService.changeTime(newTime);

                break;
            case 3:

                // Luxurious Service
                LuxuriousService.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                LuxuriousService.changePrice(newPrice);
                LuxuriousService.changeTime(newTime);

                break;
            default:
                // In case of invalid number, ask again
                throw new NotValidOptionException();
        }

    }

    @Override
    public void changeWeather(ILanguage lang) throws NotValidOptionException, NegativeNumberException {

        LOGGER.info(lang.getChangeText().get("menu"));
        LOGGER.info(lang.getChangeText().get("which"));
        LOGGER.info(lang.getChangeText().get("normalw"));
        LOGGER.info(lang.getChangeText().get("rainyw"));
        LOGGER.info(lang.getChangeText().get("dryw"));
        LOGGER.info(lang.getChangeText().get("exit"));
        LOGGER.info(lang.getChangeText().get("select"));

        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
                // Exit
                LOGGER.info("Exiting");
                System.exit(0);

            case 1:
                // Normal Season
                NormalSeason.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                if (newPrice <= 0)
                    throw new NegativeNumberException();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                NormalSeason.changePrice(newPrice);
                NormalSeason.changeTime(newTime);
                break;
            case 2:
                // Rain Season
                RainSeason.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                RainSeason.changePrice(newPrice);
                RainSeason.changeTime(newTime);

                break;
            case 3:
                // Dry Season
                DrySeason.checkValues(lang);
                LOGGER.info(lang.getChangeText().get("newprice"));
                newPrice = sc.nextInt();
                LOGGER.info(lang.getChangeText().get("newtime"));
                newTime = sc.nextInt();
                DrySeason.changePrice(newPrice);
                DrySeason.changeTime(newTime);
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
        float countryRate = (sc.nextFloat() / 100) + 1;
        if (countryRate < 1 || countryRate > 2)
            throw new NotValidPercentageException();
        Country country = new Country(countryName, countryRate);
        return country;
        }catch(CountryNameException cne){
            LOGGER.warn("Not a valide name");
            return changeCountry(lang);
        }catch(NotValidPercentageException nvpe){
            LOGGER.warn("Not a valid percentage");
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