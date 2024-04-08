package tests;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
public class DemoqaWebtablesTest extends BaseTest{

    @Test
    public void openWebtables(){
        pageManager.demoqaWebtablesPage.open();
        assertTrue(pageManager.demoqaWebtablesPage.getUrl().contains("webtables"));
        pageManager.demoqaWebtablesPage.btnAdd.scrollIntoView(true);
        pageManager.demoqaWebtablesPage.btnAdd.click();
        pageManager.demoqaWebtablesPage.formTitle.shouldHave(text("Registration Form"));
        pageManager.demoqaWebtablesPage.firstName.setValue("Simge");
        pageManager.demoqaWebtablesPage.lastName.setValue("Kurtuldu");
        pageManager.demoqaWebtablesPage.userEmail.setValue("simge@gmail.com");
        pageManager.demoqaWebtablesPage.age.setValue("26");
        pageManager.demoqaWebtablesPage.salary.setValue("10000");
        pageManager.demoqaWebtablesPage.department.setValue("Test");
        pageManager.demoqaWebtablesPage.btnSubmit.click();
        pageManager.demoqaWebtablesPage.btnAdd.shouldBe(visible);
        pageManager.demoqaWebtablesPage.btnEdit.click();
        pageManager.demoqaWebtablesPage.firstName.setValue("Ali");
        pageManager.demoqaWebtablesPage.btnSubmit.click();
        String[] lines = pageManager.demoqaWebtablesPage.elements.get(3).getText().split("\\n");
        String firstLine = lines[0];
        assertEquals(firstLine,"Ali");
    }
   /* @Test(priority = 2)
    public void clickAddButton(){
        pageManager.demoqaWebtablesPage.btnAdd.scrollIntoView(true);
        pageManager.demoqaWebtablesPage.btnAdd.click();
        pageManager.demoqaWebtablesPage.formTitle.shouldHave(text("Registration Form"));
    }
    @Test(priority = 3)
    public void addNewSubmit(){
        pageManager.demoqaWebtablesPage.firstName.setValue("Simge");
        pageManager.demoqaWebtablesPage.lastName.setValue("Kurtuldu");
        pageManager.demoqaWebtablesPage.userEmail.setValue("simge@gmail.com");
        pageManager.demoqaWebtablesPage.age.setValue("26");
        pageManager.demoqaWebtablesPage.salary.setValue("10000");
        pageManager.demoqaWebtablesPage.department.setValue("Test");
        pageManager.demoqaWebtablesPage.btnSubmit.click();
        pageManager.demoqaWebtablesPage.btnAdd.shouldBe(visible);
    }
    @Test(priority = 4)
    public void editSubmit(){
        pageManager.demoqaWebtablesPage.btnEdit.click();
        pageManager.demoqaWebtablesPage.firstName.setValue("Ali");
        pageManager.demoqaWebtablesPage.btnSubmit.click();
        String[] lines = pageManager.demoqaElementsPage.elements.get(3).getText().split("\\n");
        String firstLine = lines[0];
        assertEquals(firstLine,"Ali");

    }*/
}
