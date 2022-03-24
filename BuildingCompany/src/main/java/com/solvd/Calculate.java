package com.solvd;
import com.solvd.buildings.*;
import com.solvd.exceptions.NegativeNumberException;
import com.solvd.exceptions.NotValidOptionException;
import com.solvd.exceptions.TooManyFloorsException;
import com.solvd.interfaces.ICalc;
import com.solvd.interfaces.ICalculate;
import com.solvd.interfaces.ITax;
import com.solvd.services.*;
import com.solvd.weather.*;
import org.apache.logging.log4j.*;

public class Calculate implements ICalculate{

    private static final Logger LOGGER = LogManager.getLogger();

    public void calculate(ITax country) throws NotValidOptionException, NegativeNumberException, TooManyFloorsException {
        
        Input input = new Input();
        float time = 0;
        float price = 0;
        
        int buildType = input.askBuildingType();
        int weather = input.askWeather();
        int serviceType = input.askServiceType();
        int floors = input.askFloors();
        float sqMeters = input.askSqMetres();

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
        LOGGER.info("----------------------------------------------");
        LOGGER.info("The price of building is: $" + country.tax(price));
        LOGGER.info("The time it will take is: " + time +" days");
        LOGGER.info("----------------------------------------------");
    }
}
