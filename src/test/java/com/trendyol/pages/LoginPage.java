package com.trendyol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id=\"login-email\"]")
    public WebElement emailInput_loc;

    @FindBy(xpath = "//input[@id=\"login-password-input\"]")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//button[@class=\"q-primary q-fluid q-button-medium q-button submit\"]")
    public WebElement loginBtn_loc;

    @FindBy(xpath = "//div[text()='facebook']")
    public WebElement facebookBtn_loc;

    @FindBy(xpath = "//div[text()='google']")
    public WebElement googleBtn_loc;

    @FindBy(xpath = "//input[@class=\"whsOnd zHQkBf\"][@autocomplete=\"username\"]")
    public WebElement googleEmailInput_loc;

    @FindBy(xpath = "//span[text()='İleri']")
    public WebElement googleEmailİleriBtn_loc;

    @FindBy(xpath = "//div[text()='Şifrenizi girin']")
    public WebElement googlePasswordInput_loc;



}
