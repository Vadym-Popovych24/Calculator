package testpackage;

import mainpackage.Main;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class TestActionPerformed {
    Main component = new Main();
@Test
    public void testjButtonCActionPerformed(){
        component.jButtonCActionPerformed();

            component.getjLabel1().getForeground();
            component.getjLabel1().getText();

        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "");
    Assert.assertEquals("text = " , component.getjLabel1().getText(), "");
    Assert.assertEquals("text = " , component.getjLabel1().getForeground(), Color.black);
    }

    @Test
    public void testjButtonplusActionPerformed(){
        component.jButtonplusActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "+");

    }
    @Test
    public void testjButtonminusActionPerformed(){
        component.jButtonminusActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "-");
    }
    @Test
    public void testjButtonmultiplicationActionPerformed(){
        component.jButtonmultiplicationActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "*");
    }
    @Test
    public void testjButtondivisionActionPerformed(){
        component.jButtondivisionActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "/");
    }
    @Test
    public void testjButtonpointActionPerformed(){
        component.jButtonpointActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), ".");
    }
    @Test
    public void testjButtoncleanActionPerformed(){
        component.jButtoncleanActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "");
    }
    @Test
    public void testjButtonsumActionPerformed(){
        component.jButtonsumActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "");
    }
    @Test
    public void testjTextField1ActionPerformed(){
        component.jTextField1ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "");
    }
    @Test
    public void testjButtonpowerActionPerformed(){
        component.jButtonpowerActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "^");
    }
    @Test
    public void testjButtonkorinActionPerformed(){
        component.jButtonkorinActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "√");
    }
    @Test
    public void testjButtonPActionPerformed(){
        component.jButtonPActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "3.141592653589793");
    }
    @Test
    public void testjButtonlogActionPerformed(){
        component.jButtonlogActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "l");
    }
    @Test
    public void testjButtontanActionPerformed(){
        component.jButtontanActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "t");
    }
    @Test
    public void testjButtontanhActionPerformed(){
        component.jButtontanhActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "T");
    }
    @Test
    public void testjButtonsinActionPerformed(){
        component.jButtonsinActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "s");
    }
    @Test
    public void testjButtoncoshActionPerformed(){
        component.jButtoncoshActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "C");
    }
    @Test
    public void testjButtonsinhActionPerformed(){
        component.jButtonsinhActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "S");
    }
    @Test
    public void testjButtoncosActionPerformed(){
        component.jButtoncosActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "c");
    }
    @Test
    public void testjTextField1KeyReleased(){
        component.jTextField1KeyReleased();
    }
    @Test
    public void testjMenuIteminfoActionPerformed(){
        component.jMenuIteminfoActionPerformed();
    }
    @Test
    public void testjMenuItemstandartActionPerformed(){
        component.jMenuItemstandartActionPerformed();
       Assert.assertEquals("size jTextField1 = " , component.getjTextFiel1().getSize(), new Dimension(220,45));
        Assert.assertEquals("size jLabel1 = " , component.getjLabel1().getSize(), new Dimension(220,22) );
     }
    @Test
    public void testjMenuItemsientificActionPerformed(){
        component.jMenuItemsientificActionPerformed();
        Dimension arr = component.getjTextFiel1().getSize();
          Assert.assertEquals("size jTextField1 = " , component.getjTextFiel1().getSize(), new Dimension(503,45));
          Assert.assertEquals("size jLabel1 = " , component.getjLabel1().getSize(), new Dimension(503,22) );
    }
    @Test
    public void testjformWindowClosed(){
        component.formWindowClosed();
    }
    @Test
    public void testjMenuItemcloseActionPerformed(){
        component.jMenuItemcloseActionPerformed();
    }
    @Test
    public void testjButtonEActionPerformed(){
        component.jButtonEActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "2.718281828459045");
    }
    @Test
    public void testjButtonBracketfrontActionPerformed(){
        component.jButtonBracketfrontActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "(");
    }
    @Test
    public void testjButtonBracketendActionPerformed(){
        component.jButtonBracketendActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), ")");
    }
    @Test
    public void testjButtonLog10ActionPerformed(){
        component.jButtonLog10ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "L");
    }
    @Test
    public void testjButton0ActionPerformed(){
        component.jButton0ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "0");
    }
    @Test
    public void testjButton9ActionPerformed(){
        component.jButton9ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "9");
    }
    @Test
    public void testjButton8ActionPerformed(){
        component.jButton8ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "8");
    }
    @Test
    public void testjButton7ActionPerformed(){
        component.jButton7ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "7");
    }
    @Test
    public void testjButton6ActionPerformed(){
        component.jButton6ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "6");
    }
    @Test
    public void testjButton5ActionPerformed(){
        component.jButton5ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "5");
    }
    @Test
    public void testjButton4ActionPerformed(){
        component.jButton4ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "4");
    }
    @Test
    public void testjButton3ActionPerformed(){
        component.jButton3ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "3");
    }
    @Test
    public void testjButton2ActionPerformed(){
        component.jButton2ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "2");
    }
    @Test
    public void testjButton1ActionPerformed(){
        component.jButton1ActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "1");
    }
    @Test
    public void testjMenuItemOFFActionPerformed(){
        component.jMenuItemOFFActionPerformed();
    }
    @Test
    public void testjMenuItemONActionPerformed(){
        component.jMenuItemONActionPerformed();
    }
    @Test
    public void testjButtonFactorialActionPerformed(){
        component.jButtonFactorialActionPerformed();
        Assert.assertEquals("text = " , component.getjTextFiel1().getText(), "!");
    }
    @Test
    public void testformWindowActivated(){
        component.formWindowActivated();
    }

}


