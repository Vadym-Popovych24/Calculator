package testpackage;

import mainpackage.Calculation;
import mainpackage.Main;
import mainpackage.Process;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ProcessTest {
    Process mnt = new Process();

    Process pro = new Process();
    Calculation calc = new Calculation();
    Main main = new Main();

    @Ignore /*expected = ArithmeticException.class)*/
    public void test_division_by_zero() {
       double t2 = pro.getFirstOperand();
        double l2 = pro.getSecondOperand();

        int an = (int) (t2 / 0);
        Assert.assertEquals(an, 0);
    }

    @Test
    public void testchase_plus() {
        pro.setFirstOperand(4);
        pro.setSecondOperand(6);

        double sum = pro.getFirstOperand() + pro.getSecondOperand();
        assertEquals("sum = ", sum, 10, 1);

    }

    @Test
    public void testisDelim() {
        {
            assertFalse(mnt.isDelim('+'));

        }
    }



}