import mainpaket.Main;
import mainpaket.Process;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ProcessTest  {
   Process pro = new Process();
    Main main = new Main();
        @Test /*expected = ArithmeticException.class)*/
        public void test_division_by_zero() {
        double t2=pro.t;
        double l2=pro.l;

        int an=(int)(t2/0);
        Assert.assertEquals(an,0);
        }
/*
    @Test
    public void test_division() {
            pro.t =5;
            pro.l =2;
         main.mn =  (pro.t / pro.l);

        double an =0;

        Assert.assertEquals("Division = ",main.mn, 2.5,0);
    }
*/
}
