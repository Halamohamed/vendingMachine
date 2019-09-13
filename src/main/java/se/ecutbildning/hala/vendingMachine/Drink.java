package se.ecutbildning.hala.vendingMachine;

public class Drink extends Product{


    public Drink(int productNumber, String name, double price, int calorie, String allergen) {
        super(productNumber, name, price, calorie, allergen);
    }

    @Override
    public String use(int productNumber) {

        return "The drink " + getName() + " is used " + "with " + productNumber;
    }
}
