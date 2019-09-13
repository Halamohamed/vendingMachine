package se.ecutbildning.hala.vendingMachine;

public class Fruit extends Product {


    public Fruit(int productNumber, String name, double price, int calorie, String allergen) {
        super(productNumber, name, price, calorie, allergen);
    }

    @Override
    public String use(int productNumber) {
        return "The fruit " + getName() + " is used " + "with " + productNumber;
    }
}
