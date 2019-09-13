package se.ecutbildning.hala.vendingMachine;

public enum Valor {
    one(1),
    five(5),
    ten(10),
    twenty(20),
    fifty(50),
    oneHundred(100),
    fiveHundred(500),
    oneThousand(1000)
    ;

    private int kr ;
    private Valor(int i) {
        this.kr = i;
    }
    public int getVal(){
        return kr;
    }
}
