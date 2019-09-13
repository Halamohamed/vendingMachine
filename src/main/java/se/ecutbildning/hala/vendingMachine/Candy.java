package se.ecutbildning.hala.vendingMachine;

public class Candy extends Product{


    public Candy(int productNumber, String name, double price, int calorie, String allergen) {
        super(productNumber, name, price, calorie, allergen);
    }

    @Override
    public String use(int productNumber) {
        return "The candy " + getName() + " is used " + "with " + productNumber;
    }
}
