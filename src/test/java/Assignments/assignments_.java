package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
        driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Act
        driver.findElement(By.xpath("//input[@type= 'text'][@name='name']")).sendKeys("Dimitar");
        //Navigate to phone input box and enter data
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("12345678910");
        //Navigate to email input box and enter data
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asd1233asd@abv.bg");
        //Chose country
        Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        select.selectByValue("Bulgaria");
        // Navigate to city box and enter data
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Burgas");
        // Navigate to name box and enter data
        driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("randomName");
        // Navigate to password box and enter data
        driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("randomPassword");
        //Click on submit button
        driver.findElement(By.xpath("//div[@id='load_box']//input[@value='Submit']")).click();

    }
    @Test
    public static void Task3(){


        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://timesofindia.indiatimes.com/poll.cms");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Act
        String numbers = driver.findElement(By.cssSelector("span[id='mathq2']")).getText();
        String[] values = numbers.split(" ");
        int num1 = Integer.parseInt(values[0]);
        int num2 = Integer.parseInt(values[2]);
        String operator = values[1];
        String operatorValue = switch (operator) {
            case "+" -> String.valueOf(num1 + num2);
            case "-" -> String.valueOf(num1 - num2);
            case "*" -> String.valueOf(num1 * num2);
            case "/" -> String.valueOf(num1 / num2);
            default -> null;
        };

        driver.findElement(By.cssSelector("input[id='mathuserans2']")).sendKeys(operatorValue);

    }
    @Test
    public static void Task4(){


        //Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Act
        for (int i = 300; i <= 600; i=i+10){
            driver.manage().window().setSize(new Dimension(i,i));

        }

    }


}




