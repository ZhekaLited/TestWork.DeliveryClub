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
        
         @BeforeClass //Будет в начале  один раз в определнном классе
        @AfterClass // Будет в конце один раз в определнном классе
        
        driver.manage().window().maximize(); // Открывает окно на целый экран
          Assertions.assertEquals("https://www.google.com/?safe=active&ssui=on",driver.getCurrentUrl()); //Тестирует URL поля
         Assertions.assertTrue(driver.getCurrentUrl().contains("google.com")); // Содержин конкретные адресс
        String text = "text"; // Строковая переменная
        
        
        //Выполняет вставляние в строки какого то текста
         String text = "text"; // Строковая переменная
        WebElement input = driver.findElement(By.xpath("//input[@title='Поиск']"));  //вебрайвер будет искать элемент . Xpath - нуэно найти в консоли
        input.sendKeys(text); 
        input.sendKeys(Keys.ENTER); //Нажимает кнопки
        
       
    }
    }
}
