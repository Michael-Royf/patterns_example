package com.michael.factory.fact;

import com.michael.factory.developer.Developer;
import com.michael.factory.developer.JavaDeveloper;

public class JavaDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
