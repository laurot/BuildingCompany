package com.solvd;
import com.solvd.buildings.*;
import com.solvd.interfaces.ICalc;
import com.solvd.interfaces.ICalculate;
import com.solvd.interfaces.ITax;
import com.solvd.services.*;
import com.solvd.weather.*;


public class Calculate implements ICalculate{
    public void calculate(int buildType,int weather, int serviceType, int floors, float sqMeters, ITax country) {
        float time = 0;
        float price = 0;
        switch (buildType) {
            case 2 -> {
                //Residential
                ICalc resi = new Residential(floors, sqMeters);
                time = resi.calcTime(time);
                price = resi.calcPrice(price);
            }
            case 3 -> {
                //Industrial
                ICalc indu = new Industrial(floors, sqMeters);
                time = indu.calcTime(time);
                price = indu.calcPrice(price);
            }
            default -> {
                //Commercial
                ICalc comer = new Comercial(floors, sqMeters);
                time = comer.calcTime(time);
                price = comer.calcPrice(price);
            }
        }
        switch (weather) {
            case 2 -> {
                //Dry Season
                ICalc dryS = new DrySeason();
                time = dryS.calcTime(time);
                price = dryS.calcPrice(price);
            }
            case 3 -> {
                //Rainy Season
                ICalc wetS = new RainSeason();
                time = wetS.calcTime(time);
                price = wetS.calcPrice(price);
            }
            default -> {
                //Normal Season
                ICalc normS = new NormalSeason();
                time = normS.calcTime(time);
                price = normS.calcPrice(price);
            }
        }
        switch (serviceType) {
            case 2 -> {
                //Fast Service
                ICalc fastS = new FastService();
                time = fastS.calcTime(time);
                price = fastS.calcPrice(price);
            }
            case 3 -> {
                //Luxurious Service
                ICalc luxS = new LuxuriousService();
                time = luxS.calcTime(time);
                price = luxS.calcPrice(price);
            }
            default -> {
                //Normal Service
                ICalc normS = new NormalService();
                time = normS.calcTime(time);
                price = normS.calcPrice(price);
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("The price of building is: $" + country.tax(price));
        System.out.println("The time it will take is: " + time +" days");
        System.out.println("----------------------------------------------");
    }
}
