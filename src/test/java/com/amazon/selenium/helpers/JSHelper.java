package com.amazon.selenium.helpers;

import com.amazon.selenium.runners.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

@Component
public class JSHelper {

    @Autowired
    private Hook hooks;


    /**
     * Click element using JavascriptExecutor
     * The element must be present on the DOM for operation to take place
     *
     * @param element Element to click
     */
    public void jsClick(WebElement element) {
        hooks.getJSDriver().executeScript("arguments[0].click();", element);
    }


    /**
     * Scroll to element for view
     * The element must be present on the DOM for operation to take place
     *
     * @param element Element to scroll to and view
     */
    public void scrollToElement(WebElement element) {
        hooks.getJSDriver().executeScript("arguments[0].scrollIntoView();", element);
    }


    /**
     * Highlight element
     * The element must be present on the DOM for operation to take place
     *
     * @param element Element to highlight
     */
    public void highlightElement(WebElement element) {
        hooks.getJSDriver().executeScript("arguments[0].setAttribute('style', " +
                "'background: yellow; border: 2px solid red;');", element);
    }
}
