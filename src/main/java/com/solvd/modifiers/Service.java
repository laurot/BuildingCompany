package com.solvd.modifiers;

import com.solvd.language.ILanguage;
import org.apache.logging.log4j.*;

public class Service extends Modifier {

    protected Logger LOGGER = LogManager.getLogger();

    public Service(Double servPriceMod, Double servTimeMod) {
        this.priceMod = servPriceMod;
        this.timeMod = servTimeMod;
    }

    @Override
    public Double calcTime(Double time) {
        time = time * timeMod;
        return time;
    }

    @Override
    public Double calcPrice(Double price) {
        price = price * priceMod;
        return price;
    }

    @Override
    public void checkValues(ILanguage lang) {
        LOGGER.info(lang.getCalculateAndText().get("priceSetted") + priceMod);
        LOGGER.info(lang.getCalculateAndText().get("timeSetted") + timeMod);
    }

    @Override
    public void changePrice(Double priceMod) {
        this.priceMod = priceMod;
    }

    @Override
    public void changeTime(Double timeMod) {
        this.timeMod = timeMod;
    }
}
