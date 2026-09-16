
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author CL2-PC
 */
public class rps_Exam extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(rps_Exam.class.getName());

    /**
     * Creates new form rpsExam
     */
    
    public int p1;
    public int p2;
    public int p1Score;
    public int p2Score;
    public int p1Lives = 5;
    public int p2Lives = 5;
    
    public rps_Exam() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void resetSelection() {
        p1 = 0;
        p2 = 0;
    }
    
    public void showWinner() {
        if (p1 == 1 && p2 == 1 || p1 == 2 && p2 == 2 || p1 == 3 && p2 == 3) {
            JOptionPane.showMessageDialog(rootPane, "Draw", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (p1 == 1 && p2 == 2 || p1 == 2 && p2 == 3 || p1 == 3 && p2 == 1) {
            JOptionPane.showMessageDialog(rootPane, "PLAYER-2 WINS", "Result", JOptionPane.INFORMATION_MESSAGE);
            p1Lives--;
        } else if (p1 == 1 && p2 == 3 || p1 == 2 && p2 == 1 || p1 == 3 && p2 == 2) {
            JOptionPane.showMessageDialog(rootPane, "PLAYER-1 WINS", "Result", JOptionPane.INFORMATION_MESSAGE);
            p2Lives--;
        } else {
            JOptionPane.showMessageDialog(rootPane, "You must bato bato pick first.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        resetSelection();
        updateLives(p1Lives, p2Lives);
    }
    
    public void updateLives(int p1Lives, int p2Lives) {
        if (p1Lives == 0) {
            JOptionPane.showMessageDialog(rootPane, "PLAYER-2 WINS ON THIS ROUND", "Result", JOptionPane.INFORMATION_MESSAGE);
            p2Score++;
            lblP2Score.setText("Score: " + p2Score);
        } else if (p2Lives == 0) {
            p1Score++;
            lblP1Score.setText("Score:  " + p1Score);
            JOptionPane.showMessageDialog(rootPane, "PLAYER-1 WINS ON THIS ROUND", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        
        lblLivesP1.setText("Lives: " + p1Lives);
        lblLivesP2.setText("Lives: " + p2Lives);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblP1Score = new javax.swing.JLabel();
        lblP2Score = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLivesP1 = new javax.swing.JLabel();
        lblLivesP2 = new javax.swing.JLabel();
        btnRockP1 = new javax.swing.JButton();
        btnPaperP1 = new javax.swing.JButton();
        btnScissorP1 = new javax.swing.JButton();
        btnRockP2 = new javax.swing.JButton();
        btnPaperP2 = new javax.swing.JButton();
        btnScissorP2 = new javax.swing.JButton();
        btnShowRes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ROCK PAPER SCISSOR");

        lblP1Score.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblP1Score.setText("SCORE:");

        lblP2Score.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblP2Score.setText("SCORE:");
        lblP2Score.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("PLAYER1");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PLAYER2:");

        lblLivesP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLivesP1.setText("-----");

        lblLivesP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLivesP2.setText("-----");

        btnRockP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRockP1.setText("ROCK");
        btnRockP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockP1ActionPerformed(evt);
            }
        });

        btnPaperP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPaperP1.setText("PAPER");
        btnPaperP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperP1ActionPerformed(evt);
            }
        });

        btnScissorP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnScissorP1.setText("SCISSOR");
        btnScissorP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorP1ActionPerformed(evt);
            }
        });

        btnRockP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRockP2.setText("ROCK");
        btnRockP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockP2ActionPerformed(evt);
            }
        });

        btnPaperP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPaperP2.setText("PAPER");
        btnPaperP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperP2ActionPerformed(evt);
            }
        });

        btnScissorP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnScissorP2.setText("SCISSOR");
        btnScissorP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorP2ActionPerformed(evt);
            }
        });

        btnShowRes.setText("SHOW RESULT");
        btnShowRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addComponent(lblP1Score)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblLivesP1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblP2Score)
                    .addComponent(lblLivesP2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRockP1)
                        .addGap(18, 18, 18)
                        .addComponent(btnPaperP1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnScissorP1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRockP2)
                        .addGap(18, 18, 18)
                        .addComponent(btnPaperP2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnScissorP2)
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnShowRes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP1Score)
                    .addComponent(lblP2Score))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblLivesP1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLivesP2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPaperP1)
                    .addComponent(btnRockP1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnScissorP1)
                .addGap(32, 32, 32)
                .addComponent(btnShowRes)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRockP2)
                    .addComponent(btnPaperP2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnScissorP2)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRockP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockP1ActionPerformed
        // TODO add your handling code here:
        p1 = 1;
    }//GEN-LAST:event_btnRockP1ActionPerformed

    private void btnPaperP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperP1ActionPerformed
        // TODO add your handling code here:
        p1 = 2;
    }//GEN-LAST:event_btnPaperP1ActionPerformed

    private void btnScissorP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorP1ActionPerformed
        // TODO add your handling code here:
        p1 = 3;
    }//GEN-LAST:event_btnScissorP1ActionPerformed

    private void btnRockP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockP2ActionPerformed
        // TODO add your handling code here:
        p2 = 1;
    }//GEN-LAST:event_btnRockP2ActionPerformed

    private void btnPaperP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperP2ActionPerformed
        // TODO add your handling code here:
        p2 = 2;
    }//GEN-LAST:event_btnPaperP2ActionPerformed

    private void btnScissorP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorP2ActionPerformed
        // TODO add your handling code here:
        p2 = 3;
    }//GEN-LAST:event_btnScissorP2ActionPerformed

    private void btnShowResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowResActionPerformed
        // TODO add your handling code here:
        showWinner();
    }//GEN-LAST:event_btnShowResActionPerformed

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
            java.util.logging.Logger.getLogger(rps_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rps_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rps_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rps_Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rps_Exam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaperP1;
    private javax.swing.JButton btnPaperP2;
    private javax.swing.JButton btnRockP1;
    private javax.swing.JButton btnRockP2;
    private javax.swing.JButton btnScissorP1;
    private javax.swing.JButton btnScissorP2;
    private javax.swing.JButton btnShowRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblLivesP1;
    private javax.swing.JLabel lblLivesP2;
    private javax.swing.JLabel lblP1Score;
    private javax.swing.JLabel lblP2Score;
    // End of variables declaration//GEN-END:variables
}
