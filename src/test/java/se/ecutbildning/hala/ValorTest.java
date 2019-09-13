package se.ecutbildning.hala;

import org.junit.Assert;
import org.junit.Test;
import se.ecutbildning.hala.vendingMachine.Valor;

public class ValorTest {
    @Test
    public void denomination_value_test() {
        int expectedValue = 500;
        Assert.assertEquals(expectedValue, Valor.fiveHundred.getVal());
    }

    @Test
    public void denomination_value_of_test(){
        String expectedvalueOf = "one";
        Assert.assertEquals(expectedvalueOf, Valor.one.toString());
    }
}
