/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.commName;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.doctorMap;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.hospitalMap;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.houseMap;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.patientMap;
import models.Doctor;
import models.Hospital;
import models.House;
import models.Patient;

/**
 *
 * @author shreyasisodiya
 */
public class ViewCommunityAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ViewCommunityAdmin
     */
    public ViewCommunityAdmin() {
        initComponents();
        if(MEDICAL_RESOURCE_MANAGEMENT.commName.length() > 0) {
            jLabel1.setText(MEDICAL_RESOURCE_MANAGEMENT.commName);
    }
    }
    public void getComm(String communityName, String cityName)
    { 
        jLabel1.setText("Welcome " + communityName);
        MEDICAL_RESOURCE_MANAGEMENT.commName = communityName;
        MEDICAL_RESOURCE_MANAGEMENT.citiesName = cityName;
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
        buttonMH = new javax.swing.JButton();
        buttonViewPatients = new javax.swing.JButton();
        buttonLogOutComm = new javax.swing.JButton();
        buttonManageHouses = new javax.swing.JButton();
        buttonViewDoctors = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME COMMUNITY ADMIN");

        buttonMH.setText("MANAGE HOSPITALS");
        buttonMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMHActionPerformed(evt);
            }
        });

        buttonViewPatients.setText("VIEW PATIENTS");
        buttonViewPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewPatientsActionPerformed(evt);
            }
        });

        buttonLogOutComm.setText("LOG OUT");
        buttonLogOutComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogOutCommActionPerformed(evt);
            }
        });

        buttonManageHouses.setText("MANAGE HOUSES");
        buttonManageHouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageHousesActionPerformed(evt);
            }
        });

        buttonViewDoctors.setText("VIEW DOCTORS");
        buttonViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewDoctorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonLogOutComm)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonViewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(buttonViewDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonMH, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(buttonManageHouses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMH)
                    .addComponent(buttonViewPatients))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonManageHouses)
                    .addComponent(buttonViewDoctors))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(buttonLogOutComm)
                .addGap(59, 59, 59))
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

    private void buttonMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMHActionPerformed
        // TODO add your handling code here:
        ViewInfoCommunity view = new ViewInfoCommunity();
        view.labelTableDisplay.setText(buttonMH.getText());
        String[] columnNames = {"Hospital ID", "HospitalName", "City", "Community Name"};
        String[][] rows = new String[hospitalMap.size()][4];
        int i = 0;
        for(HashMap.Entry<Integer, Hospital>set:hospitalMap.entrySet())
        {
            if(set.getValue().getCommunityName().equals(commName))
            {   
                
                rows[i][0] = Integer.toString(set.getValue().getHospitalID());
                rows[i][1] = set.getValue().getHospitalName();
                rows[i][2] = set.getValue().getCityName();
                rows[i][3] = set.getValue().getCommunityName();
                i++;        
            }        
        }
        
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        view.tableDisplayCommunity.setModel(dtm);
        view.buttonDeleteComm.setVisible(false);
        view.show();
    }//GEN-LAST:event_buttonMHActionPerformed

    private void buttonViewPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewPatientsActionPerformed
        // TODO add your handling code here:
        ViewInfoCommunity view = new ViewInfoCommunity();
        view.labelTableDisplay.setText(buttonViewPatients.getText());
        String[] columnNames = {"Patient Name", "Community", "City"};
        String[][] rows = new String[patientMap.size()][3];
        int i = 0;
        for (HashMap.Entry<String, Patient> set : patientMap.entrySet())
        {
            //rows[i][0] = set.getValue().getPatientID();
            rows[i][0] = set.getValue().getFirstName();
            rows[i][1] = set.getValue().getCommunityName();
            rows[i][2] = set.getValue().getCityName();
            i++;
        }
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        view.tableDisplayCommunity.setModel(dtm);
        view.buttonCreateTable.setVisible(false);
        //view.buttonEditComm.setVisible(false);
        view.buttonDeleteComm.setVisible(false);
        view.show();  
    }//GEN-LAST:event_buttonViewPatientsActionPerformed

    private void buttonManageHousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageHousesActionPerformed
        // TODO add your handling code here:
        ViewInfoCommunity view = new ViewInfoCommunity();
        
        view.labelTableDisplay.setText(buttonManageHouses.getText());
        
        String[] columnNames = {"Houses", "Pin Code"};
        
        String[][] rows = new String[houseMap.size()][2];
        int i = 0;
        for(HashMap.Entry<String, House> set : houseMap.entrySet())
        {
            if(set.getValue().getCommunityName().equals(commName))
            {
                rows[i][0] = set.getValue().getHouseName();
                int x = set.getValue().getPinCode();
                rows[i][1] = Integer.toString(x);           
                i++;
            }
        }
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        view.tableDisplayCommunity.setModel(dtm);
        view.buttonDeleteComm.setVisible(false);
        view.show();         
    }//GEN-LAST:event_buttonManageHousesActionPerformed

    private void buttonLogOutCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogOutCommActionPerformed
        // TODO add your handling code here:
        this.hide();
        LoginForm logform = new LoginForm();
        logform.show();
    }//GEN-LAST:event_buttonLogOutCommActionPerformed

    private void buttonViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewDoctorsActionPerformed
        // TODO add your handling code here:
        ViewInfoCommunity view = new ViewInfoCommunity();
        view.labelTableDisplay.setText(buttonViewDoctors.getText());
        String[] columnNames = {"Doctor Name", "Hospital Name", "Community Name", "City"};
        String[][] rows = new String[doctorMap.size()][4];
        int i = 0;
        for (HashMap.Entry<String, Doctor> set : doctorMap.entrySet()) {
            if(set.getValue().getCommunityName().equals(commName))
            {
            //rows[i][0] = set.getValue().getPatientID();
            rows[i][0] = set.getValue().getFirstName();
            rows[i][1] = set.getValue().getHospitalName();
            rows[i][2] = set.getValue().getCommunityName();
            rows[i][3] = set.getValue().getCityName();
            i++;
            }
        }
        DefaultTableModel dtm = new DefaultTableModel (rows, columnNames);
        view.tableDisplayCommunity.setModel(dtm);
        view.buttonCreateTable.setVisible(false);
        //view.buttonEditComm.setVisible(false);
        view.buttonDeleteComm.setVisible(false);
        view.show(); 
    }//GEN-LAST:event_buttonViewDoctorsActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCommunityAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogOutComm;
    private javax.swing.JButton buttonMH;
    private javax.swing.JButton buttonManageHouses;
    private javax.swing.JButton buttonViewDoctors;
    private javax.swing.JButton buttonViewPatients;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
