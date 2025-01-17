/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.cityList;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.encounters;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.patUserName;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.patientMap;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.hospitalMap;
import models.Hospital;
import models.Patient;

/**
 *
 * @author shreyasisodiya
 */
public class ViewPatient extends javax.swing.JFrame {

    /**
     * Creates new form ViewPatient
     */
    public ViewPatient() {
        initComponents();
    }
    public void getPatName(String patUserName){ 
        jLabel1.setText(patUserName);
        MEDICAL_RESOURCE_MANAGEMENT.patUserName = patUserName;
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
        buttonLogPatient = new javax.swing.JButton();
        buttonViewEncounter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME PATIENT");

        buttonLogPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        buttonLogPatient.setText("LOG OUT");
        buttonLogPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogPatientActionPerformed(evt);
            }
        });

        buttonViewEncounter.setText("ENCOUNTER HISTORY");
        buttonViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewEncounterActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT PROFILE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SEARCH HOSPITALS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(buttonViewEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jButton3)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonLogPatient)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonViewEncounter)
                    .addComponent(jButton3))
                .addGap(56, 56, 56)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(buttonLogPatient)
                .addGap(61, 61, 61))
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

    private void buttonLogPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogPatientActionPerformed
        // TODO add your handling code here:
        this.hide();
        LoginForm logForm = new LoginForm();
        logForm.show();
    }//GEN-LAST:event_buttonLogPatientActionPerformed

    private void buttonViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewEncounterActionPerformed
        // TODO add your handling code here:
        ViewInfoPatient vip = new ViewInfoPatient();
        int id = patientMap.get(patUserName).getPatientID();
        
        DefaultTableModel model = (DefaultTableModel) vip.tableDisplayPatient.getModel();
        
        for(int i=0;i<encounters.size();i++){
            if(encounters.get(i).getPatientID() == id) {
                Format formatter = new SimpleDateFormat("MM/dd/yyyy");
                String s = formatter.format(encounters.get(i).getDate());
                String data[] = {encounters.get(i).getDoctorName(),
                    encounters.get(i).getHospitalName(), 
                    s, 
                    Float.toString(encounters.get(i).getBloodPressure()), 
                    Float.toString(encounters.get(i).getHeartRate()),
                    Float.toString(encounters.get(i).getTemperature())};
                model.addRow(data);
            }
        }
        vip.show();
    }//GEN-LAST:event_buttonViewEncounterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CreatePatient cp = new CreatePatient();
            
            for (HashMap.Entry<String, Patient> set : patientMap.entrySet())
            {
                if(patUserName.equals(set.getValue().getPatientUserName()))
                {
                    cp.show();
                    for(int i=0;i<cityList.size();i++) 
                    {
                        cp.comboCity.addItem(cityList.get(i));
                    }              
                    cp.textPatientFirstName.setText(set.getValue().getFirstName());
                    cp.textPatientUserName.setText(set.getValue().getPatientUserName());
                    
                    cp.textPatientAge.setText(Integer.toString(set.getValue().getAge()));
                   
                    cp.textPatientLastName.setText(set.getValue().getLastName());
                    cp.textPatientHouse.setText(set.getValue().getHouseName());
                    
                    cp.textPinPatient.setText(Integer.toString(set.getValue().getPinCode()));
                }   
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        FindDoctors fd = new FindDoctors();
        fd.jLabel2.setText(patientMap.get(patUserName).getCommunityName());
        for (HashMap.Entry<Integer, Hospital> set : hospitalMap.entrySet())
        {
            if(set.getValue()
                    .getCommunityName()
                    .equals(patientMap
                            .get(patUserName)
                            .getCommunityName())) {
                fd.comboHospital.addItem(set.getValue().getHospitalName());
            }
        }
        fd.show();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogPatient;
    private javax.swing.JButton buttonViewEncounter;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
