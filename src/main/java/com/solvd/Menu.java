package com.solvd;
import com.solvd.buildings.*;
import com.solvd.exceptions.*;
import com.solvd.interfaces.*;
import com.solvd.services.*;
import com.solvd.weather.*;
import com.solvd.language.*;
import org.apache.logging.log4j.*;
import java.util.Scanner;

public class Menu {

    private final static Logger LOGGER = LogManager.getLogger();
    static Scanner sc = new Scanner(System.in);
    static IChange change = new Change();
    ILanguage lang = new English();
    Country country = new Country("Argentina", (float) 1.21);
    ICalculate calc = new Calculate();
    int l = 0;
    public int mainMenu() {

        
        
        int select;
        LOGGER.info("----------------------------------------------");
        LOGGER.info(lang.getCalculateAndText().get("current") + country.getName());
        LOGGER.info("----------------------------------------------");
        for (int i = 0; i < lang.getMenuText().size()-1; i++) {
            LOGGER.info(lang.getMenuText().get(i));
        }
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
                calc.calculate(country,lang);
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
                country = change.changeCountry(lang);
                
                break;
            case 5:
                //Change language
                if (l==0) {
                    lang = new Spanish();
                    l = 1;
                }else{
                    lang = new English();
                    l = 0;
                }
                break;
                
            default:
                //In case of invalid number, ask again
                throw new NotValidOptionException();
        }
        
        return select;
        } catch (CountryNameException e) {
            LOGGER.warn(lang.getExceptions().get("CountryName"));
        } catch (NotValidPercentageException a) {
            LOGGER.warn(lang.getExceptions().get("Percentage"));
        } catch (NotValidOptionException o) {
            LOGGER.warn(lang.getExceptions().get("Option"));
        } catch (NegativeNumberException n) {
            LOGGER.warn(lang.getExceptions().get("Negative"));
        } catch (TooManyFloorsException t) {
            LOGGER.warn(lang.getExceptions().get("Floors"));
        }
        
        
        return 1;
    }

    private void checkValues() throws NotValidOptionException {

        int select;

        for (int i = 0; i < lang.getCheckMenu().size()-1; i++) {
            LOGGER.info(lang.getCheckMenu().get(i));
        }
        select = sc.nextInt();

        switch (select) {
            case 0:
                // Exit
                break;

            case 1:
                //Buildings
                LOGGER.info("----------------------------------------------");
                LOGGER.info(lang.getCheckValues().get("ComercialB"));
                Comercial.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("IndustrialB"));
                Industrial.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("ResidentialB"));
                Residential.checkValues(lang);
                LOGGER.info("----------------------------------------------");

                break;
            case 2:
                //Services
                LOGGER.info("----------------------------------------------");
                LOGGER.info(lang.getCheckValues().get("NormalSe"));
                NormalService.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("FastSe"));
                FastService.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("LuxuriousSe"));
                LuxuriousService.checkValues(lang);
                LOGGER.info("----------------------------------------------");

                break;
            case 3:
                //Weather
                LOGGER.info("----------------------------------------------");
                LOGGER.info(lang.getCheckValues().get("NormalW"));
                NormalSeason.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("DryW"));
                DrySeason.checkValues(lang);
                LOGGER.info(lang.getCheckValues().get("RainyW"));
                RainSeason.checkValues(lang);
                LOGGER.info("----------------------------------------------");

                break;
            default:
                //In case of invalid number, ask again
                throw new NotValidOptionException();
        }
    }

    private void changeMods() throws NotValidOptionException, NegativeNumberException {
        int select;

        for (int i = 0; i < lang.getCheckMenu().size()-1; i++) {
            LOGGER.info(lang.getCheckMenu().get(i));
        }
        select = sc.nextInt();

        switch (select) {
            case 0:
                // Back
                break;
            case 1:
                //Buildings
                change.changeBuildings(lang);
                break;
            case 2:
                //Services
                change.changeServices(lang);
                break;
            case 3:
                //Weather
                change.changeWeather(lang);
                break;
            default:
                //In case of invalid number, ask again
                throw new NotValidOptionException();
        }
    }
}
