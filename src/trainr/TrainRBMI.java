package trainr;
import java.text.DecimalFormat;

public class TrainRBMI extends javax.swing.JFrame {

    //Creates new bmi form and stores into new class instance
    static TrainRBMI b = new TrainRBMI();
    
    //Creates new form TrainRBMI
    public TrainRBMI() {
        initComponents();
    }

    //Initialized when form and program are loaded
    //This info is auto generated, do not change.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtPounds = new javax.swing.JTextField();
        txtHeightFeet = new javax.swing.JTextField();
        txtHeightInch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblBMI = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        maleRadiobtn = new javax.swing.JRadioButton();
        femaleRadiobtn = new javax.swing.JRadioButton();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblBMR2 = new javax.swing.JLabel();
        lblBMR = new javax.swing.JLabel();
        lblRange = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrainR");
        setName("frmTrainRHome"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("BMI:");
        jLabel1.setToolTipText("");
        jLabel1.setName("lblBMI"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 240, 50, 29);

        txtPounds.setName("weight"); // NOI18N
        getContentPane().add(txtPounds);
        txtPounds.setBounds(60, 20, 50, 30);

        txtHeightFeet.setName("heightInFeet"); // NOI18N
        getContentPane().add(txtHeightFeet);
        txtHeightFeet.setBounds(60, 80, 50, 30);

        txtHeightInch.setText("0");
        txtHeightInch.setName("heightInInches"); // NOI18N
        getContentPane().add(txtHeightInch);
        txtHeightInch.setBounds(140, 80, 50, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ft");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 80, 20, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("In");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 80, 20, 30);

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(140, 140, 100, 30);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(30, 140, 80, 30);

        jLabel5.setText("Weight");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 40, 30);

        jLabel6.setText("Height");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 70, 40, 30);

        lblBMI.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBMI.setText("0");
        getContentPane().add(lblBMI);
        lblBMI.setBounds(80, 230, 60, 50);

        btnContinue.setText("Continue --->");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinue);
        btnContinue.setBounds(390, 300, 100, 40);

        buttonGroup1.add(maleRadiobtn);
        maleRadiobtn.setText("Male");
        maleRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadiobtnActionPerformed(evt);
            }
        });
        getContentPane().add(maleRadiobtn);
        maleRadiobtn.setBounds(250, 20, 110, 23);

        buttonGroup1.add(femaleRadiobtn);
        femaleRadiobtn.setText("Female");
        femaleRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadiobtnActionPerformed(evt);
            }
        });
        getContentPane().add(femaleRadiobtn);
        femaleRadiobtn.setBounds(250, 50, 150, 23);

        txtAge.setName("txtAge"); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        getContentPane().add(txtAge);
        txtAge.setBounds(150, 20, 60, 30);

        lblAge.setText("Age");
        getContentPane().add(lblAge);
        lblAge.setBounds(120, 20, 31, 14);

        lblBMR2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBMR2.setText("BMR:");
        getContentPane().add(lblBMR2);
        lblBMR2.setBounds(10, 280, 70, 40);

        lblBMR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBMR.setText("0");
        getContentPane().add(lblBMR);
        lblBMR.setBounds(80, 280, 80, 40);

        lblRange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lblRange);
        lblRange.setBounds(250, 190, 240, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOTE: The normal range BMI is 18.5 - 24.9");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 120, 250, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        
        /*Gets the entered info from textbox into variable with decimal values
        to get exact precision*/
        double weightEntered =  Double.parseDouble(txtPounds.getText());
        double heightInFeet = Double.parseDouble(txtHeightFeet.getText());
        double heightInInches = Double.parseDouble(txtHeightInch.getText());
        
        
        weightEntered /= 2.205; //converts pounds to kg
        heightInInches /= 12; //inches to feet in decimal form
        double totalHeight = heightInFeet + heightInInches;
        totalHeight /= 3.281; //converts to meters
        
        //calculates bmi
        double BMI = (weightEntered / Math.pow(totalHeight, 2));
        
        //formats bmi to one decimal
        DecimalFormat dmft = new DecimalFormat("##.#");
        String format = dmft.format(BMI);
        
        //sets bmi into label
        lblBMI.setText(format);
        
        //calculating BMR
        
        int age = 0; //initializing age
        double BMR = (10 * weightEntered) + (625 * totalHeight) - (5 * age) + gen; //calculator for the BMR
        
        String fmt2 = dmft.format(BMR);
        lblBMR.setText(fmt2);
        
        if(BMI < 18.5){                             //tells user if theyre under, over, or at a normal weight
            lblRange.setText("You are Underweight");
        }
        else if(BMI >= 25){
            lblRange.setText("You are Overweight");
        }
        else{
            lblRange.setText("You are at a normal weight");
        }
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //clears form
        txtPounds.setText("");
        lblBMI.setText("0");
        txtHeightFeet.setText("");
        txtHeightInch.setText("0");
        txtAge.setText("");
        lblBMR.setText("0");
        lblRange.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        //This will get rid of the bmi form
        b.dispose();
        //This will create a new main form that opens
        TrainRHome h = new TrainRHome();
        h.setVisible(true);
    }//GEN-LAST:event_btnContinueActionPerformed

    private void femaleRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadiobtnActionPerformed
    gen = -161;
    }//GEN-LAST:event_femaleRadiobtnActionPerformed

    private void maleRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadiobtnActionPerformed
       gen = 5;
    }//GEN-LAST:event_maleRadiobtnActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    //Main class to run program
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TrainRBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainRBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainRBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainRBMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                b.setVisible(true);
            }
        });
    }

    //auto generated dont touch
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContinue;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton femaleRadiobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblBMR;
    private javax.swing.JLabel lblBMR2;
    private javax.swing.JLabel lblRange;
    private javax.swing.JRadioButton maleRadiobtn;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeightFeet;
    private javax.swing.JTextField txtHeightInch;
    private javax.swing.JTextField txtPounds;
    // End of variables declaration//GEN-END:variables
    double gen;
}
