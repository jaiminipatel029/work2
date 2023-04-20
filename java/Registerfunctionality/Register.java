package Registerfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\software\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://demo.nopcommerce.com/");


       // driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
       // WebElement Register = driver.findElement(By.className("ico-register"));


        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Jaimini");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("29");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("November");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1992");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("jaimini.patel029@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Unify Testing ");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Kathan@1206");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Kathan@1206");
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();

        driver.close();

    }
}
