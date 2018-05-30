package testpackage;

import mainpackage.Calculation;
import mainpackage.Main;
import mainpackage.Process;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ProcessTest  {
   Process pro = new Process();
   Calculation calc = new Calculation();
    Main main = new Main();
        @Test /*expected = ArithmeticException.class)*/
        public void test_division_by_zero() {
        double t2=pro.t;
        double l2=pro.l;

        int an=(int)(t2/0);
        Assert.assertEquals(an,0);
        }
        @Test
    public void testchase_plus(){
        pro.l = 4;
         pro.t = 6;

            double sum = pro.l +pro.t;
           assertEquals("sum = " , sum , 10 , 1);

        }
}
