package com.michael.absFactory.webSite;

import com.michael.absFactory.inter.ProjectManager;

public class WebSitePM  implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages project...");
    }
}
