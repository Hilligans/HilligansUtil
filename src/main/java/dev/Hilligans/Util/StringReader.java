package dev.Hilligans.Util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringReader {
    public static String readString(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        InputStream stream = StringReader.class.getResourceAsStream(path);
        if(stream == null) {
            System.out.println("Cant read file: " + path);
            return "";
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        reader.lines().forEach(string -> stringBuilder.append(string).append("\n"));
        return stringBuilder.toString();
    }
}
