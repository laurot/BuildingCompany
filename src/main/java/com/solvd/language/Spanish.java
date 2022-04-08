package com.solvd.language;

import java.util.*;

public class Spanish implements ILanguage {

    public Spanish() {
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
        calculateAndText.put("priceSetted", "El modificador de precio es: ");
        calculateAndText.put("timeSetted", "El modificador de tiempo es: ");
        calculateAndText.put("priceText", "El precio de construir es: $");
        calculateAndText.put("timeText", "El tiempo que tomara es de: ");
        calculateAndText.put(" days", " dias");
        calculateAndText.put("current", "Pais actual: ");
    }

    private void setChangeText() {
        changeText.put("menu", "menu:");
        changeText.put("which", "Que valores quieres cambiar?");
        changeText.put("comercial", "1. Comercial");
        changeText.put("residential", "2. Residencial");
        changeText.put("industrial", "3. Industrial");
        changeText.put("normals", "1. Servicio normal");
        changeText.put("fasts", "2. Servicio rapido");
        changeText.put("luxuriouss", "3. Servicio lujoso");
        changeText.put("normalw", "1. Temporada normal");
        changeText.put("rainyw", "2. Temporada de lluvia");
        changeText.put("dryw", "3. Temporada de sequia");
        changeText.put("newprice", "Ingresa el nuevo modificador de precio");
        changeText.put("newtime", "Ingresa el nuevo modificador de tiempo");
        changeText.put("select", "selecciona 0-3:");
        changeText.put("exit", "0. Salir");
        changeText.put("whatcountry", "Ingresar el nombre del nuevo pais");
        changeText.put("newtax", "Ingresar la tasa de impuestos (en porcentaje)");
    }

    private void setCheckMenu() {
        checkMenu.add("Menu:");
        checkMenu.add("Que valores?");
        checkMenu.add("1. Edificio");
        checkMenu.add("2. Servicio");
        checkMenu.add("3. Modificadores de clima");
        checkMenu.add("0. Salir");
        checkMenu.add("Seleccionar 0-3:");
    }

    private void setCheckValues() {
        checkValues.put("ComercialB", "Edificio comercial: ");
        checkValues.put("ResidentialB", "Edificio residencial: ");
        checkValues.put("IndustrialB", "Edificio industrial: ");
        checkValues.put("NormalSe", "Servicio normal: ");
        checkValues.put("FastSe", "Servicio rapido: ");
        checkValues.put("LuxuriousSe", "Servicio lujoso: ");
        checkValues.put("NormalW", "clima normal: ");
        checkValues.put("RainyW", "temporada de lluvia: ");
        checkValues.put("DryW", "temporada de sequia: ");
    }

    private void setExceptions() {
        exceptions.put("CountryName", "Los paises no deben contener numeros en el nombre");
        exceptions.put("Percentage", "Ese no es un porcentaje valido (0 - 100)");
        exceptions.put("Option", "Esa no es una de las opciones validas");
        exceptions.put("Negative", "Numeros negativos no son aceptados en esta celda");
        exceptions.put("Floors", "Esta compañia solo puede hacer hasta 26 pisos");
    }

    private void setInputText() {
        inputText.put("buildMenu", "Que tipo de edificio?");
        inputText.put("serviceMenu", "Que tipo de servicio?");
        inputText.put("weatherMenu", "Que temporada?");
        inputText.put("sqMetres", "Cuantos metros cuadrados?");
        inputText.put("floors", "Cuantos pisos?");
    }

    private void setMenuText() {
        menuText.add("menu");
        menuText.add("1. Calcular costos");
        menuText.add("2. Mirar los valores por defecto");
        menuText.add("3. Cambiar los modificadores");
        menuText.add("4. Cambiar pais");
        menuText.add("5. Cambiar a ingles");
        menuText.add("0. Salir");
        menuText.add("Seleccionar 0-4:");
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
