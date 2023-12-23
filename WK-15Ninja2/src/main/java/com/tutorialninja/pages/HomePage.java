package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]/a")
    WebElement desktop;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktops;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/h2")
    WebElement desktoplaptopcomponenttext;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]")
    WebElement lapnotelink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]/div/a")
    WebElement showalllapnotelink;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2")
    WebElement getShowalllapnotelineTEXT;
    @CacheLookup
    @FindBy (xpath = "//ul[@class='nav navbar-nav']/li[3]/a")
    WebElement component;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]/div/a")
    WebElement showallcomponent;
    public void mouseHoverToDesktop() {
        mouseHoverToElementAndClick(desktop);
        log.info("Mouse hover on “Desktops” and click " + desktop.toString());
    }

    public void setShowAllDesktops() {
        clickOnElement(showAllDesktops);
        log.info("Click on Show All Desktops " + showAllDesktops.toString());}

    public void clickonlapnotelink() {
        clickOnElement(lapnotelink);
        clickOnElement(showalllapnotelink);
    }
    public void clickOnComponentLink(){
        clickOnElement(component);
        clickOnElement(showallcomponent);
    }
    public String gettextonpage(){  return getTextFromElement(desktoplaptopcomponenttext);    }






}
