import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void clickOnElement(By by) {

        driver.findElement(by).click();
    }

    public static void clearOnElement(By by) {
        driver.findElement(by).clear();
    }

    public static String GetCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat(
                "MMHHmmss");// dd/MM/yyyy
        Date today = new Date();
        String strDate = sdfDate.format(today);
        return strDate;

    }

    // creating unique number to get unique email
    public static void sendKeysMethod(By by, String typeText)
    {
        String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
        driver.findElement(by).sendKeys(typeText);
    }
}
