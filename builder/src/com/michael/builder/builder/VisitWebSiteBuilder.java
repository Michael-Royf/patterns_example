package com.michael.builder.builder;

import com.michael.builder.entity.CMS;

public class VisitWebSiteBuilder extends WebsiteBuilder {


    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
