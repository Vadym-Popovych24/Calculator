package testpacket;
import mainpaket.Main;
import org.junit.Assert;
import org.junit.Test;


import java.awt.*;
import java.awt.event.KeyEvent;

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

    @Test
    public void testTitleFrame() {
        Main jf = new Main();

        String titleFrame = jf.jMenuItemsientific.getText();
        assertEquals("Науковий", titleFrame);

    }

  /*  @Test
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