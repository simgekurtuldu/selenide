package common;

import driver.DriverFactory;
import pages.DemoqaElementsPage;
import pages.DemoqaWebtablesPage;

public class PageManager {
    public DemoqaElementsPage demoqaElementsPage;
    public DemoqaWebtablesPage demoqaWebtablesPage;

    public PageManager() {

        DriverFactory.initDriver();

        demoqaElementsPage = PageFactory.buildDemoqaElementsPage();

        demoqaWebtablesPage = PageFactory.buildDemoqaWebtablesPage();

    }
}