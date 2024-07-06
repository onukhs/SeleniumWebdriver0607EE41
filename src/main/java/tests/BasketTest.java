package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasketFlow;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class BasketTest extends BasketFlow {

    @Test
    public void addItemsToBasketTest() {
        //login to website
        doLogin("standard_user");
        //search all Add to Cart buttons and assign them to the List/Array
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//*[contains(text(), 'Add to cart')]"));
        //Add 1st item to the basket(click on Add to Cart button)
        addToCartButtons.get(0).click();

        //Add Last item to the basket
        addToCartButtons.get(addToCartButtons.size()-1).click();

        //Verify that items are added to the basket
        String counter = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
        assertEquals("2", counter);
    }

    @Test
    public void removeItemFromTheBasket(){
        //1) Login to application as standard user
        //2) Add 1 first item to the basket
        //3) Verify that item is added
        //4) Go To basket and remove the item
        //5) Verify that item is not in the basket anymore
    }
}
