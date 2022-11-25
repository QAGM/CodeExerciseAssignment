package com.amazon.selenium.pages;

import com.amazon.selenium.helpers.JSHelper;
import com.amazon.selenium.helpers.VisibilityHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDetailsPage implements BasePage {

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//*[@id='feature-bullets']/h1")
    public WebElement text_about_item;

    @FindBy(xpath = " //*[@id='productTitle']")
    public WebElement text_productTitle;


    public void assertonProductDetailsPage() { visibilityHelper.waitForVisibilityOf(text_productTitle); }

    public void assertAboutItemDisplay() {
        jsHelper.scrollToElement(text_about_item);
        visibilityHelper.waitForVisibilityOf(text_about_item);
    }
}
