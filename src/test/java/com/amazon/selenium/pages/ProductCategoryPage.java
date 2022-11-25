package com.amazon.selenium.pages;

import com.amazon.selenium.helpers.JSHelper;
import com.amazon.selenium.helpers.VisibilityHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductCategoryPage implements BasePage{

    @Autowired
    private VisibilityHelper visibilityHelper;

    @Autowired
    private JSHelper jsHelper;

    @FindBy(xpath = "//*[@id='nav-subnav']/a[1]/span/img")
    public WebElement img_electronics;

    @FindBy(xpath = "//span/a[contains(@href,'Samsung')]/div/label/input")
    public WebElement chkbx_samsung;

    public void assertonProductCategoryPage() { visibilityHelper.waitForVisibilityOf(img_electronics); }

    public void clickChkBxSamsung() {
        visibilityHelper.waitForVisibilityOf(chkbx_samsung);
        jsHelper.scrollToElement(chkbx_samsung);
        jsHelper.jsClick(chkbx_samsung);
    }

}
