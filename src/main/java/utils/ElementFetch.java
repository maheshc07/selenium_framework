package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.BaseTest;

import java.util.List;

public class ElementFetch {

    public WebElement getElement(String identifierType, String identifierValue) {
        switch (identifierType) {
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            default:
                return null;
        }
    }

//    public List<WebElement> getListWebElements(String identifierType, String identifierValue) {
//        switch (identifierType) {
//            case "ID":
//                return BaseTest.driver.findElement(By.id(identifierValue));
//            case "CSS":
//                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
//            case "TAGNAME":
//                return BaseTest.driver.findElement(By.tagName(identifierValue));
//            case "XPATH":
//                return BaseTest.driver.findElement(By.xpath(identifierValue));
//            default:
//                return null;
//        }
//    }
}
