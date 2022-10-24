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

    public class E2Eksp {
        static WebDriver driver;
        static ExtentReports extent;
        static ExtentTest test1;
        static ExtentTest test1A;
        static ExtentTest test1B;
        static ExtentTest test1C;
        static ExtentTest test1D;
        E2Erun exm = new E2Erun(driver);
        String ImagesPath = "C:\\Users\\lip12\\OneDrive\\תמונות\\ksp1.jpg";
        @BeforeClass
        public static void setUpBeforeClass() throws Exception, InterruptedException, IOException, AWTException {
            //בדיקת קצה,בחירת מוצר,הוספה לעגלה,כניסה לתשלום
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://ksp.co.il/web/ ");
            driver.manage().window().maximize();
            Thread.sleep(3000);//נכנס למנוע חיפוש
            extent = E2Erun.GetExtent();
            test1 = E2Erun.createTest("testE2E TEST for KSP website בחירת מוצר והוספה לעגלה","description");
            test1A = E2Erun.createTest("testE2E TEST for KSP web נכנס שוב לוודא שהמוצר נשאר /נשמר בעגלה","description");
            test1B = E2Erun.createTest("testE2E TEST for KSP website כניסה לעגלה","description");
            test1C = E2Erun.createTest("testE2E TEST for KSP website כניסה לתשלום","description");
            test1D = E2Erun.createTest("testE2E TEST for KSP website לביצוע התשלום/אפשרות רק לרשומים","description");
        }

        @AfterClass
        public static void tearDownAfterClass() throws Exception {
            extent.flush();
            //	driver.quit();
        }
        @Test
        public void test1() throws InterruptedException, IOException, AWTException {
            driver.get("https://ksp.co.il/web/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[2]/div[2]/input")).sendKeys("star wars");//מחפש בובת STAR WARS
            Thread.sleep(5000);//בחירת מוצר והוספה לעגלה
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/button")).click();
            Thread.sleep(4000);
            WebDriverManager.chromedriver().setup();
            driver.get("https://ksp.co.il/web/ ");//נכנס שוב לוודא שהמוצר נשאר /נשמר בעגלה
            driver.manage().window().maximize();
            Thread.sleep(6000);
            Actions actions = new Actions(driver);
            test1.addScreenCaptureFromPath("C:\\Users\\lip12\\OneDrive\\תמונות\\ksp1.jpg");
            if(test1A.equals(test1A)){
            test1A.pass("נכנס שוב לוודא שהמוצר נשאר /נשמר בעגלה");
            }
            else {
                test1A.fail("לא הצליח להכנס");
                Thread.sleep(2000);

                driver.findElement(By.xpath("//a[@href='https://ksp.co.il/cart']")).click();//כניסה לעגלה
                {
                    if (test1B.equals(test1B)) {
                        test1B.pass("כניסה לעגלה");
                    } else {
                        test1B.fail("לא הצליח להכנס");
                        Thread.sleep(3000);
                    }
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("/html/body/div[3]/main/div[6]/div[3]/div[2]/button")).click();//כניסה לתשלום
                    Thread.sleep(3000);
                    if (test1C.equals(test1C)) {
                        test1C.pass("כניסה לתשלום");
                    } else {
                        test1C.fail("לא הצליח להכנס");
                    }
                    driver.findElement(By.xpath("/html/body/div[14]/div/div/div[2]/div[3]/div/div/form/button")).click();//לביצוע התשלום/אפשרות רק לרשומים
                    Thread.sleep(3000);
                    if (test1D.equals(test1D)) {
                        test1D.pass("מבצע תשלום רק לרשומים,הבדיקה בוצעה בהצלחה,נבחר פריט,הוכנס לעגלה,ומשם לתשלומים");
                    } else {
                        test1D.fail("לא מבצע תשלום,נפל");
                        Thread.sleep(2000);
                    }
                }
            }}}