package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eğer testimiz sırasında birden fazla sayfa arasında ileri geri hareket edeceksek
        driver.get() yerine driver.navigate().to("Url") methodunu kullanırız ve sonrasında
        forward(), back() veya refresh() methodlarını kullanabiliriz.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drives/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // amazon'a geri donelim
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden facebook'a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);
        // sayfayi kapatalim
        driver.close();
    }
}
