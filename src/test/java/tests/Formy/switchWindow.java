package tests.Formy;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class switchWindow {


    @Test
    public void verify_switchWindow() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Switch Window");
        String actualTitle = Driver.get().getCurrentUrl();
        String expectedTitle = "http://formy-project.herokuapp.com/switch-window";
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.get().close();
    }
}
