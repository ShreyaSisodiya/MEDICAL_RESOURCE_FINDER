/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.cityList;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.communityMap;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.hospitalMap;
import models.Community;
import models.Hospital;

/**
 *
 * @author shreyasisodiya
 */
public class ViewSystemAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ViewSystemAdmin
     */
    public ViewSystemAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonManageCommunities = new javax.swing.JButton();
        buttonManageUsers = new javax.swing.JButton();
        buttonManageHospitals = new javax.swing.JButton();
        buttonManageCities = new javax.swing.JButton();
        buttonSystemLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME SYSTEM ADMIN");

        buttonManageCommunities.setText("MANAGE COMMUNITIES");
        buttonManageCommunities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageCommunitiesActionPerformed(evt);
            }
        });

        buttonManageUsers.setText("MANAGE USERS");
        buttonManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageUsersActionPerformed(evt);
            }
        });

        buttonManageHospitals.setText("MANAGE HOSPITALS");
        buttonManageHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageHospitalsActionPerformed(evt);
            }
        });

        buttonManageCities.setText("MANAGE CITIES");
        buttonManageCities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageCitiesActionPerformed(evt);
            }
        });

        buttonSystemLogOut.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        buttonSystemLogOut.setText("LOG OUT");
        buttonSystemLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSystemLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(551, Short.MAX_VALUE)
                .addComponent(buttonSystemLogOut)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonManageCommunities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonManageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonManageHospitals, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(buttonManageCities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonManageCommunities)
                    .addComponent(buttonManageHospitals))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonManageCities)
                    .addComponent(buttonManageUsers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(buttonSystemLogOut)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonManageCommunitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageCommunitiesActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewInfo view = new ViewInfo();
        view.labelTableDisplay.setText(buttonManageCommunities.getText());
        String[] columnNames = {"City", "Community name"};
        String[][] rows = new String[communityMap.size()][2];
        int i = 0;
        for(HashMap.Entry<String, Community>set:communityMap.entrySet()){
            rows[i][0] = set.getValue().getCityName();
            rows[i][1] = set.getValue().getCommunityName();
            i++;
        }
         DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        view.tableDisplay.setModel(dtm);
        view.show();
    }//GEN-LAST:event_buttonManageCommunitiesActionPerformed

    private void buttonSystemLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSystemLogOutActionPerformed
        // TODO add your handling code here:
        this.hide();
        LoginForm logForm = new LoginForm();
        logForm.show();
    }//GEN-LAST:event_buttonSystemLogOutActionPerformed

    private void buttonManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageUsersActionPerformed
        // TODO add your handling code here:
        this.hide();
        ManageUsers mu = new ManageUsers();
        mu.show();
    }//GEN-LAST:event_buttonManageUsersActionPerformed

    private void buttonManageCitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageCitiesActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewInfo view = new ViewInfo();
        view.labelTableDisplay.setText(buttonManageCities.getText());
        String[] columnNames = {"Cities"};
        String[][] rows = new String[cityList.size()][1];
        for(int i=0;i<cityList.size();i++) {
            rows[i][0] = cityList.get(i);
        }
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        view.tableDisplay.setModel(dtm);
        view.show();
    }//GEN-LAST:event_buttonManageCitiesActionPerformed

    private void buttonManageHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageHospitalsActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewInfo view = new ViewInfo();
        view.labelTableDisplay.setText(buttonManageHospitals.getText());
        String[] columnNames = {"HospitalName", "City", "Community Name"};
        String[][] rows = new String[hospitalMap.size()][3];
        int i = 0;
        for(HashMap.Entry<String, Hospital>set:hospitalMap.entrySet()){
            rows[i][0] = set.getValue().getHospitalName();
            rows[i][1] = set.getValue().getCityName();
            rows[i][2] = set.getValue().getCommunityName();
            
            i++;
        }
        
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        view.tableDisplay.setModel(dtm);
        view.show();
    }//GEN-LAST:event_buttonManageHospitalsActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSystemAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonManageCities;
    private javax.swing.JButton buttonManageCommunities;
    private javax.swing.JButton buttonManageHospitals;
    private javax.swing.JButton buttonManageUsers;
    private javax.swing.JButton buttonSystemLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
