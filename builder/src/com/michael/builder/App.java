package com.michael.builder;

import com.michael.builder.builder.Director;
import com.michael.builder.builder.EnterpriseWebSiteBuilder;
import com.michael.builder.builder.VisitWebSiteBuilder;
import com.michael.builder.entity.Website;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebSiteBuilder());
        Website website = director.buildWebSite();
        System.out.println(website);
    }
}
