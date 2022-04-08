package com.solvd.language;

import java.util.*;

import com.solvd.enums.Values;

public class English implements ILanguage {

    public English() {
        menuText.clear();
        checkMenu.clear();
        setMenuText();
        setCalculateAndText();
        setChangeText();
        setCheckMenu();
        setCheckValues();
        setExceptions();
        setInputText();
    }

    private void setCalculateAndText() {
        calculateAndText.put("priceSetted", "The price modifier is set to:");
        calculateAndText.put("timeSetted", "The time modifier is set to:");
        calculateAndText.put("priceText", "The price of building is: $");
        calculateAndText.put("timeText", "The time it will take is: ");
        calculateAndText.put("days", "days");
        calculateAndText.put("current", "Current country: ");
    }

    private void setChangeText() {
        changeText.put("menu", "menu:");
        changeText.put("which", "Which values do you want to change?");
        changeText.put("comercial", "1. Commercial");
        changeText.put("residential", "2. Residential");
        changeText.put("industrial", "3. Industrial");
        changeText.put("normals", "1. Normal Service");
        changeText.put("fasts", "2. Fast Service");
        changeText.put("luxuriouss", "3. Luxurious Service");
        changeText.put("normalw", "1. Normal Season");
        changeText.put("rainyw", "2. Rain Season");
        changeText.put("dryw", "3. Dry Season");
        changeText.put("newprice", "Type the new price modifier?");
        changeText.put("newtime", "Type the new time modifier?");
        changeText.put("select", "select 0-3:");
        changeText.put("exit", "0. Exit");
        changeText.put("whatcountry", "Enter new Country name");
        changeText.put("newtax", "Enter tax Rate (in percentage)");
    }

    private void setCheckMenu() {
        checkMenu.add("Menu:");
        checkMenu.add("Which values?");
        checkMenu.add("1. " + Values.RESIDENTIAL.getOpt());
        checkMenu.add("2. " + Values.FAST.getOpt());
        checkMenu.add("3. " + Values.RAINY.getOpt());
        checkMenu.add("0. Exit");
        checkMenu.add("select 0-3:");
    }

    private void setCheckValues() {
        checkValues.put("ComercialB", "Comercial buildings: ");
        checkValues.put("ResidentialB", "Residential buildings: ");
        checkValues.put("IndustrialB", "Industrial buildings: ");
        checkValues.put("NormalSe", "Normal Service: ");
        checkValues.put("FastSe", "Fast Service: ");
        checkValues.put("LuxuriousSe", "Luxurious Service: ");
        checkValues.put("NormalW", "Normal Season: ");
        checkValues.put("RainyW", "Rain Season: ");
        checkValues.put("DryW", "Dry Season: ");
    }

    private void setExceptions() {
        exceptions.put("CountryName", "Countries must not have numbers in the name");
        exceptions.put("Percentage", "That's not a valid percentage (0 - 100)");
        exceptions.put("Option", "That's not one of the valid options");
        exceptions.put("Negative", "Negative numbers are not accepted in that field");
        exceptions.put("Floors", "This company can only build up to 26 floors");
    }

    private void setInputText() {
        inputText.put("buildMenu", "What kind of building?");
        inputText.put("serviceMenu", "What kind of service?");
        inputText.put("weatherMenu", "What kind of weather?");
        inputText.put("sqMetres", "How many square metres?");
        inputText.put("floors", "How many floors?");
    }

    private void setMenuText() {
        menuText.add("menu");
        menuText.add("1. Calculate costs");
        menuText.add("2. Check default values");
        menuText.add("3. Change default values");
        menuText.add("4. Change country");
        menuText.add("5. Change to Spanish");
        menuText.add("0. Exit");
        menuText.add("select 0-4:");
    }

    @Override
    public Map<String, String> getCalculateAndText() {
        return calculateAndText;
    }

    @Override
    public Map<String, String> getChangeText() {
        return changeText;
    }

    @Override
    public List<String> getCheckMenu() {
        return checkMenu;
    }

    @Override
    public Hashtable<String, String> getCheckValues() {
        return checkValues;
    }

    @Override
    public Map<String, String> getExceptions() {
        return exceptions;
    }

    @Override
    public LinkedHashMap<String, String> getInputText() {
        return inputText;
    }

    @Override
    public List<String> getMenuText() {
        return menuText;
    }
}
