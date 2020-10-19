package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AfishaPage extends BasePage {
    @FindBy(className = "topbar__link")
    List<WebElement> topBar;
    @FindBy(id = "city-swicth")
    WebElement citySwitch;
    @FindBy(linkText = "Онлайн-кинотеатры")
    WebElement online;

    public AfishaPage(WebDriver driver){super(driver);}

    @Override
    public void verifyPresenceOfItem(boolean isPresented) {
        Assert.assertEquals(isElementPresented(citySwitch), isPresented);
    }
    @Step("Open afisha page")
    public AfishaPage openPage(int nameBar){
       topBar.get(nameBar - 1).click();
        return this;
    }


}
