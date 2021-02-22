/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancowzt.Telas;

import static bancowzt.Compartilhada.Valores.FormataValor;
import bancowzt.Entidades.Cliente;
import bancowzt.Servicos.ClienteServices;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author natha
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        JTextField txtIdade = new JTextField("Right");
        txtIdade.setHorizontalAlignment(JTextField.RIGHT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRealizarAnalise = new javax.swing.JButton();
        txtScore = new javax.swing.JTextField();
        txtRenda = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("SCORE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("RENDA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("IDADE");

        btnRealizarAnalise.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRealizarAnalise.setText("Realizar Analise");
        btnRealizarAnalise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizarAnaliseMouseClicked(evt);
            }
        });
        btnRealizarAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarAnaliseActionPerformed(evt);
            }
        });
        btnRealizarAnalise.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRealizarAnaliseKeyPressed(evt);
            }
        });

        txtScore.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtScore.setText("0");
        txtScore.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtScoreFocusGained(evt);
            }
        });
        txtScore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtScoreKeyPressed(evt);
            }
        });

        txtRenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRenda.setText("0.00");
        txtRenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRendaFocusLost(evt);
            }
        });
        txtRenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRendaKeyPressed(evt);
            }
        });

        txtIdade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIdade.setText("0");
        txtIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdadeFocusGained(evt);
            }
        });
        txtIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdadeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRealizarAnalise)
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnRealizarAnalise))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarAnaliseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarAnaliseActionPerformed

    private void btnRealizarAnaliseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarAnaliseMouseClicked
        RealizarAnalise();
    }//GEN-LAST:event_btnRealizarAnaliseMouseClicked

    private void txtScoreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtScoreFocusGained
        txtScore.selectAll();
    }//GEN-LAST:event_txtScoreFocusGained

    private void txtRendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRendaFocusGained
        txtRenda.selectAll();
    }//GEN-LAST:event_txtRendaFocusGained

    private void txtIdadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdadeFocusGained
        txtIdade.selectAll();
    }//GEN-LAST:event_txtIdadeFocusGained

    private void txtScoreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtScoreKeyPressed
        if(evt.getKeyCode() == 10){ txtRenda.requestFocus(); }
    }//GEN-LAST:event_txtScoreKeyPressed

    private void txtRendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRendaKeyPressed
        if(evt.getKeyCode() == 10){ txtIdade.requestFocus(); }
    }//GEN-LAST:event_txtRendaKeyPressed

    private void txtIdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdadeKeyPressed
        if(evt.getKeyCode() == 10){ btnRealizarAnalise.requestFocus(); }
    }//GEN-LAST:event_txtIdadeKeyPressed

    private void btnRealizarAnaliseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRealizarAnaliseKeyPressed
        if(evt.getKeyCode() == 10){ RealizarAnalise(); }
    }//GEN-LAST:event_btnRealizarAnaliseKeyPressed

    private void txtRendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRendaFocusLost
        if(txtRenda.getText() == ""){ txtRenda.setText("0.00"); }
        txtRenda.setText(txtRenda.getText().replace(",", "."));
        try {
            double valor = Double.parseDouble(txtRenda.getText());
            valor = FormataValor(valor,2);
            txtRenda.setText(String.valueOf(valor));
        } catch (Exception e) {
            txtRenda.setText("0.00");
        }
    }//GEN-LAST:event_txtRendaFocusLost

    private void RealizarAnalise(){
        try {
            int score = Integer.parseInt(txtScore.getText());
            double renda = Double.parseDouble(txtRenda.getText());
            int idade =Integer.parseInt(txtIdade.getText());
            Cliente cliente = new Cliente(score, renda, idade);
            double creditoConcedido = ClienteServices.AnalisarCredito(cliente);
            JOptionPane.showMessageDialog(null,
                "Você pode ter um crédito de até " +creditoConcedido, "Analise de Crédito",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        txtScore.requestFocus();
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarAnalise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtRenda;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}