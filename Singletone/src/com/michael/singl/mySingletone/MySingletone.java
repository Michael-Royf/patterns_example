package com.michael.singl.mySingletone;

public class MySingletone {

    private static volatile MySingletone INSTANCE;

    private MySingletone() {
    }

    public static MySingletone getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingletone.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingletone();
                }
            }
        }
        return INSTANCE;
    }
}
