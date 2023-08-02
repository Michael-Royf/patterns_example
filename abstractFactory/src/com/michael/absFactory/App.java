package com.michael.absFactory;

import com.michael.absFactory.bank.BankingTeamFactory;
import com.michael.absFactory.inter.Developer;
import com.michael.absFactory.inter.ProjectManager;
import com.michael.absFactory.inter.ProjectTeamFactory;
import com.michael.absFactory.inter.Tester;
import com.michael.absFactory.webSite.WebSiteTeamFactory;

public class App {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new WebSiteTeamFactory();
        Developer developer = teamFactory.createDeveloper();
        ProjectManager manager = teamFactory.createManager();
        Tester tester = teamFactory.createTester();
        developer.writeCode();
        manager.manageProject();
        tester.testCode();

    }
}
