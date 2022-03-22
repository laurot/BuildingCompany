import interfaces.IChange;
import java.util.Scanner;
import services.*;
import buildings.*;
import weather.*;

public class Change implements IChange{

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void changeBuildings() {
        
        System.out.println("Menu:");
        System.out.println("Which values do you want to change?");
        System.out.println("1. Residential");
        System.out.println("2. Comercial");
        System.out.println("3. Industrial");
        System.out.println("0. Exit");
        System.out.println("select 0-3:");
        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
            // Exit
            System.out.println("Exiting");
            System.exit(0);

            case 1:
                //Residential
                Residential.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                Residential.changePrice(newPrice);
                Residential.changeTime(newTime);
                break;
            case 2:
                //Comercial
                Comercial.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                Comercial.changePrice(newPrice);
                Comercial.changeTime(newTime);

                break;
            case 3:
                //Industrial
                Industrial.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                Industrial.changePrice(newPrice);
                Industrial.changeTime(newTime);
                break;
            default:
                //In case of invalid number, ask again
                System.out.println("Not valid");
                changeBuildings();
        }
    }

    @Override
    public void changeServices() {

        System.out.println("Menu:");
        System.out.println("Which values do you want to change?");
        System.out.println("1. Normal Service");
        System.out.println("2. Fast Service");
        System.out.println("3. Luxurious Service");
        System.out.println("0. Exit");
        System.out.println("select 0-3:");
        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
            // Exit
            System.out.println("Exiting");
            System.exit(0);

            case 1:
                //Normal Service
                NormalService.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                NormalService.changePrice(newPrice);
                NormalService.changeTime(newTime);
                break;
            case 2:
                //Fast Service
                FastService.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                FastService.changePrice(newPrice);
                FastService.changeTime(newTime);

                break;
            case 3:
                
                //Luxurious Service
                LuxuriousService.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                LuxuriousService.changePrice(newPrice);
                LuxuriousService.changeTime(newTime);

                break;
            default:
                //In case of invalid number, ask again
                System.out.println("Not valid");
                changeServices();
        }
        
    }

    @Override
    public void changeWeather() {
        System.out.println("Menu:");
        System.out.println("Which values do you want to change?");
        System.out.println("1. Normal Season");
        System.out.println("2. Rain Season");
        System.out.println("3. Dry Season");
        System.out.println("0. Exit");
        System.out.println("select 0-3:");
        int newTime;
        float newPrice;
        switch (sc.nextInt()) {
            case 0:
            // Exit
            System.out.println("Exiting");
            System.exit(0);

            case 1:
                //Normal Season
                NormalSeason.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                NormalSeason.changePrice(newPrice);
                NormalSeason.changeTime(newTime);
                break;
            case 2:
                //Rain Season
                RainSeason.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                RainSeason.changePrice(newPrice);
                RainSeason.changeTime(newTime);

                break;
            case 3:
                //Dry Season
                DrySeason.checkValues();
                System.out.println("Type the new price modifier?");
                newPrice = sc.nextInt();
                System.out.println("Type the new time modifier?");
                newTime = sc.nextInt();
                DrySeason.changePrice(newPrice);
                DrySeason.changeTime(newTime);
                break;
            default:
                //In case of invalid number, ask again
                System.out.println("Not valid");
                changeWeather();
        }
        
    }
    
}
