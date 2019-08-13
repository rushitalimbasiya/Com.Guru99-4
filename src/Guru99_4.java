import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Guru99_4 extends Util {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.demo.guru99.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        //clear on email id field
        clearOnElement(By.name("emailid"));
        //click on email id field
        clickOnElement(By.name("emailid"));

        //  creating unique number to get unique email
        //String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        driver.findElement(By.name("emailid")).sendKeys("abcd" + GetCurrentTimeStamp() + "@yahoo.com");



        clickOnElement(By.name("btnLogin"));

        // verify with the guru99 Bank by using assert true
       // String actualResult = driver.findElement(By.xpath("//h2[@class='barone']")).getText();
      //  Assert.assertTrue(actualResult.contains("Guru99 B"));

        String expectedResult="Guru99 Bank";
        Assert.assertEquals(expectedResult,driver.findElement(By.xpath("//h2[@class='barone']")).getText());

        driver.close();


    }
}
