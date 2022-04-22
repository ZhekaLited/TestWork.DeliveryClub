package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirsTest extends WebDriverSetting {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anech\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.delivery-club.ru/");
        //Сравнение тайтлов
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        //Закрытие врайвера
        driver.quit();
        //driver.manage().window().maximize(); Открытие на полный экран

    }

    @Test
    public void firstTest2() {

        driver.get("https://www.delivery-club.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        driver.quit();

        
        @Test
    public void getTitle() {
        Assertions.assertEquals("Google",driver.getTitle()); // Проверка титла страницы
    }
}
