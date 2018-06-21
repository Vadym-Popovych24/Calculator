package testpackage;
import mainpackage.Process;
import mainpackage.Calculation;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class CalculationTest {
    Calculation calc = new Calculation();

    char nx = calc.getFirstFront();
    char ny = calc.getBeforeFirst();
    char nx2 = calc.getSecondFront();
    Process pro = new Process();
/*
    @Test
    public void test_eval(){
        LinkedList<Character> c2 =calc.getOp();
        c2.add('+');
        String e = "aasd";
        char bracket = ')';
        if (c2.getLast() !=bracket){
            e= "success";
        }
        else {
            e = "error";
        }
        Assert.assertEquals("There are no bracket" ,e , "success");
    }*/
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
/*
    @Test
    public void testeval(){
        int a;
        calc.getOp().add('+');
        calc.getOp().add('/');
        calc.getOp().add('*');
        calc.getOp().add('(');
        calc.getOp().add('-');
        if (calc.getOp().getLast() == ')' ){
            a = 1;
        }
        else {
            a = 0;
        }
        assertEquals("op = " ,0 ,a);
    }*/

}