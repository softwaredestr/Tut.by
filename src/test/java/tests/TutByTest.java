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
                .selectGenre(1)
                .verifyingGenre("Боевик");
    }




    @Test(description = "Scenario 2")
    public void selectSerialsAndGenres(){
        new AfishaPage(driver)
                .openPage(4)
                .verifyPresenceOfItem(true);
        new OnlineTheatresPage(driver)
                .openPage()
                .verifyPresenceOfItem(true);
        new OnlineTheatresPage(driver)
                .selectSerials()
                .selectGenre(2)
                .verifyingGenre("Детектив");
    }
    @Test(description = "Scenario 3")
    public void selectMultfilmsAndGenres(){
        new AfishaPage(driver)
                .openPage(4)
                .verifyPresenceOfItem(true);
        new OnlineTheatresPage(driver)
                .openPage()
                .verifyPresenceOfItem(true);
        new OnlineTheatresPage(driver)
                .selectMult()
                .selectGenre(3)
                .verifyingGenre("Фэнтези");
    }
}
