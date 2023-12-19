package stepdefinition;

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
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(getUrl());
        }

        @After
        public void closeBrowser()
        {
            driver.close();
        }
 // driver to be available everywhere
        public static WebDriver getDriver()
        {
            return driver;
        }
}
