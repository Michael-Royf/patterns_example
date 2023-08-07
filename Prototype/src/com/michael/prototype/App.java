package com.michael.prototype;

public class App {
    public static void main(String[] args) {
        Project project = new Project(1, "Test Project", "Project Source");
        System.out.println(project);
        ProjectFactory projectFactory = new ProjectFactory(project);
        Project copyProject = projectFactory.cloneProject();
        System.out.println(copyProject);
    }
}
