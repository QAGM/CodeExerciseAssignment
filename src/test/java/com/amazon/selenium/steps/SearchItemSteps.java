package com.amazon.selenium.steps;

import com.amazon.selenium.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class SearchItemSteps {

    private final static Logger Log = Logger.getLogger(SearchItemSteps.class.getName());

    @Autowired
    private HomePage homePage;

    @Autowired
    private ProductCategoryPage productCategoryPage;

    @Autowired
    private ProductResultsPage productResultsPage;

    @Autowired
    private ProductDetailsPage productDetailsPage;

    @Given("user in amazon Home Page")
    public void user_in_amazon_home_page() {
        homePage.assertonHomePage();

    }
    @When("user clicks Hamburger icon")
    public void user_clicks_hamburger_icon() {
        homePage.clickHamburgerIcon();
    }
    @Then("user views side menu bar")
    public void user_views_side_menu_bar() {
        homePage.assertHMenuDisplay();
    }
    @When("user clicks on {string} under {string}")
    public void user_clicks_on_under(String string, String string2) {
        Log.info("User clicks "+ string + " under category " + string2);
        homePage.clickSubmenuShopbycategory();
    }
    @Then("user views {string}")
    public void user_views(String string) {
        Log.info("User views "+ string + " ");
        homePage.assertSMenuDisplay();
    }
    @When("user clicks on item {string}")
    public void user_clicks_on_item(String string) {
        Log.info("User clicks "+ string + " ");
        homePage.clickSubmenuTelevision();
    }
    @Then("user views Product Category Page")
    public void user_views_product_category_page() {
        productCategoryPage.assertonProductCategoryPage();
    }
    @When("user clicks on {string} under category {string}")
    public void user_clicks_on_under_category(String string, String string2) {
        Log.info("User clicks "+ string + "under category " + string2);
        productCategoryPage.clickChkBxSamsung();
    }
    @Then("user views Results page")
    public void user_views_results_page() {
        productResultsPage.assertonProductResultsPage();
    }
    @When("user clicks on second item")
    public void user_clicks_on_second_item() throws InterruptedException {
        productResultsPage.clickItemSecond();
    }
    @Then("user views Product Details page")
    public void user_views_product_details_page() {
        productDetailsPage.assertonProductDetailsPage();
    }
    @Then("user validates {string} section displayed")
    public void user_validates_section_displayed(String string) {
        Log.info("User view "+ string + " details");
        productDetailsPage.assertAboutItemDisplay();
    }

}
