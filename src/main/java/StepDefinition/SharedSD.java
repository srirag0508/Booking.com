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



