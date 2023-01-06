package com.trendyol.pages;



import com.trendyol.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {
    WebDriver driver;
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
    public WebElement cerezBtn_loc;

    @FindBy(xpath = "//div[@class=\"modal-close\"]")
    public WebElement advCloser_loc;
}
