package testpackage;
import mainpackage.Main;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainTest {
    Main component = new Main();

@Test
public void KeyPressed(){
    String gt = component.jTextField1.getText();
    component.cc = KeyEvent.VK_ENTER;
    if (component.cc == KeyEvent.VK_ENTER){
       gt = String.valueOf(component.mny);
    }
    Assert.assertEquals("VK_ENTER = ",gt ,"0.0");
}

    @Test
    public void test_jButton_1_height(){
        int height = component.jButton1.getHeight();
        Assert.assertEquals("Height button +" , height , 33);
      }
      
    @Test
    public void test_jButton_1_width(){
        int width = component.jButton1.getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
      @Test
      public void test_jButton_1_text(){
          Main jtext = new Main();
          String text =  jtext.jButton1.getText();
          Assert.assertEquals("Text button +" , text , "1");
      }

   @Test
    public void test_division_by_one(){
   Main variable = new Main();
    double division_by_one = variable.ans;
    double num2 = variable.num;
    num2 = 5;
    division_by_one = 1 / num2;
        assertEquals("Division by one = " , division_by_one,  0,2) ;
    }
/*
    @Test
    public void testTitleFrame() {
        Main jf = new Main();

        String titleFrame = jf.jMenuItemsientific.getText();
        assertEquals("Науковий", titleFrame);

    }
    */
    @Test
    public void testfw(){
 component.xt = 5;
String str;
        if (component.xt  == 5){
            str = "Norm";
        }
        else{
            str = "Error";
        }
assertEquals("tr = " , str , "Norm");
    }
   @Test
    public void testenablejt(){
    component.jTextField1.setText("2-1");
    String str =component.jTextField1.getText();
    assertEquals(str , "2-1");
    }

 

    /*
    @Test
    public void testmath() {
        component.calculation = "negative_number";
        double an = component.ans;
        if (component.calculation == "negative_number") {
            an = component.num * -1;
        } else {
            an = 0.0;
        }
        assertEquals(an, -0.0, 0);
        String mess;
if (component.mathematic() == 0){
    mess = "Seccesfull";
}
else {
    mess = "Error";
}
assertEquals("mess = " , mess , "Seccesfull");
    }*/

/*
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
   * */
    }