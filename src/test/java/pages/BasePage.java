package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected static WebDriver driver;
    public static void setDriver (WebDriver webDriver){
        driver = webDriver;
    }



}
