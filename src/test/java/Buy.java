
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Buy {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Liel PC\\Desktop\\TEST\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shufersal.co.il/online/he/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ObjectPage b = new ObjectPage(driver);
        b.getmarket().click();
        b.getvegetables().click();
        Actions a = new Actions(driver);
        a.moveToElement(b.getPotato()).build().perform();
        a.moveToElement(b.getplusPotato()).click().build().perform();
        a.dragAndDrop(b.getPotato(), b.getcart()).build().perform();
        b.getclosepop().click();
        Thread.sleep(4000);
        a.dragAndDrop(b.getpurpleOnion(), b.getcart()).build().perform();

        Thread.sleep(4000);

        for (int i = 0; i < 10; i++) {
            a.moveToElement(b.getcosbra()).build().perform();
            a.moveToElement(b.getpluscosbra()).click().build().perform();
        }
        a.dragAndDrop(b.getcosbra(), b.getcart()).build().perform();
        Thread.sleep(2000);
        b.getsearch().sendKeys("חלב 3%");
        Thread.sleep(4000);

        b.getsearch().sendKeys(Keys.DOWN);
        for (int i = 0; i < 5; i++) {
            b.getplusmlik().click();
        }
        b.getaddmilk().click();
        Thread.sleep(2000);
        b.getPayable().click();
        b.getusername().sendKeys("bob@gmail.com");
        b.getpassword().sendKeys("12345012345");
        b.getok().click();
        driver.close();
        System.out.println("finish test");




    }
}
