package se.ecutbildning.hala.vendingMachine;

public interface VendingMachine {
    void addCurrency(int amount);
    Product request(int productNumber) throws Exception;
    int endSession();
    String getDescription(int productNumber) throws Exception;
    int getBalance();
    String[] getProducts();
}
