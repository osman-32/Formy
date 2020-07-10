package tests.Formy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class PageScroll {
    @Test
    public void verify_button_link_page() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Page Scroll");

        Assert.assertEquals(Driver.get().getCurrentUrl(),"http://formy-project.herokuapp.com/scroll");

        Driver.get().close();
    }
}
