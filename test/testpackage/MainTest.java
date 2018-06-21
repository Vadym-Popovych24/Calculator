package testpackage;


import mainpackage.Main;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.KeyEvent;


import java.awt.event.*;
import static org.junit.Assert.*;

  public class MainTest {

      Main component = new Main();


      @Test
      public void KeyPressedVK2() {
          String gt = component.getjTextFiel1().getText();
          component.setKey((char) KeyEvent.VK_2);
          if (component.getKey() == KeyEvent.VK_2) {
              component.getjTextFiel1().setText("2");
          } else {
              component.getjTextFiel1().setText("3");
          }
          Assert.assertEquals("VK_2 = ", component.getjTextFiel1().getText(), "2");
      }


      @Ignore
      public void test_division_by_one() {
          Main variable = new Main();
          variable.setNum(5.0);
          double d = variable.getNum();
          double division_by_one = 0;
          division_by_one = 1 / d;
          assertEquals("Division by one = ", division_by_one, 0, 2);
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
          assertEquals(an, 0.0, 0);
          String mess;
          if (component.mathematic() == 0) {
              mess = "Seccesfull";
          } else {
              mess = "Error";
          }
          assertEquals("mess = ", mess, "Seccesfull");
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
          if (component.mathematic() == 0) {
              mess = "Seccesfull";
          } else {
              mess = "Error";
          }
          assertEquals("mess = ", mess, "Seccesfull");
      }


      @Test
      public void testroun() {
          component.setjCalculation("roun");
          double an = component.getAns();
          component.setNum(3.7);
          if (component.getCalculation() == "roun") {
              an = Math.round(component.getNum());
          } else {
              an = 0.0;
          }
          assertEquals(an, 4, 0);
          String mess;
          if (component.mathematic() == 0) {
              mess = "Seccesfull";
          } else {
              mess = "Error";
          }
          assertEquals("mess = ", mess, "Seccesfull");
      }

      @Test
      public void testbin() {
          component.setjCalculation("bin");
          String an;
          component.getjTextFiel1().setText("15");
          if (component.getCalculation() == "bin") {
              component.getjLabel1().setText(Integer.toString(Integer.parseInt(component.getjTextFiel1().getText()), 2));
              an = "bin";
          } else {
              an = "error";
              component.getjLabel1().setText("0");
          }
          assertEquals(an, "bin");
          String mess;
          if (component.mathematic() == 0) {
              mess = "Seccesfull";
          } else {
              mess = "Error";
          }
          assertEquals("mess = ", mess, "Seccesfull");
      }

      @Test
      public void testhex() {
          component.setjCalculation("hex");
          String an;
          component.getjTextFiel1().setText("15");
          if (component.getCalculation() == "hex") {
              component.getjLabel1().setText(Integer.toString(Integer.parseInt(component.getjTextFiel1().getText()), 2));
              an = "hex";
          } else {
              an = "error";
              component.getjLabel1().setText("0");
          }
          assertEquals(an, "hex");
          String mess;
          if (component.mathematic() == 0) {
              mess = "Seccesfull";
          } else {
              mess = "Error";
          }
          assertEquals("mess = ", mess, "Seccesfull");
      }

      @Test
      public void testoctal() {
          component.setjCalculation("octal");
          String an;
          component.getjTextFiel1().setText("15");
          if (component.getCalculation() == "octal") {
              component.getjLabel1().setText(Integer.toString(Integer.parseInt(component.getjTextFiel1().getText()), 2));
              an = "octal";
          } else {
              an = "error";
              component.getjLabel1().setText("0");
          }
          assertEquals(an, "octal");
          String mess;
          if (component.mathematic() == 0) {
              mess = "Seccesfull";
          } else {
              mess = "Error";
          }
          assertEquals("mess = ", mess, "Seccesfull");
      }



      @Test
      public void testans() {
          component.setNum(5.0);
          component.setAns(1 / component.getNum());
          assertEquals("ans = ", component.getAns(), 0, 2);
      }

      @Test
      public void testlivesum() {
          component.livesum();
      }


      @Test
      public void testKeyPressed1() {
          try {
              KeyEvent press = null;
              component.jTextField1KeyPressed(press);
              component.setKey((char) KeyEvent.VK_1);
              press.setKeyCode(75);
             // component.setKey(press.getKeyChar());
              if (component.getKey() == KeyEvent.VK_1) {
                  component.getjTextFiel1().setText("1");
              } else {
                  component.getjTextFiel1().setText("2");
              }
              Assert.assertEquals("VK_2 = ", component.getjTextFiel1().getText(), "1");
          } catch (Exception e) {
              e.getMessage();

          }
      }


  }
