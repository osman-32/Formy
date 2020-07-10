package tests.Formy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class ButtonLinks {

    @Test
    public void verify_button_link_page() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Buttons");

        Driver.get().close();
    }

        @Test
        public void verify_button_link_page_title() throws Exception {

            FormyHomePage formyHomePage = new FormyHomePage();
            Driver.get().get(formyHomePage.url);

            clickOnTheDesiredLink1("Buttons");
            Assert.assertEquals(Driver.get().getCurrentUrl().contains("buttons"),true);
            Driver.get().close();


        }
}
