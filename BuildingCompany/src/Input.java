import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);

    public int askBuildingType() {
        int select;

        System.out.println("What kind of building?");
        System.out.println("1. Comercial");
        System.out.println("2. Residential");
        System.out.println("3. Industrial");
        System.out.println("0. Back");
        System.out.println("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 1,2,3:
                //Accepted buildings
                break;
            case 0:
                // Back
                System.out.println("exiting");
                break;
            default:
                System.out.println("not valid");
        }
        return select;
    }

    public int askServiceType(){
        int select;

        System.out.println("What kind of service?");
        System.out.println("1. Normal");
        System.out.println("2. Fast");
        System.out.println("3. Luxurious");
        System.out.println("0. Back");
        System.out.println("select 0-3:");
        select = sc.nextInt();

        switch (select) {
            case 1,2,3:
                //Accepted Services
                break;
            default:
                System.out.println("not valid");
        }

        return select;
    }
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
                System.out.println("not valid");
        }

        return select;
    }

    public float askSqMetres() {

        int sqMetres;
        System.out.println("How many square metres?");
        sqMetres = sc.nextInt();

        return sqMetres;
    }

    public int askFloors() {

        int floors;
        System.out.println("How many floors?");
        floors = sc.nextInt();

        return floors;
    }

   
}
