package com.m_Net.pages;

import com.m_Net.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

        public BasePage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }


        @FindBy(xpath = "//button[@title='Akzeptieren']")
        public WebElement acceptAllCookies;

        @FindBy(xpath = "//a[@href='https://www.m-net.de/hilfe-service/']")
        public WebElement hilfeServiceButton;


}
