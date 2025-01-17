/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JOptionPane;
import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.cityList;
import models.City;

/**
 *
 * @author shreyasisodiya
 */
public class CreateCity extends javax.swing.JFrame {

    /**
     * Creates new form CreateCity
     */
    public CreateCity() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCreateCityName = new javax.swing.JTextField();
        buttonSaveCity = new javax.swing.JButton();
        buttonBackCity = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("CITY");

        jLabel2.setText("NAME");

        textCreateCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCreateCityNameActionPerformed(evt);
            }
        });

        buttonSaveCity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        buttonSaveCity.setText("SAVE");
        buttonSaveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveCityActionPerformed(evt);
            }
        });

        buttonBackCity.setText("BACK");
        buttonBackCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
                        .addComponent(textCreateCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(buttonSaveCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonBackCity)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCreateCityName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBackCity)
                    .addComponent(buttonSaveCity))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCreateCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCreateCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCreateCityNameActionPerformed

    private void buttonSaveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveCityActionPerformed
        // TODO add your handling code here:
//        City city = new City(textCreateCityName.getText());
//        cityList.add(city.getCityName());
//        this.hide();
//        ViewSystemAdmin vsa = new ViewSystemAdmin();
//        vsa.show();

try{
        City city = new City(textCreateCityName.getText());
        cityList.add(city.getCityName());
        this.hide();
        ViewSystemAdmin vsa = new ViewSystemAdmin();
        vsa.show();
        }
        catch(Exception e){
            this.show();
            JOptionPane.showMessageDialog(this, "Please Fill out all the fields with appropriate details.");
        }

    }//GEN-LAST:event_buttonSaveCityActionPerformed

    private void buttonBackCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackCityActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewSystemAdmin vsa = new ViewSystemAdmin();
        vsa.show();
    }//GEN-LAST:event_buttonBackCityActionPerformed

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
            java.util.logging.Logger.getLogger(CreateCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateCity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBackCity;
    private javax.swing.JButton buttonSaveCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textCreateCityName;
    // End of variables declaration//GEN-END:variables
}
