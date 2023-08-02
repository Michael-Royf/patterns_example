package com.michael.absFactory.bank;

import com.michael.absFactory.inter.Developer;

public class CppDeveloper  implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer write code");
    }
}
