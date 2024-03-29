package com.solvd;

import com.solvd.enums.DefaultValues;
import com.solvd.exceptions.*;
import com.solvd.interfaces.*;
import com.solvd.language.*;
import com.solvd.modifiers.Buildings;
import com.solvd.modifiers.Service;
import com.solvd.modifiers.Weather;
import org.apache.logging.log4j.*;
import java.util.Scanner;

public class Menu {

    private final static Logger LOGGER = LogManager.getLogger();
    private static Scanner sc = new Scanner(System.in);
    static IChange change = new Change();
    ILanguage lang = new English();
    Country country = new Country("Argentina", (Double) 1.21);
    ICalculate<ILanguage> calc = new Calculate();
    int l = 0;

    private Buildings com;
    private Buildings ind;
    private Buildings res;
    private Service fas;
    private Service lux;
    private Service nse;
    private Weather dry;
    private Weather wet;
    private Weather nwe;

    public Menu() {
        com = new Buildings(DefaultValues.COMMERCIAL.getPriceMod(), DefaultValues.COMMERCIAL.getTimeMod());
        ind = new Buildings(DefaultValues.INDUSTRIAL.getPriceMod(), DefaultValues.INDUSTRIAL.getTimeMod());
        res = new Buildings(DefaultValues.RESIDENTIAL.getPriceMod(), DefaultValues.RESIDENTIAL.getTimeMod());
        fas = new Service(DefaultValues.FAST.getPriceMod(), DefaultValues.FAST.getTimeMod());
        lux = new Service(DefaultValues.LUXURIOUS.getPriceMod(), DefaultValues.LUXURIOUS.getTimeMod());
        nse = new Service(DefaultValues.NORMALS.getPriceMod(), DefaultValues.NORMALS.getTimeMod());
        dry = new Weather(DefaultValues.DRY.getPriceMod(), DefaultValues.DRY.getTimeMod());
        wet = new Weather(DefaultValues.RAINY.getPriceMod(), DefaultValues.RAINY.getTimeMod());
        nwe = new Weather(DefaultValues.NORMALW.getPriceMod(), DefaultValues.NORMALW.getTimeMod());
    }

    public int mainMenu() {

        int select;
        LOGGER.info("----------------------------------------------");
        LOGGER.info(lang.getCalculateAndText().get("current") + country.getName());
        LOGGER.info("----------------------------------------------");

        lang.getMenuText().stream().forEach(text -> LOGGER.info(text));

        LOGGER.info("----------------------------------------------");

        select = sc.nextInt();

        switch (select) {
            case 0:
                // Exit
                LOGGER.info("Exiting");
                break;

            case 1:
                // Calculate time and cost
                calcu();
                break;

            case 2:
                // Decide which values to check
                checkValues();

                break;
            case 3:
                // Change modifiers
                changeMods();
                break;
            case 4:
                // Change Country
                country = change.changeCountry(lang);

                break;
            case 5:
                // Change language
                if (l == 0) {
                    lang = new Spanish();
                    l = 1;
                } else {
                    lang = new English();
                    l = 0;
                }
                break;

            default:
                // In case of invalid number, ask again
                throw new NotValidOptionException();
        }

        return select;
    }

    private void checkValues() {

        int select;

        lang.getCheckMenu().stream().forEach(text -> LOGGER.info(text));

        select = sc.nextInt();

        switch (select) {
            case 0:
                // Exit
                break;

            case 1:
                // Buildings
                LOGGER.info("----------------------------------------------");
                LOGGER.info(lang.getCheckValues().get("ComercialB"));
                com.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("IndustrialB"));
                ind.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("ResidentialB"));
                res.checkValues(lang);
                LOGGER.info("----------------------------------------------");
                break;
            case 2:
                // Services
                LOGGER.info("----------------------------------------------");
                LOGGER.info(lang.getCheckValues().get("NormalSe"));
                nse.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("FastSe"));
                fas.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("LuxuriousSe"));
                lux.checkValues(lang);
                LOGGER.info("----------------------------------------------");
                break;
            case 3:
                // Weather
                LOGGER.info("----------------------------------------------");
                LOGGER.info(lang.getCheckValues().get("NormalW"));
                nwe.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("DryW"));
                dry.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("RainyW"));
                wet.checkValues(lang);
                LOGGER.info("----------------------------------------------");
                break;
            default:
                // In case of invalid number, ask again
                throw new NotValidOptionException();
        }
    }

    private void changeMods() throws NotValidOptionException, NegativeNumberException {
        int select;

        lang.getCheckMenu().stream().forEach(text -> LOGGER.info(text));

        select = sc.nextInt();

        switch (select) {
            case 0:
                // Back
                break;
            case 1:
                // Buildings
                change.changeBuildings(lang, com, res, ind);
                break;
            case 2:
                // Services
                change.changeServices(lang, nse, fas, lux);
                break;
            case 3:
                // Weather
                change.changeWeather(lang, nwe, dry, wet);
                break;
            default:
                // In case of invalid number, ask again
                throw new NotValidOptionException();
        }
    }

    private void calcu() {

        Input input = new Input();

        int buildType = input.askBuildingType(lang);
        int weather = input.askWeather(lang);
        int serviceType = input.askServiceType(lang);
        int floors = input.askFloors(lang);
        Double sqMeters = input.askSqMetres(lang);

        Buildings calcBuild;
        Service calcServ;
        Weather calcWeath;

        switch (buildType) {
            case 2:
                // Residential
                calcBuild = res;
            case 3:
                // Industrial
                calcBuild = ind;
            default:
                // Commercial
                calcBuild = com;
        }
        switch (weather) {
            case 2:
                // Dry Season
                calcWeath = dry;
            case 3:
                // Rainy Season
                calcWeath = wet;
            default:
                // Normal Season
                calcWeath = nwe;
        }
        switch (serviceType) {
            case 2:
                // Fast Service
                calcServ = fas;
            case 3:
                // Luxurious Service
                calcServ = lux;
            default:
                // Normal Service
                calcServ = nse;
        }
        calc.calculate(country, lang, floors, sqMeters, calcBuild, calcWeath, calcServ);
    }
}
