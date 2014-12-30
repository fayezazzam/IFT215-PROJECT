/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarSeller;

import javax.swing.JOptionPane;

/**
 *
 * @author Fayez
 */
public class carsellergui extends javax.swing.JFrame {

    /**
     * Creates new form carsellergui
     */
    public carsellergui() {
        initComponents();
        this.setLocationRelativeTo(this);
        rootPane.setDefaultButton(btnSubmit);
        this.setTitle("Car Seller");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgWindows = new javax.swing.ButtonGroup();
        pnlOptions = new javax.swing.JPanel();
        lblProductionyear = new javax.swing.JLabel();
        txtProductionyear = new javax.swing.JTextField();
        lblWindows = new javax.swing.JLabel();
        rbElectrical = new javax.swing.JRadioButton();
        rbManual = new javax.swing.JRadioButton();
        lblEngine = new javax.swing.JLabel();
        cbxEngine = new javax.swing.JComboBox();
        chxAC = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        pnlCarprice = new javax.swing.JPanel();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Seller");

        pnlOptions.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        lblProductionyear.setText("Production year:");

        txtProductionyear.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtProductionyearComponentAdded(evt);
            }
        });
        txtProductionyear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductionyearFocusLost(evt);
            }
        });
        txtProductionyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductionyearActionPerformed(evt);
            }
        });
        txtProductionyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductionyearKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductionyearKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductionyearKeyTyped(evt);
            }
        });

        lblWindows.setText("Windows:");

        rbgWindows.add(rbElectrical);
        rbElectrical.setText("Electrical");
        rbElectrical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbElectricalActionPerformed(evt);
            }
        });

        rbgWindows.add(rbManual);
        rbManual.setText("Manual");

        lblEngine.setText("Engine:");

        cbxEngine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fuel", "Diesel", "Electrical" }));
        cbxEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEngineActionPerformed(evt);
            }
        });

        chxAC.setText("AC");
        chxAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxACActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOptionsLayout = new javax.swing.GroupLayout(pnlOptions);
        pnlOptions.setLayout(pnlOptionsLayout);
        pnlOptionsLayout.setHorizontalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOptionsLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnSubmit))
                    .addGroup(pnlOptionsLayout.createSequentialGroup()
                        .addComponent(lblProductionyear)
                        .addGap(27, 27, 27)
                        .addComponent(txtProductionyear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOptionsLayout.createSequentialGroup()
                        .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWindows)
                            .addComponent(lblEngine))
                        .addGap(18, 18, 18)
                        .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOptionsLayout.createSequentialGroup()
                                .addComponent(cbxEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(chxAC))
                            .addGroup(pnlOptionsLayout.createSequentialGroup()
                                .addComponent(rbElectrical)
                                .addGap(18, 18, 18)
                                .addComponent(rbManual)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pnlOptionsLayout.setVerticalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductionyear)
                    .addComponent(txtProductionyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWindows)
                    .addComponent(rbElectrical)
                    .addComponent(rbManual))
                .addGap(12, 12, 12)
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEngine)
                        .addComponent(cbxEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chxAC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addGap(35, 35, 35))
        );

        pnlCarprice.setBorder(javax.swing.BorderFactory.createTitledBorder("Car price"));

        lblPrice.setText("Price:");

        txtPrice.setEditable(false);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCarpriceLayout = new javax.swing.GroupLayout(pnlCarprice);
        pnlCarprice.setLayout(pnlCarpriceLayout);
        pnlCarpriceLayout.setHorizontalGroup(
            pnlCarpriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarpriceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrice)
                .addGap(18, 18, 18)
                .addComponent(txtPrice)
                .addContainerGap())
        );
        pnlCarpriceLayout.setVerticalGroup(
            pnlCarpriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarpriceLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlCarpriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCarprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCarprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void rbBeirutStateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
        if(rbElectrical.isSelected()){
           int windows = 500;
        }
    }
    private void txtProductionyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductionyearActionPerformed

    }//GEN-LAST:event_txtProductionyearActionPerformed

    private void txtProductionyearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductionyearKeyReleased
        // TODO add your handling code here:
      if(txtProductionyear.getText().trim().equals("2012")){
           changeEngineValues(2012);
       }else{if(txtProductionyear.getText().trim().equals("2013")){
           changeEngineValues(2013);
       }else{if(txtProductionyear.getText().trim().equals("2014")){
           changeEngineValues(2014);
       }else{if(txtProductionyear.getText().trim().equals("2015")){
           changeEngineValues(2015);
       }
       }
       }
       }
    }//GEN-LAST:event_txtProductionyearKeyReleased
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
    // TODO add your handling code here:
          if(txtProductionyear.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter Production Year","Warning",JOptionPane.INFORMATION_MESSAGE);
          } else{
              int Windows;
              if(rbElectrical.isSelected()){
                Windows=500;
            }else{
                Windows=0;
            }
          int ProductionYear = 
                    Integer.parseInt(txtProductionyear.getText());
            boolean AC;
            AC=chxAC.isSelected();
              int Engine = 0;
              CarSeller cs = 
                new CarSeller(ProductionYear,Windows,AC,Engine);
        txtPrice.setText(Integer.toString(cs.getPrice()));
                
                
          }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void rbElectricalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbElectricalActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_rbElectricalActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtProductionyearComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtProductionyearComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductionyearComponentAdded

    private void txtProductionyearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductionyearKeyTyped
        // TODO add your handling code here:
        if(txtProductionyear.getText().length()>=4){
           evt.consume();
}
    }//GEN-LAST:event_txtProductionyearKeyTyped

    private void txtProductionyearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductionyearKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductionyearKeyPressed

    private void cbxEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEngineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEngineActionPerformed

    private void txtProductionyearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductionyearFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtProductionyearFocusLost

    private void chxACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxACActionPerformed
    private void changeEngineValues(int ProductionYear){
        
       cbxEngine.removeAllItems();
       switch(ProductionYear){
            case 2012:
                cbxEngine.addItem("Fuel");
                cbxEngine.addItem("Diesel");
                break;
            case 2013:
                cbxEngine.addItem("Fuel");
                cbxEngine.addItem("Diesel");
                break;
            case 2014:
                cbxEngine.addItem("Fuel");
                cbxEngine.addItem("Diesel");
                cbxEngine.addItem("Electrical");
                break;
            default:
                cbxEngine.addItem("Fuel");
                cbxEngine.addItem("Diesel");
                cbxEngine.addItem("Electrical");
                break;
        }  
    }
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
            java.util.logging.Logger.getLogger(carsellergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carsellergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carsellergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carsellergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carsellergui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbxEngine;
    private javax.swing.JCheckBox chxAC;
    private javax.swing.JLabel lblEngine;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductionyear;
    private javax.swing.JLabel lblWindows;
    private javax.swing.JPanel pnlCarprice;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JRadioButton rbElectrical;
    private javax.swing.JRadioButton rbManual;
    private javax.swing.ButtonGroup rbgWindows;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductionyear;
    // End of variables declaration//GEN-END:variables
}
