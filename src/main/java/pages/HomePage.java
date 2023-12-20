package pages;

import org.openqa.selenium.By;

import java.util.ArrayList;

public class HomePage extends Base {

    By popupClose = By.xpath("//button[contains@aria-label,'Dismiss')]");


    public void closePopup() {
            try {
            clickOn(String.valueOf(popupClose));

            } catch (Exception e) {  }


        }
    By hotels = By.xpath("//div[@data-testid='title']");



    public void clickStarRating(String stars)    {
        By rating = By.xpath("//div[@data-filters-group='class']//input[@name='class="+stars+"']");
        clickOn(String.valueOf(rating));


        }



    }

