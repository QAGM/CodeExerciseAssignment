package com.amazon.selenium.pages;

import com.amazon.selenium.helpers.VisibilityHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage implements BasePage{

    @Autowired
    private VisibilityHelper visibilityHelper;

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']")
    public WebElement icon_hamburger;

    @FindBy(xpath = "//*[@id='hmenu-content']")
    public WebElement menu_hside;

    @FindBy(xpath = "//div[contains(text(),'shop by category')]//following::li/a/div[contains(text(),'TV, Appliances, Electronics')]")
    public WebElement shopbycategory;

    @FindBy(xpath = "//*[@id='hmenu-content']//following::div[contains(text(),'tv, audio & cameras')]")
    public WebElement submenu_tvcamera;

    @FindBy(xpath = "//*[@id='hmenu-content']//following::a[contains(text(),'Televisions')]")
    public WebElement submenu_television;

    public void assertonHomePage() { visibilityHelper.waitForVisibilityOf(icon_hamburger); }

    public void clickHamburgerIcon() {
        icon_hamburger.click();
    }

    public void assertHMenuDisplay() { visibilityHelper.waitForVisibilityOf(menu_hside); }

    public void clickSubmenuShopbycategory() {
        visibilityHelper.waitForVisibilityOf(shopbycategory);
        shopbycategory.click(); }

    public void assertSMenuDisplay() { visibilityHelper.waitForVisibilityOf(submenu_tvcamera); }

    public void clickSubmenuTelevision() {
        visibilityHelper.waitForVisibilityOf(submenu_television);
        submenu_television.click();
    }
}
