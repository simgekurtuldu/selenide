package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DemoqaWebtablesPage extends BasePage{
    public SelenideElement btnAdd = $("#addNewRecordButton");
    public SelenideElement formTitle = $("#registration-form-modal.modal-title");
    public SelenideElement firstName = $("input#firstName");
    public SelenideElement lastName = $("input#lastName");
    public SelenideElement userEmail = $("input#userEmail");
    public SelenideElement age = $("input#age");
    public SelenideElement salary = $("input#salary");
    public SelenideElement department = $("input#department");
    public SelenideElement btnSubmit = $("input#submit");
    public SelenideElement btnEdit = $("pan#edit-record-4");
    public ElementsCollection elements = $$("div.rt-tr-group");


    public DemoqaWebtablesPage(String pageUrl) {
        super(pageUrl);
    }
}
