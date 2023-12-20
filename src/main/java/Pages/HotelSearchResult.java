package Pages;

import org.openqa.selenium.By;

import java.util.ArrayList;

import static StepDefinition.SharedSD.getDriver;

public class HotelSearchResult extends Base {
    By hotels = By.xpath("//div[@data-testid='title']");

    public ArrayList<String> getHotelsList()
    {
        return getElementTextList(hotels);
    }

    public void clickStarRating(String star)
    {
        By rating = By.xpath("//div[@data-filters-group='class']//input[@name='class="+star+"']");
        clickStarRating(String.valueOf(rating));

    }

    By totalRatings = By.xpath("//div[@data-testid='rating-stars']");
    By totalStars = By.xpath("//div[@data-testid='rating-stars']/span");

    public int getTotalRatings()
    {
        return  getDriver().findElements(totalRatings).size();
    }

    public int getTotalStars()
    {
        return  getDriver().findElements(totalStars).size();
    }


    By priceList = By.xpath("//span[@data-testid='price-and-discounted-price']");

    public ArrayList<Integer> getPriceList()
    {
        ArrayList<String> priceListStr = getElementTextList(priceList); // ₹ 18,500
        ArrayList<Integer> priceListInt = new ArrayList<>();
        for (String priceStr: priceListStr ) {

            String priceWithComma = priceStr.split(" ")[1]; // 18,500
            String priceWithoutComma= priceWithComma.replace(",",""); // 18500
            int price = Integer.parseInt(priceWithoutComma);

            priceListInt.add(price);
        }

        return priceListInt;
    }
}
