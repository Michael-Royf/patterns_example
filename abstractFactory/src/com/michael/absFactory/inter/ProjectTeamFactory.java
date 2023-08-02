package com.michael.absFactory.inter;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createTester();
    ProjectManager createManager();
}
