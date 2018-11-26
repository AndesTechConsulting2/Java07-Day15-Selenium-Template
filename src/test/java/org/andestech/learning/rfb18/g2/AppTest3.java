package org.andestech.learning.rfb18.g2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AppTest3
{
    private WebDriver wd = null;

    @BeforeClass
    public void initData(){

    System.setProperty("webdriver.ie.driver",
            "E:\\drivers\\selenium\\IEDriverServer.exe");
        System.out.println("+++ Class: " + this);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        wd = new InternetExplorerDriver();
        wd.get("http://leta.ru");
        assertTrue( true );
    }


    @AfterClass
    public void tearDown()
    {
        if(wd != null) wd.quit();
        System.out.println("--- Class: " + this);
    }

}
