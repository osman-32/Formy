package tests.Formy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class Checkbox {

    @Test
    public void verify_button_link_page() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Checkbox");

        Driver.get().close();
    }

    @Test
    public void verify_checkbox_title() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);
         // this reusable method
        clickOnTheDesiredLink1("Checkbox");

        Assert.assertEquals(Driver.get().getCurrentUrl().contains("checkbox"),true);
         //Driver method commenting out
        Driver.get().close();


    }

}
