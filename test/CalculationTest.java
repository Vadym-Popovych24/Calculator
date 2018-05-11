import mainpaket.Calculation;
import mainpaket.Process;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationTest  {
    Calculation calc = new Calculation();
    Process pro = new Process();
    @Test
    public void correctness_char (){
      String a;
       char nx = calc.x;
       char ny = calc.y;
       char nx2 = calc.x2;
       if (pro.isOperator(nx) && pro.isOperator(ny) && pro.isOperator(nx2))
       {
         a = " not right";

       }
       else {
a = "right";
       }

       Assert.assertEquals("correctness char is :", a, "right");

    }


}