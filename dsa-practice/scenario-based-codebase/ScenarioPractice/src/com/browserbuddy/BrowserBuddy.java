package com.browserbuddy;

import java.util.Stack;

class BrowserBuddy {
    private Stack<Tab> closedTabs = new Stack<>();
    private Tab currentTab;

    public void openNewTab() {
        currentTab = new Tab();
        System.out.println("New tab opened");
    }

    public Tab getCurrentTab() {
        return currentTab;
    }

    public void closeTab() {
        if (currentTab != null) {
            closedTabs.push(currentTab);
            currentTab = null;
            System.out.println("Tab closed");
        }
    }

    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Reopened last closed tab");
        } else {
            System.out.println("No closed tabs to reopen");
        }
    }
}

