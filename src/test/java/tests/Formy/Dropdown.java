package tests.Formy;

import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class Dropdown {

    @Test
    public void verifyDropdown() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Dropdown");

        Driver.get().close();
    }

}
