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
      public void KeyPressedVK2(){
          String gt = component.getjTextFiel1().getText();
          component.setKey((char) KeyEvent.VK_2);
          if (component.getKey() == KeyEvent.VK_2){
              component.getjTextFiel1().setText("2");

          }
          else {
              component.getjTextFiel1().setText("3");
          }
          Assert.assertEquals("VK_2 = " ,component.getjTextFiel1().getText() , "2");
      }

    @Test
    public void test_jButton_1_height(){
      int height = component.getjButton1().getHeight();
      Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_1_width(){
      int width = component.getjButton1().getWidth();
      Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_1_text(){
      Main jtext = new Main();
      String text =  jtext.getjButton1().getText();
      Assert.assertEquals("Text button +" , text , "1");
    }
    @Test
    public  void testfontjButton1(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton1().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
    }


      @Test
      public void test_jButton_2_height(){
          int height = component.getjButton2().getHeight();
          Assert.assertEquals("Height button +" , height , 33);
      }

      @Test
      public void test_jButton_2_width(){
          int width = component.getjButton2().getWidth();
          Assert.assertEquals("Width button +" , width , 51);
      }
      @Test
      public void test_jButton_2_text(){
          Main jtext = new Main();
          String text =  jtext.getjButton2().getText();
          Assert.assertEquals("Text button +" , text , "2");
      }
      @Test
      public  void testfontjButton2(){
          Main setfont1 = new Main();
          String font2 =  setfont1.getjButton2().getFont().getFontName();
          Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
      }


      @Test
      public void test_jButton_3_height(){
          int height = component.getjButton3().getHeight();
          Assert.assertEquals("Height button +" , height , 33);
      }

      @Test
      public void test_jButton_3_width(){
          int width = component.getjButton3().getWidth();
          Assert.assertEquals("Width button +" , width , 51);
      }
      @Test
      public void test_jButton_3_text(){
          Main jtext = new Main();
          String text =  jtext.getjButton3().getText();
          Assert.assertEquals("Text button +" , text , "3");
      }
      @Test
      public  void testfontjButton3(){
          Main setfont1 = new Main();
          String font2 =  setfont1.getjButton3().getFont().getFontName();
          Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
      }

      @Test
      public void test_jButton_4_height(){
          int height = component.getjButton3().getHeight();
          Assert.assertEquals("Height button +" , height , 33);
      }

      @Test
      public void test_jButton_4_width(){
          int width = component.getjButton4().getWidth();
          Assert.assertEquals("Width button +" , width , 51);
      }
      @Test
      public void test_jButton_4_text(){
          Main jtext = new Main();
          String text =  jtext.getjButton4().getText();
          Assert.assertEquals("Text button +" , text , "4");
      }
      @Test
      public  void testfontjButton4(){
          Main setfont1 = new Main();
          String font2 =  setfont1.getjButton4().getFont().getFontName();
          Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
      }

      @Test
      public void test_jButton_5_height(){
          int height = component.getjButton5().getHeight();
          Assert.assertEquals("Height button +" , height , 33);
      }

      @Test
      public void test_jButton_5_width(){
          int width = component.getjButton5().getWidth();
          Assert.assertEquals("Width button +" , width , 51);
      }
      @Test
      public void test_jButton_5_text(){
          Main jtext = new Main();
          String text =  jtext.getjButton5().getText();
          Assert.assertEquals("Text button +" , text , "5");
      }
      @Test
      public  void testfontjButton5(){
          Main setfont1 = new Main();
          String font2 =  setfont1.getjButton5().getFont().getFontName();
          Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
      }

      @Test
    public void test_division_by_one(){
      Main variable = new Main();
       variable.setNum(5.0);
       double d = variable.getNum();
          double division_by_one = 0;
      division_by_one = 1 / d;
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
      component.getjTextFiel1().setText("2-1");
      String str =component.getjTextFiel1().getText();
      assertEquals(str , "2-1");
    }


    @Test
    public void testmath() {
        component.setjCalculation("negative_number");
        double an = component.getAns();
        if (component.getCalculation() == "negative_number") {
            an = component.getNum() * -1;
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
          component.setjCalculation("1/x");
          double an = component.getAns();
          component.setNum(5.0);
          if (component.getCalculation() == "1/x") {
              an = 1 / component.getNum();
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
          component.setjCalculation("roun");
          double an = component.getAns();
          component.setNum(3.7);
          if (component.getCalculation() == "roun") {
              an =Math.round(component.getNum());
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
          component.setjCalculation("bin");
          String an ;
          component.getjTextFiel1().setText("15");
          if (component.getCalculation() == "bin") {
           component.getjLabel1().setText(Integer.toString(Integer.parseInt(component.getjTextFiel1().getText()),2));
          an = "bin";
          } else {
          an = "error";
              component.getjLabel1().setText("0");
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
          component.setjCalculation("hex");
          String an ;
          component.getjTextFiel1().setText("15");
          if (component.getCalculation() == "hex") {
              component.getjLabel1().setText(Integer.toString(Integer.parseInt(component.getjTextFiel1().getText()),2));
              an = "hex";
          } else {
              an = "error";
              component.getjLabel1().setText("0");
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
          component.setjCalculation("octal");
          String an ;
          component.getjTextFiel1().setText("15");
          if (component.getCalculation() == "octal") {
              component.getjLabel1().setText(Integer.toString(Integer.parseInt(component.getjTextFiel1().getText()),2));
              an = "octal";
          } else {
              an = "error";
              component.getjLabel1().setText("0");
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
          component.getjMenuItemON().setEnabled(true);
          if (component.getjMenuItemON().isEnabled()){
              b = "ON";
          }
          else {
              b ="OFF";
          }

          assertEquals(b , "ON");
      }
@Test
public void testans(){
        component.setNum(5.0);
   component.setAns(1 / component.getNum());
assertEquals("ans = " , component.getAns() , 0,2);
}
/*
    @Test
    public void testenab(){
       component.jButton1.setEnabled(true);
 assertEquals("b is " , component.jButton1.isEnabled() , true);
    }
*/
    @Test
      public void jButtonCActionPerformed(){
      component.getjTextFiel1().setText(" ");
      component.getjLabel1().getForeground();
     component.getjLabel1().getText();
     assertEquals("color = " ,  Color.black ,component.getjLabel1().getForeground() );
    
    }
    

  }
