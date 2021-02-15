package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    // create constructor for initializing webdriver
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected static void clickElement(WebElement element) {
        element.click();
    }

    protected static void sendKeysToElement(WebElement textElement, String value) {
        textElement.sendKeys(value);

    }
}