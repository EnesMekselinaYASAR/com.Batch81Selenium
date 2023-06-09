package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {

        /*
        En ilkel haliyle bir otomasyon yapmak icin
        Class'imiza otomasyon icin gerekli webdriver'in yerini gostermemiz gerekir
        bunun icin Java kutuphanesinden System.setProperty() methodu kullaniriz.
        method 2 parametre istemektedir
        ilki kullanacaginiz driver: webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu :
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drives/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.twitter.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");

        Thread.sleep(2000);

        // driver.close();

    }
}
