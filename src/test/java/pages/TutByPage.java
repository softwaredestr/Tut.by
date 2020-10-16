package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TutByPage extends BasePage {
    String url = "https://www.tut.by/";
    @FindBy(className = "header-logo")
    WebElement logo;

    public TutByPage(WebDriver driver){super(driver);}

    @Override
    @Step("Verifying page is open")
    public void verifyPresenceOfItem(boolean isPresented) {
        Assert.assertEquals(isElementPresented(logo), isPresented);
    }
    @Step("Open tut.by page")
    public TutByPage openPage(){
        driver.get(url);
        return this;
    }


}
