package my_pac;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FindByKSPcategoryRun {
    static WebDriver driver;
    static FindBykspCatFunc pom;
    static ExtentReports extent;
    static ExtentTest test1;
    static ExtentTest test2;
    static ExtentTest test3;
    static ExtentTest test4;
    static ExtentTest test5;
    static ExtentTest test6;
    static ExtentTest test7;
    static ExtentTest test8;
    static ExtentTest test9;
    static ExtentTest test10;
    static ExtentTest test11;
    static ExtentTest test12;
    static ExtentTest test13;
    static ExtentTest test14;
    static ExtentTest test15;
    static ExtentTest test16;
    static ExtentTest test17;
    static ExtentTest test18;
    static ExtentTest test19;
    static ExtentTest test20;
    static ExtentTest test21;
    static ExtentTest test22;
    static ExtentTest test23;
    static ExtentTest test24;
    static ExtentTest test25;
    static ExtentTest test26;
    static ExtentTest test27;
    static ExtentTest test28;
    static ExtentTest test29;
    static ExtentTest test30;
    static ExtentTest test31;
    static ExtentTest test32;
    static ExtentTest test33;
    String ImagesPath = "C:\\Users\\lip12\\OneDrive\\תמונות\\ksp1.jpg";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        Thread.sleep(3000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ksp.co.il/web/");
        driver.manage().window().maximize();
        extent = FindBykspCatFunc.GetExtent();
        test1 = FindBykspCatFunc.createTest("test1 QA tests for KSP  מחשבים וסלולר Categories", "description");
        test2 = FindBykspCatFunc.createTest("test2 QA tests for KSP מוצרי חשמל  Categories", "description");
        test3 = FindBykspCatFunc.createTest("test3 QA tests for KSP טלויזיות Categories", "description");
        test4 = FindBykspCatFunc.createTest("test4 QA tests for KSP סאונד Categories", "description");
        test5 = FindBykspCatFunc.createTest("test5 QA tests for KSP בשמים Categories", "description");
        test6 = FindBykspCatFunc.createTest("test6 QA tests for KSP  שעונים וארנקים Categories", "description");
        test7 = FindBykspCatFunc.createTest("test7 QA tests for KSP לבית Categories", "description");
        test8 = FindBykspCatFunc.createTest("test8 QA tests for KSP גיימינג Categories", "description");
        test9 = FindBykspCatFunc.createTest("test9 QA tests for KSP למשרד ולתלמיד Categories", "description");
        test10 = FindBykspCatFunc.createTest("test10 QA tests for KSP למטבח Categories", "description");
        test11 = FindBykspCatFunc.createTest("test11 QA tests for KSP רפואה ועיסוי Categories", "description");
        test12 = FindBykspCatFunc.createTest("test12 QA tests for KSP טיפוח Categories", "description");
        test13 = FindBykspCatFunc.createTest("test13 QA tests for KSP קוסמטיקה Categories", "description");
        test14 = FindBykspCatFunc.createTest("test14 QA tests for KSP קפה ותה Categories", "description");
        test15 = FindBykspCatFunc.createTest("test15 QA tests for KSP פארם Categories", "description");
        test16 = FindBykspCatFunc.createTest("test16 QA tests for KSP תינוקות Categories", "description");
        test17 = FindBykspCatFunc.createTest("test17 QA tests for KSP צעצועים וילדים Categories", "description");
        test18 = FindBykspCatFunc.createTest("test18 QA tests for KSP קמפינג וטיולים Categories", "description");
        test19 = FindBykspCatFunc.createTest("test19 QA tests for KSP אופניים וקורקינטים Categories", "description");
        test20 = FindBykspCatFunc.createTest("test20 QA tests for KSP ספורט Categories", "description");
        test21 = FindBykspCatFunc.createTest("test21 QA tests for KSP הלבשה Categories", "description");
        test22 = FindBykspCatFunc.createTest("test22 QA tests for KSP תאורה Categories", "description");
        test23 = FindBykspCatFunc.createTest("test23 QA tests for KSP ניקיון Categories", "description");
        test24 = FindBykspCatFunc.createTest("test24 QA tests for KSP מיזוג וחימום Categories", "description");
        test25 = FindBykspCatFunc.createTest("test25 QA tests for KSP סניטריה Categories", "description");
        test26 = FindBykspCatFunc.createTest("test26 QA tests for KSP כלי עבודה Categories", "description");
        test27 = FindBykspCatFunc.createTest("test27 QA tests for KSP לחיות מחמד Categories", "description");
        test28 = FindBykspCatFunc.createTest("test28 QA tests for KSP צילום Categories", "description");
        test29 = FindBykspCatFunc.createTest("test29 QA tests for KSP בישול חוץ Categories", "description");
        test30 = FindBykspCatFunc.createTest("test30 QA tests for KSP בית חכם Categories", "description");
        test31 = FindBykspCatFunc.createTest("test31 QA tests for KSP לרכב Categories", "description");
        test32 = FindBykspCatFunc.createTest("test32 QA tests for KSP לגינה Categories", "description");
        test33 = FindBykspCatFunc.createTest("test33 QA tests for KSP מציאון ועודפים Categories", "description");

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        extent.flush();
        //	driver.quit();
    }

    @Test
    public  void test1() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://ksp.co.il/web/");
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.CellandComputercategory.getText().equals("מחשבים וסלולר")) {
            Thread.sleep(3000);
            test1.pass("קטגוריה מחשבים וסלולור קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 1 fail");
        }
    }
    @Test
    public  void test2() throws Exception {
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Electriccategory.getText().equals("מוצרי חשמל")) {
            Thread.sleep(3000);
            test2.pass("קטגוריה מוצרי חשמל קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 2 fail");
        }
    }
    @Test
    public  void test3() throws Exception {
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.TVcategory.getText().equals("טלוויזיות")) {
            Thread.sleep(3000);
            test3.pass("קטגוריה טלוויזיות קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 3 fail");

        }
    }
    @Test
    public  void test4() throws Exception {
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Soundcategory.getText().equals("סאונד")) {
            Thread.sleep(3000);
            test4.pass("קטגוריה סאונד קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 4 fail");
        }
    }
    @Test
    public  void test5() throws Exception {
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Perfumecategory.getText().equals("בשמים")) {
            Thread.sleep(3000);
            test5.pass("קטגוריה בשמים קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 5 fail");
        }
    }
    @Test
    public  void test6() throws Exception {
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.WatchWalletcategory.getText().equals("שעונים וארנקים")) {
            Thread.sleep(3000);
            test6.pass("קטגוריה שעונים וארנקים קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 6 fail");
        }
    }
    @Test
    public  void test7() throws Exception {
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Homecategory.getText().equals("לבית")) {
            Thread.sleep(3000);
            test7.pass("קטגוריה לבית קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 7 fail");
        }
    }
    @Test
    public  void test8() throws Exception {
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Gamecategory.getText().equals("גיימינג")) {
            Thread.sleep(3000);
            test8.pass("קטגוריה גיימינג קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 8 fail");
        }
    }
    @Test
    public  void test9() throws Exception {
        Thread.sleep(5000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.OfficeSchoolcategory.getText().equals("למשרד ולתלמיד")) {
            Thread.sleep(3000);
            test9.pass("קטגוריה למשרד ולתלמיד קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 9 fail");
        }
    }
    @Test
    public  void test10() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ksp.co.il/web/");
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Kittchencategory.getText().equals("למטבח")) {
            Thread.sleep(3000);
            test10.pass("קטגוריה למטבח קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 10 fail");
        }
    }
    @Test
    public  void test11() throws Exception {
        driver.get("https://ksp.co.il/web/");
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.MedicMasaagecategory.getText().equals("רפואה ועיסוי")) {
            Thread.sleep(3000);
            test11.pass("קטגוריה רפואה ועיסוי קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 11 fail");
        }
    }
    @Test
    public  void test12() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Beautycategory.getText().equals("טיפוח")) {
            Thread.sleep(3000);
            test12.pass("קטגוריה טיפוח קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 12 fail");
        }
    }
    @Test
    public  void test13() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Cosmeticategory.getText().equals("קוסמטיקה")) {
            Thread.sleep(3000);
            test13.pass("קטגוריה קוסמטיקה קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 13 fail");
        }
    }
    @Test
    public  void test14() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver,FindBykspCatFunc.class);
        if (pom.CoffeTeecategory.getText().equals("קפה ותה")) {
            Thread.sleep(3000);
            test14.pass("קטגוריה קפה ותה,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 14 fail");
        }
    }
    @Test
    public  void test15() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Pharmcategory.getText().equals("פארם")) {
            Thread.sleep(3000);
            test15.pass("קטגוריה פארם קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 15 fail");
        }
    }
    @Test
    public  void test16() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver,FindBykspCatFunc.class);
        if (pom.Babycategory.getText().equals("תינוקות")) {
            Thread.sleep(3000);
            test16.pass("קטגוריה תינוקות קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 16 fail");
        }
    }
    @Test
    public  void test17() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Toyscategory.getText().equals("צעצועים וילדים")) {
            Thread.sleep(3000);
            test17.pass("קטגוריה צעצועים וילדים קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 17 fail");
        }
    }
    @Test
    public  void test18() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Campingcategory.getText().equals("קמפינג וטיולים")) {
            Thread.sleep(3000);
            test18.pass("קטגוריה קמפינג וטיולים קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 18 fail");
        }
    }
    @Test
    public  void test19() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Bikecategory.getText().equals("אופניים וקורקינטים")) {
            Thread.sleep(3000);
            test19.pass("קטגוריה אופניים וקורקינטים קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 19 fail");
        }
    }
    @Test
    public  void test20() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Sportcategory.getText().equals("ספורט")) {
            Thread.sleep(3000);
            test20.pass("קטגוריה ספורט קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 20 fail");
        }
    }
    @Test
    public  void test21() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Clothcategory.getText().equals("הלבשה")) {
            Thread.sleep(3000);
            test21.pass("קטגוריה הלבשה קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 21 fail");
        }
    }
    @Test
    public  void test22() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Lithingcategory.getText().equals("תאורה")) {
            Thread.sleep(3000);
            test22.pass("קטגוריה תאורה קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 22 fail");
        }
    }
    @Test
    public  void test23() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver,FindBykspCatFunc.class);
        if (pom.Cleaningcategory.getText().equals("ניקיון")) {
            Thread.sleep(3000);
            test23.pass("קטגוריה ניקיון קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 23 fail");
        }
    }
    @Test
    public  void test24() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver,FindBykspCatFunc.class);
        if (pom.AirConditioncategory.getText().equals("מיזוג וחימום")) {
            Thread.sleep(3000);
            test24.pass("קטגוריה מיזוג וחימום קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 24 fail");
        }
    }
    @Test
    public  void test25() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Sanitarycategory.getText().equals("סניטריה")) {
            Thread.sleep(3000);
            test25.pass("קטגוריה סניטריה קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 25 fail");
        }
    }
    @Test
    public  void test26() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Toolscategory.getText().equals("כלי עבודה")) {
            Thread.sleep(3000);
            test26.pass("קטגוריה כלי עבודה קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 26 fail");
        }
    }
    @Test
    public  void test27() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Petscategory.getText().equals("לחיות מחמד")) {
            Thread.sleep(3000);
            test27.pass("קטגוריה לחיות מחמד קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 27 fail");
        }
    }
    @Test
    public  void test28() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Photocategory.getText().equals("צילום")) {
            Thread.sleep(3000);
            test28.pass("קטגוריה צילום קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 28 fail");
        }
    }
    @Test
    public  void test29() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver,FindBykspCatFunc.class);
        if (pom.Cookingcategory.getText().equals("בישול חוץ")) {
            Thread.sleep(3000);
            test29.pass("קטגוריה בישול חוץ קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 29 fail");
        }
    }
    @Test
    public  void test30() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.SmartHomecategory.getText().equals("בית חכם")) {
            Thread.sleep(3000);
            test30.pass("קטגוריה בית חכם קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 30 fail");
        }
    }
    @Test
    public  void test31() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Carcategory.getText().equals("לרכב")) {
            Thread.sleep(3000);
            test31.pass("קטגוריה לרכב קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 31 fail");
        }
    }
    @Test
    public  void test32() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Gardenycategory.getText().equals("לגינה")) {
            Thread.sleep(3000);
            test32.pass("קטגוריה לגינה קיים,הטסט עבר בהצלחה");
        } else {
            System.err.println("test 32 fail");
        }
    }
    @Test
    public  void test33() throws Exception {
        Thread.sleep(6000);
        FindBykspCatFunc pom = new FindBykspCatFunc();
        pom = PageFactory.initElements(driver, FindBykspCatFunc.class);
        if (pom.Outletcategory.getText().equals("מציאון ועודפים")) {
            Thread.sleep(3000);
            test33.pass("קטגוריה מציאון ועודפים קיים,הטסט עבר בהצלחה");

        } else {
            System.err.println("test 33 fail");
        }
    }
}







