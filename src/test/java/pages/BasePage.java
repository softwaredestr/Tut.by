package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@Log4j2
public abstract class BasePage {
    public WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    public boolean isElementPresented(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            log.error(element.toString() + " not found");
            return false;
        }
    }
    public void waitClickableElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void  waitVisibleElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public abstract void verifyPresenceOfItem(boolean isPresented);
}
