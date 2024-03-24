package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DemoqaElementsPage extends BasePage{

    public SelenideElement btnButtons = $("li.btn#item-4");
    public ElementsCollection elements = $$("button.btn-primary");
    public SelenideElement clickMessage = $("#dynamicClickMessage");



    public DemoqaElementsPage(String pageUrl) {
        super(pageUrl);
    }
}
