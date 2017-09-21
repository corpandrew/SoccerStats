package com.corpa.util;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Utils {

    public static String API_KEY = "HsdxelKE1Umsh9hfsJCCah13dZAyp1YOiuijsngzYPEUBNAZvB";

    public static void writeToFile(String s, File f) {
        try {
            Files.asCharSink(f, Charset.defaultCharset()).write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

