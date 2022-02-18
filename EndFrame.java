/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramirezbrianproject3;

/**
 *
 * @author brianramirez
 */
public class EndFrame extends javax.swing.JFrame {
    
    private BookStore myMode1;
    private Product myMode2;
    private Members myMode3;
    private PremiumMembers myMode4;
    
    private boolean enteredID = false;
    private boolean enteredPayment = false;
    
    private boolean PremiumMember;


    /**
     * Creates new form CheckoutFrame
     */
    public EndFrame() {
        initComponents();
    }

    EndFrame(BookStore mode1, Product myMode2, Members myMode3, PremiumMembers myMode4) {
     initComponents();
     this.myMode1 = mode1;
     this.myMode2 = myMode2;
     this.myMode3 = myMode3;   
     this.myMode4 = myMode4;
     welcomeLabel.setText("Welcome, " + myMode3.getFirstName() + ".");
     ProductLabel.setText("Chosen Product & It's Value: " + myMode2.getProductName()+ ".");
     
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        ProductLabel = new javax.swing.JLabel();
        MemberID = new javax.swing.JLabel();
        IdText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PaymentComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        PremiumCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        PremiumComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        welcomeLabel.setText("Welcome");

        ProductLabel.setText("Selected Item(s):");

        MemberID.setText("Member ID: ");

        IdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextActionPerformed(evt);
            }
        });
        IdText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdTextKeyTyped(evt);
            }
        });

        jLabel1.setText("Payment Method?");

        PaymentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit", "Debit" }));
        PaymentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentComboBoxActionPerformed(evt);
            }
        });

        PremiumCheckBox.setText("Premium Member?");
        PremiumCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiumCheckBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Phosphate", 0, 18)); // NOI18N
        jLabel3.setText("***CHECKOUT***");

        ConfirmButton.setText("Confirm");
        ConfirmButton.setEnabled(false);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        PremiumComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        PremiumComboBox.setEnabled(false);
        PremiumComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiumComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Have you payed the fee?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PaymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PremiumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ExitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MemberID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(PremiumCheckBox)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(welcomeLabel)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel3))
                            .addComponent(ProductLabel)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(welcomeLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(ProductLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberID)
                    .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PremiumCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PremiumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton)
                    .addComponent(ConfirmButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void PremiumCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumCheckBoxActionPerformed
        // TODO add your handling code here:
       PremiumMember = false;
       
       if (PremiumCheckBox.isSelected()) {
           PremiumMember= true; 
           PremiumComboBox.setEnabled(PremiumMember);
       }
       
    }//GEN-LAST:event_PremiumCheckBoxActionPerformed

    private void PremiumComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PremiumComboBoxActionPerformed

    private void IdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextActionPerformed
        // TODO add your handling code here:  
    
    }//GEN-LAST:event_IdTextActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // TODO add your handling code here:
       int a = Integer.parseInt(IdText.getText());
       myMode3.setId(a);
       
       myMode3.setPaymentMethod(PaymentComboBox.getSelectedItem().toString());
       
       boolean b = Boolean.parseBoolean(PremiumComboBox.getSelectedItem().toString());
       myMode4.setIsFeePaid(b);
        
      SummaryFrame mySummaryFrame = new SummaryFrame(myMode1, myMode2, myMode3, myMode4);
      mySummaryFrame.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void PaymentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentComboBoxActionPerformed
        // TODO add your handling code here:
             
        enteredPayment = true;
        
        if (enteredPayment && enteredID) {
            ConfirmButton.setEnabled(true);
        }
    }//GEN-LAST:event_PaymentComboBoxActionPerformed

    private void IdTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdTextKeyTyped
        // TODO add your handling code here:
        enteredID = true;
        
        if (enteredPayment && enteredID) {
            ConfirmButton.setEnabled(true);
        }
    }//GEN-LAST:event_IdTextKeyTyped

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField IdText;
    private javax.swing.JLabel MemberID;
    private javax.swing.JComboBox<String> PaymentComboBox;
    private javax.swing.JCheckBox PremiumCheckBox;
    private javax.swing.JComboBox<String> PremiumComboBox;
    private javax.swing.JLabel ProductLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
