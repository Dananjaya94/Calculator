/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nuwan
 */
public class CalculatorMain extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorMain
     */
    
    int number1 = 0;
    int number2 = 0;
    String operator = null;
    
    public CalculatorMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisplayField = new javax.swing.JTextField();
        equal = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        four = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        three = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numbertwolabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numberonelabel = new javax.swing.JLabel();
        divide1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DisplayField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DisplayField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(DisplayField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 110));

        equal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        getContentPane().add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 80, 80));

        clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clear.setText("AC");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, 80));

        plus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        getContentPane().add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, 80));

        minus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        getContentPane().add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 80, 80));

        multiply.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        getContentPane().add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 80, 80));

        seven.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 80));

        eight.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 80, 80));

        nine.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 80, 80));

        five.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 80, 80));

        six.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 80, 80));

        four.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 80));

        zero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 80, 80));

        three.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 80, 80));

        one.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 80, 80));

        two.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 80, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Number Two Label");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        numbertwolabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numbertwolabel.setText("--");
        getContentPane().add(numbertwolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Number One Label");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        numberonelabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numberonelabel.setText("--");
        getContentPane().add(numberonelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        divide1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        divide1.setText("/");
        divide1.setMaximumSize(new java.awt.Dimension(555, 550));
        divide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divide1ActionPerformed(evt);
            }
        });
        getContentPane().add(divide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 80, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        
        DisplayField.setText(DisplayField.getText() + 0);
    }//GEN-LAST:event_zeroActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        ResetClaculator();
    }//GEN-LAST:event_clearActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed

        DisplayField.setText(DisplayField.getText() + 1);
        
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed

        DisplayField.setText(DisplayField.getText() + 2);
        
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed

        DisplayField.setText(DisplayField.getText() + 3);
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed

        DisplayField.setText(DisplayField.getText() + 4);
        
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed

        DisplayField.setText(DisplayField.getText() + 5);
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed

        DisplayField.setText(DisplayField.getText() + 6);
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed

        DisplayField.setText(DisplayField.getText() + 7);
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed

        DisplayField.setText(DisplayField.getText() + 8);
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed

        DisplayField.setText(DisplayField.getText() + 9);
    }//GEN-LAST:event_nineActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed

        number1 = Integer.parseInt(DisplayField.getText());
        operator = "plus";
        numberonelabel.setText(Integer.toString(number1));
        DisplayField.setText("");
    }//GEN-LAST:event_plusActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed

        number2 = Integer.parseInt(DisplayField.getText());
        numbertwolabel.setText(Integer.toString(number2));
        Operator opr = new Operator();
        
        float answer = opr.PerformOperator(number1, number2, operator);
        DisplayField.setText(Float.toString(answer));
        
    }//GEN-LAST:event_equalActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed

        number1 = Integer.parseInt(DisplayField.getText());
        operator = "minus";
        numberonelabel.setText(Integer.toString(number1));
        DisplayField.setText("");
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed

        number1 = Integer.parseInt(DisplayField.getText());
        operator = "multiply";
        numberonelabel.setText(Integer.toString(number1));
        DisplayField.setText("");
    }//GEN-LAST:event_multiplyActionPerformed

    private void divide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divide1ActionPerformed
        
        number1 = Integer.parseInt(DisplayField.getText());
        operator = "divide";
        numberonelabel.setText(Integer.toString(number1));
        DisplayField.setText("");
    }//GEN-LAST:event_divide1ActionPerformed

    private void ResetClaculator(){
        number1 = 0;
        number2 = 0;
        operator = null;
        DisplayField.setText("");
        numberonelabel.setText("");
        numbertwolabel.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DisplayField;
    private javax.swing.JButton clear;
    private javax.swing.JButton divide1;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JLabel numberonelabel;
    private javax.swing.JLabel numbertwolabel;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
