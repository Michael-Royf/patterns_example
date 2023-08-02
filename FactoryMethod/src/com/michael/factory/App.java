package com.michael.factory;

import com.michael.factory.developer.Developer;
import com.michael.factory.fact.CppDeveloperFactory;
import com.michael.factory.fact.DeveloperFactory;
import com.michael.factory.fact.JavaDeveloperFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter the programming language");
        String language = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            language = bufferedReader.readLine();
            language = language.trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DeveloperFactory developerFactory =createDeveloperBySpeciality(language);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }


    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if (speciality.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }
        else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }

    }


}
