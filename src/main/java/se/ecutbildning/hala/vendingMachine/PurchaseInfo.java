package se.ecutbildning.hala.vendingMachine;

public class PurchaseInfo implements VendingMachine{

    private Product[] products;
    private int moneyPool;

    public PurchaseInfo(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(int amount) throws NumberFormatException {
        for (Valor valor : Valor.values()){
            if (valor.getVal() == amount){
                moneyPool += amount;
                return;
            }

        }throw new NumberFormatException();
    }

    @Override
    public Product request(int productNumber) throws NullPointerException, Exception {
        for (Product product : products){
            if (product.getProductNumber() == productNumber){
                if(product.getPrice()<= moneyPool) {
                    moneyPool -= product.getPrice();
                    System.out.println("The product you purchase is: ");
                    System.out.println(getDescription(productNumber));
                    return product;
                }
                if(product.getPrice()> moneyPool){
                    throw new Exception();
                }
        }
            }

        throw new NullPointerException();
    }

    @Override
    public int endSession() {
       int change = moneyPool;
        moneyPool = 0;
        return change;
        }


    @Override
    public String getDescription(int productNumber) throws NullPointerException {
        for (Product product : products){
            if (product.getProductNumber() == productNumber){
                return product.examine();
            }
        }
        throw new NullPointerException();
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProducts() {
        String[] temp = new String[10];
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<products.length; i++){
            sb.append(" Product number : " + products[i].getProductNumber() +" Name : " + products[i].getName()) ;
            sb.append("\n");
            temp[i] = sb.toString();
        }
        return temp;
    }
}
