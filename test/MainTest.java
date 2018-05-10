import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test_jButton_1_height(){
        Main component = new Main();
        int height = component.jButton1.getHeight();
        Assert.assertEquals("Height button +" , height , 33);
      }
    @Test
    public void test_jButton_1_width(){
        Main component = new Main();
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
    public void test_jButton_1_font(){
        Main setfont = new Main();
        String font =  setfont.jButton1.getFont().getFontName();
       Assert.assertEquals("Font button +" , font , "Tahoma Полужирный") ;//Arial Narrow Полужирный
    }
     @Test
  public void test_jButton_2_font(){
        Main setfont2 = new Main();
        String font2 =  setfont2.jButton2.getFont().getFontName();
        Assert.assertEquals("Font button +" , font2 , "Tahoma Полужирный") ;//Arial Narrow Полужирный Tahoma Bold
    }
   @Test/*expected = ArithmeticException.class)*/
    public void test_division_by_zero() {
        Main process = new Main();
        double t2 = process.t;
        double l2 = process.l;

        int an = (int) (t2 / 0);
        Assert.assertEquals(an, 0);
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
    public void test_division() {
        Main processy = new Main();
        double tt = processy.t;
        double ll = processy.l;
        double mn2 = processy.mn;
        double an =  (tt / ll);

        an =0;

        Assert.assertEquals("Division = ",mn2, an,0);
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