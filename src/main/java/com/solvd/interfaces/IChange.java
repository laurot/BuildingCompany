package com.solvd.interfaces;

import com.solvd.buildings.Buildings;
import com.solvd.services.Service;
import com.solvd.weather.Weather;
import com.solvd.Country;
import com.solvd.language.ILanguage;

public interface IChange{
    
    //To change the default values of each class
    void changeBuildings(ILanguage lang, Buildings res, Buildings ind, Buildings com);
    void changeServices(ILanguage lang, Service nse, Service fas, Service lux);
    void changeWeather(ILanguage lang, Weather nwe, Weather dry, Weather wet);
    Country changeCountry(ILanguage lang);
}
