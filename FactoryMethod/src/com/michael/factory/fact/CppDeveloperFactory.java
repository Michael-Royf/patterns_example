package com.michael.factory.fact;

import com.michael.factory.developer.CppDeveloper;
import com.michael.factory.developer.Developer;

public class CppDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
