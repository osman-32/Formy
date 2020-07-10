package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.FormyHomePage;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {


    //static , don't need to create and object , public
    public static void clickOnTheDesiredLink1(String desiredlink) throws InterruptedException {
        FormyHomePage formyHomePage = new FormyHomePage();
        List<WebElement> listOfLinks = formyHomePage.links;
        for (WebElement each : listOfLinks) {
            if (each.getText().contains(desiredlink)) {
                each.click();
                Thread.sleep(3000);
                break;
            }
        }
    }








}
