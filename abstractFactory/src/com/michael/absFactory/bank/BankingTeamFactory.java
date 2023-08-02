package com.michael.absFactory.bank;

import com.michael.absFactory.inter.Developer;
import com.michael.absFactory.inter.ProjectManager;
import com.michael.absFactory.inter.ProjectTeamFactory;
import com.michael.absFactory.inter.Tester;

public class BankingTeamFactory  implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectManager createManager() {
        return new BankingPm();
    }
}
