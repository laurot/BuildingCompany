package com.solvd;

import com.solvd.buildings.*;
import com.solvd.interfaces.ICalculate;
import com.solvd.interfaces.ITax;
import com.solvd.language.ILanguage;
import com.solvd.services.*;
import com.solvd.weather.*;
import org.apache.logging.log4j.*;

public class Calculate implements ICalculate<ILanguage>{

    private static final Logger LOGGER = LogManager.getLogger();

    public void calculate(ITax country, ILanguage lang) {
        
        Input input = new Input();
        Float time = (float) 0;
        Float price = (float) 0;
        
        int buildType = input.askBuildingType(lang);
        int weather = input.askWeather(lang);
        int serviceType = input.askServiceType(lang);
        int floors = input.askFloors(lang);
        float sqMeters = input.askSqMetres(lang);

        switch (buildType) {
            case 2:
                //Residential
                Buildings resi = new Residential(floors, sqMeters);
                time = resi.calcTime(time);
                price = resi.calcPrice(price);
            
            case 3:
                //Industrial
                Buildings indu = new Industrial(floors, sqMeters);
                time = indu.calcTime(time);
                price = indu.calcPrice(price);
            
            default:
                //Commercial
                Buildings comer = new Comercial(floors, sqMeters);
                time = comer.calcTime(time);
                price = comer.calcPrice(price);
            
        }
        switch (weather) {
            case 2:
                //Dry Season
                Weather dryS = new DrySeason();
                time = dryS.calcTime(time);
                price = dryS.calcPrice(price);
            
            case 3:
                //Rainy Season
                Weather wetS = new RainSeason();
                time = wetS.calcTime(time);
                price = wetS.calcPrice(price);
            
            default:
                //Normal Season
                Weather normS = new NormalSeason();
                time = normS.calcTime(time);
                price = normS.calcPrice(price);
            
        }
        switch (serviceType) {
            case 2:
                //Fast Service
                Service fastS = new FastService();
                time = fastS.calcTime(time);
                price = fastS.calcPrice(price);
            
            case 3:
                //Luxurious Service
                Service luxS = new LuxuriousService();
                time = luxS.calcTime(time);
                price = luxS.calcPrice(price);
            
            default:
                //Normal Service
                Service normS = new NormalService();
                time = normS.calcTime(time);
                price = normS.calcPrice(price);
            
        }
        LOGGER.info("----------------------------------------------");
        LOGGER.info(lang.getCalculateAndText().get("priceText") + country.tax(price));
        LOGGER.info(lang.getCalculateAndText().get("timeText") + time + lang.getCalculateAndText().get("days"));
        LOGGER.info("----------------------------------------------");
    }
}
