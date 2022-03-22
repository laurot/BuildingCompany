package main.java.com.solvd;
import java.util.Scanner;

import main.java.com.solvd.buildings.*;
import main.java.com.solvd.interfaces.*;
import main.java.com.solvd.services.*;
import main.java.com.solvd.weather.*;

public class Menu{

    Country country = new Country("Argentina", (float) 1.21);
    
    static Scanner sc = new Scanner(System.in);
    static IChange change = new Change();
    ICalculate calc = new Calculate();
    public void mainMenu(){
        
        int select;
        IIn input = new Input();
        System.out.println("Menu:");
        System.out.println("1. Calculate costs");
        System.out.println("2. Check default values");
        System.out.println("3. Change default values");
        System.out.println("4. Change country (Currently in "+ country.getName()+")");
        System.out.println("0. Exit");
        System.out.println("select 0-4:");
        select = sc.nextInt();

        switch (select) {
            case 0:
            // Exit
            System.out.println("Exiting");
            System.exit(0);

            case 1:
                //Calculate time and cost
                calc.calculate(input.askBuildingType(), input.askWeather(), input.askServiceType(),
                                input.askFloors(), input.askSqMetres(), country);
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

                System.out.println("What country?");
                String countryName = sc.next();
                System.out.println("Enter tax Rate (in percentage)");
                float countryRate = (sc.nextFloat()/100)+1;
                country = new Country(countryName, countryRate);
                
            default:
                //In case of invalid number, ask again
                System.out.println("Not valid");
                mainMenu();
        }
    }

    private void checkValues(){

        int select;

        System.out.println("Menu:");
        System.out.println("Which values do you want to check?");
        System.out.println("1. Buildings");
        System.out.println("2. Services");
        System.out.println("3. Weather modifiers");
        System.out.println("0. Exit");
        System.out.println("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 0:
                // Exit
                break;

            case 1:
                //Buildings
                System.out.println("----------------------------------------------");
                System.out.println("Comercial buildings: ");
                Comercial.checkValues();
                System.out.println("Industrial buildings: ");
                Industrial.checkValues();
                System.out.println("Residential buildings: ");
                Residential.checkValues();
                System.out.println("----------------------------------------------");

                break;
            case 2:
                //Services
                System.out.println("----------------------------------------------");
                System.out.println("Normal Service: ");
                NormalService.checkValues();
                System.out.println("Fast Service: ");
                FastService.checkValues();
                System.out.println("Luxurious Service: ");
                LuxuriousService.checkValues();
                System.out.println("----------------------------------------------");

                break;
            case 3:
                //Weather
                System.out.println("----------------------------------------------");
                System.out.println("Normal Season: ");
                NormalSeason.checkValues();
                System.out.println("Dry Season: ");
                DrySeason.checkValues();
                System.out.println("Rain Season: ");
                RainSeason.checkValues();
                System.out.println("----------------------------------------------");

                break;
            default:
                //In case of invalid number, ask again
                System.out.println("Not valid");
                mainMenu();
        }
    }

    private void changeMods() {
        int select;

        System.out.println("Menu:");
        System.out.println("Which values do you want to change?");
        System.out.println("1. Buildings");
        System.out.println("2. Services");
        System.out.println("3. Weather ");
        System.out.println("0. Back");
        System.out.println("select 0-3:");
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
                System.out.println("Not valid");
                mainMenu();
        }
    }
}
