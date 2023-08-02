package com.michael.absFactory.webSite;

import com.michael.absFactory.inter.Tester;

public class ManualTester  implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code");
    }
}
