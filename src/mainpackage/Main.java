package mainpackage;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;

import java.awt.event.*;
import java.util.Scanner;

public class Main extends javax.swing.JFrame  {

   public String calculation;
    public double num;
    public double ans;
   public Scanner s = new Scanner("");


    public Main() {
        initComponents();
        jMenuItemON.setEnabled(false);//as
    }


    public double meansum;

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

            case "round":
                ans = Math.round(num);
                jLabel1.setText(Double.toString(ans));
                break;

            case "bin":
                jLabel1.setText(Integer.toString(Integer.parseInt(jTextField1.getText()),2));
                break;

            case "hex":
                jLabel1.setText(Integer.toString(Integer.parseInt(jTextField1.getText()),16));
                break;


            case "octal":
                jLabel1.setText(Integer.toString(Integer.parseInt(jTextField1.getText()),8));
                break;
            default :
                System.out.println("ERROR");
                break;
        }
        return 0;

    }

    public int livesum(){
        Calculation calc_livesum = new Calculation();
        try {
            s = new Scanner(jTextField1.getText());
            String b = s.next();
            double x;
            do {

                StringBuilder a = new StringBuilder(b);
                meansum = calc_livesum.eval(a, Double.valueOf(a.indexOf("" + '(')));
                String formattedDouble = String.format("%.1f", meansum);
                x = meansum;

                if (x % 1 == 0) {

                    jLabel1.setText("" + calc_livesum.eval(a, Double.valueOf(a.indexOf("" + '('))));
                } else {
                    jLabel1.setText(formattedDouble);
                }
            }
            while ((b = s.next()) != "null") ;

        }
        catch(Exception e){
            StrictMath logger = null;
            logger.log(0);
        }
        finally{
            s.close();
        }

        return s.nextInt();
    }

    public void vkl()
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
    }

    public void vykl()
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new JCheckBoxMenuItem();
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
        //jLabel1 label = new javax.swing.JLabel();

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
        jInternalFrame1 = new JInternalFrame();
        //jTextField2 = new JTextField();
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
        jMenuBar1 = new JMenuBar();
        jMenuKalculator = new JMenu();
        jMenuItemON = new JMenuItem();
        jMenuItemOFF = new JMenuItem();
        jMenuItemclose = new JMenuItem();
        jMenuview = new JMenu();
        jMenuItemstandart = new JMenuItem();
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
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed();
            }
        });
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
        jButtonclean.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtoncleanActionPerformed();
            }
        });
        getContentPane().add(jButtonclean);
        jButtonclean.setBounds(67, 90, 51, 56);

        jButtonC.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonC.setText("C");
        jButtonC.setToolTipText("CTRL+C");
        jButtonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonCActionPerformed();
            }
        });
        getContentPane().add(jButtonC);
        jButtonC.setBounds(124, 90, 51, 56);

        jButton1.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed();
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 152, 51, 33);

        jButtonplus.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonplus.setText("+");
        jButtonplus.setToolTipText("");
        jButtonplus.setRequestFocusEnabled(false);
        jButtonplus.setRolloverEnabled(false);
        jButtonplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonplusActionPerformed();
            }
        });

        jButtonplus.addKeyListener(new KeyAdapter() {
        /*	@Override
            public void keyPressed(KeyEvent evt) {
                jButtonplusKeyPressed();
            }
            @Override
            public void keyReleased(KeyEvent evt) {
                jButtonplusKeyReleased();
            }
            @Override
 
            public void keyTyped(KeyEvent evt) {
                jButtonplusKeyTyped();
            }*/
        });

        getContentPane().add(jButtonplus);
        jButtonplus.setBounds(181, 90, 51, 56);

        jButton2.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("2");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed();
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(67, 152, 51, 33);

        jButton3.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed();
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(124, 152, 51, 33);

        jButtonminus.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonminus.setText("-");
        jButtonminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonminusActionPerformed();
            }
        });
        getContentPane().add(jButtonminus);
        jButtonminus.setBounds(181, 152, 51, 33);

        jButton4.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed();
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 191, 51, 33);

        jButton5.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton5.setText("5");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed();
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(67, 191, 51, 33);

        jButton6.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton6.setText("6");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed();
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(124, 191, 51, 33);

        jButtonmultiplication.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonmultiplication.setText("*");
        jButtonmultiplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonmultiplicationActionPerformed();
            }
        });
        getContentPane().add(jButtonmultiplication);
        jButtonmultiplication.setBounds(181, 191, 51, 33);

        jButton7.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed();
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 230, 51, 33);

        jButton8.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed();
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(67, 230, 51, 33);

        jButton9.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed();
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(124, 230, 51, 33);

        jButtondivision.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtondivision.setText("/");
        jButtondivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtondivisionActionPerformed();
            }
        });
        getContentPane().add(jButtondivision);
        jButtondivision.setBounds(181, 230, 51, 33);

        jButton0.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton0ActionPerformed();
            }
        });
        getContentPane().add(jButton0);
        jButton0.setBounds(10, 269, 51, 33);

        jButtonpoint.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonpoint.setText(".");
        jButtonpoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonpointActionPerformed();
            }
        });
        getContentPane().add(jButtonpoint);
        jButtonpoint.setBounds(67, 269, 51, 33);

        jButtonsum.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonsum.setText("=");
        jButtonsum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonsumActionPerformed();
            }
        });
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
        jButtonkorin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonkorinActionPerformed();
            }
        });
        getContentPane().add(jButtonkorin);
        jButtonkorin.setBounds(450, 222, 61, 37);

        jButtonreverse.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonreverse.setText("±");
        jButtonreverse.setToolTipText("Shift+F");
        jButtonreverse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonreverseActionPerformed();
            }
        });
        getContentPane().add(jButtonreverse);
        jButtonreverse.setBounds(376, 265, 70, 37);

        jButton1x.setFont(new Font("Tahoma", 1, 10)); // NOI18N
        jButton1x.setText("1/x");
        jButton1x.setToolTipText("Shift+D");
        jButton1x.setAlignmentY(0.0F);
        jButton1x.setMaximumSize(new Dimension(49, 33));
        jButton1x.setMinimumSize(new Dimension(49, 33));
        jButton1x.setPreferredSize(new Dimension(49, 33));
        jButton1x.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1xActionPerformed();
            }
        });
        getContentPane().add(jButton1x);
        jButton1x.setBounds(450, 265, 61, 37);

        jButtonP.setFont(new Font("Tahoma", 1, 20)); // NOI18N
        jButtonP.setText("П");
        jButtonP.setToolTipText("Ctrl+P");
        jButtonP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonPActionPerformed();
            }
        });
        getContentPane().add(jButtonP);
        jButtonP.setBounds(450, 179, 61, 37);

        jButtoncos.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtoncos.setText("cos");
        jButtoncos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtoncosActionPerformed();
            }
        });
        getContentPane().add(jButtoncos);
        jButtoncos.setBounds(239, 222, 65, 37);

        jButtonsinh.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonsinh.setText("sinh");
        jButtonsinh.setMaximumSize(new Dimension(60, 23));
        jButtonsinh.setMinimumSize(new Dimension(60, 23));
        jButtonsinh.setPreferredSize(new Dimension(51, 23));
        jButtonsinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonsinhActionPerformed();
            }
        });
        getContentPane().add(jButtonsinh);
        jButtonsinh.setBounds(310, 179, 60, 37);

        jButtonlog.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonlog.setText("log");
        jButtonlog.setPreferredSize(new Dimension(51, 23));
        jButtonlog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonlogActionPerformed();
            }
        });
        getContentPane().add(jButtonlog);
        jButtonlog.setBounds(310, 131, 60, 42);

        jButtontan.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtontan.setText("tan");
        jButtontan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtontanActionPerformed();
            }
        });
        getContentPane().add(jButtontan);
        jButtontan.setBounds(239, 265, 65, 37);

        jButtontanh.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtontanh.setText("tanh");
        jButtontanh.setPreferredSize(new Dimension(60, 23));
        jButtontanh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtontanhActionPerformed();
            }
        });
        getContentPane().add(jButtontanh);
        jButtontanh.setBounds(310, 265, 60, 37);

        jButtonsin.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonsin.setText("sin");
        jButtonsin.setPreferredSize(new Dimension(51, 23));
        jButtonsin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonsinActionPerformed();
            }
        });
        getContentPane().add(jButtonsin);
        jButtonsin.setBounds(239, 179, 65, 37);

        jButtoncosh.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtoncosh.setText("cosh");
        jButtoncosh.setMaximumSize(new Dimension(60, 23));
        jButtoncosh.setPreferredSize(new Dimension(51, 23));
        jButtoncosh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtoncoshActionPerformed();
            }
        });
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
        jButtonE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonEActionPerformed();
            }
        });
        getContentPane().add(jButtonE);
        jButtonE.setBounds(376, 179, 70, 37);

        jButtonBracketfront.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonBracketfront.setText("(");
        jButtonBracketfront.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonBracketfrontActionPerformed();
            }
        });
        getContentPane().add(jButtonBracketfront);
        jButtonBracketfront.setBounds(10, 90, 51, 27);

        jButtonBracketend.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonBracketend.setText(")");
        jButtonBracketend.setMinimumSize(new Dimension(37, 27));
        jButtonBracketend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonBracketendActionPerformed();
            }
        });
        getContentPane().add(jButtonBracketend);
        jButtonBracketend.setBounds(10, 123, 51, 23);

        jButtonRound.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonRound.setText("round");
        jButtonRound.setPreferredSize(new Dimension(51, 23));
        jButtonRound.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonlog3ActionPerformed();
            }
        });
        getContentPane().add(jButtonRound);
        jButtonRound.setBounds(239, 131, 65, 42);

        jButtonPRC.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonPRC.setText("PRC");
        jButtonPRC.setToolTipText("Точність суми");
        jButtonPRC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonPRCActionPerformed();
            }
        });
        getContentPane().add(jButtonPRC);
        jButtonPRC.setBounds(450, 131, 61, 42);

        jButtonLog10.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonLog10.setText("log10");
        jButtonLog10.setToolTipText("");
        jButtonLog10.setMaximumSize(new Dimension(49, 33));
        jButtonLog10.setMinimumSize(new Dimension(49, 33));
        jButtonLog10.setPreferredSize(new Dimension(49, 33));
        jButtonLog10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonLog10ActionPerformed();
            }
        });
        getContentPane().add(jButtonLog10);
        jButtonLog10.setBounds(376, 131, 70, 42);

        jButtonBin.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonBin.setText("bin");
        jButtonBin.setPreferredSize(new Dimension(51, 23));
        jButtonBin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonBinActionPerformed();
            }
        });
        getContentPane().add(jButtonBin);
        jButtonBin.setBounds(310, 90, 60, 35);

        jButtonOctal.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonOctal.setText("octal");
        jButtonOctal.setToolTipText("");
        jButtonOctal.setMaximumSize(new Dimension(53, 23));
        jButtonOctal.setMinimumSize(new Dimension(53, 23));
        jButtonOctal.setPreferredSize(new Dimension(53, 23));
        jButtonOctal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonOctalActionPerformed();
            }
        });
        getContentPane().add(jButtonOctal);
        jButtonOctal.setBounds(380, 90, 60, 35);

        jButtonHex.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonHex.setText("hex");
        jButtonHex.setToolTipText("");
        jButtonHex.setMaximumSize(new Dimension(53, 33));
        jButtonHex.setMinimumSize(new Dimension(53, 33));
        jButtonHex.setPreferredSize(new Dimension(53, 33));
        jButtonHex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonHexActionPerformed();
            }
        });
        getContentPane().add(jButtonHex);
        jButtonHex.setBounds(450, 90, 60, 33);

        jButtonFactorial.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jButtonFactorial.setText("!n");
        jButtonFactorial.setPreferredSize(new Dimension(51, 23));
        jButtonFactorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonFactorialActionPerformed();
            }
        });
        getContentPane().add(jButtonFactorial);
        jButtonFactorial.setBounds(239, 90, 65, 35);

        jMenuKalculator.setText("Калькулятор");

        jMenuItemON.setText("Вкл");
        jMenuItemON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItemONActionPerformed();
            }
        });
        jMenuKalculator.add(jMenuItemON);

        jMenuItemOFF.setText("Викл");
        jMenuItemOFF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItemOFFActionPerformed();
            }
        });
        jMenuKalculator.add(jMenuItemOFF);

        jMenuItemclose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        jMenuItemclose.setText("Закрити");
        jMenuItemclose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItemcloseActionPerformed();
            }
        });
        jMenuKalculator.add(jMenuItemclose);

        jMenuBar1.add(jMenuKalculator);

        jMenuview.setText("Вид");

        jMenuItemstandart.setText("Стандартний");
        jMenuItemstandart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItemstandartActionPerformed();
            }
        });
        jMenuview.add(jMenuItemstandart);

        jMenuItemsientific.setText("Науковий");
        jMenuItemsientific.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItemsientificActionPerformed();
            }
        });
        jMenuview.add(jMenuItemsientific);

        jMenuBar1.add(jMenuview);

        jMenuinfa.setText("Інфо");

        jMenuItemON.setText("Про програму");
        jMenuItemON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuIteminfoActionPerformed();
            }
        });
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
        calculation = "round";
        mathematic();
    }//GEN-LAST:event_jButton_log3ActionPerformed


    public void jButtonBinActionPerformed() {//GEN-FIRST:event_jButton_log4ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = "bin";
        mathematic();
    }//GEN-LAST:event_jButton_log4ActionPerformed

    public void jButtonOctalActionPerformed() {//GEN-FIRST:event_jButton_P2ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = "octal";
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


    private void jButton1ActionPerformed() {//GEN-FIRST:event_jButton_1ActionPerformed
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

    @SuppressWarnings("empty-statement")
    private void jButtonsumActionPerformed() {//GEN-FIRST:event_jButton_sumActionPerformed
        Calculation calc_sum_ActionPerformed = new Calculation();
        try {
            s = new Scanner(jTextField1.getText());
            String b = s.next();
            double x;
            do
            {
                StringBuilder a = new StringBuilder(b);
                Double summean = calc_sum_ActionPerformed.eval(a,Double.valueOf(a.indexOf(""+'(')));
                String formattedDouble = String.format("%.1f", summean);
                x = summean;

                if (x % 1 == 0)
                {
                    jTextField1.setText(""+calc_sum_ActionPerformed.eval(a,Double.valueOf(a.indexOf(""+'('))) ) ;
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
            StrictMath logger = null;
            logger.log(0);
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
    public char cc;
    public double mny;
    public void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        Calculation calckeypressed = new Calculation();
        cc = evt.getKeyChar();
        if (cc == KeyEvent.VK_ENTER ){
            try{
                s = new Scanner(jTextField1.getText());
                String b = s.next();
                double x;
                do{
                    StringBuilder a = new StringBuilder(b);
                    mny =calckeypressed.eval(a,Double.valueOf(a.indexOf(""+'(')));
                    String formattedDouble = String.format("%.1f", meansum);
                    x = mny;

                    if (x % 1 == 0)
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
                StrictMath logger = null;
                logger.log(0);
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

        else  if(cc ==KeyEvent.VK_1 ){
            jTextField1.setText(jTextField1.getText() + "1");
            livesum();
        }
        else if(cc ==KeyEvent.VK_2 ){
            jTextField1.setText(jTextField1.getText() + "2");
            livesum();
        }
        else if(cc ==KeyEvent.VK_3 ){
            jTextField1.setText(jTextField1.getText() + "3");
            livesum();
        }
        else if(cc ==KeyEvent.VK_4 ){
            jTextField1.setText(jTextField1.getText() + "4");
            livesum();
        }
        else if(cc ==KeyEvent.VK_5 ){
            jTextField1.setText(jTextField1.getText() + "5");
            livesum();
        }
        else if(cc ==KeyEvent.VK_6 ){
            jTextField1.setText(jTextField1.getText() + "6");
            livesum();
        }
        else if(cc ==KeyEvent.VK_7 ){
            jTextField1.setText(jTextField1.getText() + "7");
            livesum();
        }
        else if(cc ==KeyEvent.VK_8 ){
            jTextField1.setText(jTextField1.getText() + "8");
            livesum();
        }
        else if(cc ==KeyEvent.VK_9 ){
            jTextField1.setText(jTextField1.getText() + "9");
            livesum();
        }
        else if(cc ==KeyEvent.VK_0 ){
            jTextField1.setText(jTextField1.getText() + "0");
            livesum();
        }

        else if(evt.getKeyCode()==49 && (evt.isControlDown() ) ){
            jTextField1.setText(jTextField1.getText());
             livesum();
        }

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
        try{
            s = new Scanner(jTextField1.getText());

            String b = s.next();

            do{
                StringBuilder a = new StringBuilder(b);
                jLabel1.setText(""+calcPRCActionPerformed.eval(a,Double.valueOf(a.indexOf(""+'('))) ) ;
            }
            while ( (b = s.next()) != "null");
        }

        catch(Exception e){
            StrictMath logger = null;
            logger.log(0);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton0;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1x;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonLog10;
    private javax.swing.JButton jButtonHex;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonPRC;
    private javax.swing.JButton jButtonOctal;
    private javax.swing.JButton jButtonclean;
    private javax.swing.JButton jButtoncos;
    private javax.swing.JButton jButtoncosh;
    private javax.swing.JButton jButtondivision;
    private javax.swing.JButton jButtonkorin;
    private javax.swing.JButton jButtonlog;
    private javax.swing.JButton jButtonBracketfront;
    private javax.swing.JButton jButtonBracketend;
    private javax.swing.JButton jButtonRound;
    private javax.swing.JButton jButtonBin;
    private javax.swing.JButton jButtonFactorial;
    private javax.swing.JButton jButtonminus;
    private javax.swing.JButton jButtonmultiplication;
    private javax.swing.JButton jButtonplus;
    private javax.swing.JButton jButtonpoint;
    private javax.swing.JButton jButtonpower;
    private javax.swing.JButton jButtonreverse;
    private javax.swing.JButton jButtonsin;
    private javax.swing.JButton jButtonsinh;
    private javax.swing.JButton jButtonsum;
    private javax.swing.JButton jButtontan;
    private javax.swing.JButton jButtontanh;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JInternalFrame jInternalFrame1;
    public  javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemOFF;
    private javax.swing.JMenuItem jMenuItemON;
    private javax.swing.JMenuItem jMenuItemclose;
   // private javax.swing.JMenuItem jMenuIteminfo;
    public javax.swing.JMenuItem jMenuItemsientific;
    private javax.swing.JMenuItem jMenuItemstandart;
    private javax.swing.JMenu jMenuKalculator;
    private javax.swing.JMenu jMenuinfa;
    private javax.swing.JMenu jMenuview;
    public  javax.swing.JTextField jTextField1;
   // private static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}

