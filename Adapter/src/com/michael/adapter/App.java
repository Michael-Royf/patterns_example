package com.michael.adapter;

public class App {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();
        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
