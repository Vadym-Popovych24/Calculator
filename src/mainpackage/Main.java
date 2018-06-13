package mainpackage;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;

import java.awt.event.*;
import java.util.Scanner;

public class Main extends javax.swing.JFrame  {

   String calculation;
    public String getCalculation() {
        return calculation;
    }

    public void setjCalculation(String calculation) {
        this.calculation=calculation;
    }

     double num;
    public double getNum() {
        return num;
    }

    public void setNum(double num ) {
        this.num = num;
    }

    double ans;
    public double getAns() {
        return ans;
    }

    public void setAns(double ans) {
        this.ans= ans;
    }
   Scanner s = new Scanner("");


    public Main() {
        initComponents();
        jMenuItemON.setEnabled(false);
    }


    double meansum;

    Prioritet prior = new Prioritet();
    Process process = new Process();
    public int mathematic ()
    {
        switch (calculation)
        {
            case "1/x":
                ans = 1 / num;
                jLabel1.setText(Double.toString(ans));
                break;

            case "negative_number":
                ans =num * -1;
                jLabel1.setText(Double.toString(ans));
                break;

            case "roun":
                ans = Math.round(num);
                jLabel1.setText(Double.toString(ans));
                break;

            case "bin":
                jLabel1.setText(Integer.toString(Integer.parseInt(jTextField1.getText()),2));
                break;

            case "hex":
                jLabel1.setText(Integer.toString(Integer.parseInt(jTextField1.getText()),16));
                break;


            case "oct":
                jLabel1.setText(Integer.toString(Integer.parseInt(jTextField1.getText()),8));
                break;
            default :
                jLabel1.setText("");
                break;
        }
        return 0;

    }

    public int livesum(){
        Calculation calclivesum = new Calculation();
        try {
            s = new Scanner(jTextField1.getText());
            String b = s.next();
            double x;
            do {

                StringBuilder a = new StringBuilder(b);
                meansum = calclivesum.eval(a, Double.valueOf(a.indexOf("" + '(')));
                String formattedDouble = String.format("%.1f", meansum);
                x = meansum;

                if (x % 1 == 0) {

                    jLabel1.setText("" + calclivesum.eval(a, Double.valueOf(a.indexOf("" + '('))));
                } else {
                    jLabel1.setText(formattedDouble);
                }
            }
            while ((b = s.next()) != "null") ;

        }
        catch(Exception e){
          e.getMessage();
        }
        finally{
            s.close();

        }

        return s.nextInt();
    }

    public int vkl()
    {
        jTextField1.setEnabled(true);
        jMenuinfa.setEnabled(true);
        jMenuItemON.setEnabled(false);
        jMenuItemOFF.setEnabled(true);
        jButtonclean.setEnabled(true);
        jButtonC.setEnabled(true);
        jButton1.setEnabled(true);
        jButtonplus.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButtonminus.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButtonmultiplication.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButtondivision.setEnabled(true);
        jButton0.setEnabled(true);
        jButtonpoint.setEnabled(true);
        jButtonsum.setEnabled(true);
        jButtonpower.setEnabled(true);
        jButtonkorin.setEnabled(true);
        jButtonreverse.setEnabled(true);
        jButton1x.setEnabled(true);
        jButtonP.setEnabled(true);
        jButtonPRC.setEnabled(true);
        jButtonOctal.setEnabled(true);
        jButtonE.setEnabled(true);
        jButtonLog10.setEnabled(true);
        jButtonHex.setEnabled(true);
        jButtonsinh.setEnabled(true);
        jButtoncos.setEnabled(true);
        jButtonsin.setEnabled(true);
        jButtoncosh.setEnabled(true);
        jButtontan.setEnabled(true);
        jButtontanh.setEnabled(true);
        jButtonlog.setEnabled(true);
        jButtonBracketfront.setEnabled(true);
        jButtonBracketend.setEnabled(true);
        jButtonRound.setEnabled(true);
        jButtonBin.setEnabled(true);
        jButtonFactorial.setEnabled(true);
   return 0;
    }

    public int vykl()
    {
        jTextField1.setEnabled(false);
        jMenuinfa.setEnabled(false);

        jMenuItemOFF.setEnabled(false);
        jMenuItemON.setEnabled(true);

        jButtonclean.setEnabled(false);
        jButtonC.setEnabled(false);
        jButton1.setEnabled(false);
        jButtonplus.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButtonminus.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButtonmultiplication.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButtondivision.setEnabled(false);
        jButton0.setEnabled(false);
        jButtonpoint.setEnabled(false);
        jButtonsum.setEnabled(false);
        jButtonpower.setEnabled(false);
        jButtonkorin.setEnabled(false);
        jButtonreverse.setEnabled(false);
        jButton1x.setEnabled(false);
        jButtonP.setEnabled(false);
        jButtonPRC.setEnabled(false);
        jButtonOctal.setEnabled(false);
        jButtonE.setEnabled(false);
        jButtonLog10.setEnabled(false);
        jButtonHex.setEnabled(false);
        jButtonsinh.setEnabled(false);
        jButtoncos.setEnabled(false);
        jButtonsin.setEnabled(false);
        jButtoncosh.setEnabled(false);
        jButtontan.setEnabled(false);
        jButtontanh.setEnabled(false);
        jButtonlog.setEnabled(false);
        jButtonBracketfront.setEnabled(false);
        jButtonBracketend.setEnabled(false);
        jButtonRound.setEnabled(false);
        jButtonBin.setEnabled(false);
        jButtonFactorial.setEnabled(false);
 return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem();
        jTextField1 = new JTextField();
        jButtonclean = new JButton();
        jButtonC = new JButton();
        jButton1 = new JButton();
        jButtonplus = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButtonminus = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButtonmultiplication = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButtondivision = new JButton();
        jButton0 = new JButton();
        jButtonpoint = new JButton();
        jButtonsum = new JButton();

        jLabel1 = new JLabel();

        jButtonpower = new JButton();
        jButtonkorin = new JButton();
        jButtonreverse = new JButton();
        jButton1x = new JButton();
        jButtonP = new JButton();
        jButtoncos = new JButton();
        jButtonsinh = new JButton();
        jButtonlog = new JButton();
        jButtontan = new JButton();
        jButtontanh = new JButton();
        jButtonsin = new JButton();
        jButtoncosh = new JButton();
        JInternalFrame jInternalFrame1 = new JInternalFrame();

        jButtonE = new JButton();
        jButtonBracketfront = new JButton();
        jButtonBracketend = new JButton();
        jButtonRound = new JButton();
        jButtonPRC = new JButton();
        jButtonLog10 = new JButton();
        jButtonBin = new JButton();
        jButtonOctal = new JButton();
        jButtonHex = new JButton();
        jButtonFactorial = new JButton();
        JMenuBar jMenuBar1 = new JMenuBar();
        JMenu jMenuKalculator = new JMenu();
        jMenuItemON = new JMenuItem();
        jMenuItemOFF = new JMenuItem();
        JMenuItem jMenuItemclose = new JMenuItem();
        JMenu jMenuview = new JMenu();
        JMenuItem jMenuItemstandart = new JMenuItem();
        jMenuItemsientific = new JMenuItem();
        jMenuinfa = new JMenu();
        jMenuItemON = new JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Калькулятор");
        setFocusable(false);
        setLocation(new Point(500, 250));
        setType(Type.UTILITY);
        addWindowListener(new WindowAdapter() {
        	@Override
            public void windowActivated(WindowEvent evt) {
                formWindowActivated();
            }
            @Override
            public void windowClosed(WindowEvent evt) {
    
                formWindowClosed();
            }
        });
        getContentPane().setLayout(null);

        jTextField1.setFont(new Font("Times New Roman", 3, 23)); // NOI18N
        jTextField1.setHorizontalAlignment(JTextField.RIGHT);
        jTextField1.setMaximumSize(new Dimension(488, 45));
        jTextField1.setMinimumSize(new Dimension(221, 45));
        jTextField1.addActionListener(evt -> jTextField1ActionPerformed());
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            @Override
            public void keyReleased(KeyEvent evt) {
                jTextField1KeyReleased();
            }
            @Override
            public void keyTyped(KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 11, 220, 45);

        jButtonclean.setFont(new Font("Thames", 1, 16)); // NOI18N
        jButtonclean.setText("<--");
        jButtonclean.addActionListener(evt -> jButtoncleanActionPerformed());
        getContentPane().add(jButtonclean);
        jButtonclean.setBounds(67, 90, 51, 56);

        jButtonC.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonC.setText("C");
        jButtonC.setToolTipText("CTRL+C");
        jButtonC.addActionListener(evt -> jButtonCActionPerformed());
        getContentPane().add(jButtonC);
        jButtonC.setBounds(124, 90, 51, 56);

        jButton1.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(evt -> jButton1ActionPerformed());
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 152, 51, 33);

        jButtonplus.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonplus.setText("+");
        jButtonplus.setToolTipText("");
        jButtonplus.setRequestFocusEnabled(false);
        jButtonplus.setRolloverEnabled(false);
        jButtonplus.addActionListener(evt -> jButtonplusActionPerformed());

        jButtonplus.addKeyListener(new KeyAdapter() {
      
        });

        getContentPane().add(jButtonplus);
        jButtonplus.setBounds(181, 90, 51, 56);

        jButton2.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("2");
        jButton2.setToolTipText("");
        jButton2.addActionListener(evt -> jButton2ActionPerformed());
        getContentPane().add(jButton2);
        jButton2.setBounds(67, 152, 51, 33);

        jButton3.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(evt -> jButton3ActionPerformed());
        getContentPane().add(jButton3);
        jButton3.setBounds(124, 152, 51, 33);

        jButtonminus.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonminus.setText("-");
        jButtonminus.addActionListener(evt -> jButtonminusActionPerformed());
        getContentPane().add(jButtonminus);
        jButtonminus.setBounds(181, 152, 51, 33);

        jButton4.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(evt -> jButton4ActionPerformed());
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 191, 51, 33);

        jButton5.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton5.setText("5");
        jButton5.setToolTipText("");
        jButton5.addActionListener(evt -> jButton5ActionPerformed());
        getContentPane().add(jButton5);
        jButton5.setBounds(67, 191, 51, 33);

        jButton6.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton6.setText("6");
        jButton6.setToolTipText("");
        jButton6.addActionListener(evt -> jButton6ActionPerformed());
        getContentPane().add(jButton6);
        jButton6.setBounds(124, 191, 51, 33);

        jButtonmultiplication.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonmultiplication.setText("*");
        jButtonmultiplication.addActionListener(evt -> jButtonmultiplicationActionPerformed());
        getContentPane().add(jButtonmultiplication);
        jButtonmultiplication.setBounds(181, 191, 51, 33);

        jButton7.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(evt -> jButton7ActionPerformed());
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 230, 51, 33);

        jButton8.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(evt -> jButton8ActionPerformed());
        getContentPane().add(jButton8);
        jButton8.setBounds(67, 230, 51, 33);

        jButton9.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(evt -> jButton9ActionPerformed());
        getContentPane().add(jButton9);
        jButton9.setBounds(124, 230, 51, 33);

        jButtondivision.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtondivision.setText("/");
        jButtondivision.addActionListener(evt -> jButtondivisionActionPerformed());
        getContentPane().add(jButtondivision);
        jButtondivision.setBounds(181, 230, 51, 33);

        jButton0.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(evt -> jButton0ActionPerformed());
            /**
             * @param evt
             */
         /*   public void actionPerformed(ActionEvent evt) {
                jButton0ActionPerformed();
            }
        });*/
        getContentPane().add(jButton0);
        jButton0.setBounds(10, 269, 51, 33);

        jButtonpoint.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonpoint.setText(".");
        jButtonpoint.addActionListener(evt -> jButtonpointActionPerformed());
        getContentPane().add(jButtonpoint);
        jButtonpoint.setBounds(67, 269, 51, 33);

        jButtonsum.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonsum.setText("=");
        jButtonsum.addActionListener(evt -> jButtonsumActionPerformed());
        getContentPane().add(jButtonsum);
        jButtonsum.setBounds(124, 269, 109, 33);
        jLabel1.setForeground(Color.black);
        jLabel1.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setText("0");
        jLabel1.addAncestorListener(new AncestorListener() {

            public void ancestorMoved(AncestorEvent evt) {
            }
            public void ancestorAdded(AncestorEvent evt) {
                jLabel1AncestorAdded();
            }
            public void ancestorRemoved(AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 62, 220, 22);

        jButtonpower.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonpower.setText("^");
        jButtonpower.setToolTipText("Shift+S");
        jButtonpower.addActionListener(evt -> jButtonpowerActionPerformed());
        getContentPane().add(jButtonpower);
        jButtonpower.setBounds(376, 222, 70, 37);

        jButtonkorin.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonkorin.setText("√");
        jButtonkorin.setToolTipText("Shift+K");
        jButtonkorin.addActionListener(evt -> jButtonkorinActionPerformed());
        getContentPane().add(jButtonkorin);
        jButtonkorin.setBounds(450, 222, 61, 37);

        jButtonreverse.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonreverse.setText("±");
        jButtonreverse.setToolTipText("Shift+F");
        jButtonreverse.addActionListener(evt -> jButtonreverseActionPerformed());
        getContentPane().add(jButtonreverse);
        jButtonreverse.setBounds(376, 265, 70, 37);

        jButton1x.setFont(new Font("Tahoma", 1, 10)); // NOI18N
        jButton1x.setText("1/x");
        jButton1x.setToolTipText("Shift+D");
        jButton1x.setAlignmentY(0.0F);
        jButton1x.setMaximumSize(new Dimension(49, 33));
        jButton1x.setMinimumSize(new Dimension(49, 33));
        jButton1x.setPreferredSize(new Dimension(49, 33));
        jButton1x.addActionListener(evt -> jButton1xActionPerformed());
        getContentPane().add(jButton1x);
        jButton1x.setBounds(450, 265, 61, 37);

        jButtonP.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonP.setText("П");
        jButtonP.setToolTipText("Ctrl+P");
        jButtonP.addActionListener(evt -> jButtonPActionPerformed());
        getContentPane().add(jButtonP);
        jButtonP.setBounds(450, 179, 61, 37);

        jButtoncos.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtoncos.setText("cos");
        jButtoncos.addActionListener(evt -> jButtoncosActionPerformed());
        getContentPane().add(jButtoncos);
        jButtoncos.setBounds(239, 222, 65, 37);

        jButtonsinh.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonsinh.setText("sinh");
        jButtonsinh.setMaximumSize(new Dimension(60, 23));
        jButtonsinh.setMinimumSize(new Dimension(60, 23));
        jButtonsinh.setPreferredSize(new Dimension(51, 23));
        jButtonsinh.addActionListener(evt -> jButtonsinhActionPerformed());
        getContentPane().add(jButtonsinh);
        jButtonsinh.setBounds(310, 179, 60, 37);

        jButtonlog.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonlog.setText("log");
        jButtonlog.setPreferredSize(new Dimension(51, 23));
        jButtonlog.addActionListener(evt -> jButtonlogActionPerformed());
        getContentPane().add(jButtonlog);
        jButtonlog.setBounds(310, 131, 60, 42);

        jButtontan.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtontan.setText("tan");
        jButtontan.addActionListener(evt -> jButtontanActionPerformed());
        getContentPane().add(jButtontan);
        jButtontan.setBounds(239, 265, 65, 37); 

        jButtontanh.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtontanh.setText("tanh");
        jButtontanh.setPreferredSize(new Dimension(60, 23));
        jButtontanh.addActionListener(evt -> jButtontanhActionPerformed());
        getContentPane().add(jButtontanh);
        jButtontanh.setBounds(310, 265, 60, 37);

        jButtonsin.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonsin.setText("sin");
        jButtonsin.setPreferredSize(new Dimension(51, 23));
        jButtonsin.addActionListener(evt -> jButtonsinActionPerformed());
        getContentPane().add(jButtonsin);
        jButtonsin.setBounds(239, 179, 65, 37);

        jButtoncosh.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtoncosh.setText("cosh");
        jButtoncosh.setMaximumSize(new Dimension(60, 23));
        jButtoncosh.setPreferredSize(new Dimension(51, 23));
        jButtoncosh.addActionListener(evt -> jButtoncoshActionPerformed());
        getContentPane().add(jButtoncosh);
        jButtoncosh.setBounds(310, 222, 60, 37);

        jInternalFrame1.setVisible(true);
        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 0, 0);

        jButtonE.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonE.setText("e");
        jButtonE.setToolTipText("Ctrl+E");
        jButtonE.setMaximumSize(new Dimension(49, 33));
        jButtonE.setMinimumSize(new Dimension(49, 33));
        jButtonE.setPreferredSize(new Dimension(49, 33));
        jButtonE.addActionListener(evt -> jButtonEActionPerformed());
        getContentPane().add(jButtonE);
        jButtonE.setBounds(376, 179, 70, 37);

        jButtonBracketfront.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonBracketfront.setText("(");
        jButtonBracketfront.addActionListener(evt -> jButtonBracketfrontActionPerformed());
        getContentPane().add(jButtonBracketfront);
        jButtonBracketfront.setBounds(10, 90, 51, 27);

        jButtonBracketend.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonBracketend.setText(")");
        jButtonBracketend.setMinimumSize(new Dimension(37, 27));
        jButtonBracketend.addActionListener(evt -> jButtonBracketendActionPerformed());
        getContentPane().add(jButtonBracketend);
        jButtonBracketend.setBounds(10, 123, 51, 23);

        jButtonRound.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonRound.setText("roun");
        jButtonRound.setPreferredSize(new Dimension(51, 23));
        jButtonRound.addActionListener(evt -> jButtonlog3ActionPerformed());
        getContentPane().add(jButtonRound);
        jButtonRound.setBounds(239, 131, 65, 42);

        jButtonPRC.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonPRC.setText("PRC");
        jButtonPRC.setToolTipText("Точність суми");
        jButtonPRC.addActionListener(evt -> jButtonPRCActionPerformed());
        getContentPane().add(jButtonPRC);
        jButtonPRC.setBounds(450, 131, 61, 42);

        jButtonLog10.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonLog10.setText("log10");
        jButtonLog10.setToolTipText("");
        jButtonLog10.setMaximumSize(new Dimension(49, 33));
        jButtonLog10.setMinimumSize(new Dimension(49, 33));
        jButtonLog10.setPreferredSize(new Dimension(49, 33));
        jButtonLog10.addActionListener(evt -> jButtonLog10ActionPerformed());
        getContentPane().add(jButtonLog10);
        jButtonLog10.setBounds(376, 131, 70, 42);

        jButtonBin.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonBin.setText("bin");
        jButtonBin.setPreferredSize(new Dimension(51, 23));
        jButtonBin.addActionListener(evt -> jButtonBinActionPerformed());
        getContentPane().add(jButtonBin);
        jButtonBin.setBounds(310, 90, 60, 35);

        jButtonOctal.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonOctal.setText("oct");
        jButtonOctal.setToolTipText("");
        jButtonOctal.setMaximumSize(new Dimension(53, 23));
        jButtonOctal.setMinimumSize(new Dimension(53, 23));
        jButtonOctal.setPreferredSize(new Dimension(53, 23));
        jButtonOctal.addActionListener(evt -> jButtonOctalActionPerformed());
        getContentPane().add(jButtonOctal);
        jButtonOctal.setBounds(380, 90, 60, 35);

        jButtonHex.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonHex.setText("hex");
        jButtonHex.setToolTipText("");
        jButtonHex.setMaximumSize(new Dimension(53, 33));
        jButtonHex.setMinimumSize(new Dimension(53, 33));
        jButtonHex.setPreferredSize(new Dimension(53, 33));
        jButtonHex.addActionListener(evt -> jButtonHexActionPerformed());
        getContentPane().add(jButtonHex);
        jButtonHex.setBounds(450, 90, 60, 33);

        jButtonFactorial.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonFactorial.setText("!n");
        jButtonFactorial.setPreferredSize(new Dimension(51, 23));
        jButtonFactorial.addActionListener(evt -> jButtonFactorialActionPerformed());
        getContentPane().add(jButtonFactorial);
        jButtonFactorial.setBounds(239, 90, 65, 35);

        jMenuKalculator.setText("Калькулятор");

        jMenuItemON.setText("Вкл");
        jMenuItemON.addActionListener(evt -> jMenuItemONActionPerformed());
        jMenuKalculator.add(jMenuItemON);

        jMenuItemOFF.setText("Викл");
        jMenuItemOFF.addActionListener(evt -> jMenuItemOFFActionPerformed());
        jMenuKalculator.add(jMenuItemOFF);

        jMenuItemclose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        jMenuItemclose.setText("Закрити");
        jMenuItemclose.addActionListener(evt -> jMenuItemcloseActionPerformed());
        jMenuKalculator.add(jMenuItemclose);

        jMenuBar1.add(jMenuKalculator);

        jMenuview.setText("Вид");

        jMenuItemstandart.setText("Стандартний");
        jMenuItemstandart.addActionListener(evt -> jMenuItemstandartActionPerformed());
        jMenuview.add(jMenuItemstandart);

        jMenuItemsientific.setText("Науковий");
        jMenuItemsientific.addActionListener(evt -> jMenuItemsientificActionPerformed());
        jMenuview.add(jMenuItemsientific);

        jMenuBar1.add(jMenuview);

        jMenuinfa.setText("Інфо");

        jMenuItemON.setText("Про програму");
        jMenuItemON.addActionListener(evt -> jMenuIteminfoActionPerformed());
        jMenuinfa.add(jMenuItemON);

        jMenuBar1.add(jMenuinfa);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void jButtonreverseActionPerformed() {//GEN-FIRST:event_jButton_reverseActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = "negative_number";
        mathematic();
    }//GEN-LAST:event_jButton_reverseActionPerformed

    public void jButton1xActionPerformed() {//GEN-FIRST:event_jButton_1xActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = "1/x";
        mathematic();
    }//GEN-LAST:event_jButton_1xActionPerformed

    public void jButtonlog3ActionPerformed() {//GEN-FIRST:event_jButton_log3ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = "roun";
        mathematic();
    }//GEN-LAST:event_jButton_log3ActionPerformed


    public void jButtonBinActionPerformed() {//GEN-FIRST:event_jButton_log4ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = "bin";
        mathematic();
    }//GEN-LAST:event_jButton_log4ActionPerformed

    public void jButtonOctalActionPerformed() {//GEN-FIRST:event_jButton_P2ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = "oct";
        mathematic();
    }//GEN-LAST:event_jButton_P2ActionPerformed

    public void jButtonHexActionPerformed() {//GEN-FIRST:event_jButton_E2ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = "hex";
        mathematic();
    }//GEN-LAST:event_jButton_E2ActionPerformed

    public void jMenuItemONActionPerformed() {//GEN-FIRST:event_jMenuItem_ONActionPerformed
        vkl();
    }//GEN-LAST:event_jMenuItem_ONActionPerformed

    public void jMenuItemOFFActionPerformed() {//GEN-FIRST:event_jMenuItem_OFFActionPerformed
        vykl();
    }//GEN-LAST:event_jMenuItem_OFFActionPerformed


    public void jButton1ActionPerformed() {//GEN-FIRST:event_jButton_1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
        livesum();
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton2ActionPerformed() {//GEN-FIRST:event_jButton_2ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
        livesum();
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton3ActionPerformed() {//GEN-FIRST:event_jButton_3ActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
        livesum();
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton4ActionPerformed() {//GEN-FIRST:event_jButton_4ActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");
        livesum();
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton5ActionPerformed() {//GEN-FIRST:event_jButton_5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
        livesum();
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton6ActionPerformed() {//GEN-FIRST:event_jButton_6ActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");
        livesum();
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton7ActionPerformed() {//GEN-FIRST:event_jButton_7ActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
        livesum();
    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jButton8ActionPerformed() {//GEN-FIRST:event_jButton_8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
        livesum();
    }//GEN-LAST:event_jButton_8ActionPerformed

    private void jButton9ActionPerformed() {//GEN-FIRST:event_jButton_9ActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
        livesum();
    }//GEN-LAST:event_jButton_9ActionPerformed

    private void jButton0ActionPerformed() {//GEN-FIRST:event_jButton_0ActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
        livesum();
    }//GEN-LAST:event_jButton_0ActionPerformed

    private void jButtonpointActionPerformed() {//GEN-FIRST:event_jButton_pointActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_jButton_pointActionPerformed

    private void jButtondivisionActionPerformed() {//GEN-FIRST:event_jButton_divisionActionPerformed
        jTextField1.setText(jTextField1.getText() + "/");
    }//GEN-LAST:event_jButton_divisionActionPerformed

    private void jButtonmultiplicationActionPerformed() {//GEN-FIRST:event_jButton_multiplicationActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
    }//GEN-LAST:event_jButton_multiplicationActionPerformed

    private void jButtonminusActionPerformed() {//GEN-FIRST:event_jButton_minusActionPerformed
        jTextField1.setText(jTextField1.getText() + "-");
    }//GEN-LAST:event_jButton_minusActionPerformed

    private void jButtonplusActionPerformed() {//GEN-FIRST:event_jButton_plusActionPerformed
        jTextField1.setText(jTextField1.getText() + "+");
    }//GEN-LAST:event_jButton_plusActionPerformed

    private void jButtonCActionPerformed() {//GEN-FIRST:event_jButton_CActionPerformed
        jTextField1.setText("");
        jLabel1.setText("");
       jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jButton_CActionPerformed

    private void jButtoncleanActionPerformed() {//GEN-FIRST:event_jButton_cleanActionPerformed
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;
        if (jTextField1.getText().length() == 1)
        {
            jLabel1.setText("");
            jLabel1.setForeground(Color.black);
        }
        String store;

        if(length > 0)
        {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);
        }
    }//GEN-LAST:event_jButton_cleanActionPerformed
    double xt;
    @SuppressWarnings("empty-statement")
    private void jButtonsumActionPerformed() {//GEN-FIRST:event_jButton_sumActionPerformed
        Calculation calcsumActionPerformed = new Calculation();
        try {
            s = new Scanner(jTextField1.getText());
            String b = s.next();

            do
            {
                StringBuilder a = new StringBuilder(b);
                Double summean = calcsumActionPerformed.eval(a,Double.valueOf(a.indexOf(""+'(')));
                String formattedDouble = String.format("%.1f", summean);
                xt = summean;

                if (xt % 1 == 0)
                {
                    jTextField1.setText(""+calcsumActionPerformed.eval(a,Double.valueOf(a.indexOf(""+'(')))) ;
                    jLabel1.setText("");
                }

                else{
                    jTextField1.setText(formattedDouble);
                    jLabel1.setText("");
                }

            }

            while ( (b = s.next()) != "null");
        }
        catch(Exception e){
           e.getMessage();
        }
        finally{
            s.close();
        }
    }//GEN-LAST:event_jButton_sumActionPerformed

    private void jTextField1ActionPerformed() {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonpowerActionPerformed() {//GEN-FIRST:event_jButton_powerActionPerformed
        jTextField1.setText(jTextField1.getText() + "^");
    }//GEN-LAST:event_jButton_powerActionPerformed

    private void jButtonkorinActionPerformed() {//GEN-FIRST:event_jButton_korinActionPerformed
        jTextField1.setText(jTextField1.getText() + "√");
    }//GEN-LAST:event_jButton_korinActionPerformed

    private void jButtonFactorialActionPerformed() {//GEN-FIRST:event_jButton_log5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "!");
        livesum();
    }//GEN-LAST:event_jButton_log5ActionPerformed


    private void jButtonPActionPerformed() {//GEN-FIRST:event_jButton_PActionPerformed
        jTextField1.setText(jTextField1.getText() + Math.PI);
    }//GEN-LAST:event_jButton_PActionPerformed

    private void formWindowActivated() {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(255, 380);

    }//GEN-LAST:event_formWindowActivated

    private void jButtonlogActionPerformed() {//GEN-FIRST:event_jButton_logActionPerformed
        jTextField1.setText(jTextField1.getText() + "l");
    }//GEN-LAST:event_jButton_logActionPerformed

    private void jButtontanActionPerformed() {//GEN-FIRST:event_jButton_tanActionPerformed
        jTextField1.setText(jTextField1.getText() + "t");
    }//GEN-LAST:event_jButton_tanActionPerformed

    private void jButtontanhActionPerformed() {//GEN-FIRST:event_jButton_tanhActionPerformed
        jTextField1.setText(jTextField1.getText() + "T");
    }//GEN-LAST:event_jButton_tanhActionPerformed

    private void jButtonsinActionPerformed() {//GEN-FIRST:event_jButton_sinActionPerformed
        jTextField1.setText(jTextField1.getText() + "s");
    }//GEN-LAST:event_jButton_sinActionPerformed

    private void jButtoncoshActionPerformed() {//GEN-FIRST:event_jButton_coshActionPerformed
        jTextField1.setText(jTextField1.getText() + "C");
    }//GEN-LAST:event_jButton_coshActionPerformed

    private void jButtonsinhActionPerformed() {//GEN-FIRST:event_jButton_sinhActionPerformed
        jTextField1.setText(jTextField1.getText() + "S");
    }//GEN-LAST:event_jButton_sinhActionPerformed

    private void jButtoncosActionPerformed() {//GEN-FIRST:event_jButton_cosActionPerformed
        jTextField1.setText(jTextField1.getText() + "c");
    }//GEN-LAST:event_jButton_cosActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char non =evt.getKeyChar();
        if((Character.isDigit(non)) ){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jLabel1AncestorAdded() {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

 /*   private void jButtonplusKeyPressed() {//GEN-FIRST:event_jButton_plusKeyPressed

    }//GEN-LAST:event_jButton_plusKeyPressed

    private void jButtonplusKeyReleased() {//GEN-FIRST:event_jButton_plusKeyReleased

    }//GEN-LAST:event_jButton_plusKeyReleased

    private void jButtonplusKeyTyped() {//GEN-FIRST:event_jButton_plusKeyTyped
    }//GEN-LAST:event_jButton_plusKeyTyped*/
    char key;
    public char getKey(){return key; }
    public void setKey(char key){
        this.key =key;
    }
     double mny;
    public int jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        Calculation calckeypressed = new Calculation();
        key = evt.getKeyChar();
        if (key == KeyEvent.VK_ENTER ){
            try{
                s = new Scanner(jTextField1.getText());
                String b = s.next();
                double xl;
                do{
                    StringBuilder a = new StringBuilder(b);
                    mny =calckeypressed.eval(a,Double.valueOf(a.indexOf(""+'(')));
                    String formattedDouble = String.format("%.1f", meansum);
                    xl = mny;

                    if (xl % 1 == 0)
                    {
                        jTextField1.setText(""+calckeypressed.eval(a,Double.valueOf(a.indexOf(""+'('))) ) ;
                        jLabel1.setText("");
                    }

                    else{
                        jTextField1.setText(formattedDouble);
                        jLabel1.setText("");
                    }

                }
                while ( (b = s.next()) != "null");
            }
            catch(Exception e){
              e.getMessage();
            }
            finally{
                s.close();
            }
        }
        else if((evt.getKeyCode()==67 && (evt.isControlDown() ) )){
            jTextField1.setText("");
            jLabel1.setText("");

        }
        else if(evt.getKeyCode()==80 && (evt.isControlDown() ) ){
            jTextField1.setText(jTextField1.getText() + Math.PI);

        }
        else if(evt.getKeyCode()==101 && (evt.isControlDown() ) ){
            jTextField1.setText(jTextField1.getText() + Math.exp(1));

        }
        else if(evt.getKeyCode()==75 && (evt.isControlDown() ) ){
            jTextField1.setText(jTextField1.getText() + "√");
        }

        else  if(key ==KeyEvent.VK_1 ){
            jTextField1.setText(jTextField1.getText() + "1");
            livesum();
        }
        else if(key ==KeyEvent.VK_2 ){
            jTextField1.setText(jTextField1.getText() + "2");
            livesum();
        }
        else if(key ==KeyEvent.VK_3 ){
            jTextField1.setText(jTextField1.getText() + "3");
            livesum();
        }
        else if(key ==KeyEvent.VK_4 ){
            jTextField1.setText(jTextField1.getText() + "4");
            livesum();
        }
        else if(key ==KeyEvent.VK_5 ){
            jTextField1.setText(jTextField1.getText() + "5");
            livesum();
        }
        else if(key ==KeyEvent.VK_6 ){
            jTextField1.setText(jTextField1.getText() + "6");
            livesum();
        }
        else if(key ==KeyEvent.VK_7 ){
            jTextField1.setText(jTextField1.getText() + "7");
            livesum();
        }
        else if(key ==KeyEvent.VK_8 ){
            jTextField1.setText(jTextField1.getText() + "8");
            livesum();
        }
        else if(key ==KeyEvent.VK_9 ){
            jTextField1.setText(jTextField1.getText() + "9");
            livesum();
        }
        else if(key ==KeyEvent.VK_0 ){
            jTextField1.setText(jTextField1.getText() + "0");
            livesum();
        }

        else if(evt.getKeyCode()==49 && (evt.isControlDown() ) ){
            jTextField1.setText(jTextField1.getText());
             livesum();
        }
return 0;
    }//GEN-LAST:event_jTextField1KeyPressed
    private void jTextField1KeyReleased() {//GEN-FIRST:event_jTextField1KeyReleased
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jMenuIteminfoActionPerformed() {//GEN-FIRST:event_jMenuItem_infoActionPerformed
    }//GEN-LAST:event_jMenuItem_infoActionPerformed
        String jT;
    public void jMenuItemstandartActionPerformed() {//GEN-FIRST:event_jMenuItem_standartActionPerformed
        jT = "jMenuItemstandartActionPerformed";
        this.setResizable(true);
        this.setSize(255, 380);
        jTextField1.setSize(220,45);
        jLabel1.setSize(220,22);

    }//GEN-LAST:event_jMenuItem_standartActionPerformed

    public boolean jMenuItemsientificActionPerformed() {//GEN-FIRST:event_jMenuItem_sientificActionPerformed
       jT = "jMenuItemsientificActionPerformed";
        this.setResizable(true);
        this.setSize(538, 380);
        jTextField1.setSize(503,45);
        jLabel1.setSize(503,22);
        return false;
    }//GEN-LAST:event_jMenuItem_sientificActionPerformed

    private void formWindowClosed() {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jMenuItemcloseActionPerformed() {//GEN-FIRST:event_jMenuItem_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jMenuItem_closeActionPerformed

    private void jButtonEActionPerformed() {//GEN-FIRST:event_jButton_EActionPerformed
        jTextField1.setText(jTextField1.getText() + Math.exp(1));
    }//GEN-LAST:event_jButton_EActionPerformed

    private void jButtonBracketfrontActionPerformed() {//GEN-FIRST:event_jButton_log1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "(");
    }//GEN-LAST:event_jButton_log1ActionPerformed

    private void jButtonBracketendActionPerformed() {//GEN-FIRST:event_jButton_log2ActionPerformed
        jTextField1.setText(jTextField1.getText() + ")");
    }//GEN-LAST:event_jButton_log2ActionPerformed


    private void jButtonPRCActionPerformed() {//GEN-FIRST:event_jButton_P1ActionPerformed
        Calculation calcPRCActionPerformed = new Calculation();
        try {
            s = new Scanner(jTextField1.getText());

            String b = s.next();

            do{
                StringBuilder a = new StringBuilder(b);
                jLabel1.setText(""+calcPRCActionPerformed.eval(a,Double.valueOf(a.indexOf(""+'('))) ) ;
            }
            while ( (b = s.next()) != "null");
        }

        catch(Exception e){
            e.getMessage();
        }
        finally{
            s.close();
        }
    }//GEN-LAST:event_jButton_P1ActionPerformed

    private void jButtonLog10ActionPerformed() {//GEN-FIRST:event_jButton_E1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "L");
    }//GEN-LAST:event_jButton_E1ActionPerformed


    public static void main(String[] args) {


        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    public javax.swing.JButton getjButton0() { return jButton0;
    }

    public void setjButton0(javax.swing.JButton button0) {

        this.jButton0 = button0;
    }

    private javax.swing.JButton jButton1;
    public javax.swing.JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(javax.swing.JButton button1) {

        this.jButton1 = button1;
    }

    private javax.swing.JButton jButton1x;
    public javax.swing.JButton getjButton1x() { return jButton1x;
    }

    public void setjButton1x(javax.swing.JButton button1x) {

        this.jButton1x = button1x;
    }


    private javax.swing.JButton jButton2;
    public javax.swing.JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(javax.swing.JButton button2) {

        this.jButton2 = button2;
    }

    private javax.swing.JButton jButton3;
    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(javax.swing.JButton button3) {

        this.jButton3 = button3;
    }
    private javax.swing.JButton jButton4;
    public javax.swing.JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(javax.swing.JButton button4) {

        this.jButton4 = button4;
    }
    private javax.swing.JButton jButton5;
    public javax.swing.JButton getjButton5() { return jButton5;
    }

    public void setjButton5(javax.swing.JButton button5) {

        this.jButton5 = button5;
    }
    private javax.swing.JButton jButton6;
    public javax.swing.JButton getjButton6() { return jButton6;
    }

    public void setjButton6(javax.swing.JButton button6) {

        this.jButton6 = button6;
    }
    private javax.swing.JButton jButton7;
    public javax.swing.JButton getjButton7() { return jButton7;
    }

    public void setjButton7(javax.swing.JButton button7) {

        this.jButton7 = button7;
    }
    private javax.swing.JButton jButton8;
    public javax.swing.JButton getjButton8() { return jButton8;
    }

    public void setjButton8(javax.swing.JButton button8) {

        this.jButton8 = button8;
    }
    private javax.swing.JButton jButton9;
    public javax.swing.JButton getjButton9() { return jButton9;
    }

    public void setjButton9(javax.swing.JButton button9) {

        this.jButton9 = button9;
    }
    private javax.swing.JButton jButtonC;
    public javax.swing.JButton getjButtonC() { return jButtonC;
    }

    public void setjButtonC(javax.swing.JButton buttonC) {

        this.jButtonC = buttonC;
    }
    private javax.swing.JButton jButtonE;
    public javax.swing.JButton getjButtonE() { return jButtonE;
    }

    public void setjButtonE(javax.swing.JButton buttonE) {

        this.jButtonE = buttonE;
    }
    private javax.swing.JButton jButtonLog10;
    public javax.swing.JButton getjButtonLog10() { return jButtonLog10;
    }

    public void setjButtonLog10(javax.swing.JButton buttonLog10) {

        this.jButtonLog10 = buttonLog10;
    }
    private javax.swing.JButton jButtonHex;
    public javax.swing.JButton getjButtonHex() { return jButtonHex;
    }

    public void setjButtonHex(javax.swing.JButton buttonHex) {

        this.jButtonHex = buttonHex;
    }
    private javax.swing.JButton jButtonP;
    public javax.swing.JButton getjButtonP() { return jButtonP;
    }

    public void setjButtonP(javax.swing.JButton buttonP) {

        this.jButtonP = buttonP;
    }
    private javax.swing.JButton jButtonPRC;
    public javax.swing.JButton getjButtonPRC() { return jButtonPRC;
    }

    public void setjButtonPRC(javax.swing.JButton buttonPRC) {

        this.jButtonPRC = buttonPRC;
    }
    private javax.swing.JButton jButtonOctal;
    public javax.swing.JButton getjButtonOctal() { return jButtonOctal;
    }

    public void setjButtonOctal(javax.swing.JButton buttonOctal) {

        this.jButtonOctal = buttonOctal;
    }
    private javax.swing.JButton jButtonclean;
    public javax.swing.JButton getjButtonClean() { return jButtonclean;
    }

    public void setjButtonClean(javax.swing.JButton buttonClean) {

        this.jButtonclean = buttonClean;
    }
    private javax.swing.JButton jButtoncos;
    public javax.swing.JButton getjButtonCos() { return jButtoncos;
    }

    public void setjButtonCos(javax.swing.JButton buttoncos) {

        this.jButtoncos = buttoncos;
    }


    private javax.swing.JButton jButtoncosh;
    public javax.swing.JButton getjButtonCosh() { return jButtoncosh;
    }

    public void setjButtonCosh(javax.swing.JButton buttoncosh) {

        this.jButtoncosh = buttoncosh;
    }
    private javax.swing.JButton jButtondivision;
    public javax.swing.JButton getjButtonDivision() { return jButtondivision;
    }

    public void setjButtonDivision(javax.swing.JButton buttondivision) {

        this.jButtondivision = buttondivision;
    }
    private javax.swing.JButton jButtonkorin;
    public javax.swing.JButton getjButtonKorin() { return jButtonkorin;
    }

    public void setjButtonKorin(javax.swing.JButton buttonKorin) {

        this.jButtonkorin = buttonKorin;
    }
    private javax.swing.JButton jButtonlog;
    public javax.swing.JButton getjButtonLog() { return jButtonlog;
    }

    public void setjButtonLog(javax.swing.JButton buttonLog) {

        this.jButtonlog = buttonLog;
    }
    private javax.swing.JButton jButtonBracketfront;
    public javax.swing.JButton getjButtonBracketfront() { return jButtonBracketfront;
    }

    public void setjButtonBracketfront(javax.swing.JButton buttonBracketfront) {

        this.jButtonBracketfront = buttonBracketfront;
    }
    private javax.swing.JButton jButtonBracketend;
    public javax.swing.JButton getjButtonBracketend() { return jButtonBracketend;
    }

    public void setjButtonBracketend(javax.swing.JButton buttonBracketend) {

        this.jButtonBracketend = buttonBracketend;
    }
    private javax.swing.JButton jButtonRound;
    public javax.swing.JButton getjButtonRound() { return jButtonRound;
    }

    public void setjButtonRound(javax.swing.JButton buttonRound) {

        this.jButtonRound = buttonRound;
    }
    private javax.swing.JButton jButtonBin;
    public javax.swing.JButton getjButtonBin() { return jButtonBin;
    }

    public void setjButtonBin(javax.swing.JButton buttonBin) {

        this.jButtonBin = buttonBin;
    }
    private javax.swing.JButton jButtonFactorial;
    public javax.swing.JButton getjButtonFactorial() { return jButtonFactorial;
    }

    public void setjButtonFactorial(javax.swing.JButton buttonFactorial) {

        this.jButtonFactorial = buttonFactorial;
    }
    private javax.swing.JButton jButtonminus;
    public javax.swing.JButton getjButtonMinus() { return jButtonminus;
    }

    public void setjButtonMinus(javax.swing.JButton buttonMinus) {

        this.jButtonminus = buttonMinus;
    }
    private javax.swing.JButton jButtonmultiplication;
    public javax.swing.JButton getjButtonmultiplication() { return jButtonmultiplication;
    }

    public void setjButtonmultiplication(javax.swing.JButton buttonmultiplication) {

        this.jButtonmultiplication = buttonmultiplication;
    }
    private javax.swing.JButton jButtonplus;
    public javax.swing.JButton getjButtonPlus() { return jButtonplus;
    }

    public void setjButtonPlus(javax.swing.JButton buttonPlus) {

        this.jButtonplus = buttonPlus;
    }
    private javax.swing.JButton jButtonpoint;
    public javax.swing.JButton getjButtonPoint() { return jButtonpoint;
    }

    public void setjButtonPoint(javax.swing.JButton buttonPoint) {

        this.jButtonpoint= buttonPoint;
    }
    private javax.swing.JButton jButtonpower;
    public javax.swing.JButton getjButtonPower() { return jButtonpower;
    }

    public void setjButtonPower(javax.swing.JButton buttonPower) {

        this.jButtonpower= buttonPower;
    }
    private javax.swing.JButton jButtonreverse;
    public javax.swing.JButton getjButtonReverse() { return jButtonreverse;
    }

    public void setjButtonReverse(javax.swing.JButton buttonReverse) {

        this.jButtonreverse = buttonReverse;
    }
    private javax.swing.JButton jButtonsin;
    public javax.swing.JButton getjButtonSin() { return jButtonsin;
    }

    public void setjButtonSin(javax.swing.JButton buttonSin) {

        this.jButtonsin = buttonSin;
    }
    private javax.swing.JButton jButtonsinh;
    public javax.swing.JButton getjButtonSinh() { return jButtonsinh;
    }

    public void setjButtonSinh(javax.swing.JButton buttonSinh) {

        this.jButtonsinh = buttonSinh;
    }
    private javax.swing.JButton jButtonsum;
    public javax.swing.JButton getjButtonSum() { return jButtonsum;
    }

    public void setjButtonSum(javax.swing.JButton buttonSum) {

        this.jButtonsum = buttonSum;
    }
    private javax.swing.JButton jButtontan;
    public javax.swing.JButton getjButtonTan() { return jButtontan;
    }

    public void setjButtonTan(javax.swing.JButton buttonTan) {

        this.jButtontan = buttonTan;
    }
    private javax.swing.JButton jButtontanh;
    public javax.swing.JButton getjButtonTanh() { return jButtontanh;
    }

    public void setjButtonTanh(javax.swing.JButton buttonTanh) {

        this.jButtontanh = buttonTanh;
    }
   private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel label1) {

        this.jLabel1 = label1;
    }
  private javax.swing.JMenuItem jMenuItemOFF;
    public javax.swing.JMenuItem getjMenuItemOFF() {
        return jMenuItemOFF;
    }

    public void setjMenuItemOFF(javax.swing.JMenuItem jmenuItemOff) {

        this.jMenuItemOFF = jmenuItemOff;
    }
    private javax.swing.JMenuItem jMenuItemON;
    public javax.swing.JMenuItem getjMenuItemON() {
        return jMenuItemON;
    }

    public void setjMenuItemON(javax.swing.JMenuItem jmenuItemOn) {

        this.jMenuItemON = jmenuItemOn;
    }
    private javax.swing.JMenuItem jMenuItemsientific;
    public javax.swing.JMenuItem getjMenuItemSientific() {
        return jMenuItemsientific;
    }
    public void setjMenuItemSientific(javax.swing.JMenuItem jMenuItemsientific) {

        this.jMenuItemsientific = jMenuItemsientific;
    }



    private javax.swing.JMenuItem jMenuItemstandart;
    public javax.swing.JMenuItem getjMenuItemStandart() {
        return jMenuItemstandart;
    }
    public void setjMenuItemStandart(javax.swing.JMenuItem jMenuItemstandart) {

        this.jMenuItemstandart = jMenuItemstandart;
    }


    private javax.swing.JMenuItem jMenuItemclose;
    public javax.swing.JMenuItem getjMenuItemclose() {
        return jMenuItemclose;
    }

    public void setjMenuItemclose(javax.swing.JMenuItem jMenuItemclose) {

        this.jMenuItemclose = jMenuItemclose;
    }



    private javax.swing.JMenu jMenuinfa;
    public javax.swing.JMenu getjMenuInfa() {
        return jMenuinfa;
    }

    public void setjMenuInfa(javax.swing.JMenu jMenuInfa) {

        this.jMenuinfa = jMenuInfa;
    }



    private  javax.swing.JTextField jTextField1;

    public javax.swing.JTextField getjTextFiel1() {
        return jTextField1; 
    }

    public void setjTextFiled1(javax.swing.JTextField field) {
        this.jTextField1 = field;
    }

    // End of variables declaration//GEN-END:variables
    private javax.swing.JMenu jMenuKalculator;
    public javax.swing.JMenu getjMenuKalculator() {
        return jMenuKalculator;
    }

    public void setjMenuKalculator(javax.swing.JMenu calculator) {

        this.jMenuKalculator = calculator;
    }
}

