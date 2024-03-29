/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.chej_antivirus;

/**
 *
 * @author monst
 */
public class Chej_AntiVirus_2 extends javax.swing.JFrame {

    /**
     * Creates new form Chej_AntiVirus_2
     */
    public Chej_AntiVirus_2() {
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

        jPAll = new javax.swing.JPanel();
        jPMenu_top = new javax.swing.JPanel();
        jLLogo = new javax.swing.JLabel();
        jLExit = new javax.swing.JLabel();
        jLMinimize = new javax.swing.JLabel();
        jLInfo = new javax.swing.JLabel();
        jLEdit = new javax.swing.JLabel();
        jLFile = new javax.swing.JLabel();
        jLPremium = new javax.swing.JLabel();
        jLAll_bottom = new javax.swing.JPanel();
        jLMenu = new javax.swing.JPanel();
        jBWkrotce1 = new javax.swing.JButton();
        jBScan = new javax.swing.JButton();
        jBWkrotce2 = new javax.swing.JButton();
        jBRegistration = new javax.swing.JButton();
        jBLogin = new javax.swing.JButton();
        jLSeparator = new javax.swing.JLabel();
        jPPanel = new javax.swing.JPanel();
        jPBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chej - AntiVirus");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPAll.setBackground(java.awt.Color.black);
        jPAll.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPAll.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPMenu_top.setBackground(java.awt.Color.black);
        jPMenu_top.setAlignmentX(0.0F);
        jPMenu_top.setAlignmentY(0.0F);
        jPMenu_top.setMaximumSize(new java.awt.Dimension(1280, 28));
        jPMenu_top.setPreferredSize(new java.awt.Dimension(1280, 28));

        jLExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLExitMouseClicked(evt);
            }
        });

        jLMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPMenu_topLayout = new javax.swing.GroupLayout(jPMenu_top);
        jPMenu_top.setLayout(jPMenu_topLayout);
        jPMenu_topLayout.setHorizontalGroup(
            jPMenu_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenu_topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLPremium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLInfo)
                .addGap(18, 18, 18)
                .addComponent(jLMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenu_topLayout.setVerticalGroup(
            jPMenu_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenu_topLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMenu_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenu_topLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLPremium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLAll_bottom.setBackground(new java.awt.Color(45, 49, 148));

        jLMenu.setBackground(new java.awt.Color(249, 176, 65));
        jLMenu.setMaximumSize(new java.awt.Dimension(220, 692));
        jLMenu.setPreferredSize(new java.awt.Dimension(220, 692));

        jBWkrotce1.setBackground(new java.awt.Color(249, 176, 65));
        jBWkrotce1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jBWkrotce1.setText("Wkrótce...");
        jBWkrotce1.setBorder(null);
        jBWkrotce1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWkrotce1ActionPerformed(evt);
            }
        });

        jBScan.setBackground(new java.awt.Color(249, 176, 65));
        jBScan.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jBScan.setText("Skanuj");
        jBScan.setBorder(null);
        jBScan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBScanMouseEntered(evt);
            }
        });
        jBScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBScanActionPerformed(evt);
            }
        });

        jBWkrotce2.setBackground(new java.awt.Color(249, 176, 65));
        jBWkrotce2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jBWkrotce2.setText("Wkrótce...");
        jBWkrotce2.setBorder(null);
        jBWkrotce2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWkrotce2ActionPerformed(evt);
            }
        });

        jBRegistration.setBackground(new java.awt.Color(249, 176, 65));
        jBRegistration.setText("Rejestracja");
        jBRegistration.setBorder(null);

        jBLogin.setBackground(new java.awt.Color(249, 176, 65));
        jBLogin.setBorder(null);
        jBLogin.setLabel("Logowanie");

        jLSeparator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSeparator.setText("|");

        javax.swing.GroupLayout jLMenuLayout = new javax.swing.GroupLayout(jLMenu);
        jLMenu.setLayout(jLMenuLayout);
        jLMenuLayout.setHorizontalGroup(
            jLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBWkrotce1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLMenuLayout.createSequentialGroup()
                        .addComponent(jBRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLSeparator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLMenuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jBScan, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLMenuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jBWkrotce2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLMenuLayout.setVerticalGroup(
            jLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLMenuLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jBWkrotce1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addGroup(jLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegistration)
                    .addComponent(jBLogin)
                    .addComponent(jLSeparator))
                .addContainerGap())
            .addGroup(jLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLMenuLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jBScan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(570, Short.MAX_VALUE)))
            .addGroup(jLMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLMenuLayout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(jBWkrotce2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );

        jPPanel.setBackground(java.awt.Color.blue);
        jPPanel.setMaximumSize(new java.awt.Dimension(1060, 692));
        jPPanel.setPreferredSize(new java.awt.Dimension(1060, 692));

        javax.swing.GroupLayout jPPanelLayout = new javax.swing.GroupLayout(jPPanel);
        jPPanel.setLayout(jPPanelLayout);
        jPPanelLayout.setHorizontalGroup(
            jPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        jPPanelLayout.setVerticalGroup(
            jPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLAll_bottomLayout = new javax.swing.GroupLayout(jLAll_bottom);
        jLAll_bottom.setLayout(jLAll_bottomLayout);
        jLAll_bottomLayout.setHorizontalGroup(
            jLAll_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLAll_bottomLayout.createSequentialGroup()
                .addComponent(jLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
        );
        jLAll_bottomLayout.setVerticalGroup(
            jLAll_bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
            .addComponent(jPPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPAllLayout = new javax.swing.GroupLayout(jPAll);
        jPAll.setLayout(jPAllLayout);
        jPAllLayout.setHorizontalGroup(
            jPAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenu_top, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jLAll_bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPAllLayout.setVerticalGroup(
            jPAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAllLayout.createSequentialGroup()
                .addComponent(jPMenu_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLAll_bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAll, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAll, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBWkrotce1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBWkrotce1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBWkrotce1ActionPerformed

    private void jBWkrotce2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBWkrotce2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBWkrotce2ActionPerformed

    private void jBScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBScanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBScanActionPerformed

    private void jBScanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBScanMouseEntered
        
    }//GEN-LAST:event_jBScanMouseEntered

    private void jLExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLExitMouseClicked

    private void jLMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizeMouseClicked
        this.setExtendedState(Chej_AntiVirus_2.ICONIFIED);
    }//GEN-LAST:event_jLMinimizeMouseClicked

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
            java.util.logging.Logger.getLogger(Chej_AntiVirus_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chej_AntiVirus_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chej_AntiVirus_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chej_AntiVirus_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chej_AntiVirus_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jBRegistration;
    private javax.swing.JButton jBScan;
    private javax.swing.JButton jBWkrotce1;
    private javax.swing.JButton jBWkrotce2;
    private javax.swing.JPanel jLAll_bottom;
    private javax.swing.JLabel jLEdit;
    private javax.swing.JLabel jLExit;
    private javax.swing.JLabel jLFile;
    private javax.swing.JLabel jLInfo;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JPanel jLMenu;
    private javax.swing.JLabel jLMinimize;
    private javax.swing.JLabel jLPremium;
    private javax.swing.JLabel jLSeparator;
    private javax.swing.JPanel jPAll;
    private javax.swing.JLabel jPBackground;
    private javax.swing.JPanel jPMenu_top;
    private javax.swing.JPanel jPPanel;
    // End of variables declaration//GEN-END:variables

    private void setBackground(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
