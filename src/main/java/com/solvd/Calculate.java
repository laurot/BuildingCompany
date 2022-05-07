package com.solvd;

import com.solvd.interfaces.*;
import com.solvd.language.ILanguage;
import com.solvd.modifiers.Buildings;
import com.solvd.modifiers.Service;
import com.solvd.modifiers.Weather;
import org.apache.logging.log4j.*;

public class Calculate implements ICalculate<ILanguage> {

    private static final Logger LOGGER = LogManager.getLogger();

    private ObjDoubleBiConsumer<ILanguage> print = (lang, price, time) -> {
        LOGGER.info("----------------------------------------------");
        LOGGER.info(lang.getCalculateAndText().get("priceText") + price);
        LOGGER.info(lang.getCalculateAndText().get("timeText") + time + lang.getCalculateAndText().get("days"));
        LOGGER.info("----------------------------------------------");
    };

    public void calculate(ITax country, ILanguage lang, int floors, double sqMeters,
            Buildings calcBuild, Weather calcWeath, Service calcServ) {
        double time = 0.0;
        double price = 0.0;

        price = calcServ.calcPrice(calcWeath.calcPrice(calcBuild.calcPrice(calcBuild.calcPrice(sqMeters, floors))));
        time = calcServ.calcTime(calcWeath.calcTime(calcBuild.calcTime(calcBuild.calcTime(sqMeters, floors))));
        price = country.tax(price);
        print.accept(lang, price, time);
    }
}
