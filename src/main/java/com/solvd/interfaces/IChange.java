package com.solvd.interfaces;

import com.solvd.Country;
import com.solvd.language.ILanguage;
import com.solvd.modifiers.Buildings;
import com.solvd.modifiers.Service;
import com.solvd.modifiers.Weather;

public interface IChange {

    // To change the default values of each class
    void changeBuildings(ILanguage lang, Buildings res, Buildings ind, Buildings com);

    void changeServices(ILanguage lang, Service nse, Service fas, Service lux);

    void changeWeather(ILanguage lang, Weather nwe, Weather dry, Weather wet);

    Country changeCountry(ILanguage lang);
}
