package com.trendyol.pages;

import com.trendyol.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//img[@style=\"width:146px;height:100%;margin-bottom:-3px\"]")
    public WebElement trendyolImg_loc;

    @FindBy(xpath = "//input[@placeholder=\"Aradığınız ürün, kategori veya markayı yazınız\"]")
    public WebElement searchInput_loc;

    @FindBy(xpath = "//i[@data-testid=\"search-icon\"]")
    public WebElement searchBtn_loc;

    public WebElement girişFavSep_loc(String girisFavoriSepet){
        return Driver.get().findElement(By.xpath("//p[text()='"+girisFavoriSepet+"']"));
    }
    public WebElement bottomOfTheHeader_loc(String kadınErkek){
        return Driver.get().findElement(By.xpath("//a[text()='"+kadınErkek+"']" +
                "[@class=\"category-header\"]"));
    }

    public WebElement topOfTheHeader(String indirimKuponlarım){
        return Driver.get().findElement(By.xpath("//a[text()='"+indirimKuponlarım+"']"));

    }

}
