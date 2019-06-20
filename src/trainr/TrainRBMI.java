package trainr;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TrainRBMI extends javax.swing.JFrame {

    //Creates new bmi form and stores into new class instance
    static TrainRBMI b = new TrainRBMI();
    //static TrainRLogin l = new TrainRLogin();

    //Creates new form TrainRBMI
    public TrainRBMI() {
        initComponents();
        jComboMeasurements.setSelectedIndex(-1);
        comboActivityLevel.setSelectedIndex(-1);
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
        lblheight1 = new javax.swing.JLabel();
        lblheight2 = new javax.swing.JLabel();
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
        lblNormalRange = new javax.swing.JLabel();
        comboActivityLevel = new javax.swing.JComboBox<String>();
        jComboMeasurements = new javax.swing.JComboBox<String>();
        lblWeight = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrainR");
        setName("frmTrainRHome"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("BMI:");
        jLabel1.setToolTipText("");
        jLabel1.setName("lblBMI"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 240, 50, 29);

        txtPounds.setName("weight"); // NOI18N
        getContentPane().add(txtPounds);
        txtPounds.setBounds(30, 50, 50, 30);

        txtHeightFeet.setName("heightInFeet"); // NOI18N
        getContentPane().add(txtHeightFeet);
        txtHeightFeet.setBounds(30, 110, 50, 30);

        txtHeightInch.setText("0");
        txtHeightInch.setName("heightInInches"); // NOI18N
        getContentPane().add(txtHeightInch);
        txtHeightInch.setBounds(120, 110, 50, 30);

        lblheight1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(lblheight1);
        lblheight1.setBounds(90, 110, 20, 30);

        lblheight2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(lblheight2);
        lblheight2.setBounds(240, 110, 20, 30);

        btnCalculate.setForeground(new java.awt.Color(0, 0, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(120, 180, 100, 30);

        btnClear.setForeground(new java.awt.Color(0, 0, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(10, 180, 80, 30);

        jLabel5.setText("Weight");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 20, 60, 30);

        jLabel6.setText("Height");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 80, 50, 30);

        lblBMI.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBMI.setForeground(new java.awt.Color(255, 0, 0));
        lblBMI.setText("0");
        getContentPane().add(lblBMI);
        lblBMI.setBounds(70, 230, 60, 50);

        btnContinue.setBackground(new java.awt.Color(255, 0, 0));
        btnContinue.setForeground(new java.awt.Color(0, 0, 255));
        btnContinue.setText("Continue --->");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinue);
        btnContinue.setBounds(380, 300, 120, 40);

        buttonGroup1.add(maleRadiobtn);
        maleRadiobtn.setText("Male");
        maleRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadiobtnActionPerformed(evt);
            }
        });
        getContentPane().add(maleRadiobtn);
        maleRadiobtn.setBounds(310, 60, 80, 20);

        buttonGroup1.add(femaleRadiobtn);
        femaleRadiobtn.setText("Female");
        femaleRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadiobtnActionPerformed(evt);
            }
        });
        getContentPane().add(femaleRadiobtn);
        femaleRadiobtn.setBounds(310, 90, 120, 20);

        txtAge.setName("txtAge"); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        getContentPane().add(txtAge);
        txtAge.setBounds(120, 50, 50, 30);

        lblAge.setText("Age");
        lblAge.setPreferredSize(new java.awt.Dimension(48, 16));
        getContentPane().add(lblAge);
        lblAge.setBounds(120, 30, 30, 16);

        lblBMR2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBMR2.setText("BMR:");
        getContentPane().add(lblBMR2);
        lblBMR2.setBounds(10, 280, 60, 40);

        lblBMR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBMR.setForeground(new java.awt.Color(255, 0, 0));
        lblBMR.setText("0");
        getContentPane().add(lblBMR);
        lblBMR.setBounds(70, 280, 80, 40);

        lblRange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lblRange);
        lblRange.setBounds(230, 240, 240, 40);

        lblNormalRange.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNormalRange.setText("NOTE: The normal range BMI is 18.5 - 24.9");
        getContentPane().add(lblNormalRange);
        lblNormalRange.setBounds(260, 190, 250, 50);

        comboActivityLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sedentary", "slightly active", "active", "extremely active" }));
        comboActivityLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActivityLevelActionPerformed(evt);
            }
        });
        getContentPane().add(comboActivityLevel);
        comboActivityLevel.setBounds(360, 140, 140, 20);

        jComboMeasurements.setBackground(new java.awt.Color(255, 255, 102));
        jComboMeasurements.setMaximumRowCount(2);
        jComboMeasurements.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metric", "Imperial" }));
        jComboMeasurements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMeasurementsActionPerformed(evt);
            }
        });
        getContentPane().add(jComboMeasurements);
        jComboMeasurements.setBounds(370, 20, 110, 20);
        getContentPane().add(lblWeight);
        lblWeight.setBounds(90, 50, 30, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Choose Units first:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 20, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Activity Level:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 140, 100, 20);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        
       try {                                             
           
           /*Gets the entered info from textbox into variable with decimal values
           to get exact precision*/
           double weightEntered =  Double.parseDouble(txtPounds.getText());
           double heightInFeet = Double.parseDouble(txtHeightFeet.getText());
           double heightInInches = Double.parseDouble(txtHeightInch.getText());
           double totalHeight = 0;
           if (jComboMeasurements.getSelectedIndex() == 1){
               weightEntered /= 2.205; //converts pounds to kg
               heightInInches /= 12; //inches to feet in decimal form
               totalHeight = heightInFeet + heightInInches;
               totalHeight /= 3.281; //converts to meters
           }
           //calculates bmi
           else if(jComboMeasurements.getSelectedIndex() == 0){
               totalHeight = heightInFeet; //keeps meters to total height
           }
          BMI = (weightEntered / Math.pow(totalHeight, 2));
           
           //formats bmi to one decimal
           DecimalFormat dmft = new DecimalFormat("##.#");
           String format = dmft.format(BMI);
           
           DecimalFormat dmft1 = new DecimalFormat("#####");
           
           //sets bmi into label
           lblBMI.setText(format);           
           //calculating BMR
           
           int age = 0; //initializing age
           double BMR = (10 * weightEntered) + (625 * totalHeight) - (5 * age) + gen; //calculator for the BMR
           
           switch(comboActivityLevel.getSelectedItem().toString()){  //calculating activity level of the person and
               case "sedentary":                                    // adding it to the BMR
                   BMR *= 1.2;
                   break;
               case "slightly active":
                   BMR *= 1.375;
                   break;
               case "active":
                   BMR *= 1.55;
                   break;
               case "extremely active":
                   BMR *= 1.725;
                   break;
           }
           
           
           
           String fmt2 = dmft1.format(BMR);
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
           //Start of Database integration
           String pkey = "CoreyD";
           //String pkey = TrainRLogin.txtUser.getText();
           
           double BMRDB = BMR;
           Connection con= null;
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String connectionURL="jdbc:sqlserver://trainrserver.database.windows.net:1433;databaseName=traindata;user=trainrproject;password=Password123;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
          
           try {
              con =DriverManager.getConnection(connectionURL);
              PreparedStatement st= con.prepareStatement("update traindata set BMRDB = ? where username = ?");
              st.setInt(1, (int) BMRDB);
              st.setString(2, pkey);
               int a =st.executeUpdate();
               if(a>0)
               {
                System.out.println("Row Update");
               }
               else{
                   JOptionPane.showMessageDialog(null, "Data did not save");
               }
           } catch(SQLException e){
               JOptionPane.showMessageDialog(null, e);
           }
           
           
       } catch(ClassNotFoundException ex){
            Logger.getLogger(TrainRBMI.class.getName()).log(Level.SEVERE,null, ex);
       } 
        String pkey = "CoreyD";
           //String pkey = TrainRLogin.txtUser.getText();
           
           double BMIDB = BMI;
           Connection con= null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TrainRBMI.class.getName()).log(Level.SEVERE, null, ex);
        }
           String connectionURL="jdbc:sqlserver://trainrserver.database.windows.net:1433;databaseName=traindata;user=trainrproject;password=Password123;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
          
           try {
            con =DriverManager.getConnection(connectionURL);
            PreparedStatement st= con.prepareStatement("update traindata set BMIDB = ? where username = ?");
            st.setInt(1, (int) BMIDB);
            st.setString(2, pkey); 
           int b =st.executeUpdate();
              if(b>0)
               {
                System.out.println("Row Update");
               } 
               else{
                   JOptionPane.showMessageDialog(null, "Data did not save");
               }
           } catch(SQLException e){
               JOptionPane.showMessageDialog(null, e);
           
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
        comboActivityLevel.setSelectedItem(null);
        buttonGroup1.clearSelection();
        jComboMeasurements.setSelectedItem(null);
        
        
        
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

    private void comboActivityLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActivityLevelActionPerformed
             
       
        
    }//GEN-LAST:event_comboActivityLevelActionPerformed

    private void jComboMeasurementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMeasurementsActionPerformed
        if (jComboMeasurements.getSelectedIndex() == 0){
            lblheight1.setText("m");
            lblheight2.setText("");
            lblWeight.setText("Kg");
        }
        else if (jComboMeasurements.getSelectedIndex() == 1){
            lblheight1.setText("Ft");
            lblheight2.setText("In");
            lblWeight.setText("Lbs");
        }
  
    }//GEN-LAST:event_jComboMeasurementsActionPerformed

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
try (FileReader reader = new FileReader("keyvalue"))
       {
           Properties p = new Properties();
           p.load(reader);
           String pkey = p.getProperty(("key"));
           System.out.println(pkey);
           
       } catch (Exception e){
           System.out.println("Did not pull properly");
           e.printStackTrace();

       }

      
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
    private javax.swing.JComboBox<String> comboActivityLevel;
    private javax.swing.JRadioButton femaleRadiobtn;
    private javax.swing.JComboBox<String> jComboMeasurements;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblBMR;
    private javax.swing.JLabel lblBMR2;
    private javax.swing.JLabel lblNormalRange;
    private javax.swing.JLabel lblRange;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblheight1;
    private javax.swing.JLabel lblheight2;
    private javax.swing.JRadioButton maleRadiobtn;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeightFeet;
    private javax.swing.JTextField txtHeightInch;
    private javax.swing.JTextField txtPounds;
    // End of variables declaration//GEN-END:variables
    double gen;
    double BMI;
}
