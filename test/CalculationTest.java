
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationTest {
    Calculation calc = new Calculation();

    char nx = calc.x;
    char ny = calc.y;
    char nx2 = calc.x2;

    Process pro = new Process();

    @Test
    public void correctness_char() {
        String a;
        if (pro.isOperator(nx) && pro.isOperator(ny) && pro.isOperator(nx2)) {
            a = "not right";

        } else {
            a = "right";
        }

        Assert.assertEquals("correctness char is :", a, "right");

    }

    @Test
    public void delimeter() {
        String b;
        if (pro.isDelim(nx) && pro.isDelim(ny)) {
            b = "Two delimeter";
        } else {
            b = "One delimeter";
        }
        Assert.assertEquals("correctness delimiter is :", b, "One delimeter");

    }
}