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

        if (prior.priority('^') == 4 && prior.priority('!') == 3 &&
                prior.priority('s') ==3 &&  prior.priority('c') ==3
                &&  prior.priority('t') ==3
                &&  prior.priority('l') ==3
                &&   prior.priority('T') ==3
                &&   prior.priority('S') ==3
                &&   prior.priority('C') ==3
                &&   prior.priority('L') ==3
                &&   prior.priority('√') ==3
                && prior.priority('*') ==2 &&prior.priority('/') ==2
                &&prior.priority('+') ==1 && prior.priority('-') ==1)  {
            mess = "Prioritet is not correct";
        }
        else {
            mess = "Prioritet is correct";
        }
        Assert.assertEquals("correctness prioritet :", mess, "Prioritet is correct");
    }
}