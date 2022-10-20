package my_pac;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FindBykspCatFunc {


    static WebDriver driver;

        private static ExtentReports extent;

        static DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        static Date today = Calendar.getInstance().getTime();
        static String reportDate = df.format(today);
        public static String filePath = "C:\\reportDate\\exReport.html" ;


        public static ExtentReports GetExtent() {
            new File("C:\\" ).mkdirs();
            if (extent != null)
                return extent; //avoid creating new instance of html file
            extent = new ExtentReports();
            extent.attachReporter(getHtmlReporter());
            return extent;
        }

        private static ExtentSparkReporter getHtmlReporter() {
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter(filePath);
            htmlReporter.config().setDocumentTitle("QAV automation report");
            htmlReporter.config().setReportName("Functional & Usability / UI Tests,קטגוריות, KSP WebSite");
            htmlReporter.config().setEncoding("UTF-8");
            return htmlReporter; }


        public static ExtentTest createTest(String name, String description){
            ExtentTest test = extent.createTest(name, description);
            return test;
        }

        public static String CaptureScreen(WebDriver driver) throws AWTException, IOException
        {
            LocalDateTime now = LocalDateTime.now();
            String  time =now.format(DateTimeFormatter.ofPattern("ddHHmmss", Locale.ENGLISH));
            String folderPath = ("C:\\reportDate");
            String imagePath   = folderPath  +"/pic" +time +".jpg";

            TakesScreenshot oScn = (TakesScreenshot) driver;
            File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
            File oDest = new File(imagePath);

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(scrFile, oDest);

		/*Robot robot = new Robot();
		BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(screenShot, "JPG", new File("C:\\reportDate"));*/
//

            return imagePath;
        }


        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/1']")//1
        static WebElement CellandComputercategory;//מחשבים וסלולר
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/3']")//2
        static WebElement Electriccategory;//מוצרי חשמל
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/17']")//3
        static WebElement TVcategory;//טלויזיות
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/18']")//4
        static WebElement Soundcategory;//סאונד
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/5']")//5
        static WebElement Perfumecategory;//בשמים
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/6']")//6
        static WebElement WatchWalletcategory;//שעונים וארנקים
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/4']")//7
        static WebElement Homecategory;//לבית
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/21']")//8
        static WebElement Gamecategory;//גיימינג
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/22']")//9
        static WebElement OfficeSchoolcategory;//למשרד ולתלמיד
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/20']")//10
        static WebElement Kittchencategory;//למטבח
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/23']")//11
        static WebElement MedicMasaagecategory;//רפואה ועיסוי
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/24']")//12
        static WebElement Beautycategory;//טיפוח
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/32']")//13
        static WebElement Cosmeticategory;//קוסמטיקה
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/14']")//14
        static WebElement CoffeTeecategory;//קפה ותה
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/13']")//15
        static WebElement Pharmcategory;//פארם
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/7']")//16
        static WebElement Babycategory;//תינוקות
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/2']")//17
        static WebElement Toyscategory;//צעצועים וילדים
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/8']")//18
        static WebElement Campingcategory;//קמפינג וטיולים
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/9']")//19
        static WebElement Bikecategory;//אופניים וקורקינטים
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/12']")//20
        static WebElement Sportcategory;//ספורט
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/15']")//21
        static WebElement Clothcategory;//הלבשה
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/11']")//22
        static WebElement Lithingcategory;//תאורה
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/26']")//23
        static WebElement Cleaningcategory;//ניקיון
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/16']")//24
        static WebElement AirConditioncategory;//מיזוג וחימום
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/31']")//25
        static WebElement Sanitarycategory;//סניטריה
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/10']")//26
        static WebElement Toolscategory;//כלי עבודה
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/30']")//27
        static WebElement Petscategory;//לחיות מחמד
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/25']")//28
        static WebElement Photocategory;//צילום
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/29']")//29
        static WebElement Cookingcategory;//בישול חוץ
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/28']")//30
        static WebElement SmartHomecategory;//בית חכם
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/27']")//31
        static WebElement Carcategory;//לרכב
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/world/19']")//32
        static WebElement Gardenycategory;//לגינה
        @FindBy (how = How.XPATH, using =  "//a[@href='/web/outlet']")//33
        static WebElement Outletcategory;//מציאון ועודפים
    }




