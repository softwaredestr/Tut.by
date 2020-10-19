package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OnlineTheatresPage extends BasePage {
    @FindBy(linkText = "Онлайн-кинотеатры")
    WebElement online;
    @FindBy(className = "title_page")
    WebElement title;
    @FindBy(className = "check-label")
    WebElement label;
    @FindBy(xpath = "//span[@class='filter-option pull-left']")
    List<WebElement> dropdowns;
    @FindBy(className = "text")
    List<WebElement> dropdownMenu;
    @FindBy(xpath = "//a[text()='Сериалы']")
    WebElement serials;
    @FindBy(xpath = "//a[text()='Мультфильмы']")
    WebElement mult;
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
    @Step ("Verify genre")
    public OnlineTheatresPage verifyingGenre(String expectedResult){
        String actualResult = label.getText();
        Assert.assertEquals(actualResult, expectedResult);
        return this;
    }
    @Step("Select serials")
    public OnlineTheatresPage selectSerials(){
        serials.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }
    @Step("Select multfilms")
    public OnlineTheatresPage selectMult(){
        mult.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

}
