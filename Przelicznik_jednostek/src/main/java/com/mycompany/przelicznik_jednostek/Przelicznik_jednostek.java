/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.przelicznik_jednostek;

import java.lang.reflect.Array;
import javax.lang.model.util.Elements;

/**
 *
 * @author musialantoni
 */
public class Przelicznik_jednostek extends javax.swing.JFrame {

    /**
     * Creates new form Przelicznik_jednostek
     */
    public Przelicznik_jednostek() {
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

        jDHistoria = new javax.swing.JDialog();
        jOPHistoria = new javax.swing.JOptionPane();
        jPTresc = new javax.swing.JPanel();
        jTBTresc = new javax.swing.JTabbedPane();
        jPStrona1 = new javax.swing.JPanel();
        jLTytulTemperatura = new javax.swing.JLabel();
        jTFKelwiny = new javax.swing.JTextField();
        jTFCelcjusze = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPStrona2 = new javax.swing.JPanel();
        jMBMenu = new javax.swing.JMenuBar();
        jMPlik = new javax.swing.JMenu();
        jMIPokazHistorie = new javax.swing.JMenuItem();
        jMIZamknij = new javax.swing.JMenuItem();
        jMOProgramie = new javax.swing.JMenu();

        jDHistoria.setBackground(java.awt.Color.darkGray);
        jDHistoria.setIconImages(null);
        jDHistoria.setUndecorated(true);

        jOPHistoria.setBackground(java.awt.Color.darkGray);
        jOPHistoria.setForeground(java.awt.Color.white);
        jOPHistoria.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jDHistoriaLayout = new javax.swing.GroupLayout(jDHistoria.getContentPane());
        jDHistoria.getContentPane().setLayout(jDHistoriaLayout);
        jDHistoriaLayout.setHorizontalGroup(
            jDHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jOPHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDHistoriaLayout.setVerticalGroup(
            jDHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jOPHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Przelicznik jednostek");
        setBackground(java.awt.Color.darkGray);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 400));

        jPTresc.setBackground(java.awt.Color.pink);
        jPTresc.setForeground(java.awt.Color.white);

        jTBTresc.setBackground(java.awt.Color.yellow);
        jTBTresc.setForeground(java.awt.Color.black);
        jTBTresc.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jPStrona1.setBackground(java.awt.Color.pink);
        jPStrona1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLTytulTemperatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTytulTemperatura.setForeground(java.awt.Color.white);
        jLTytulTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTytulTemperatura.setText("Przelicznik Kelwinów na Celcjusze");
        jLTytulTemperatura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTFKelwiny.setBackground(java.awt.Color.pink);
        jTFKelwiny.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTFKelwiny.setForeground(java.awt.Color.white);
        jTFKelwiny.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFKelwiny.setText("Kelwiny");

        jTFCelcjusze.setBackground(java.awt.Color.pink);
        jTFCelcjusze.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTFCelcjusze.setForeground(java.awt.Color.white);
        jTFCelcjusze.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCelcjusze.setText("Celcjusze");

        jButton1.setBackground(java.awt.Color.pink);
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Przelicz");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPStrona1Layout = new javax.swing.GroupLayout(jPStrona1);
        jPStrona1.setLayout(jPStrona1Layout);
        jPStrona1Layout.setHorizontalGroup(
            jPStrona1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPStrona1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTytulTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPStrona1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPStrona1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCelcjusze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
            .addGroup(jPStrona1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPStrona1Layout.createSequentialGroup()
                    .addContainerGap(158, Short.MAX_VALUE)
                    .addComponent(jTFKelwiny, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(139, 139, 139)))
        );
        jPStrona1Layout.setVerticalGroup(
            jPStrona1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPStrona1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTytulTemperatura)
                .addGap(110, 110, 110)
                .addComponent(jTFCelcjusze, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(jPStrona1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPStrona1Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jTFKelwiny, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
        );

        jTBTresc.addTab("Temperatura", jPStrona1);

        jPStrona2.setBackground(java.awt.Color.pink);
        jPStrona2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPStrona2Layout = new javax.swing.GroupLayout(jPStrona2);
        jPStrona2.setLayout(jPStrona2Layout);
        jPStrona2Layout.setHorizontalGroup(
            jPStrona2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );
        jPStrona2Layout.setVerticalGroup(
            jPStrona2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        jTBTresc.addTab("Odległość", jPStrona2);

        javax.swing.GroupLayout jPTrescLayout = new javax.swing.GroupLayout(jPTresc);
        jPTresc.setLayout(jPTrescLayout);
        jPTrescLayout.setHorizontalGroup(
            jPTrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTrescLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTBTresc)
                .addContainerGap())
        );
        jPTrescLayout.setVerticalGroup(
            jPTrescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTrescLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTBTresc)
                .addContainerGap())
        );

        jMBMenu.setBackground(java.awt.Color.darkGray);
        jMBMenu.setBorder(null);
        jMBMenu.setForeground(java.awt.Color.white);

        jMPlik.setBackground(java.awt.Color.darkGray);
        jMPlik.setForeground(java.awt.Color.pink);
        jMPlik.setText("Plik");
        jMPlik.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jMIPokazHistorie.setBackground(java.awt.Color.darkGray);
        jMIPokazHistorie.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMIPokazHistorie.setForeground(java.awt.Color.pink);
        jMIPokazHistorie.setText("Pokaż historię");
        jMIPokazHistorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPokazHistorieActionPerformed(evt);
            }
        });
        jMPlik.add(jMIPokazHistorie);

        jMIZamknij.setBackground(java.awt.Color.darkGray);
        jMIZamknij.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMIZamknij.setForeground(java.awt.Color.red);
        jMIZamknij.setText("Zamknij");
        jMIZamknij.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMIZamknijMouseClicked(evt);
            }
        });
        jMIZamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIZamknijActionPerformed(evt);
            }
        });
        jMPlik.add(jMIZamknij);

        jMBMenu.add(jMPlik);

        jMOProgramie.setBackground(java.awt.Color.darkGray);
        jMOProgramie.setForeground(java.awt.Color.pink);
        jMOProgramie.setText("O programie");
        jMOProgramie.setFocusable(false);
        jMOProgramie.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jMBMenu.add(jMOProgramie);

        setJMenuBar(jMBMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTresc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTresc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIZamknijMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMIZamknijMouseClicked
        
    }//GEN-LAST:event_jMIZamknijMouseClicked

    private void jMIZamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIZamknijActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMIZamknijActionPerformed

    private void jMIPokazHistorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPokazHistorieActionPerformed
       jOPHistoria.showMessageDialog(null, "Odleglosci: ");
    }//GEN-LAST:event_jMIPokazHistorieActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String kelwiny = jTFKelwiny.getText();
        int kelwiny_value = Integer.parseInt(kelwiny);
        
        int celcjusze_value = Math.abs(celcjusze_value) + 273;
        jTFCelcjusze.setText(""+celcjusze_value);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Przelicznik_jednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Przelicznik_jednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Przelicznik_jednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Przelicznik_jednostek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Przelicznik_jednostek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDHistoria;
    private javax.swing.JLabel jLTytulTemperatura;
    private javax.swing.JMenuBar jMBMenu;
    private javax.swing.JMenuItem jMIPokazHistorie;
    private javax.swing.JMenuItem jMIZamknij;
    private javax.swing.JMenu jMOProgramie;
    private javax.swing.JMenu jMPlik;
    private javax.swing.JOptionPane jOPHistoria;
    private javax.swing.JPanel jPStrona1;
    private javax.swing.JPanel jPStrona2;
    private javax.swing.JPanel jPTresc;
    private javax.swing.JTabbedPane jTBTresc;
    private javax.swing.JTextField jTFCelcjusze;
    private javax.swing.JTextField jTFKelwiny;
    // End of variables declaration//GEN-END:variables
}
