package Pages;

import org.openqa.selenium.By;

public class Sigin extends Base {



    By SignInBtn = By.xpath("//a[@aria-label='Sign in']//span[@class='e4adce92df'][normalize-space()='Sign in']");

    By username = By.id("username");
    By password = By.id("password");

    By continueEmailBtn = By.xpath("//span[normalize-space()='Continue with email']");

    By SignInSubmitBtn = By.xpath("//span[normalize-space()='Sign in']");

    public void SignIn()
    {
        SignInBtn.click();


    }




}
