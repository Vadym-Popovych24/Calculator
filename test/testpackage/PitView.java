package testpackage;

import mainpackage.Main;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.awt.*;
import java.awt.event.ActionListener;

public class PitView {
    Main component = new Main();
    @Test
    public void testTitleFrame() {
        Main jf = new Main();
        String titleFrame = jf.getjMenuItemSientific().getText();
        Assert.assertEquals("Науковий", titleFrame);
    }
    @Test
    public void test_jButton_0_height(){
        int height = component.getjButton0().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_0_width(){
        int width = component.getjButton0().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_0_text(){
        Main jtext = new Main();
        String text =  jtext.getjButton0().getText();
        Assert.assertEquals("Text button +" , text , "0");
    }

    @Test
    public  void testfontjButton0(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton0().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public void testjButton1Listener(){
        ActionListener[] listener = component.getjButton1().getActionListeners();
      Assert.assertEquals("Listener " , listener , component.getjButton1().getActionListeners());
    }
    @Test
    public  void testfontjButton1(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton1().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
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
    public void test_jButton_2_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButton2().getToolTipText();
        Assert.assertEquals("Text button +" , text , "");
    }
    @Test
    public  void testfontjButton2(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton2().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
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
        String font2 =  setfont1.getjButton3().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
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
        String font2 =  setfont1.getjButton4().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
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
    public void test_jButton_5_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButton5().getToolTipText();
        Assert.assertEquals("Text button +" , text , "");
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
        String font2 =  setfont1.getjButton5().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }

    @Test
    public void test_jButton_6_height(){
        int height = component.getjButton6().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_6_width(){
        int width = component.getjButton6().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_6_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButton6().getToolTipText();
        Assert.assertEquals("Text button +" , text , "");
    }
    @Test
    public void test_jButton_6_text(){
        Main jtext = new Main();
        String text =  jtext.getjButton6().getText();
        Assert.assertEquals("Text button +" , text , "6");
    }
    @Test
    public  void testfontjButton6(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton6().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }


    @Test
    public void test_jButton_7_height(){
        int height = component.getjButton7().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_7_width(){
        int width = component.getjButton7().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_7_text(){
        Main jtext = new Main();
        String text =  jtext.getjButton7().getText();
        Assert.assertEquals("Text button +" , text , "7");
    }
    @Test
    public  void testfontjButton7(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton7().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }


    @Test
    public void test_jButton_8_height(){
        int height = component.getjButton8().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_8_width(){
        int width = component.getjButton8().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_8_text(){
        Main jtext = new Main();
        String text =  jtext.getjButton8().getText();
        Assert.assertEquals("Text button +" , text , "8");
    }
    @Test
    public  void testfontjButton8(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton8().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }


    @Test
    public void test_jButton_9_height(){
        int height = component.getjButton9().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_9_width(){
        int width = component.getjButton9().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_9_text(){
        Main jtext = new Main();
        String text =  jtext.getjButton9().getText();
        Assert.assertEquals("Text button +" , text , "9");
    }
    @Test
    public  void testfontjButton9(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton9().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }


    @Test
    public void test_jButton_minus_height(){
        int height = component.getjButtonMinus().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_minus_width(){
        int width = component.getjButtonMinus().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_minus_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonMinus().getText();
        Assert.assertEquals("Text button +" , text , "-");
    }
    @Test
    public  void testfontjButtonminus(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonMinus().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }


    @Test
    public void test_jButton_plus_height(){
        int height = component.getjButtonPlus().getHeight();
        Assert.assertEquals("Height button +" , height , 56);
    }

    @Test
    public void test_jButton_plus_width(){
        int width = component.getjButtonPlus().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_plus_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonPlus().getText();
        Assert.assertEquals("Text button +" , text , "+");
    }
    @Test
    public void test_jButton_plus_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonPlus().getToolTipText();
        Assert.assertEquals("Text button +" , text , "");
    }

    @Test
    public  void testfontjButtonplus(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonPlus().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }

    @Test
    public  void testFocusablejButtonplus(){
        Main setfont1 = new Main();
        Boolean bool =  setfont1.getjButtonPlus().getFocusTraversalKeysEnabled();
        Assert.assertEquals("Font button +" , bool , true) ;//Arial Narrow Полужирный Tahoma Bold
    }


    @Test
    public void test_jButton_division_height(){
        int height = component.getjButtonDivision().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_division_width(){
        int width = component.getjButtonDivision().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_division_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonDivision().getText();
        Assert.assertEquals("Text button +" , text , "/");
    }
    @Test
    public  void testfontjButtondivision(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonDivision().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }




    @Test
    public void test_jButton_multiplicatio_height(){
        int height = component.getjButtonmultiplication().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_multiplicatio_width(){
        int width = component.getjButtonmultiplication().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_multiplicatio_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonmultiplication().getText();
        Assert.assertEquals("Text button +" , text , "*");
    }
    @Test
    public  void testfontjButtonmultiplicatio(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonmultiplication().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }




    @Test
    public void test_jButton_C_height(){
        int height = component.getjButtonC().getHeight();
        Assert.assertEquals("Height button +" , height , 56);
    }

    @Test
    public void test_jButton_C_width(){
        int width = component.getjButtonC().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_C_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonC().getText();
        Assert.assertEquals("Text button +" , text , "C");
    }
    @Test
    public void test_jButton_C_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonC().getToolTipText();
        Assert.assertEquals("Text button +" , text , "CTRL+C");
    }
    @Test
    public  void testfontjButtonC(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonC().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_clean_height(){
        int height = component.getjButtonClean().getHeight();
        Assert.assertEquals("Height button +" , height , 56);
    }

    @Test
    public void test_jButton_clean_width(){
        int width = component.getjButtonClean().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_clean_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonClean().getText();
        Assert.assertEquals("Text button +" , text , "<--");
    }

    @Test
    public  void testfontjButtonclean(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonClean().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_point_height(){
        int height = component.getjButtonPoint().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_point_width(){
        int width = component.getjButtonPoint().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_point_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonPoint().getText();
        Assert.assertEquals("Text button +" , text , ".");
    }

    @Test
    public  void testfontjButtonpoint(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonPoint().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_sum_height(){
        int height = component.getjButtonSum().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_sum_width(){
        int width = component.getjButtonSum().getWidth();
        Assert.assertEquals("Width button +" , width , 109);
    }
    @Test
    public void test_jButton_sum_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonSum().getText();
        Assert.assertEquals("Text button +" , text , "=");
    }

    @Test
    public  void testfontjButtonsum(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonSum().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
}




    @Test
    public void test_jButton_power_height(){
        int height = component.getjButtonPower().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_power_width(){
        int width = component.getjButtonPower().getWidth();
        Assert.assertEquals("Width button +" , width , 70);
    }
    @Test
    public void test_jButton_power_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonPower().getText();
        Assert.assertEquals("Text button +" , text , "^");
    }
    @Test
    public void test_jButton_power_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonPower().getToolTipText();
        Assert.assertEquals("Text button +" , text , "Shift+S");
    }
    @Test
    public  void testfontjButtonpower(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonPower().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }




    @Test
    public void test_jButton_korin_height(){
        int height = component.getjButtonKorin().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_korin_width(){
        int width = component.getjButtonKorin().getWidth();
        Assert.assertEquals("Width button +" , width , 61);
    }
    @Test
    public void test_jButton_korin_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonKorin().getText();
        Assert.assertEquals("Text button +" , text , "√");
    }
    @Test
    public void test_jButton_korin_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonKorin().getToolTipText();
        Assert.assertEquals("Text button +" , text , "Shift+K");
    }
    @Test
    public  void testfontjButtonkorin(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonKorin().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_reverse_height(){
        int height = component.getjButtonReverse().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_reverse_width(){
        int width = component.getjButtonReverse().getWidth();
        Assert.assertEquals("Width button +" , width , 70);
    }
    @Test
    public void test_jButton_reverse_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonReverse().getText();
        Assert.assertEquals("Text button +" , text , "±");
    }
    @Test
    public void test_jButton_reverse_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonReverse().getToolTipText();
        Assert.assertEquals("Text button +" , text , "Shift+F");
    }
    @Test
    public  void testfontjButtonReverse(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonReverse().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }




    @Test
    public void test_jButton_1x_height(){
        int height = component.getjButton1x().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_1x_width(){
        int width = component.getjButton1x().getWidth();
        Assert.assertEquals("Width button +" , width , 61);
    }
    @Test
    public void test_jButton_1x_text(){
        Main jtext = new Main();
        String text =  jtext.getjButton1x().getText();
        Assert.assertEquals("Text button +" , text , "1/x");
    }
    @Test
    public void test_jButton_1x_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButton1x().getToolTipText();
        Assert.assertEquals("Text button +" , text , "Shift+D");
    }
    @Test
    public  void testfontjButton1x(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton1x().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_P_height(){
        int height = component.getjButtonP().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_P_width(){
        int width = component.getjButtonP().getWidth();
        Assert.assertEquals("Width button +" , width , 61);
    }
    @Test
    public void test_jButton_P_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonP().getText();
        Assert.assertEquals("Text button +" , text , "П");
    }
    @Test
    public void test_jButton_P_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonP().getToolTipText();
        Assert.assertEquals("Text button +" , text , "Ctrl+P");
    }
    @Test
    public  void testfontjButtonP(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonP().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_cos_height(){
        int height = component.getjButtonCos().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_cos_width(){
        int width = component.getjButtonCos().getWidth();
        Assert.assertEquals("Width button +" , width , 65);
    }
    @Test
    public void test_jButton_cos_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonCos().getText();
        Assert.assertEquals("Text button +" , text , "cos");
    }

    @Test
    public  void testfontjButtoncos(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonCos().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_cosh_height(){
        int height = component.getjButtonCosh().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_cosh_width(){
        int width = component.getjButtonCosh().getWidth();
        Assert.assertEquals("Width button +" , width , 60);
    }
    @Test
    public void test_jButton_cosh_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonCosh().getText();
        Assert.assertEquals("Text button +" , text , "cosh");
    }

    @Test
    public  void testfontjButtoncosh(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonCosh().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_sinh_height(){
        int height = component.getjButtonSinh().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_sinh_width(){
        int width = component.getjButtonSinh().getWidth();
        Assert.assertEquals("Width button +" , width , 60);
    }
    @Test
    public void test_jButton_sinh_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonSinh().getText();
        Assert.assertEquals("Text button +" , text , "sinh");
    }

    @Test
    public  void testfontjButtonsinh(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonSinh().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_sin_height(){
        int height = component.getjButtonSin().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_sin_width(){
        int width = component.getjButtonSin().getWidth();
        Assert.assertEquals("Width button +" , width , 65);
    }
    @Test
    public void test_jButton_sin_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonSin().getText();
        Assert.assertEquals("Text button +" , text , "sin");
    }

    @Test
    public  void testfontjButtonsin(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonSin().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_log_height(){
        int height = component.getjButtonLog().getHeight();
        Assert.assertEquals("Height button +" , height , 42);
    }

    @Test
    public void test_jButton_log_width(){
        int width = component.getjButtonLog().getWidth();
        Assert.assertEquals("Width button +" , width , 60);
    }
    @Test
    public void test_jButton_log_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonLog().getText();
        Assert.assertEquals("Text button +" , text , "log");
    }

    @Test
    public  void testfontjButtonlog(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonLog().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_tan_height(){
        int height = component.getjButtonTan().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_tan_width(){
        int width = component.getjButtonTan().getWidth();
        Assert.assertEquals("Width button +" , width , 65);
    }
    @Test
    public void test_jButton_tan_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonTan().getText();
        Assert.assertEquals("Text button +" , text , "tan");
    }

    @Test
    public  void testfontjButtontan(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonTan().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_tanh_height(){
        int height = component.getjButtonTanh().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_tanh_width(){
        int width = component.getjButtonTanh().getWidth();
        Assert.assertEquals("Width button +" , width , 60);
    }
    @Test
    public void test_jButton_tanh_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonTanh().getText();
        Assert.assertEquals("Text button +" , text , "tanh");
    }

    @Test
    public  void testfontjButtontanh(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonTanh().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_E_height(){
        int height = component.getjButtonE().getHeight();
        Assert.assertEquals("Height button +" , height , 37);
    }

    @Test
    public void test_jButton_E_width(){
        int width = component.getjButtonE().getWidth();
        Assert.assertEquals("Width button +" , width , 70);
    }
    @Test
    public void test_jButton_E_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonE().getText();
        Assert.assertEquals("Text button +" , text , "e");
    }
    @Test
    public void test_jButton_E_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonE().getToolTipText();
        Assert.assertEquals("Text button +" , text , "Ctrl+E");
    }
    @Test
    public  void testfontjButtonE(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonE().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_PRC_height(){
        int height = component.getjButtonPRC().getHeight();
        Assert.assertEquals("Height button +" , height , 42);
    }

    @Test
    public void test_jButton_PRC_width(){
        int width = component.getjButtonPRC().getWidth();
        Assert.assertEquals("Width button +" , width , 61);
    }
    @Test
    public void test_jButton_PRC_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonPRC().getText();
        Assert.assertEquals("Text button +" , text , "PRC");
    }
    @Test
    public void test_jButton_PRC_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonPRC().getToolTipText();
        Assert.assertEquals("Text button +" , text , "Точність суми");
    }
    @Test
    public  void testfontjButtonPRC(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonPRC().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_Bracketfront_height(){
        int height = component.getjButtonBracketfront().getHeight();
        Assert.assertEquals("Height button +" , height , 27);
    }

    @Test
    public void test_jButton_Bracketfront_width(){
        int width = component.getjButtonBracketfront().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_Bracketfront_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonBracketfront().getText();
        Assert.assertEquals("Text button +" , text , "(");
    }

    @Test
    public  void testfontjButtonBracketfront(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonBracketfront().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_Bracketend_height(){
        int height = component.getjButtonBracketend().getHeight();
        Assert.assertEquals("Height button +" , height , 23);
    }

    @Test
    public void test_jButton_Bracketend_width(){
        int width = component.getjButtonBracketend().getWidth();
        Assert.assertEquals("Width button +" , width , 51);
    }
    @Test
    public void test_jButton_Bracketend_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonBracketend().getText();
        Assert.assertEquals("Text button +" , text , ")");
    }

    @Test
    public  void testfontjButtonBracketend(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonBracketend().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_Round_height(){
        int height = component.getjButtonPRC().getHeight();
        Assert.assertEquals("Height button +" , height , 42);
    }

    @Test
    public void test_jButton_Round_width(){
        int width = component.getjButtonRound().getWidth();
        Assert.assertEquals("Width button +" , width , 65);
    }
    @Test
    public void test_jButton_Round_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonRound().getText();
        Assert.assertEquals("Text button +" , text , "roun");
    }

    @Test
    public  void testfontjButtonRound(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonRound().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_Log10_height(){
        int height = component.getjButtonLog10().getHeight();
        Assert.assertEquals("Height button +" , height , 42);
    }

    @Test
    public void test_jButton_Log10_width(){
        int width = component.getjButtonLog10().getWidth();
        Assert.assertEquals("Width button +" , width , 70);
    }
    @Test
    public void test_jButton_log10_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonLog10().getToolTipText();
        Assert.assertEquals("Text button +" , text , "");
    }
    @Test
    public void test_jButton_Log10_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonLog10().getText();
        Assert.assertEquals("Text button +" , text , "log10");
    }

    @Test
    public  void testfontjButtonLog10(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonLog10().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_Bin_height(){
        int height = component.getjButtonBin().getHeight();
        Assert.assertEquals("Height button +" , height , 35);
    }

    @Test
    public void test_jButton_Bin_width(){
        int width = component.getjButtonBin().getWidth();
        Assert.assertEquals("Width button +" , width , 60);
    }
    @Test
    public void test_jButton_Bin_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonBin().getText();
        Assert.assertEquals("Text button +" , text , "bin");
    }

    @Test
    public  void testfontjButtonBin(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonBin().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_Octal_height(){
        int height = component.getjButtonOctal().getHeight();
        Assert.assertEquals("Height button +" , height , 35);
    }

    @Test
    public void test_jButton_Octal_width(){
        int width = component.getjButtonOctal().getWidth();
        Assert.assertEquals("Width button +" , width , 60);
    }
    @Test
    public void test_jButton_Octal_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonOctal().getText();
        Assert.assertEquals("Text button +" , text , "oct");
    }
    @Test
    public void test_jButton_Octal_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonOctal().getToolTipText();
        Assert.assertEquals("Text button +" , text , "");
    }
    @Test
    public  void testfontjButtonOctal(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonOctal().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }



    @Test
    public void test_jButton_Hex_height(){
        int height = component.getjButtonHex().getHeight();
        Assert.assertEquals("Height button +" , height , 33);
    }

    @Test
    public void test_jButton_Hex_width(){
        int width = component.getjButtonHex().getWidth();
        Assert.assertEquals("Width button +" , width , 60);
    }
    @Test
    public void test_jButton_Hex_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonHex().getText();
        Assert.assertEquals("Text button +" , text , "hex");
    }
    @Test
    public void test_jButton_Hex_tooltip(){
        Main jtext = new Main();
        String text =  jtext.getjButtonHex().getToolTipText();
        Assert.assertEquals("Text button +" , text , "");
    }
    @Test
    public  void testfontjButtonHex(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonHex().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }




    @Test
    public void test_jButton_Factorial_height(){
        int height = component.getjButtonFactorial().getHeight();
        Assert.assertEquals("Height button +" , height , 35);
    }

    @Test
    public void test_jButton_Factorial_width(){
        int width = component.getjButtonFactorial().getWidth();
        Assert.assertEquals("Width button +" , width , 65);
    }
    @Test
    public void test_jButton_Factorial_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonFactorial().getText();
        Assert.assertEquals("Text button +" , text , "!n");
    }

    @Test
    public  void testfontjButtonFactorial(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonFactorial().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Thames") ;//Arial Narrow Полужирный Tahoma Bold
    }


    @Test
    public void test_jButton_jMenuItemOn_text(){
        Main jtext = new Main();
        String text =  jtext.getjMenuItemON().getText();
        Assert.assertEquals("Text button +" , text , "Про програму");
    }
    @Test
    public void test_jButton_jMenuItemOFF_text(){
        Main jtext = new Main();
        String text =  jtext.getjMenuItemOFF().getText();
        Assert.assertEquals("Text button +" , text , "Викл");
    }
    @Test
    public void test_jButton_jMenuSientific_text(){
        Main jtext = new Main();
        String text =  jtext.getjMenuItemSientific().getText();
        Assert.assertEquals("Text button +" , text , "Науковий");
    }

    @Test
    public void test_jButton_jMenuInfa_text(){
        Main jtext = new Main();
        String text =  jtext.getjMenuInfa().getText();
        Assert.assertEquals("Text button +" , text , "Інфо");
    }



@Test
public void testenab() {
        component.vkl();
        Assert.assertEquals("b is ", component.getjButton2().isDisplayable(), true);
    }
    @Test
    public void testenabt() {
        component.vkl();
        Assert.assertEquals("b is ", component.getjButton7().isEnabled(), true);
    }



    @Test
    public void testdisablejTextField() {
        component.vykl();
        Assert.assertEquals( component.getjTextFiel1().isEnabled(), false);
    }
    @Test
    public void testdisablejMenuInfa() {
        component.vykl();
        Assert.assertEquals( component.getjMenuInfa().isEnabled(), false);
}
    @Test
    public void testdisablejMenuItemOFF() {
        component.vykl();
        Assert.assertEquals( component.getjMenuItemOFF().isEnabled(), false);
    }
    @Test
    public void testdisablejMenuItemON() {
        component.vykl();
        Assert.assertEquals( component.getjMenuItemON().isEnabled(), true);
    }
    @Test
    public void testdisablejButtonclean() {
        component.vykl();
        Assert.assertEquals( component.getjButtonClean().isEnabled(), false);
    }
    @Test
    public void testdisablejButtonC() {
        component.vykl();
        Assert.assertEquals( component.getjButtonC().isEnabled(), false);
    }
    @Test
    public void testdisablejButtonPlus() {
        component.vykl();
        Assert.assertEquals( component.getjButtonPlus().isEnabled(), false);
    }
    @Test
    public void testdisablejButtonMinus() {
        component.vykl();
        Assert.assertEquals( component.getjButtonMinus().isEnabled(), false);
    }
    @Test
    public void testdisablejButtonMultiplication() {
        component.vykl();
        Assert.assertEquals( component.getjButtonmultiplication().isEnabled(), false);
    }



    @Test
    public void testenable1() {
        component.vykl();
        Assert.assertEquals( component.getjButton1().isEnabled(), false);
    }
    @Test
    public void testenable2() {
        component.vykl();
        Assert.assertEquals( component.getjButton2().isEnabled(), false);
    }
    @Test
    public void testenable3() {
        component.vykl();
        Assert.assertEquals( component.getjButton3().isEnabled(), false);
    }
    @Test
    public void testenable4() {
        component.vykl();
        Assert.assertEquals( component.getjButton4().isEnabled(), false);
    }
    @Test
    public void testenable5() {
        component.vykl();
        Assert.assertEquals( component.getjButton5().isEnabled(), false);
    }
    @Test
    public void testenable6() {
        component.vykl();
        Assert.assertEquals( component.getjButton6().isEnabled(), false);
    }
    @Test
    public void testenable7() {
        component.vykl();
        Assert.assertEquals( component.getjButton7().isEnabled(), false);
    }
    @Test
    public void testenable8() {
        component.vykl();
        Assert.assertEquals( component.getjButton8().isEnabled(), false);
    }
    @Test
    public void testenable9() {
        component.vykl();
        Assert.assertEquals(component.getjButton9().isEnabled(), false);
    }
    @Test
    public void testenabledisable0() {
        component.vykl();
        Assert.assertEquals(component.getjButton0().isEnabled(), false);
    }
    @Test
    public void testdisabledivision() {
        component.vykl();
        Assert.assertEquals(component.getjButtonDivision().isEnabled(), false);
    }
    @Test
    public void testenablejButtonpoint() {
        component.vykl();
        Assert.assertEquals(component.getjButtonPoint().isEnabled(), false);
    }
    @Test
    public void testenablejButtonSum() {
        component.vykl();
        Assert.assertEquals(component.getjButtonSum().isEnabled(), false);
    }
    @Test
    public void testenablejButtonPower() {
        component.vykl();
        Assert.assertEquals(component.getjButtonPower().isEnabled(), false);
    }
    @Test
    public void testenablejButtonKorin() {
        component.vykl();
        Assert.assertEquals(component.getjButtonKorin().isEnabled(), false);
    }
    @Test
    public void testenablejButtonReverse() {
        component.vykl();
        Assert.assertEquals(component.getjButtonReverse().isEnabled(), false);
    }
    @Test
    public void testenablejButton1x() {
        component.vykl();
        Assert.assertEquals(component.getjButton1x().isEnabled(), false);
    }
    @Test
    public void testenablejButtonP() {
        component.vykl();
        Assert.assertEquals(component.getjButtonP().isEnabled(), false);
    }
    @Test
    public void testenablejButtonPRC() {
        component.vykl();
        Assert.assertEquals(component.getjButtonPRC().isEnabled(), false);
    }
    @Test
    public void testenablejButtonOctal() {
        component.vykl();
        Assert.assertEquals(component.getjButtonOctal().isEnabled(), false);
    }
    @Test
    public void testenablejButtonE() {
        component.vykl();
        Assert.assertEquals(component.getjButtonE().isEnabled(), false);
    }
    @Test
    public void testenablejButtonLog10() {
        component.vykl();
        Assert.assertEquals(component.getjButtonLog10().isEnabled(), false);
    }
    @Test
    public void testenablejButtonHex() {
        component.vykl();
        Assert.assertEquals(component.getjButtonHex().isEnabled(), false);
    }
    @Test
    public void testenablejButtonsinH() {
        component.vykl();
        Assert.assertEquals(component.getjButtonSinh().isEnabled(), false);
    }
    @Test
    public void testenablejButtonsin() {
        component.vykl();
        Assert.assertEquals(component.getjButtonSin().isEnabled(), false);
    }
    @Test
    public void testenablejButtoncos() {
        component.vykl();
        Assert.assertEquals(component.getjButtonCos().isEnabled(), false);
    }
    @Test
    public void testenablejButtoncosh() {
        component.vykl();
        Assert.assertEquals(component.getjButtonCosh().isEnabled(), false);
    }
    @Test
    public void testenablejButtontan() {
        component.vykl();
        Assert.assertEquals(component.getjButtonTan().isEnabled(), false);
    }
    @Test
    public void testenablejButtontanh() {
        component.vykl();
        Assert.assertEquals(component.getjButtonTanh().isEnabled(), false);
    }
    @Test
    public void testenablejButtonlog() {
        component.vykl();
        Assert.assertEquals(component.getjButtonLog().isEnabled(), false);
    }
    @Test
    public void testenablejButtonBracketfront() {
        component.vykl();
        Assert.assertEquals(component.getjButtonBracketfront().isEnabled(), false);
    }
    @Test
    public void testenablejButtonBracketend() {
        component.vykl();
        Assert.assertEquals(component.getjButtonBracketend().isEnabled(), false);
    }
    @Test
    public void testenablejButtonRound() {
        component.vykl();
        Assert.assertEquals(component.getjButtonRound().isEnabled(), false);
    }
    @Test
    public void testenablejButtonBin() {
        component.vykl();
        Assert.assertEquals(component.getjButtonBin().isEnabled(), false);
    }
    @Test
    public void testenablejButtonFactorial() {
        component.vykl();
        Assert.assertEquals(component.getjButtonFactorial().isEnabled(), false);
    }



    @Test
    public void testdisablet() {
        component.vykl();
        Assert.assertEquals(component.getjButton0().isEnabled(), false);
    }

    @Test
    public void testreturnvykl0() {
        component.vykl();
        boolean zero;
        if (component.vykl() == 0){
            zero = true;
        }
        else {
            zero = false;
        }
        Assert.assertEquals(zero, true);
    }
    @Test
    public void testreturnvkl0(){
        component.vkl();
        boolean zero;
        if (component.vkl() == 0){
            zero = true;
        }
        else {
            zero = false;
        }
        Assert.assertEquals(zero, true);
    }


    @Test
    public void test_jTestField_height(){
        int height = component.getjTextFiel1().getHeight();
        Assert.assertEquals("Height button +" , height , 45);
    }

    @Test
    public void test_jTestField_width(){
        int width = component.getjTextFiel1().getWidth();
        Assert.assertEquals("Width button +" , width , 220);
    }
    @Test
    public void test_jTestField_sizeMax(){
        Dimension size = component.getjTextFiel1().getMaximumSize();
        Assert.assertEquals("MaximumSize +" , size , new Dimension(488, 45));
    }
    @Test
    public void test_jTestField_sizeMin(){
        Dimension size = component.getjTextFiel1().getMinimumSize();
        Assert.assertEquals("MaximumSize +" , size , new Dimension(221, 45));
    }
  /*  @Test
    public  void testfontjTestField(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjTextFiel1().getFont().getName();
        Assert.assertEquals("Font button +" , font2 , "Times New Roman") ;//Arial Narrow Полужирный Tahoma Bold
    }*/
}
