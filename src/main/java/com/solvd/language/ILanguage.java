package com.solvd.language;

import java.util.*;

public interface ILanguage {
    
    public List<String> menuText = new ArrayList<String>();
    public Map<String, String> exceptions = new HashMap<String, String>();
    public Hashtable<String, String> checkValues = new Hashtable<String,String>();
    public List<String> checkMenu = new ArrayList<String>();
    public LinkedHashMap<String, String> inputText = new LinkedHashMap<String, String>();
    public Map<String, String> changeText = new HashMap<String, String>();
    public Map<String, String> calculateAndText = new HashMap<String, String>();
    
    public Map<String, String> getCalculateAndText();
    public Map<String, String> getChangeText();
    public List<String> getCheckMenu();
    public Hashtable<String, String> getCheckValues();
    public Map<String, String> getExceptions();
    public LinkedHashMap<String, String> getInputText();
    public List<String> getMenuText();
}
