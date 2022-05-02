package com.solvd;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void fileReadToFile() {
        try {
            File file = new File("src/main/resources/article");
            File output = new File("src/main/resources/output.txt");
            String text = FileUtils.readFileToString(file, StandardCharsets.UTF_8).toLowerCase();
            String[] a = StringUtils.split(text);
            String result = "";

            Set<String> words = Arrays.stream(a).collect(Collectors.toSet());
            for (String string : words) {
                result = result + string + " - " + StringUtils.countMatches(text, string) + "\n";
            }
            FileUtils.writeStringToFile(output, result, StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
