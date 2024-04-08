package tests;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static org.testng.Assert.assertTrue;


public class DemoqaElementsTest extends BaseTest{
    @Test
    public void openElementsPage(){
        pageManager.demoqaElementsPage.open();
        assertTrue(pageManager.demoqaElementsPage.getUrl().contains("demoqa"));
        pageManager.demoqaElementsPage.btnButtons.click();
        pageManager.demoqaElementsPage.elements.get(2).scrollIntoView(true);
        pageManager.demoqaElementsPage.elements.get(2).click();
        pageManager.demoqaElementsPage.clickMessage.shouldHave(text("You have done a dynamic click"));
    }

    /*@Test(priority = 2)
    public void clickButtonsButton(){
        pageManager.demoqaElementsPage.btnButtons.click();
        pageManager.demoqaElementsPage.elements.get(2).scrollIntoView(true);
        pageManager.demoqaElementsPage.elements.get(2).click();
        pageManager.demoqaElementsPage.clickMessage.shouldHave(text("You have done a dynamic click"));
    }*/


}
