package testpackage;

import mainpackage.Prioritet;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class PrioritetTest {
    Prioritet prior = new Prioritet();

    @Test
    public void prioritet() {
        String mess;

        if (prior.priority('^') == 4 && prior.priority('!') == 3

                && prior.priority('*') == 2 && prior.priority('/') == 2 && prior.priority('+') == 1 && prior.priority('-') == 1) {
            mess = "Prioritet is not correct";
        } else {
            mess = "Prioritet is correct";
        }
        Assert.assertEquals("correctness prioritet :", mess, "Prioritet is correct");
    }

    @Test
    public void priority() {
    String an ;
    String mess;

        if (prior.priority('+') == 1) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");
    if( prior.priority('+') == 0)

    {
        mess = "Seccesfull";
    }
else

    {
        mess = "Error";
    }
        assertEquals("mess = " , mess , "Seccesfull");


}
}