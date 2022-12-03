package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class assignments_ {

    @Test
    public static void Task1(){

        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Act
        //Wait for cookies and accept
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='L2AGLb']/div[@class='QS5gu sy4vM'][1]")));
        driver.findElement(By.xpath("//button[@id='L2AGLb']/div[@class='QS5gu sy4vM'][1]")).click();
        //Navigate to search box and enter data
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("way2automation");
        //Click on search button
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK'][@class='gNO89b']")).click();
        //Click on first result
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
        // Store in list of WebElements all elements with tagname "a" , print number of stored elements, and text
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement link: links) {
            System.out.println(link.getText() + link.getAttribute("Href"));

        }
        System.out.println("asd");

    }
    @Test
    public static void Task2(){

        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Act
        //Wait for cookies and accept
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='L2AGLb']/div[@class='QS5gu sy4vM'][1]")));
        driver.findElement(By.xpath("//button[@id='L2AGLb']/div[@class='QS5gu sy4vM'][1]")).click();
        //Navigate to search box and enter data
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("way2automation");
        //Click on search button
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK'][@class='gNO89b']")).click();
        //Click on first result
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
        // Store in list of WebElements all elements with tagname "a" , print number of stored elements, and text
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement link: links) {
            System.out.println(link.getText() + link.getAttribute("Href"));

        }


    }
}
