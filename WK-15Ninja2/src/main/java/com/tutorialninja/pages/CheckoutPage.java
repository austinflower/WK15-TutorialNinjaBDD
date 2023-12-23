package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement checkoutpagetext;
    @CacheLookup
    @FindBy (xpath = "//div[@class='panel-body']/div/div/h2")
    WebElement copnewcustomer;
    @CacheLookup
    @FindBy (xpath = "//div[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input")
    WebElement guestbutton;
    @CacheLookup
    @FindBy (id = "button-account")
    WebElement copcontinuebutton;
    @CacheLookup
    @FindBy (id = "button-guest")
    WebElement continuebuttonstep2;
    @CacheLookup
    @FindBy (xpath = "//div[@id='collapse-payment-method']/div/div[1]")
    WebElement copwarning;

    public String verifycheckoutpagetext(){ return getTextFromElement(checkoutpagetext);}
    public String verifycopnewcustomer(){ return getTextFromElement(copnewcustomer);}
    public void clickonguestbuttonandcontinue(){
        clickOnElement(guestbutton);
        clickOnElement(copcontinuebutton);
    }
    public void fillinmandatoryfields() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[2]/div/div[1]/div[1]/fieldset/div[4]/input")).sendKeys("tomsmith@aol.com");
        driver.findElement(By.name("telephone")).sendKeys("123-555-9999");
        driver.findElement(By.name("address_1")).sendKeys("123 Main St");
        driver.findElement(By.name("city")).sendKeys("Dallas");
        driver.findElement(By.name("postcode")).sendKeys("12345");
        WebElement countrypick = driver.findElement(By.name("country_id"));
        Select select1 = new Select(countrypick);
        select1.selectByValue("223");
        WebElement statepick = driver.findElement(By.name("zone_id"));
        Select select2 = new Select(statepick);
        select2.selectByValue("3669");
        driver.findElement(By.xpath("//input[@id='button-guest']")).click();
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys(" test test test");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='accordion']/div[3]/div[2]/div/div[2]/div/input[1]")).click();
        driver.findElement(By.xpath("//div[@id='accordion']/div[3]/div[2]/div/div[2]/div/input[2]")).click();
    }
    public String getwarning (){return getTextFromElement(copwarning);}


}
