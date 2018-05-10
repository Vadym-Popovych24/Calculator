import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ProcessTest  {
    Process process=new Process();
    Main main = new Main();
        @Test /*expected = ArithmeticException.class)*/
        public void test_division_by_zero() {
        double t2=process.t;
        double l2=process.l;

        int an=(int)(t2/0);
        Assert.assertEquals(an,0);
        }

    @Test
    public void test_division() {
            process.t =5;
            process.l =2;
         main.mn =  (process.t / process.l);

        double an =0;

        Assert.assertEquals("Division = ",main.mn, 2.5,0);
    }

}
