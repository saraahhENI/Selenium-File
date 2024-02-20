import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class googleTest {

    @Test
    public void verifyMavenRepoTitle() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.id("L2AGLb")).click();

        WebElement searchBar = driver.findElement(By.id("APjFqb"));
        searchBar.sendKeys("maven repository");
        //searchBar.submit();
        searchBar.sendKeys(Keys.ENTER);

        WebElement results = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
        results.click();

        String title = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(title,"What's New in Maven");

        Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void verifyMavenRepoTitle2() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.id("L2AGLb")).click();

        WebElement searchBar = driver.findElement(By.id("APjFqb"));
        searchBar.sendKeys("maven repository");
        //searchBar.submit();
        searchBar.sendKeys(Keys.ENTER);

        WebElement results = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
        results.click();

        String title = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(title,"What's New in Maven");

        Thread.sleep(3000);

        driver.quit();
    }

}
