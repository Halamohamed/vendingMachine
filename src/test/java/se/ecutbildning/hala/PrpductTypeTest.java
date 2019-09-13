package se.ecutbildning.hala;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutbildning.hala.vendingMachine.Candy;
import se.ecutbildning.hala.vendingMachine.Drink;
import se.ecutbildning.hala.vendingMachine.Fruit;
import se.ecutbildning.hala.vendingMachine.Product;

public class PrpductTypeTest {
    Product[] drinks;
    Product[] fruits;
    Product[] candies;
    @Before
    public void init() {
        drinks = new Product[3];
       drinks[0] = new Drink(1, "Cola", 20, 1000, "No allergen");
       drinks[1] = new Drink(2, "Juice", 12, 110, "No idea");
       drinks[2] = new Drink(3, "Milk", 15, 100, "Lactose");
       fruits = new Product[3];
        fruits[0] = new Fruit(1, "Apple", 10, 100, "No allergen");
       fruits[1] = new Fruit(2, "Orange", 12, 110, "No allergen");
        fruits[2] = new Fruit(3, "Melon", 110, 100, "No allergen");

       candies = new Product[2];
      candies[0] = new Candy(1, "Chocolate", 15, 1000, "Nötter");
       candies[1] = new Candy(2, "Seg råtta", 12, 110, "Gluten");
    }

    @Test
    public void test_drink_test(){
        String expectedOutput = "The drink Cola is used with 1";
        Assert.assertEquals(expectedOutput, drinks[0].use(1));
    }
    @Test
    public void test_fruit_test(){
        String expectedOutput = "The fruit Apple is used with 1";
        Assert.assertEquals(expectedOutput, fruits[0].use(1));
    }
    @Test
    public void test_candy_test(){
        String expectedOutput = "The candy Seg råtta is used with 2";
        Assert.assertEquals(expectedOutput, candies[1].use(2));
    }
}
