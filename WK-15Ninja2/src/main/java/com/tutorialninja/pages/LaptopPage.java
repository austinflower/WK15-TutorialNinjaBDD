package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    public LaptopPage() {
        PageFactory.initElements(driver, this);
    }
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
    @FindBy (id = "input-sort")
    WebElement sortvalue;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']/option[5]")
    WebElement verifyHL;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[4]/div[4]/div/div[2]/div/h4/a")
    WebElement macbook;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/div/div[2]/h1")
    WebElement macbooknametext;
    @CacheLookup
    @FindBy (id = "button-cart")
    WebElement addmactocart;
    @CacheLookup
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")
    WebElement shoppingcarttext;
    @CacheLookup
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")
    WebElement shoppingcartmsglink;
    @CacheLookup
    @FindBy (xpath = "//div[@id='checkout-cart']/div/div/h1")
    WebElement macshoppingcarttext;
    @CacheLookup
    @FindBy (xpath = "//div[@class='table-responsive']/table/tbody[1]/tr[1]/td[2]/a")
    WebElement macproduct;
    @CacheLookup
    @FindBy (xpath = "//div[@class='input-group btn-block']/input")
    WebElement macbookquantitybox;
    @CacheLookup
    @FindBy (xpath = "//button[@type='submit']/i")
    WebElement updatemacqt;
    @CacheLookup
    @FindBy (xpath = "//div[@class='table-responsive']/table/tbody/tr/td[6]")
    WebElement total;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/div[3]/div[2]/a")
    WebElement clickonmaccheckout;
    @CacheLookup
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement modifiedshopcart;
    public void clickonlapnotelink()  {
        clickOnElement(lapnotelink);
        clickOnElement(showalllapnotelink);}
    public String getLaptopNoteText(){
        return getTextFromElement(getShowalllapnotelineTEXT);
    }
    public void getsortvalue(){
        selectByVisibleTextFromDropDown(sortvalue,"Price (High > Low)");
    }
    public String getverifyHL (){
        return getTextFromElement(verifyHL);
    }
    public void selectmacbook(){
        clickOnElement(macbook);
    }
    public String verifymacbook(){
        return getTextFromElement(macbooknametext);
    }
    public void clickaddmactocart(){
        clickOnElement(addmactocart);
    }
    public String getmacshoppingcarttext(){
        return getTextFromElement(shoppingcarttext);
    }
    public void clickonmacshoppingcartmsglink(){
        clickOnElement(shoppingcartmsglink);
    }
    public String getmacshoppingcarttextkg(){
        return getTextFromElement(macshoppingcarttext);
    }
    public String getmacproduct(){
        return getTextFromElement(macproduct);
    }
    public void getnewmacbookqt () {
        clearTextFromField(By.xpath("//div[@class='input-group btn-block']/input"));
        sendTextToElement(macbookquantitybox, "2");
    }
    public void getupdatemacqt(){ clickOnElement(updatemacqt);}
    public String getshoppingcarttext(){ return getTextFromElement(shoppingcarttext);}
    public String getnewtotal(){
        return getTextFromElement(total);
    }
    public void getclickonmaccheckout (){ clickOnElement(clickonmaccheckout);}
    public String getmodifiedshopcart(){return getTextFromElement(modifiedshopcart);}


}
