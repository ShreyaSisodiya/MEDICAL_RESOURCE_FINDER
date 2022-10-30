/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import static medical_resource_management.MEDICAL_RESOURCE_MANAGEMENT.cityList;

/**
 *
 * @author shreyasisodiya
 */
public class ViewInfo extends javax.swing.JFrame {

    /**
     * Creates new form ViewInfo
     */
    public ViewInfo() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDisplay = new javax.swing.JTable();
        labelTableDisplay = new javax.swing.JLabel();
        buttonCreateTable = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        buttonTableBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableDisplay);

        labelTableDisplay.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        labelTableDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTableDisplay.setText("DISPLAY");

        buttonCreateTable.setText("CREATE");
        buttonCreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateTableActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");

        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonTableBack.setText("BACK");
        buttonTableBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTableBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(buttonCreateTable)
                        .addGap(60, 60, 60)
                        .addComponent(jButton2)
                        .addGap(70, 70, 70)
                        .addComponent(jButton1)
                        .addGap(70, 70, 70)
                        .addComponent(buttonTableBack))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(labelTableDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelTableDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCreateTable)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(buttonTableBack))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buttonTableBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTableBackActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewSystemAdmin vsa = new ViewSystemAdmin();
        vsa.show();
    }//GEN-LAST:event_buttonTableBackActionPerformed

    private void buttonCreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateTableActionPerformed
        // TODO add your handling code here:
        if(labelTableDisplay.getText() == "MANAGE CITIES")
        {
            this.hide();
            CreateCity cc = new CreateCity();
            cc.show();
        }
        else if (labelTableDisplay.getText() == "MANAGE HOSPITALS")
        {
            this.hide();
            CreateHospital ch = new CreateHospital();
            for(int i=0;i<cityList.size();i++) 
            {
               ch.comboCity.addItem(cityList.get(i));
            }
        ch.show();
        }
        else if(labelTableDisplay.getText() == "MANAGE COMMUNITIES")
        {
            this.hide();
            CreateCommunity cc = new CreateCommunity();
            for(int i=0;i<cityList.size();i++) {
              cc.comboCity.addItem(cityList.get(i));
        }
            cc.show();
        }
        else if(labelTableDisplay.getText() == "MANAGE PATIENTS"){
            this.hide();
            CreatePatient cp = new CreatePatient();
            cp.comboCity.removeAll();
            for(int i=0;i<cityList.size();i++) {
                cp.comboCity.addItem(cityList.get(i));
            }
        cp.show();
        }
        else if(labelTableDisplay.getText() == "MANAGE DOCTORS"){
            this.hide();
            CreateDoctor cdoc = new CreateDoctor();
            for(int i=0;i<cityList.size();i++) {
                cdoc.comboCity.addItem(cityList.get(i));
            }
            cdoc.show();
        }
        else if(labelTableDisplay.getText() == "COMMUNITY ADMIN"){
            this.hide();
            CommunityAdminForm caf = new CommunityAdminForm();
            for(int i=0;i<cityList.size();i++) {
                caf.comboCity.addItem(cityList.get(i));
            }
            caf.show();
        }
    }//GEN-LAST:event_buttonCreateTableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ViewInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreateTable;
    private javax.swing.JButton buttonTableBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelTableDisplay;
    public javax.swing.JTable tableDisplay;
    // End of variables declaration//GEN-END:variables
}
