package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionZtoA;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionAtoZ;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[4]/div[3]/div/div[2]/div/h4/a")
    WebElement selectProductHPLP3065;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][3]/div/div/a")
    WebElement selectHP;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']/option[2]")
    WebElement sortAZ;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]/h1")
    WebElement textHPLP3065page;
    @CacheLookup
    @FindBy(id = "input-option225")
    WebElement pickDeliveryDate;
    @CacheLookup
    @FindBy (id = "input-quantity")
    WebElement qtField;
    @CacheLookup
    @FindBy (id = "button-cart")
    WebElement addtoCart;
    @CacheLookup
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;
    @CacheLookup
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")
    WebElement shoppingcartmsglink;
    @CacheLookup
    @FindBy (xpath = "//div[@id='content']/h1")
    WebElement shoppingcarttext;
    @CacheLookup
    @FindBy (xpath = "//div[@class='table-responsive']/table/tbody[1]/tr[1]/td[2]/a")
    WebElement product;
    @CacheLookup
    @FindBy (xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliverydate;
    @CacheLookup
    @FindBy (xpath = "//div[@class='table-responsive']/table/tbody/tr/td[3]")
    WebElement model;
    @CacheLookup
    @FindBy (xpath = "//div[@class='table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    public void sortByPositionZtoA() {
        selectByIndexFromDropDown(positionZtoA, 2);
    }
    public void alpaOrder() {
        clickOnElement(sortAZ);}
    public void clickOnSelectHP(){
        clickOnElement(selectHP);
    }
    public String verifyHPLP3065(){ return getTextFromElement(textHPLP3065page); }
    public void selectDeliveryDate()  {
        clearTextFromField(By.id("input-option225"));
        sendTextToElement(pickDeliveryDate,"2024-11-30");
        clickOnElement(By.xpath("//div[@id='product']/h3"));
    }
    public void enterQty(){
        clearTextFromField(By.id("input-quantity"));
        sendTextToElement(qtField, "1");}
    public void clickaddbutton(){
        clickOnElement(addtoCart);}
    public String getShoppingCartText(){
        return getTextFromElement(successMessage);}
    public void clickonshoppingcartmsg (){
        clickOnElement(shoppingcartmsglink);}
    public String getverifyshoppingcart (){
        return getTextFromElement(shoppingcarttext);
    }
    public String getproduct(){
        return getTextFromElement(product);
    }
    public String getdeliverydate (){
        return getTextFromElement(deliverydate);
    }
    public String getmodel (){
        return getTextFromElement(model);
    }
    public String gettotal (){
        return getTextFromElement(total);
    }
}