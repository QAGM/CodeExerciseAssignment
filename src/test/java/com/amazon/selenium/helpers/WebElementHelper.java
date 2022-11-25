package com.amazon.selenium.helpers;

import com.amazon.selenium.runners.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Component
public class WebElementHelper {

    @Autowired
    private Hook hooks;

    /**
     * Switch to a new tab
     * Clicking element in parent tab control navigated -> child tab
     */
    public void switchNewTab() {
        hooks.getDriver().getWindowHandles().forEach(tab-> hooks.getDriver().switchTo().window(tab));
    }


}
