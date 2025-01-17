/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.docName;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.docUserName;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.doctorMap;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.encounters;

/**
 *
 * @author shreyasisodiya
 */
public class ViewDoctor extends javax.swing.JFrame {

    /**
     * Creates new form ViewDoctor
     */
    public ViewDoctor() {
        initComponents();
    }
     public void getDocName(String DocUserName, String DocName)
     { 
        labelDocWelcome.setText(docName);
        MEDICAL_RESOURCE_MANAGEMENT.docUserName = DocUserName;
        MEDICAL_RESOURCE_MANAGEMENT.docName = DocName;
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
        labelDocWelcome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buttonLog = new javax.swing.JButton();
        jld = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDocWelcome.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        labelDocWelcome.setText("WELCOME DOCTOR");

        jButton1.setText("ENCOUNTERS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonLog.setText("LOG OUT");
        buttonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogActionPerformed(evt);
            }
        });

        jld.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jld.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelDocWelcome)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonLog)
                        .addGap(89, 89, 89))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jld)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelDocWelcome)
                .addGap(31, 31, 31)
                .addComponent(jld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(169, 169, 169)
                .addComponent(buttonLog)
                .addGap(53, 53, 53))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewInfoDoctor vid = new ViewInfoDoctor();
        vid.jLabel1.setText("ENCOUNTERS");

        int id = doctorMap.get(docUserName).getDoctorID();
        
        DefaultTableModel dtm = (DefaultTableModel) vid.tableDoctor.getModel();
            for(int i=0;i<encounters.size();i++){
               
            if(encounters.get(i).getDoctorID() == id) {
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                String s = formatter.format(encounters.get(i).getDate());
                String data[] = {Integer.toString(encounters.get(i).getPatientID()), 
                    encounters.get(i).getPatientName(), 
                    
                    s, 
                    Float.toString(encounters.get(i).getBloodPressure()), 
                    
                    Float.toString(encounters.get(i).getHeartRate()), 
                    Float.toString(encounters.get(i).getTemperature())};
                dtm.addRow(data);
            }
        }
        vid.show();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogActionPerformed
        // TODO add your handling code here:
        this.hide();
        LoginForm logform = new LoginForm();
        logform.show();
    }//GEN-LAST:event_buttonLogActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLog;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel jld;
    private javax.swing.JLabel labelDocWelcome;
    // End of variables declaration//GEN-END:variables
}
