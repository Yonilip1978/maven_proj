
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
public class RegKapFunc {


        public RegKapFunc(WebDriver driver) {
        }
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
            htmlReporter.config().setReportName("Functional & Usability Tests בדיקת תקנון קיי אס פי והעתקתו ל קונסול, KSP WebSite");
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



    }


