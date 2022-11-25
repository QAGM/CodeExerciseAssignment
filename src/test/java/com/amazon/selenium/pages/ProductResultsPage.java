package com.amazon.selenium.pages;

import com.amazon.selenium.helpers.JSHelper;
import com.amazon.selenium.helpers.VisibilityHelper;
import com.amazon.selenium.helpers.WebElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductResultsPage implements BasePage {
    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @Autowired
    private WebElementHelper webElementHelper;

    @FindBy(xpath = "//span[text()='RESULTS']")
    public WebElement text_results;

    @FindBy(xpath = "//span[@class='rush-component s-latency-cf-section']//following::div[@data-index=2]")
    public WebElement item_second;


    public void assertonProductResultsPage() { visibilityHelper.waitForVisibilityOf(text_results); }

    public void clickItemSecond() throws InterruptedException {
        jsHelper.highlightElement(item_second);
        item_second.click();
        webElementHelper.switchNewTab();
    }

}
