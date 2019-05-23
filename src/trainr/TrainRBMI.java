package trainr;
import java.text.DecimalFormat;
//Imports TrainRLogin Class from different file.
import trainr.TrainRLogin;

public class TrainRBMI extends javax.swing.JFrame {
    
    /*Gets new instance of TrainRLogin class so it can be referenced 
    in this class.*/
    static TrainRLogin TrainRLogin = new TrainRLogin();
    
    //Creates new home form and stores into new class instance
    public TrainRHome h = new TrainRHome();
    
    //Creates new form TrainRBMI
    public TrainRBMI() {
        initComponents();
    }

    //Initialized when form and program are loaded
    //This info is auto generated, do not change.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel1.setBounds(30, 190, 50, 29);

        txtPounds.setName("weight"); // NOI18N
        getContentPane().add(txtPounds);
        txtPounds.setBounds(60, 20, 50, 30);

        txtHeightFeet.setName("heightInFeet"); // NOI18N
        getContentPane().add(txtHeightFeet);
        txtHeightFeet.setBounds(60, 80, 50, 30);

        txtHeightInch.setName("heightInInches"); // NOI18N
        getContentPane().add(txtHeightInch);
        txtHeightInch.setBounds(130, 80, 50, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ft");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 70, 20, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("In");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 70, 20, 30);

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(100, 130, 90, 30);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(0, 130, 80, 30);

        jLabel5.setText("Weight:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 50, 30);

        jLabel6.setText("Height:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 70, 50, 30);

        lblBMI.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBMI.setText("0");
        getContentPane().add(lblBMI);
        lblBMI.setBounds(90, 190, 60, 30);

        btnContinue.setText("Continue --->");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinue);
        btnContinue.setBounds(470, 320, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        
        /*Gets the entered info from textbox into variable with decimal values
        to get exact precision*/
        double weightEntered =  Double.parseDouble(txtPounds.getText());
        double heightInFeet = Double.parseDouble(txtHeightFeet.getText());
        double heightInInches = Double.parseDouble(txtHeightInch.getText());
        
        
        weightEntered /= 2.205; //converts pounds to kg
        heightInInches /= 12; //inches to foot in decimal form
        double totalHeight = heightInFeet + heightInInches;
        totalHeight /= 3.281; //converts to meters
        
        //calculates bmi
        double BMI = (weightEntered / Math.pow(totalHeight, 2));
        
        //formats bmi to one decimal
        DecimalFormat dmft = new DecimalFormat("##.#");
        String format = dmft.format(BMI);
        
        //sets bmi into label
        lblBMI.setText(format);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //clears form
        txtPounds.setText("");
        lblBMI.setText("0");
        txtHeightFeet.setText("");
        txtHeightInch.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        //TODO - Does not dispose correctly        
        //This will get rid of the bmi form
        TrainRLogin.b.dispose();
        //This will open main form
        h.setVisible(true);
    }//GEN-LAST:event_btnContinueActionPerformed

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
                TrainRLogin.b.setVisible(true);
            }
        });
    }

    //auto generated dont touch
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnContinue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JTextField txtHeightFeet;
    private javax.swing.JTextField txtHeightInch;
    private javax.swing.JTextField txtPounds;
    // End of variables declaration//GEN-END:variables
}
