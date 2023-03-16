/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tojustdoit;

import java.awt.Color;

/**
 *
 * @author musialantoni
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Menu() {
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

        jP_ContainerAll = new javax.swing.JPanel();
        jP_Container_MenuLeft = new javax.swing.JPanel();
        jB_Home = new javax.swing.JButton();
        jS_1 = new javax.swing.JSeparator();
        jB_TasksAndProjects = new javax.swing.JButton();
        jS_2 = new javax.swing.JSeparator();
        jB_Menu = new javax.swing.JButton();
        jP_Container_MenuTop = new javax.swing.JPanel();
        jL_Home = new javax.swing.JLabel();
        jL_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCB_ChangeTheme = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jP_ContainerAll.setBackground(java.awt.Color.gray);

        jP_Container_MenuLeft.setBackground(java.awt.Color.darkGray);
        jP_Container_MenuLeft.setPreferredSize(new java.awt.Dimension(242, 768));

        jB_Home.setBackground(java.awt.Color.darkGray);
        jB_Home.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jB_Home.setForeground(java.awt.Color.lightGray);
        jB_Home.setText("Home");
        jB_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_HomeActionPerformed(evt);
            }
        });

        jB_TasksAndProjects.setBackground(java.awt.Color.darkGray);
        jB_TasksAndProjects.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jB_TasksAndProjects.setForeground(java.awt.Color.lightGray);
        jB_TasksAndProjects.setText("Tasks&Projects");

        jB_Menu.setBackground(java.awt.Color.darkGray);
        jB_Menu.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jB_Menu.setForeground(java.awt.Color.lightGray);
        jB_Menu.setText("Menu");

        javax.swing.GroupLayout jP_Container_MenuLeftLayout = new javax.swing.GroupLayout(jP_Container_MenuLeft);
        jP_Container_MenuLeft.setLayout(jP_Container_MenuLeftLayout);
        jP_Container_MenuLeftLayout.setHorizontalGroup(
            jP_Container_MenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Container_MenuLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Container_MenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jS_2)
                    .addComponent(jS_1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_TasksAndProjects, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_Container_MenuLeftLayout.setVerticalGroup(
            jP_Container_MenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Container_MenuLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jS_1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_TasksAndProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jS_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(500, Short.MAX_VALUE))
        );

        jP_Container_MenuTop.setBackground(java.awt.Color.darkGray);

        jL_Home.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jL_Home.setForeground(java.awt.Color.lightGray);
        jL_Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Home.setText("Home");

        jL_Logo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jL_Logo.setForeground(java.awt.Color.lightGray);
        jL_Logo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_Logo.setText("To");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setForeground(java.awt.Color.orange);
        jLabel1.setText("just");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Do");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(java.awt.Color.orange);
        jLabel3.setText("it");

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP_Container_MenuTopLayout = new javax.swing.GroupLayout(jP_Container_MenuTop);
        jP_Container_MenuTop.setLayout(jP_Container_MenuTopLayout);
        jP_Container_MenuTopLayout.setHorizontalGroup(
            jP_Container_MenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Container_MenuTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 645, Short.MAX_VALUE)
                .addComponent(jL_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jP_Container_MenuTopLayout.setVerticalGroup(
            jP_Container_MenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Container_MenuTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Container_MenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP_Container_MenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jL_Home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Change theme");

        jCB_ChangeTheme.setBackground(java.awt.Color.gray);
        jCB_ChangeTheme.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jCB_ChangeTheme.setForeground(java.awt.Color.white);
        jCB_ChangeTheme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dark", "Light", " " }));
        jCB_ChangeTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ChangeThemeActionPerformed(evt);
            }
        });
        jCB_ChangeTheme.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCB_ChangeThemePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jP_ContainerAllLayout = new javax.swing.GroupLayout(jP_ContainerAll);
        jP_ContainerAll.setLayout(jP_ContainerAllLayout);
        jP_ContainerAllLayout.setHorizontalGroup(
            jP_ContainerAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_ContainerAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_ContainerAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_Container_MenuTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP_ContainerAllLayout.createSequentialGroup()
                        .addComponent(jP_Container_MenuLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jCB_ChangeTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_ContainerAllLayout.setVerticalGroup(
            jP_ContainerAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_ContainerAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Container_MenuTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_ContainerAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_Container_MenuLeft, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(jP_ContainerAllLayout.createSequentialGroup()
                        .addGroup(jP_ContainerAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jCB_ChangeTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_ContainerAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_ContainerAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jCB_ChangeThemePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCB_ChangeThemePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_ChangeThemePropertyChange

    private void jCB_ChangeThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ChangeThemeActionPerformed
        // TODO add your handling code here:
        String ct = jCB_ChangeTheme.getSelectedItem().toString();
        
        if ("Dark".equals(ct)) {
            System.out.println("Ciemny");

            jP_ContainerAll.setBackground(Color.gray);
        } else {
            System.out.println("Jasny");
        }
    }//GEN-LAST:event_jCB_ChangeThemeActionPerformed

    private void jB_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_HomeActionPerformed
        // TODO add your handling code here:
        Home Home = new Home();
        this.setVisible(false);
        Home.setVisible(true);
    }//GEN-LAST:event_jB_HomeActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Home;
    private javax.swing.JButton jB_Menu;
    private javax.swing.JButton jB_TasksAndProjects;
    private javax.swing.JComboBox<String> jCB_ChangeTheme;
    private javax.swing.JLabel jL_Home;
    private javax.swing.JLabel jL_Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jP_ContainerAll;
    private javax.swing.JPanel jP_Container_MenuLeft;
    private javax.swing.JPanel jP_Container_MenuTop;
    private javax.swing.JSeparator jS_1;
    private javax.swing.JSeparator jS_2;
    // End of variables declaration//GEN-END:variables
}