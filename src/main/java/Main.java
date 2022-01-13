import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) {
        ////Answer 2
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omer Brosh\\Downloads\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://translate.google.com");
chromeDriver.findElement(By.className("er8xn"));
chromeDriver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea"));
        System.out.println(chromeDriver.findElement(By.className("er8xn")));
        System.out.println(chromeDriver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea")));
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.youtube.com");
        System.out.println(firefoxDriver.findElement(By.cssSelector("yt-simple-endpoint style-scope ytd-mini-guide-entry-renderer")));

    }
}
