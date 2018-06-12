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




}
