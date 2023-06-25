package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class getSecondHeading {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // WebDriverWait wait=
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        System.out.println("Goal: Read the second heading of the website and verify the text");
        driver.get("https://alchemy.hguy.co/jobs");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//header[@class='entry-header ast-no-meta']//div)[1]")));
        String url=driver.findElement(By.xpath("(//div[@class='entry-content clear']//h2)[1]")).getText();
        System.out.println("Second Header is: "+url);
        driver.quit();
    }
}
