package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class OnlineTheatresPage extends BasePage {
    @FindBy(linkText = "Онлайн-кинотеатры")
    WebElement online;
    @FindBy(className = "title_page")
    WebElement title;
    @FindBy(className = "check-label")
    WebElement label;
    @FindBy(className = "cnt")
    List<WebElement> dropdowns;
    @FindBy(className = "text")
    List<WebElement> dropdownMenu;
    @FindBy(xpath = "//li[text()='Сериалы']")
    WebElement widgets;
    public OnlineTheatresPage(WebDriver driver){super (driver);}

    @Override
    public void verifyPresenceOfItem(boolean isPresented) {
        Assert.assertEquals(isElementPresented(title), isPresented);
    }
    @Step("Open online theaters")
    public OnlineTheatresPage openPage(){
        online.click();
        return this;
    }
    @Step("Select genre")
    public OnlineTheatresPage selectGenre(int num){
        dropdowns.get(0).click();
        dropdownMenu.get(num).click();
        waitVisibleElement(label);
        return this;
    }
    @Step("Select serials")
    public OnlineTheatresPage selectSerials(){
        widgets.click();
        return this;
    }
}
