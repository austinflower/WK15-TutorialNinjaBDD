package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy (xpath = "//div[@id='top-links']/ul/li[2]/a")
    WebElement myaccountlink;
    @CacheLookup
    @FindBy (xpath = "//div[@id='top-links']/ul/li[2]/ul/li[1]/a")
    WebElement registerlink;
    @CacheLookup
    @FindBy (xpath = "//div[@id='top-links']/ul/li[2]/ul/li[5]/a")
    WebElement logoutlink;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/h1")
    WebElement registeraccounttext;
    @CacheLookup
    @FindBy (xpath = "//div[@id='top-links']/ul/li[2]/ul/li[2]/a")
    WebElement loginlink;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/div/div[2]/div/h2")
    WebElement returncust;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/div/div/a")
    WebElement continueafterlogout;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/div/div[2]/div/form/input")
    WebElement returningcustlogin;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/h2")
    WebElement myaccounttext;
    public void clickonRegister (){
        clickOnElement(myaccountlink);
        clickOnElement(registerlink);
    }
    public String getregistertext(){
        return getTextFromElement(registeraccounttext);
    }
    public void clickonLogin(){
        clickOnElement(myaccountlink);
        clickOnElement(loginlink);
    }
    public String getreturncust (){
        return getTextFromElement(returncust);
    }
    public void fillinregisterinfo (){
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("email")).sendKeys("tomsmith5010@aol.com");
        driver.findElement(By.name("telephone")).sendKeys("555-555-5555");
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.name("confirm")).sendKeys("123456789");
        //3.9 Select Subscribe Yes radio button
        selectMyAccountOptions("//div[@id='content']/form/fieldset[3]/div/div/label[1]/input");
        //3.10 Click on Privacy Policy check box
        selectMyAccountOptions("//div[@id='content']/form/div/div/input[1]");
        //3.11 Click on Continue button
        selectMyAccountOptions("//div[@id='content']/form/div/div/input[2]");
    }
    public void fillinRESTInfo (){
        driver.findElement(By.xpath("//div[@class='pull-right']/a")).click();
        selectMyAccountOptions("//div[@id='top-links']/ul/li[2]/a");
        selectMyAccountOptions("//div[@id='top-links']/ul/li[2]/ul/li[5]/a");

    }
    public void logoutcontinue(){ clickOnElement(continueafterlogout);}
    public void getreturncustlogin(){
        driver.findElement(By.id("input-email")).sendKeys("tomsmith5010@aol.com");
        driver.findElement(By.id("input-password")).sendKeys("123456789");
        clickOnElement(returningcustlogin);}
    public String getmyaccounttext(){
        return getTextFromElement(myaccounttext);
    }
    public void clickonlogout () {
        clickOnElement(myaccountlink);
        clickOnElement(logoutlink);
    }








}
