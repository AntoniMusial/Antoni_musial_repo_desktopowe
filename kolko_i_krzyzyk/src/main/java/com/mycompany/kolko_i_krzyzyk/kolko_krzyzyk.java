/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kolko_i_krzyzyk;

/**
 *
 * @author musialantoni
 */
public class kolko_krzyzyk extends javax.swing.JFrame {

    /**
     * Creates new form kolko_krzyzyk
     */
    public kolko_krzyzyk() {
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

        jPContainerAll = new javax.swing.JPanel();
        jPContainerRight = new javax.swing.JPanel();
        jLKolkoikrzyzyk = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLKolko1 = new javax.swing.JLabel();
        jLKrzyzyk1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jBRozpocznij = new javax.swing.JButton();
        jBZakoncz = new javax.swing.JButton();
        jLTwojruch1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLKolko2 = new javax.swing.JLabel();
        jLKrzyzyk2 = new javax.swing.JLabel();
        jLTwojruch2 = new javax.swing.JLabel();
        jPContainerLeft = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 400));

        jPContainerAll.setBackground(java.awt.Color.gray);
        jPContainerAll.setMaximumSize(new java.awt.Dimension(600, 400));

        jPContainerRight.setBackground(java.awt.Color.darkGray);
        jPContainerRight.setMaximumSize(new java.awt.Dimension(200, 400));
        jPContainerRight.setPreferredSize(new java.awt.Dimension(200, 400));

        jLKolkoikrzyzyk.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLKolkoikrzyzyk.setForeground(java.awt.Color.white);
        jLKolkoikrzyzyk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLKolkoikrzyzyk.setText("Kółko i krzyżyk");

        jLKolko1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLKolko1.setForeground(java.awt.Color.white);
        jLKolko1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLKolko1.setText("Kółko:");

        jLKrzyzyk1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLKrzyzyk1.setForeground(java.awt.Color.white);
        jLKrzyzyk1.setText("Krzyżyk:");

        jBRozpocznij.setBackground(java.awt.Color.darkGray);
        jBRozpocznij.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jBRozpocznij.setForeground(java.awt.Color.white);
        jBRozpocznij.setText("Rozpocznij");
        jBRozpocznij.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jBZakoncz.setBackground(java.awt.Color.darkGray);
        jBZakoncz.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jBZakoncz.setForeground(java.awt.Color.white);
        jBZakoncz.setText("Zakończ");
        jBZakoncz.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        jBZakoncz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZakonczActionPerformed(evt);
            }
        });

        jLTwojruch1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLTwojruch1.setForeground(java.awt.Color.white);
        jLTwojruch1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTwojruch1.setText("Twój ruch:");

        jLKolko2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLKolko2.setForeground(java.awt.Color.white);

        jLKrzyzyk2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLKrzyzyk2.setForeground(java.awt.Color.white);

        jLTwojruch2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLTwojruch2.setForeground(java.awt.Color.green);

        javax.swing.GroupLayout jPContainerRightLayout = new javax.swing.GroupLayout(jPContainerRight);
        jPContainerRight.setLayout(jPContainerRightLayout);
        jPContainerRightLayout.setHorizontalGroup(
            jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContainerRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPContainerRightLayout.createSequentialGroup()
                        .addGroup(jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBRozpocznij, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBZakoncz, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPContainerRightLayout.createSequentialGroup()
                        .addGroup(jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLKolkoikrzyzyk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(jPContainerRightLayout.createSequentialGroup()
                                .addComponent(jLKolko1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLKolko2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPContainerRightLayout.createSequentialGroup()
                                .addComponent(jLKrzyzyk1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLKrzyzyk2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPContainerRightLayout.createSequentialGroup()
                                .addComponent(jLTwojruch1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLTwojruch2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPContainerRightLayout.setVerticalGroup(
            jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContainerRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLKolkoikrzyzyk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLKolko1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLKolko2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLKrzyzyk1)
                    .addComponent(jLKrzyzyk2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTwojruch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLTwojruch2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222)
                .addGroup(jPContainerRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBRozpocznij, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBZakoncz, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
        );

        jPContainerLeft.setBackground(java.awt.Color.gray);
        jPContainerLeft.setMaximumSize(new java.awt.Dimension(394, 400));
        jPContainerLeft.setPreferredSize(new java.awt.Dimension(394, 400));

        javax.swing.GroupLayout jPContainerLeftLayout = new javax.swing.GroupLayout(jPContainerLeft);
        jPContainerLeft.setLayout(jPContainerLeftLayout);
        jPContainerLeftLayout.setHorizontalGroup(
            jPContainerLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPContainerLeftLayout.setVerticalGroup(
            jPContainerLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPContainerAllLayout = new javax.swing.GroupLayout(jPContainerAll);
        jPContainerAll.setLayout(jPContainerAllLayout);
        jPContainerAllLayout.setHorizontalGroup(
            jPContainerAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContainerAllLayout.createSequentialGroup()
                .addComponent(jPContainerLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContainerRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPContainerAllLayout.setVerticalGroup(
            jPContainerAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContainerRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPContainerLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContainerAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPContainerAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBZakonczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZakonczActionPerformed
        
    }//GEN-LAST:event_jBZakonczActionPerformed

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
            java.util.logging.Logger.getLogger(kolko_krzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kolko_krzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kolko_krzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kolko_krzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kolko_krzyzyk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRozpocznij;
    private javax.swing.JButton jBZakoncz;
    private javax.swing.JLabel jLKolko1;
    private javax.swing.JLabel jLKolko2;
    private javax.swing.JLabel jLKolkoikrzyzyk;
    private javax.swing.JLabel jLKrzyzyk1;
    private javax.swing.JLabel jLKrzyzyk2;
    private javax.swing.JLabel jLTwojruch1;
    private javax.swing.JLabel jLTwojruch2;
    private javax.swing.JPanel jPContainerAll;
    private javax.swing.JPanel jPContainerLeft;
    private javax.swing.JPanel jPContainerRight;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
