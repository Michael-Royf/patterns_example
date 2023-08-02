package com.michael.absFactory.webSite;

import com.michael.absFactory.inter.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write code");
    }
}
