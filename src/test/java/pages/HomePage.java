package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class HomePage {

    //constructor

    public HomePage() {
        //this method requires to provide webdriver object for @FindBy
        //and page class
        //this means this page class
        PageFactory.initElements(Driver.get(), this);
    }



    // locators

    @FindBy(css = "#content > ul > li:nth-child(6) > a")
    public WebElement checkBoxLink;





    // methods

    public void ClickOnCheckboxLink(){

//        // first way to click // selenium
//      checkBoxLink.click();
//      BrowserUtils.wait(5);

        //Browser
        BrowserUtils.clickWithJS(checkBoxLink);
        BrowserUtils.wait(5);



    }




}
