package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {

    public ChromeDriver driver;

    //Выполняется анатация Before перед чем либо ( перед тестом )
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anech\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        // System.out.println("Test start");
    }

    //Анатация выполняется после операции ( после тестов )
    @After
    public void close() {
        driver.quit();
        //System.out.println("Test close");
    }
}
