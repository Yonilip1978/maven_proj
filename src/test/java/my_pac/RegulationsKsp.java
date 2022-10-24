
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
import java.io.IOException;
import java.util.List;

public class RegulationsKsp {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test1;
    RegKapFunc exm = new RegKapFunc(driver);
    String ImagesPath = "C:\\Users\\lip12\\OneDrive\\תמונות\\ksp1.jpg";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception, InterruptedException, IOException, AWTException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ksp.co.il/web/help/regulations");
        driver.manage().window().maximize();
        extent = RegKapFunc.GetExtent();
        test1 = RegKapFunc.createTest("test1 QA KSP website בדיקת תקנון קיי אס פי והעתקתו ל קונסול ", "description");
        Thread.sleep(6000);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        extent.flush();
        //	driver.quit();
    }

    @Test
    public void test1() throws InterruptedException, IOException, AWTException {
        driver.get("https://ksp.co.il/web/help/regulations");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        Actions actions = new Actions(driver);
        test1.addScreenCaptureFromPath("C:\\Users\\lip12\\OneDrive\\תמונות\\ksp1.jpg");
        List<WebElement> o1 = driver.findElements(By.xpath("/html/body/div[1]/div/div/div[1]/div[4]/div[4]/div/div[2]/p/div/div/div/div[6]/ol"));
        List<WebElement> marker = driver.findElements(By.xpath("/html/body/div[1]/div/div/div[1]/div[4]/div[4]/div/div[2]/p/div/div/div/div[6]/ol/li[1]"));
        for (int i = 0; i < o1.size(); i++)
            System.out.println(o1.get(i).getText() + marker.get(i).getText());
            Thread.sleep(4000);
            if (test1.equals(test1)){
                test1.pass("בדיקת תקנון קיי אס פי והעתקתו ל קונסול,הטסט עבר");
            Thread.sleep(2000);
            }
            else {
                test1.fail("טסט נפל");
                Thread.sleep(2000);

    }}}




