package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class createNewJobList {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // WebDriverWait wait=
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        System.out.println("Goal: Create a new job listing");
        driver.get("https://alchemy.hguy.co/jobs");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//header[@class='entry-header ast-no-meta']//div)[1]")));
        driver.findElement(By.linkText("Post a Job")).click();

        Random rand = new Random();

        int rand_int1 = rand.nextInt(100);
        WebElement emailId=driver.findElement(By.name("create_account_email"));
        emailId.clear();
        emailId.sendKeys("howdy"+rand_int1+"@gmail.com");
        WebElement jobTitle=driver.findElement(By.id("job_title"));
        int rand_int2 = rand.nextInt(1000);
        String jobId="Test Specialist_"+rand_int2;
        jobTitle.sendKeys(jobId);
        WebElement location=driver.findElement(By.id("job_location"));
        location.clear();
        location.sendKeys("Mumbai");
        driver.switchTo().frame("job_description_ifr");
        WebElement description=driver.findElement(By.xpath("//body[@id='tinymce']"));
        description.clear();
        description.sendKeys("Testing profile.. Looking for candidates with knowledge on selenium");
        driver.switchTo().defaultContent();
        WebElement url=driver.findElement(By.xpath("//input[@id='application']"));
        url.clear();
        url.sendKeys("https://alchemy.hguy.co/jobs");
        WebElement company=driver.findElement(By.id("company_name"));
        company.clear();
        company.sendKeys("ABC");
        driver.findElement(By.name("submit_job")).click();
        driver.findElement(By.id("job_preview_submit_button")).click();
        driver.findElement(By.linkText("click here")).click();

        driver.findElement(By.linkText("Jobs")).click();

        WebElement jobSearchInput=driver.findElement(By.name("search_keywords"));
        jobSearchInput.clear();
        jobSearchInput.sendKeys(jobId);
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        List<WebElement> jobList=driver.findElements(By.xpath("//div[@class='position']//h3"));

        System.out.println(jobList.get(0).getText());
        if(jobList.get(0).getText().equals(jobId)){
        System.out.println("Job posted successfully and ID is "+jobId);
        driver.quit();
        }else {
            System.out.println("Job not posted successfully: "+jobId);
        }

    }
}
