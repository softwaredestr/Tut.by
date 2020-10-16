package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class OnlineTheatersPage extends BasePage {
    @FindBy(linkText = "Онлайн-кинотеатры")
    WebElement online;
    @FindBy(className = "title_page")
    WebElement title;

    public OnlineTheatersPage(WebDriver driver){super (driver);}

    @Override
    public void verifyPresenceOfItem(boolean isPresented) {
        Assert.assertEquals(isElementPresented(title), isPresented);
    }
    @Step("Open online theaters")
    public OnlineTheatersPage openPage(){
        online.click();
        return this;
    }
    @Step("Select genre")
    public OnlineTheatersPage selectGenre(String genre){
        Select dropdown = new Select(driver.findElement(By.tagName("select")));
        dropdown.getAllSelectedOptions();
        dropdown.selectByVisibleText(genre);
        return this;
    }
}
