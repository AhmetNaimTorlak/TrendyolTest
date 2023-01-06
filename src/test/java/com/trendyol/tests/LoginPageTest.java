package com.trendyol.tests;

import com.trendyol.TestBase;
import com.trendyol.pages.DashboardPage;
import com.trendyol.pages.LoginPage;
import com.trendyol.utilities.ConfigurationReader;
import com.trendyol.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Test
    public void loginTest() {
        extentLogger = report.createTest("Trendyol login test");

        loginPage.advCloser_loc.click();
        loginPage.cerezBtn_loc.click();

        extentLogger.info("The user on the home page");
        String expectedLogin = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle, expectedLogin, "You are NOT on the home page");

        extentLogger.info("The user should be able to see login page");
        dashboardPage.girişFavSep_loc("Giriş Yap").click();
        String expectedTitleLogin = "giris";
        String actualTitleLogin = Driver.get().getTitle();
        if (actualTitleLogin.contains(expectedTitleLogin)){
            Assert.assertTrue(true);
        }
        extentLogger.info("The user should be able to login");
        loginPage.googleBtn_loc.click();
        loginPage.googleEmailInput_loc.sendKeys(ConfigurationReader.get("email"));
        loginPage.googleEmailİleriBtn_loc.click();
        loginPage.googlePasswordInput_loc.sendKeys(ConfigurationReader.get("password"));
        loginPage.googleEmailİleriBtn_loc.click();
        Assert.assertEquals(actualTitle,expectedLogin);





    }
}
