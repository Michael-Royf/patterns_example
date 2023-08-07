package com.michael.bridge;

public class App {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new CppDeveloper())
        };
        for (Program program : programs){
            program.developProgram();
        }

    }
}
