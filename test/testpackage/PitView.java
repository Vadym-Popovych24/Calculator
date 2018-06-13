package testpackage;

import mainpackage.Main;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.swing.event.AncestorListener;
import java.awt.event.ActionListener;

public class PitView {
    Main component = new Main();
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

    @Ignore
    public  void testfontjButton0(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton0().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
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
    @Ignore
    public  void testfontjButton5(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton5().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    public void test_jButton_6_text(){
        Main jtext = new Main();
        String text =  jtext.getjButton6().getText();
        Assert.assertEquals("Text button +" , text , "6");
    }
    @Ignore
    public  void testfontjButton6(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton6().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButton7(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton7().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButton8(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton8().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButton9(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton9().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonminus(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonMinus().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonplus(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonPlus().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtondivision(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonDivision().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonmultiplicatio(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonmultiplication().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonC(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonC().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonclean(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonClean().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonpoint(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonPoint().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonsum(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonSum().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonpower(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonPower().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonkorin(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonKorin().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
        String text =  jtext.getjButtonKorin().getToolTipText();
        Assert.assertEquals("Text button +" , text , "Shift+K");
    }
    @Ignore
    public  void testfontjButtonReverse(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonReverse().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButton1x(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButton1x().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonP(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonP().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtoncos(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonCos().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtoncosh(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonCosh().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonsinh(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonSinh().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonsin(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonSin().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonlog(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonLog().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtontan(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonTan().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtontanh(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonTanh().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonE(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonE().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonPRC(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonPRC().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonBracketfront(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonBracketfront().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonBracketend(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonBracketend().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonRound(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonRound().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    public void test_jButton_Log10_text(){
        Main jtext = new Main();
        String text =  jtext.getjButtonLog10().getText();
        Assert.assertEquals("Text button +" , text , "log10");
    }

    @Ignore
    public  void testfontjButtonLog10(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonLog10().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonBin(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonBin().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonOctal(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonOctal().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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
    @Ignore
    public  void testfontjButtonHex(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonHex().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
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

    @Ignore
    public  void testfontjButtonFactorial(){
        Main setfont1 = new Main();
        String font2 =  setfont1.getjButtonFactorial().getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
    }


    @Ignore
    public void test_jMenu_text(){
        Main jtext = new Main();
        String text =  jtext.getjMenuKalculator().getText();
        Assert.assertEquals("Text button +" , text , "Калькулятор");
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
    @Ignore
    public void test_jButton_jMenuStandart_text(){
        Main jtext = new Main();
        String text =  jtext.getjMenuItemStandart().getText();
        Assert.assertEquals("Text button +" , text , "Стандартний");
    }
    @Ignore
    public void test_jButton_jMenuItemclose_text(){
        Main jtext = new Main();
        String text =  jtext.getjMenuItemclose().getText();
        Assert.assertEquals("Text button +" , text , "Закрити");
    }
    @Test
    public void test_jButton_jMenuInfa_text(){
        Main jtext = new Main();
        String text =  jtext.getjMenuInfa().getText();
        Assert.assertEquals("Text button +" , text , "Інфо");
    }
}
