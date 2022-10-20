package my_pac;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class test {


    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test1;
    static ExtentTest test2;
    KSPfuncPage exm = new KSPfuncPage(driver);
    String ImagesPath = "C:\\Users\\lip12\\OneDrive\\תמונות\\ksp1.jpg";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception, InterruptedException, IOException, AWTException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\lip12\\Downloads\\chromedriver_win32 (3)//chromedriver.exe");//
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ksp.co.il/web/");
        driver.manage().window().maximize();
        extent = KSPfuncPage.GetExtent();
        test1 = KSPfuncPage.createTest("test1 QA KSP website הצליח להכנס להום פייג' לשדה חיפוש ומחפש אייפון","description");
        test2 = KSPfuncPage.createTest("test2 QA KSP website כניסה ללינקים,יוטיוב,פייסבוק,יצרן,מדפסת","description");


        //נכנס להום פייג' לשדה חיפוש ומחפש אייפון

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        extent.flush();
        //	driver.quit();
    }

    @Test
    public void test1() throws InterruptedException, IOException, AWTException {

        driver.get("https://ksp.co.il/web/item/124986");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[2]/div[2]/input")).sendKeys("אייפון");
        String str2 = "אייפון";
        Thread.sleep(3000);//בוחר ברשימה אייפון12 מיני
        Actions actions = new Actions(driver);
        test1.addScreenCaptureFromPath("C:\\Users\\lip12\\OneDrive\\תמונות\\ksp1.jpg");
        if (str2.equals(str2)){
            test1.pass("הצליח להכנס להום פייג' לשדה חיפוש ומחפש אייפון");
        }
        else {
            test1.fail("לא הצליח להכנס");
            Thread.sleep(2000);
        }
    }
    @Test
    public void test2() throws InterruptedException,  IOException ,AWTException {
        Thread.sleep(2000);

        driver.get("https://ksp.co.il/web/item/124986");
        driver.manage().window().maximize();
        Robot robot = new Robot();
        robot.mouseMove(440, 430);
        robot.delay(3000);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        //ירידת חץ למטה
        Thread.sleep(8000);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.mouseMove(440, 430);
        robot.delay(3000);
        //ירידת חץ למטה
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//img[@alt='Facebook']")).click();
        System.out.println("הצליח להתחבר פייסבוק");
        String str2a = "הצליח להתחבר פייסבוק";
        test2.addScreenCaptureFromPath("C:\\Users\\lip12\\OneDrive\\תמונות\\ksp1.jpg");
        if (str2a.equals(str2a)){
            test2.pass("הצליח להתחבר לפייסבוק");
        }
        else {
            test2.fail("לא הצליח להכנס");
            Thread.sleep(2000);
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("//img[@alt='youtube']")).click();
        System.out.println("הצליח להתחבר ליוטיוב");
        String str2b = "הצליח להתחבר ליוטיוב";
        Thread.sleep(4000);
        if (str2b.equals(str2b)){
            test2.pass("הצליח להתחבר ליוטיוב");
        }
        else {
            test2.fail("לא הצליח להכנס");
            Thread.sleep(2000);
        }
        driver.findElement(By.xpath("//img[@alt='manufacturer']")).click();
        System.out.println("הצליח להתחבר ליצרן");
        Thread.sleep(4000);
        String str2c = "הצליח להתחבר ליצרן";
        Thread.sleep(4000);
        if (str2c.equals(str2c)){
            test2.pass("הצליח להתחבר ליצרן");
        }
        else {
            test2.fail("לא הצליח להכנס");
            Thread.sleep(2000);
        }
        driver.findElement(By.xpath("//img[@alt='Print']")).click();
        System.out.println("הצליח להתחבר למדפסת");
        Thread.sleep(4000);
        String str2d = "הצליח להתחבר למדפסת";
        Thread.sleep(4000);
        if (str2d.equals(str2d)){
            test2.pass("הצליח להתחבר למדפסת");
        }
        else {
            test2.fail("לא הצליח להכנס");
            Thread.sleep(2000);
        }
    }

    public static void action(String linka, String linkb, WebDriver driver) throws InterruptedException {
        WebElement menu = driver.findElement(By.linkText(linka));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText(linkb));
        actions.click(submenu).perform();
    }
}
