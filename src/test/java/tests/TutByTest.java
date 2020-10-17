package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AfishaPage;
import pages.OnlineTheatresPage;


public class TutByTest extends BaseTest {
    @Test(description = "Scenario 1")
    public void openAfisha() {
        new AfishaPage(driver)
                .openPage(4)
                .verifyPresenceOfItem(true);
        new OnlineTheatresPage(driver)
                .openPage()
                .verifyPresenceOfItem(true);
        new OnlineTheatresPage(driver)
                .selectGenre(1);
    }
    @BeforeMethod
    public void openOnlineTheatres(){
        new AfishaPage(driver)
                .openPage(4)
                .verifyPresenceOfItem(true);
        new OnlineTheatresPage(driver)
                .openPage()
                .verifyPresenceOfItem(true);

    }
    @Test(description = "Scenario 2")
    public void selectSerialsAndGenres(){
        new OnlineTheatresPage(driver)
                .selectSerials()
                .selectGenre(2);
    }
}
