package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class createNewJobListBackend {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // WebDriverWait wait=
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        System.out.println("Goal: Visit the site’s backend and create a job listing");
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        //Sign in

        WebElement userId=driver.findElement(By.id("user_login"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
        userId.clear();
        userId.sendKeys("root");
        WebElement pwd=driver.findElement(By.id("user_pass"));
        pwd.clear();
        pwd.sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement homePage=driver.findElement(By.xpath("//h1[text()='Dashboard']"));

        if(homePage.isDisplayed()){
            System.out.println("User logged in successfully");
        }else{
            System.out.println("User not logged in successfully");
     }
        WebElement alchemyJobs=driver.findElement(By.xpath("//a[text()='Alchemy Jobs']"));
                /*if(alchemyJobs.isDisplayed())
                {
                    alchemyJobs.click();
                    WebElement dashboard=driver.findElement(By.xpath("//a[text()='Dashboard']"));
                    dashboard.click();
                }*/
        WebElement jobListing=driver.findElement(By.xpath("//div[text()='Job Listings']"));
                jobListing.click();
        WebElement addJob=driver.findElement(By.xpath("//a[text()='All Jobs']"));
        addJob.click();
        String url=driver.getCurrentUrl();
        if(url.contains("job_listing")){
            System.out.println("USer is in job listing page");
        }else{
            System.out.println("USer is not in job listing page");
        }
        WebElement addNew=driver.findElement(By.xpath("(//a[text()='Add New'])[7]"));
        addNew.click();
        WebElement position=driver.findElement(By.xpath("//textarea[@placeholder='Position']"));
        Random rand = new Random();
        int rand_int2 = rand.nextInt(1000);
        String jobId="Test Automation Engineer_"+rand_int2;
        position.sendKeys(jobId);
        WebElement applicationUrl=driver.findElement(By.name("_application"));
        applicationUrl.clear();
        applicationUrl.sendKeys("taracn@123.com");
        WebElement companyName=driver.findElement(By.name("_company_name"));
        companyName.clear();
        companyName.sendKeys("XYZ CONSULTANCY");

        WebElement jobLocation=driver.findElement(By.name("_job_location"));
        jobLocation.clear();
        jobLocation.click();
        jobLocation.sendKeys("Kerala");
        WebElement companyWebsite=driver.findElement(By.name("_company_website"));
        companyWebsite.clear();
        companyWebsite.sendKeys("testing.in");
        WebElement companyTwitter=driver.findElement(By.name("_company_twitter"));
        companyTwitter.clear();
        companyTwitter.click();
        companyTwitter.sendKeys("xyz.io");

        WebElement publish=driver.findElement(By.xpath("//button[text()='Publish…']"));
        publish.click();
        WebElement publish1=driver.findElement(By.xpath("//button[text()='Publish']"));
        publish1.click();
        //verify published
        WebElement published=driver.findElement(By.xpath("//div[text()='Published']"));
        if(published.isDisplayed()){
            System.out.println("Job published: "+jobId);

        }
       /* WebElement home=driver.findElement(By.xpath("(//li[@id='wp-admin-bar-menu-toggle']//a[@class='ab-item'])[1]"));
        home.click();;*/
        Thread.sleep(7000);
        WebElement test=driver.findElement(By.xpath("//a[text()='View Job']"));
        test.click();
        Thread.sleep(2000);
        WebElement job=driver.findElement(By.xpath("//h1[text()='"+jobId+"']"));
        if (job.isDisplayed()){
            System.out.println("Job successfully added: "+jobId);
        }else{
            System.out.println("Job successfully not added: "+jobId);
        }

    driver.close();
    }


}
