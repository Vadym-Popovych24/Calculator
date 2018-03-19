import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void initComponent(){
        Main but = new Main();
//        but.initComponents();
      String a =  but.jButton_1.getText();
           int b = but.jButton_1.getHeight();
        Assert.assertEquals("Height button +" , b , 33);
        Assert.assertEquals("Text button +" , a , "1");
      /*  Main one = new Main();

 assertEquals(one.jButton_1)   */ }
    @Test
    public void isDelim() {

    }

    @Test
    public void isOperator() {


    }

    @Test
    public void priority() {
    }

    @Test(/*expected = ArithmeticException.class*/)
    public void processOperator() {
        Main proc = new Main();
        double t2 = proc.t;
        double l2 = proc.l;
        int an = (int) (t2/0);
       Assert.assertEquals(an,1);

        /*double neb = proc.ans;
        if (proc.calculation == "1/x"){
            assertEquals("1/x = " , 4 , 5);
        }*/
    }


    @Test
    public void eval() {

    }

    @Test
    public void livesumTest(){

    }

    @Test
    public void mathematic() {
        
    }

    @Test
    public void vkl() {
    }

    @Test
    public void vykl() {
    }

    @Test
    public void main() {
    }
}