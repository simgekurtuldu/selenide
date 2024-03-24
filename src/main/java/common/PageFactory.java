
package common;
import pages.DemoqaElementsPage;
import pages.DemoqaWebtablesPage;

public class PageFactory {
    public static DemoqaElementsPage buildDemoqaElementsPage() {return new DemoqaElementsPage("/elements");}

    public static DemoqaWebtablesPage buildDemoqaWebtablesPage(){return new DemoqaWebtablesPage("/webtables");}
}
