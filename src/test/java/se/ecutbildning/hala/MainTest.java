package se.ecutbildning.hala;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutbildning.hala.vendingMachine.*;

public class MainTest {
    Product[] products;
    PurchaseInfo testObject;

    @Before
    public void before_test() {
        products = new Product[6];
        products[0] = new Fruit(1, "Melon", 100, 10, "No allergen");
        products[1] = new Fruit(2, "Banana", 5, 20, "No idea");
        products[2] = new Candy(3, "Thyself rat", 15, 30, "Gluten");
        products[3] = new Candy(4, "Chocolate", 20, 100, "Nuts");
        products[4] = new Drink(5, "Cola", 20, 200, "No allergen");
        products[5] = new Drink(6, "Milk", 25, 140, "Lactose");
        testObject = new PurchaseInfo(products);
    }

    @Test
    public void test_show_all_products(){
        Assert.assertNotNull(testObject.getProducts());
    }

}
