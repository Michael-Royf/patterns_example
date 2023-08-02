package com.michael.builder.builder;

import com.michael.builder.entity.Website;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

  public   Website buildWebSite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        return builder.getWebsite();
    }
}
