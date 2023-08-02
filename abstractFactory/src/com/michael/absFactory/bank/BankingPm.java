package com.michael.absFactory.bank;

import com.michael.absFactory.inter.ProjectManager;

public class BankingPm  implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
