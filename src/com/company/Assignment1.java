package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    // declaration and instantiation of objects/variables

    WebDriver driver;
    String facebookurl="https://www.facebook.com";

    public void invokeBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushikesh\\Desktop\\selenium jar\\Selenium d\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get("http://www.unipune.ac.in/");
        String titleOfThePage = driver.getTitle();
        System.out.println("SPPU title:" + titleOfThePage);
        if (titleOfThePage.equals("Savitribai Phule Pune University, One of the Premier Universities in India - Official Website."))
        {
            System.out.println("Test case PASS");
        }
        else
        {
            System.out.println("Test case FAIL");
        }
    }
    public void navigateCommands()
    {
        driver.navigate().to(facebookurl);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL :: " + currentUrl);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().refresh();

    }
    public static void main(String[] args)
    {
        Assignment1 assignment = new Assignment1();
        assignment.invokeBrowser();
        assignment.navigateCommands();
    }

}
