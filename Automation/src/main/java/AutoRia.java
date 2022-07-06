import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoRia {
    String searchButton = "//button[@class='button']";
    String categories = "//select [@id= 'categories' ]";
    //String brand = "//input[@id = 'brandTooltipBrandAutocompleteInput-brand']";
    By brand = By.xpath("//input[@id = 'brandTooltipBrandAutocompleteInput-brand']");
    //String model = "//input [@id = 'brandTooltipBrandAutocompleteInput-model']";
  By model = By.xpath("//input [@id = 'brandTooltipBrandAutocompleteInput-model']");
    //String region = "//input [@id = 'brandTooltipBrandAutocompleteInput-region']";
  By region = By.xpath("//input [@id = 'brandTooltipBrandAutocompleteInput-region']");
   // By region = By.xpath("//label[@data-text='Регіон']");
    By submitButton = By.xpath("//button[@type='submit']");
    //String yearFrom = "//select [@id = 'yearFrom']";
    By yearFrom = By.xpath("//select [@id = 'yearFrom']");
    //String yearTo = "//select [@id = 'yearTo']";
    By yearTo = By.xpath("//select [@id = 'yearTo']");
    //String priceFrom = "//input [@id = 'priceFrom']";
    By priceFrom = By.xpath("//input [@id = 'priceFrom']");
    //String priceTo = "//input [@id = 'priceTo']";
    By priceTo = By.xpath("//input [@id = 'priceTo']");

    @Test
    public void openSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://auto.ria.com/uk/");
        //driver.findElement(By.xpath("//input[@id = 'brandTooltipBrandAutocompleteInput-brand']")).sendKeys("Audi");
        //driver.findElement(By.xpath(brand)).sendKeys("Audi");
        driver.findElement(brand).sendKeys("Bmw");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li [@data-value='9']")).click();
        Thread.sleep(3000);
        driver.findElement(model).sendKeys("x5");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li [@data-value='96']")).click();
        Thread.sleep(3000);
       driver.findElement(region).sendKeys("Львів");
        Thread.sleep(3000);
       driver.findElement(By.xpath("//a[text()='Львів']")).click();


        Thread.sleep(3000);
        driver.findElement(yearFrom).sendKeys("2020");
        //driver.findElement(By.xpath("//a[text()='2020']")).click();
        //Thread.sleep(3000);
        driver.findElement(yearTo).sendKeys("2021");
        //Thread.sleep(3000);
        driver.findElement(priceFrom).sendKeys("10000");
        //Thread.sleep(3000);
        driver.findElement(priceTo).sendKeys("30000");
        Thread.sleep(3000);
        //Thread.sleep(3000);
        driver.findElement(submitButton).click();
        Thread.sleep(3000);
       Assert.assertEquals("https://auto.ria.com/uk/search/?categories.main.id=1&price.currency=1&price.USD.gte=10000&price.USD.lte=30000&indexName=auto,order_auto,newauto_search&region.id[0]=5&city.id[0]=5&brand.id[0]=9&model.id[0]=96&year[0].gte=2020&year[0].lte=2021&size=20", driver.getCurrentUrl());






        //открытие сайта
      //  driver.get("https://auto.ria.com/uk/");
       // driver.navigate().to("https://auto.ria.com/uk/");
      //  Thread.sleep(5000);
       //driver.findElement(By.xpath(searchButton)).click();

       //Навигация по сайту
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
      //  driver.close();

        //Размер окна
        //driver.manage().window().minimize(); //свернуть
        //driver.manage().window().maximize(); //фулскрин

        //Ожидание загрузки элементов
      // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



    }
}
