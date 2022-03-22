package main;
import java.util.Scanner;

import interfaces.IIn;

public class Input  implements IIn{
    static Scanner sc = new Scanner(System.in);

    @Override
    public int askBuildingType() {
        int select;

        System.out.println("What kind of building?");
        System.out.println("1. Comercial");
        System.out.println("2. Residential");
        System.out.println("3. Industrial");
        System.out.println("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 1,2,3:
                //Accepted buildings
                break;
            default:
                //In case of invalid number, ask again
                System.out.println("Not valid");
                askBuildingType();
        }
        return select;
    }

    @Override
    public int askServiceType(){
        int select;

        System.out.println("What kind of service?");
        System.out.println("1. Normal");
        System.out.println("2. Fast");
        System.out.println("3. Luxurious");
        System.out.println("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 1,2,3:
                //Accepted Services
                break;
            default:
                //In case of invalid number, ask again
                System.out.println("Not valid");
                askServiceType();
        }

        return select;
    }

    @Override
    public int askWeather(){
        int select;

        System.out.println("What kind of weather?");
        System.out.println("1. Normal Season");
        System.out.println("2. Rainy Season");
        System.out.println("3. Dry Season");
        System.out.println("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 1,2,3:
                //Accepted Seasons
                break;
            default:
                //In case of invalid number, ask again
                System.out.println("Not valid");
                askWeather();
        }

        return select;
    }

    @Override
    public float askSqMetres() {

        int sqMetres;
        System.out.println("How many square metres?");
        sqMetres = sc.nextInt();

        return sqMetres;
    }

    @Override
    public int askFloors() {

        int floors;
        System.out.println("How many floors?");
        floors = sc.nextInt();

        return floors;
    }
}
