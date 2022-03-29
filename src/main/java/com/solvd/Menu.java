package com.solvd;
import com.solvd.buildings.*;
import com.solvd.exceptions.*;
import com.solvd.interfaces.*;
import com.solvd.services.*;
import com.solvd.weather.*;
import org.apache.logging.log4j.*;
import java.util.Scanner;

public class Menu {

    private final static Logger LOGGER = LogManager.getLogger();

    Country country = new Country("Argentina", (float) 1.21);

    static Scanner sc = new Scanner(System.in);
    
    static IChange change = new Change();
    ICalculate calc = new Calculate();

    public int mainMenu() {

        int select;
        LOGGER.info("----------------------------------------------");
        LOGGER.info("Menu:");
        LOGGER.info("1. Calculate costs");
        LOGGER.info("2. Check default values");
        LOGGER.info("3. Change default values");
        LOGGER.info("4. Change country (Currently in " + country.getName() + ")");
        LOGGER.info("0. Exit");
        LOGGER.info("select 0-4:");
        LOGGER.info("----------------------------------------------");
        try{
        select = sc.nextInt();

        switch (select) {
            case 0:
                // Exit
                LOGGER.info("Exiting");
                break;

            case 1:
                //Calculate time and cost
                calc.calculate(country);
                break;

            case 2:
                //Decide which values to check
                checkValues();

                break;
            case 3:
                //Change modifiers
                changeMods();
                break;
            case 4:
                //Change Country 
                country = change.changeCountry();
                
                break;
            default:
                //In case of invalid number, ask again
                throw new NotValidOptionException();
        }
        
        return select;
        } catch (CountryNameException e) {
            LOGGER.warn("Countries must not have numbers in the name");
        } catch (NotValidPercentageException a) {
            LOGGER.warn("That's not a valid percentage (0 - 100");
        } catch (NotValidOptionException o) {
            LOGGER.warn("That's not one of the valid options");
        } catch (NegativeNumberException n) {
            LOGGER.warn("Negative numbers are not accepted in that field");
        } catch (TooManyFloorsException t) {
            LOGGER.warn("This company can only build up to 26 floors");
        }
        
        
        return 1;
    }

    private void checkValues() throws NotValidOptionException {

        int select;

        LOGGER.info("Menu:");
        LOGGER.info("Which values do you want to check?");
        LOGGER.info("1. Buildings");
        LOGGER.info("2. Services");
        LOGGER.info("3. Weather modifiers");
        LOGGER.info("0. Exit");
        LOGGER.info("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 0:
                // Exit
                break;

            case 1:
                //Buildings
                LOGGER.info("----------------------------------------------");
                LOGGER.info("Comercial buildings: ");
                Comercial.checkValues();
                LOGGER.info("Industrial buildings: ");
                Industrial.checkValues();
                LOGGER.info("Residential buildings: ");
                Residential.checkValues();
                LOGGER.info("----------------------------------------------");

                break;
            case 2:
                //Services
                LOGGER.info("----------------------------------------------");
                LOGGER.info("Normal Service: ");
                NormalService.checkValues();
                LOGGER.info("Fast Service: ");
                FastService.checkValues();
                LOGGER.info("Luxurious Service: ");
                LuxuriousService.checkValues();
                LOGGER.info("----------------------------------------------");

                break;
            case 3:
                //Weather
                LOGGER.info("----------------------------------------------");
                LOGGER.info("Normal Season: ");
                NormalSeason.checkValues();
                LOGGER.info("Dry Season: ");
                DrySeason.checkValues();
                LOGGER.info("Rain Season: ");
                RainSeason.checkValues();
                LOGGER.info("----------------------------------------------");

                break;
            default:
                //In case of invalid number, ask again
                throw new NotValidOptionException();
        }
    }

    private void changeMods() throws NotValidOptionException, NegativeNumberException {
        int select;

        LOGGER.info("Menu:");
        LOGGER.info("Which values do you want to change?");
        LOGGER.info("1. Buildings");
        LOGGER.info("2. Services");
        LOGGER.info("3. Weather ");
        LOGGER.info("0. Back");
        LOGGER.info("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 0:
                // Back
                break;
            case 1:
                //Buildings
                change.changeBuildings();
                break;
            case 2:
                //Services
                change.changeServices();
                break;
            case 3:
                //Weather
                change.changeWeather();
                break;
            default:
                //In case of invalid number, ask again
                throw new NotValidOptionException();
        }
    }
}