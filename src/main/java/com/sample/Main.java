package com.sample;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("conf" + File.separator + "config.properties")) {

            // load a properties file
            prop.load(input);
            String name = prop.getProperty("name");

            if (!StringUtils.isEmpty(name)) {
                System.out.println(name);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
