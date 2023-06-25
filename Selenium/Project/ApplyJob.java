package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApplyJob {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // WebDriverWait wait=
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        System.out.println("Goal: Search for a job and apply for it");
        driver.get("https://alchemy.hguy.co/jobs");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//header[@class='entry-header ast-no-meta']//div)[1]")));
        driver.findElement(By.linkText("Jobs")).click();
        //driver.findElement(By.xpath("//a[text()='Jobs']"))
        System.out.println("Title of the page: "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");

        WebElement jobSearchInput=driver.findElement(By.name("search_keywords"));
        jobSearchInput.clear();
        jobSearchInput.sendKeys("Banking");
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        List<WebElement> jobList=driver.findElements(By.className("position"));
        jobList.get(0).click();
        driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
        String job=driver.findElement(By.className("job_application_email")).getText();
        System.out.println("Mail ID: "+job);

        driver.quit();
    }
}
