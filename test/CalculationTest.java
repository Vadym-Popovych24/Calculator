import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationTest extends Process {
    Calculation calc = new Calculation();
    @Test
    public void correctness_char (){
      String a;
       char nx = calc.x;
       char ny = calc.y;
       char nx2 = calc.x2;
       if (isOperator(nx) && isOperator(ny) && isOperator(nx2))
       {
         a = " not right";

       }
       else {
a = "right";
       }

       Assert.assertEquals("correctness char is :", a, "right");

    }


}