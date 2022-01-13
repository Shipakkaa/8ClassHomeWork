import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tests {


        private static ChromeDriver chromeDriver;
        private static FirefoxDriver firefoxDriver;



@BeforeClass
        public static void before(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omer Brosh\\Downloads\\chromedriver.exe");
   System.setProperty("webdriver.gecko.driver","C:\\Users\\Omer Brosh\\Downloads\\geckodriver.exe");
        chromeDriver = new ChromeDriver();
       firefoxDriver = new FirefoxDriver();



}

 @Test
         public static void test1_open() {
     chromeDriver.get("https://he.wikipedia.org/wiki/%D7%A2%D7%9E%D7%95%D7%93_%D7%A8%D7%90%D7%A9%D7%99");
     firefoxDriver.get("https://www.ynet.co.il");
 }
    @Test
             public static void test2_google_chrome_translate() {
        chromeDriver.get("https://translate.google.com");
        chromeDriver.findElement(By.className("er8xn"));
        chromeDriver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea"));
        System.out.println(chromeDriver.findElement(By.className("er8xn")));
    }
     @Test
             public static void test3_firefox_Youtube(){
            firefoxDriver.get("https://www.youtube.com");
            System.out.println(firefoxDriver.findElement(By.cssSelector("yt-simple-endpoint style-scope ytd-mini-guide-entry-renderer")));
        }
        @Test
    public static void test4_firefox_selenium() {
            firefoxDriver.get("http://www.seleniumhq.org/");
            WebElement searchField = firefoxDriver.findElement(By.xpath("/html/body/header/nav/div/div/span/input"));
            searchField.sendKeys("Selenium");
            System.out.println(searchField);
        }
        @Test
    public static void test5_chrome_amazon() {
            chromeDriver.get("https://www.amazon.com");
            String Title = "Amazon.com. שלמו פחות, חייכו יותר.";
            Assert.assertEquals(chromeDriver.getTitle(), Title);
            chromeDriver.findElement(By.name("field-keywords")).sendKeys("נעלי עור");
            chromeDriver.findElement(By.id("nav-search-submit-button")).click();
        }
        @Test
    public static void test6_chrome_translate() {
            chromeDriver.get("https://translate.google.com");
            chromeDriver.findElement(By.xpath("//*[@id=\"i10\"]/span[3]")).click();
            chromeDriver.findElement(By.className("er8xn")).sendKeys("מה המצב?");
        }
        @Test
    public static void test7_chrome_youtube(){

    chromeDriver.get("https://www.youtube.com");

chromeDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            chromeDriver.manage().window().maximize();
var search = chromeDriver.findElement(By.tagName("input"));
search.sendKeys("עידן חביב - רודף אהבה בימים");

    chromeDriver.findElement(By.id("search-icon-legacy")).click();
            chromeDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    chromeDriver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();

         
            chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                WebElement addSkip = chromeDriver.findElement(By.className("ytp-ad-skip-button-icon"));

                addSkip.click();



        }
@Test
    public static void test8_chrome_facebook(){
    chromeDriver.get("http://www.facebook.com");
    chromeDriver.findElement(By.id("email")).sendKeys("me@gmail.com");
    chromeDriver.findElement(By.id("pass")).sendKeys("***************");
    chromeDriver.findElement(By.className("_6ltg")).click();

}








 }

