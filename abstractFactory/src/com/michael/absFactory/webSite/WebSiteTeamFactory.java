package com.michael.absFactory.webSite;

import com.michael.absFactory.inter.Developer;
import com.michael.absFactory.inter.ProjectManager;
import com.michael.absFactory.inter.ProjectTeamFactory;
import com.michael.absFactory.inter.Tester;

public class WebSiteTeamFactory  implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager createManager() {
        return new WebSitePM();
    }
}
