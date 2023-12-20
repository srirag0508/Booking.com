package StepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import static util.ConfigReader.getUrl;


public class SharedSD {
    private static WebDriver driver;

    @Before
    public void openUrl() throws IOException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");

        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.get(getUrl());

        // Sign in into application

        //  By SignInBtn = By.xpath("//a[@aria-label='Sign in']//span[@class='e4adce92df'][normalize-space()='Sign in']");
        //
        //    By username = By.id("username");
        //    By password = By.id("password");
        //
        //    By continueEmailBtn = By.xpath("//span[normalize-space()='Continue with email']");
        //
        //    By SignInSubmitBtn = By.xpath("//span[normalize-space()='Sign in']");
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            // Close the browser window
            driver.quit();
        }
    }


    public static WebDriver getDriver () {
            return driver;
        }
    }



