package tests;

import org.testng.annotations.Test;
import pages.AfishaPage;
import pages.OnlineTheatersPage;
import pages.TutByPage;

public class TutByTest extends BaseTest {
    @Test
    public void openAfisha() {
        new TutByPage(driver)
                .openPage();
        new AfishaPage(driver)
                .openPage(4)
                .verifyPresenceOfItem(true);
        new OnlineTheatersPage(driver)
                .openPage()
                .verifyPresenceOfItem(true);
        new OnlineTheatersPage(driver)
                .selectGenre("Комедии");
    }
}
