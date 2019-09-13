package se.ecutbildning.hala.vendingMachine;

public abstract class Product {
    private int productNumber;
    private String name;
    private double price;
    private int calorie;
    private String allergen;

    public Product(int productNumber, String name, double price, int calorie, String allergen) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.calorie = calorie;
        this.allergen = allergen;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }
    public String examine(){
        return  "Product no: " + productNumber +
                ", Name: " + name +
                ", Price: " + price +
                ", Calorie: " + calorie +
                ", Allergen: " + allergen ;
    }
    public abstract String use(int productNumber);
}
