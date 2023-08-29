package com.m_Net.stepDefs;

import com.m_Net.pages.BasePage;
import com.m_Net.utilities.BrowserUtils;
import com.m_Net.utilities.ConfigurationReader;
import com.m_Net.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class homePage_StepDefs extends BasePage {

    BasePage basePage = new BasePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("user is on the M-net home page")
    public void user_is_on_the_m_net_home_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("env"));
       BrowserUtils.sleep(1);
    }
    @Then("user accept cookies")
    public void user_accept_cookies() {
        basePage.acceptAllCookies.click();
        BrowserUtils.sleep(1);

    }
    @When("user click hilfeServiceButton")
    public void user_click_hilfe_service_button() {
        basePage.hilfeServiceButton.click();
        BrowserUtils.sleep(1);

    }
    @When("user scroll down and up the page")
    public void user_scroll_down_and_up_the_page() {
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,1850)");
        }
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,-1850)");
        }


    }
    @When("user goes back to the main page")
    public void user_goes_back_to_the_main_page() {
        BrowserUtils.sleep(1);
        Driver.getDriver().navigate().back();

    }
    @Then("user should see {string} title")
    public void user_should_see_title(String expectedTitle) {
        BrowserUtils.sleep(1);
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.sleep(1);
        Assert.assertEquals(expectedTitle,actualTitle);

        Driver.closeDriver();


    }


}