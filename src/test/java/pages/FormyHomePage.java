package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class FormyHomePage {

    //4 categories

    //constructor => it help us to create and object
    public FormyHomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    // locators
    @FindBy(css = "body > div > div > h1")
    public WebElement title;
//single element
    @FindBy(xpath = "/html/body/div/div/p[1]")
    public WebElement paragraf;

// elements more one elements
    @FindBy(css = "body > div > div > li >a")
    public List<WebElement> links;





    // data types
    // 3 int
    // sentesr String
    // 4.50 double
    // true boolean
    // locator Webelement

    // variables -- our data,
    public String url = "http://formy-project.herokuapp.com/";
    public String homePageTitle = "Welcome to Formy";
    public String homePageParagraf = "This is a simple site that has form components that can be used for testing purposes.";




    // methods
    public void clickOnTheDesiredLink2(String desiredlink) throws InterruptedException {

        List<WebElement> listOfLinks = links;
        for (WebElement each : listOfLinks) {
            if (each.getText().contains(desiredlink)) {
                each.click();
                Thread.sleep(3000);
                break;
            }
        }
    }










}
