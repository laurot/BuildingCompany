package com.solvd;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;


/*  This Class was made for the purpose of the hometask about FileUtils
    and does nothing for the actual Project*/
public class App 
{
    public static void Text()
    {
        try {
            File file = new File("src/main/resources/article");
            String text = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            String[] a = StringUtils.split(text);
            List<String> list = new ArrayList<String>();
            Collections.addAll(list, a);
            String result = "";
            
            for (int i = 0; i < list.size()-1; i++) {
                int amount = 1;
                for (int j = list.size()-1; j > i; j--) {
                    if (list.get(i).equals(list.get(j))) {
                        amount++;
                        list.remove(j);
                    }
                }                
                result = result + list.get(i) + " - " + amount +"\n";
            }
            File output = new File("src/main/resources/output.txt");
            FileUtils.writeStringToFile(output, result, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
