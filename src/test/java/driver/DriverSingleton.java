package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static WebDriver driver;

    //static final Logger log = getLogger(lookup().lookupClass());

    public static WebDriver getDriver(){
        if(driver == null){
            init();
        }
        return driver;
    }
    public static void init(){
        /*var opt = new ChromeOptions();
        driver = new ChromeDriver(opt);*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }
}
