package testpackage;
import jdk.nashorn.internal.AssertsEnabled;
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
      component.cc = KeyEvent.VK_2;
      if (component.cc == KeyEvent.VK_2){
          component.jTextField1.setText("2");

      }
      else {
          component.jTextField1.setText("3");
      }
      Assert.assertEquals("VK_2 = " ,component.jTextField1.getText() , "2");
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
    public void testenablejt(){
      component.jTextField1.setText("2-1");
      String str =component.jTextField1.getText();
      assertEquals(str , "2-1");
    }


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
    }
     @Test
      public void test1x() {
          component.calculation = "1/x";
          double an = component.ans;
          component.num = 5;
          if (component.calculation == "1/x") {
              an = 1 / component.num;
          } else {
              an = 0.0;
          }
          assertEquals(an, 0.2, 0);
          String mess;
          if (component.mathematic() == 0){
              mess = "Seccesfull";
          }
          else {
              mess = "Error";
          }
          assertEquals("mess = " , mess , "Seccesfull");
      }

      @Test
      public void testroun() {
          component.calculation = "roun";
          double an = component.ans;
          component.num = 3.7;
          if (component.calculation == "roun") {
              an =Math.round(component.num);
          } else {
              an = 0.0;
          }
          assertEquals(an, 4, 0);
          String mess;
          if (component.mathematic() == 0){
              mess = "Seccesfull";
          }
          else {
              mess = "Error";
          }
          assertEquals("mess = " , mess , "Seccesfull");
      }
      @Test
      public void testbin() {
          component.calculation = "bin";
          String an ;
          component.jTextField1.setText("15");
          if (component.calculation == "bin") {
           component.jLabel1.setText(Integer.toString(Integer.parseInt(component.jTextField1.getText()),2));
          an = "bin";
          } else {
          an = "error";
              component.jLabel1.setText("0");
          }
          assertEquals(an , "bin");
          String mess;
          if (component.mathematic() == 0){
              mess = "Seccesfull";
          }
          else {
              mess = "Error";
          }
          assertEquals("mess = " , mess , "Seccesfull");
      }
      @Test
      public void testhex() {
          component.calculation = "hex";
          String an ;
          component.jTextField1.setText("15");
          if (component.calculation == "hex") {
              component.jLabel1.setText(Integer.toString(Integer.parseInt(component.jTextField1.getText()),2));
              an = "hex";
          } else {
              an = "error";
              component.jLabel1.setText("0");
          }
          assertEquals(an , "hex");
          String mess;
          if (component.mathematic() == 0){
              mess = "Seccesfull";
          }
          else {
              mess = "Error";
          }
          assertEquals("mess = " , mess , "Seccesfull");
      }
      @Test
      public void testoctal() {
          component.calculation = "octal";
          String an ;
          component.jTextField1.setText("15");
          if (component.calculation == "octal") {
              component.jLabel1.setText(Integer.toString(Integer.parseInt(component.jTextField1.getText()),2));
              an = "octal";
          } else {
              an = "error";
              component.jLabel1.setText("0");
          }
          assertEquals(an , "octal");
          String mess;
          if (component.mathematic() == 0){
              mess = "Seccesfull";
          }
          else {
              mess = "Error";
          }
          assertEquals("mess = " , mess , "Seccesfull");
      }
           @Test
      public void testvkl() {
          String vkl;
          if (component.vkl() == 0) {
              vkl = "on";
          } else {
              vkl = "off";
          }
          String b;
          component.jMenuItemON.setEnabled(true);
          if (component.jMenuItemON.isEnabled()){
              b = "ON";
          }
          else {
              b ="OFF";
          }

          assertEquals(b , "ON");
      }
@Test
public void testans(){
        component.num = 5;
    component.ans = 1 / component.num;
assertEquals("ans = " , component.ans , 0,2);
}
    @Test
    public void testenab(){
       component.jButton1.setEnabled(true);
 assertEquals("b is " , component.jButton1.isEnabled() , true);
    
    }

    @Test
      public void jButtonCActionPerformed(){
      component.jTextField1.setText(" ");
      component.jLabel1.getForeground();
     component.jLabel1.getText();
     assertEquals("color = " ,  Color.black ,component.jLabel1.getForeground() );
    
    }
    

  }
