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


    @Test
    public void prioritys() {
        String an ;
        String mess;

        if (prior.priority('s') == 3) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");

    }


    @Test
    public void priorityc() {
        String an ;
        String mess;

        if (prior.priority('c') == 3) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");

    }

    @Test
    public void priorityt() {
        String an ;
        String mess;

        if (prior.priority('t') == 3) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");

    }
    @Test
    public void priorityS() {
        String an ;
        String mess;

        if (prior.priority('S') == 3) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");

    }
    @Test
    public void priorityC() {
        String an ;
        String mess;

        if (prior.priority('C') == 3) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");

    }
    @Test
    public void priorityT() {
        String an ;
        String mess;

        if (prior.priority('T') == 3) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");

    }
    @Test
    public void priorityl() {
        String an ;
        String mess;

        if (prior.priority('l') == 3) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");

    }
    @Test
    public void priorityL() {
        String an ;
        String mess;

        if (prior.priority('L') == 3) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "-");

    }
    @Test
    public void prioritypower() {
        String an ;
        String mess;

        if (prior.priority('^') == 4) {
            an = "+";
        } else {
            an = "-";
        }
        assertEquals(an, "+");

    }
}