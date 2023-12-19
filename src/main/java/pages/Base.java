package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepdefinition.SharedSD.getDriver;

public class Base {

    public WebElement webAction(By locator)
    {
        WebElement element = getDriver().findElement(locator);
        return element;
    }
    public void clickOn(By locator)
    {
        webAction(locator).click();
    }

    public void setValue(By locator, String value)
    {
        webAction(locator).sendKeys(value);
    }

    public String getElementText(By locator)
    {
        webAction(locator).getText();
    }


    public String getElementText(By locator)
    {
        webAction(locator).getText();
    }


}
