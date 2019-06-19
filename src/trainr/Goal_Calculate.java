package trainr;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static trainr.TrainRLogin.l;

public class Goal_Calculate extends javax.swing.JFrame {
                                
            
               
            //If there are not any errors then it will continue to the next form.
        



    
    
    
    
    /*IMPORTANT*/private int BMR = 2000; //*** Placeholder value. Replace with user BMR.***
    /*IMPORTANT*/private int weeksChosen = 0; //The number of weeks chosen by the user.
    /*IMPORTANT*/private int overallGoal = 0;//Overall user goal in calories
    /*IMPORTANT*/private int weeklyGoal = 0;//Weekly goal of the user based on Overall goal and weeks.
    
    
    //modifiers used in calculation.
    private int ninetyFiveBmr = (int)Math.ceil(BMR * 0.95);
    private int ninetyBmr = (int)Math.ceil(BMR * 0.9);
    private int eightyFiveBmr = (int)Math.ceil(BMR * 0.85);
    private int eightyBmr = (int)Math.ceil(BMR * 0.8);
    private int seventyFiveBmr = (int)Math.ceil(BMR * 0.75);
    private int seventyBmr = (int)Math.ceil(BMR * 0.7);
    private int sixtyFiveBmr = (int)Math.ceil(BMR * 0.65);
    private int sixtyBmr = (int)Math.ceil(BMR * 0.6);
    
    //Arrays used in calculation and for short term data storage.
    private int[] weeklyGoalCalc, dailyGoalCalc, adjustedBMRCalc;
    private int userGoalCalories, weeklyGoalCalories;
    List<Integer> recommendedRangeGoal, cautionRangeGoal, dangerRangeGoal,
            recommendedRangeWeeks, cautionRangeWeeks, dangerRangeWeeks;
    
    /**
     * Creates new form Goal_Calculate
     */
    public Goal_Calculate() {
        initComponents();
        System.out.println(BMR);
            try{
                    Connection con= null;
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    String connectionURL="jdbc:sqlserver://trainrserver.database.windows.net:1433;databaseName=traindata;user=trainrproject;password=Password123;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
                    try{
                        con =DriverManager.getConnection(connectionURL);
                        System.out.println("Connection Is Good!");
                        
                        int log = 1;
                        Statement stmt = (Statement)con.createStatement();
                        ResultSet rs = stmt.executeQuery("select * from traindata");
                        
                        while (rs.next())
                        {
                            if (rs.getString(1).equals(45))
                            {
                                log = 0;
                                
                                break;
                            }
                        }
                        
                        if (log ==0){
                            
                        }
                        else  {
                            //txtUserLogin.setText("");
                            
                        }
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    //If there are not any errors then it will continue to the next form.
                }catch(ClassNotFoundException ex){
                    Logger.getLogger(Goal_Calculate.class.getName()).log(Level.SEVERE,null, ex);
                }
                //If there are not any errors then it will continue to the next form.
}


        //printValues();
    
    
    private void printValues(){
        /*This method is used to print values to the console, for the purposes
        of testing.*/
        int userGoal = Integer.parseInt(weightSpinner.getValue().toString());
        System.out.println(BMR);
        System.out.println(ninetyFiveBmr);
        System.out.println(ninetyBmr);
        System.out.println(eightyFiveBmr);
        System.out.println(eightyBmr);
        System.out.println(seventyFiveBmr);
        System.out.println(seventyBmr);
        System.out.println(sixtyFiveBmr);
        System.out.println(sixtyBmr);
        System.out.println(userGoal);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        weightSpinner = new javax.swing.JSpinner();
        weightTypeCombo = new javax.swing.JComboBox();
        confirmGoalbtn = new javax.swing.JButton();
        weekSlider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        overallTextField = new javax.swing.JTextField();
        weeklyTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        weeksDisplay = new javax.swing.JTextField();

        saveBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveBtn1.setText("Save Goal");
        saveBtn1.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Select Weight Loss Goal: ");

        weightSpinner.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        weightSpinner.setModel(new javax.swing.SpinnerNumberModel(2, 2, 20, 1));

        weightTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        weightTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lbs", "Kgs" }));

        confirmGoalbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmGoalbtn.setForeground(new java.awt.Color(255, 0, 0));
        confirmGoalbtn.setText("Confirm Goal");
        confirmGoalbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmGoalbtnMouseClicked(evt);
            }
        });

        weekSlider.setMajorTickSpacing(3);
        weekSlider.setMaximum(52);
        weekSlider.setMinimum(3);
        weekSlider.setMinorTickSpacing(1);
        weekSlider.setPaintLabels(true);
        weekSlider.setPaintTicks(true);
        weekSlider.setValue(3);
        weekSlider.setEnabled(false);
        weekSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                weekSliderMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Select Your Time Goal (in Weeks)");
        jLabel2.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Overall Goal (KCal.):");
        jLabel4.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Weekly Burn Goal (KCal.): ");
        jLabel5.setEnabled(false);

        overallTextField.setEditable(false);
        overallTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        overallTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        overallTextField.setEnabled(false);

        weeklyTextField.setEditable(false);
        weeklyTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weeklyTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        weeklyTextField.setEnabled(false);

        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 0, 255));
        saveBtn.setText("Save Goal");
        saveBtn.setEnabled(false);
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveBtnMouseReleased(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(0, 0, 255));
        exitBtn.setText("Exit");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitBtnMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("*If using the Metric scale, we do not recommend a goal larger than 17Kg");

        textArea1.setEditable(false);
        textArea1.setEnabled(false);
        textArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textArea1.setMaximumSize(new java.awt.Dimension(1000, 300));

        weeksDisplay.setEditable(false);
        weeksDisplay.setBackground(new java.awt.Color(204, 204, 204));
        weeksDisplay.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        weeksDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        weeksDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeksDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(weightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(weightTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(confirmGoalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(weekSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4)
                                        .addGap(9, 9, 9)))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weeklyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(overallTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(weeksDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(weightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(confirmGoalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(weeksDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overallTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(weeklyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmGoalbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmGoalbtnMouseClicked
        int userGoal = Integer.parseInt(weightSpinner.getValue().toString());
        if (weightTypeCombo.getSelectedIndex() == 0){
        userGoalCalories = userGoal * 3500;
        //weeklyGoalCalories = (int)Math.ceil(userGoalCalories / 7);
        }else{
        userGoalCalories = Math.round((long) (userGoal * 7716.1791764707));
        //weeklyGoalCalories = Math.round((long)userGoalCalories / 7);
        }
        
        //activate all disabled elements except for the save button.
        jLabel2.setEnabled(true);
        weekSlider.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        overallTextField.setEnabled(true);
        weeklyTextField.setEnabled(true);
        saveBtn.setEnabled(true);
        textArea1.setEnabled(true);
        weeksDisplay.setText(weekSlider.getValue() + "");
        
        weeklyGoalCalc = new int[50]; // 49 weeks (entries), 3 to 52 weeks.
        dailyGoalCalc = new int[50];
        adjustedBMRCalc = new int[50];
        
        
        //Calculating Weekly Calorie Goals for each week.
        for (int i=0; i < weeklyGoalCalc.length; i++){ 
            int week = 3;
            week+=i;        
            weeklyGoalCalc[i] = Math.round((long)userGoalCalories / week); 
            //System.out.println(weeklyGoalCalc[i]);
        }
        
        
        //Calculating average daily calorie goals based on weekly goals.
        for (int i=0; i < dailyGoalCalc.length; i++){ 
            dailyGoalCalc[i] = Math.round((long)weeklyGoalCalc[i] / 7);
            //System.out.println(dailyGoalCalc[i]);
        }
        
        //Calculating the estimated daily calorie intake of each week. 
        for (int i=0; i < adjustedBMRCalc.length; i++){ 
            adjustedBMRCalc[i] = (BMR - dailyGoalCalc[i]);
            //System.out.println(adjustedBMRCalc[i]);
        }
        
        
        //initialize Array lists, representing calorie intake ranges.
        recommendedRangeGoal= new ArrayList<>();
        cautionRangeGoal = new ArrayList<>();
        dangerRangeGoal  = new ArrayList<>();
        //initialize Array lists, representing the weekly timeframe for each range.
        recommendedRangeWeeks = new ArrayList<>();
        cautionRangeWeeks = new ArrayList<>();
        dangerRangeWeeks = new ArrayList<>();
        
        for (int i = 0; i < adjustedBMRCalc.length; i++){ 
            if (adjustedBMRCalc[i] <= ninetyBmr && adjustedBMRCalc[i] >= eightyBmr){
                recommendedRangeGoal.add(adjustedBMRCalc[i]);
                recommendedRangeWeeks.add(i + 3);
                
            }else if((adjustedBMRCalc[i] > ninetyBmr && adjustedBMRCalc[i] <= ninetyFiveBmr)
                    || (adjustedBMRCalc[i] < eightyBmr && adjustedBMRCalc[i] >= seventyBmr)){
                cautionRangeGoal.add(adjustedBMRCalc[i]);
                cautionRangeWeeks.add(i + 3);
                
            }else if(adjustedBMRCalc[i] < seventyBmr || adjustedBMRCalc[i] >
                    ninetyFiveBmr){
                dangerRangeGoal.add(adjustedBMRCalc[i]);
                dangerRangeWeeks.add(i + 3);
            }    
        }
        
        
        //System.out.println(recommendedRangeGoal.toString());//Calorie Range
        //System.out.println(recommendedRangeWeeks.toString());//Weeks Range
        
        
        //The try catch block below displays a message based on the results of the
        //calculations, recommending a weekly time frame selection based on 
        //an array of acceptable values. If the range is not acceptable, and error
        //message displays. This only happens if a goal cannot be achieved in under a 
        //year (52 weeks).
        try{
            if (recommendedRangeWeeks.get(0) == 3){
        textArea1.setText("Based on your BMR and your selected weight loss goal, "
                + "it is strongly \nrecommended that you select a weekly time frame between "
                + recommendedRangeWeeks.get(0).toString() + " weeks \nand " 
                + recommendedRangeWeeks.get((recommendedRangeWeeks.size() - 1)).toString() 
                + " weeks. This range will give you the most desirable results at an \neven pace."
                + " It is recommended that you choose a weekly time from \nsomewhere in the middle of that range." 
                + "\n\nIf you want to change this range, change your goal selection"
                + "\nand press the \"confirm goal\" button again to recalculate.");
        
                overallTextField.setText(Integer.toString(userGoalCalories));
                overallGoal = userGoalCalories;

            }else{
                textArea1.setText("Based on your BMR and your selected weight loss goal, "
                + "it is strongly \nrecommended that you select a weekly time frame between "
                + recommendedRangeWeeks.get(0).toString() + " weeks \nand " 
                + recommendedRangeWeeks.get((recommendedRangeWeeks.size() - 1)).toString() 
                + " weeks. This range will give you the most desirable results at an \neven pace."
                + " It is recommended that you choose a weekly time from \nsomewhere in the middle of that range." 
                + "\n\nIt is also strongly recommended that you do not choose a weekly time \nframe at or below "
                + cautionRangeWeeks.get(0).toString() + " weeks. That range would result in either"
                + "\nextremely arduous physical requirements to achieve your goal, \nor "
                + "a calorie intake that would resemble starvation."
                + "\n\nIf you want to change this range, change your goal selection"
                + "\nand press the \"confirm goal\" button again to recalculate.");
                
                overallTextField.setText(Integer.toString(userGoalCalories));
                overallGoal = userGoalCalories;
            }
        }catch(Exception e){
            textArea1.setText("There was an error. This was most likely caused by\n"
                    + "selecting a weight loss goal outside the possible time range of \nour "
                    + "calculations. If you chose a goal higher than 17kgs or 18kgs, please\nselect"
                    + " a lower goal and try again.");
        }    
        
        weekSliderMouseReleased(evt);
        
    }//GEN-LAST:event_confirmGoalbtnMouseClicked

    private void saveBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseReleased
           try {                                      
               /*ADD CODE TO PASS VARIABLES TO DATABASE.
               Variables to be Passed:
               private int weeksChosen; (line 16)
               private int overallGoal; (line 17)
               private int weeklyGoal; (line 18)
               */
               Connection con= null;
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               String connectionURL="jdbc:sqlserver://trainrserver.database.windows.net:1433;databaseName=traindata;user=trainrproject;password=Password123;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
               try {
                   con =DriverManager.getConnection(connectionURL);
                   PreparedStatement st= con.prepareStatement("insert into traindata where username = pkey (BMIDB,BMRDB)values(?,?)");
                   //st.setInt(1, (int) BMIDB);
                   //st.setInt(2, (int) BMRDB);
                   int a =st.executeUpdate();
                   if(a>0)
                   {
                       System.out.println("ROW UPDATE");
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Data did not save");
                   }
               } catch(SQLException e){
                   JOptionPane.showMessageDialog(null, e);
               }
               
               
           } catch(ClassNotFoundException ex){
               Logger.getLogger(Goal_Calculate.class.getName()).log(Level.SEVERE,null, ex);
           }
           
        
    }//GEN-LAST:event_saveBtnMouseReleased

    private void exitBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseReleased
        this.dispose();
    }//GEN-LAST:event_exitBtnMouseReleased

    private void weekSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weekSliderMouseReleased
        
        int weekSliderChosen = weekSlider.getValue();
        weeklyTextField.setText(weeklyGoalCalc[weekSliderChosen - 3] + "");
        
        weeksChosen = weekSliderChosen;
        
        if (recommendedRangeWeeks.contains(weekSlider.getValue())){
            weeksDisplay.setText(weekSlider.getValue() + "");
            weeksDisplay.setForeground(Color.green);
        }else if(cautionRangeWeeks.contains(weekSlider.getValue())){
            weeksDisplay.setText(weekSlider.getValue() + "");
            weeksDisplay.setForeground(Color.yellow);
        }else if(dangerRangeWeeks.contains(weekSlider.getValue())){
            weeksDisplay.setText(weekSlider.getValue() + "");
            weeksDisplay.setForeground(Color.red);
        }else{
            weeksDisplay.setText("Error");
            weeksDisplay.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_weekSliderMouseReleased

    private void weeksDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeksDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weeksDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(Goal_Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Goal_Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Goal_Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Goal_Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Goal_Calculate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmGoalbtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField overallTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveBtn1;
    private java.awt.TextArea textArea1;
    private javax.swing.JSlider weekSlider;
    private javax.swing.JTextField weeklyTextField;
    private javax.swing.JTextField weeksDisplay;
    private javax.swing.JSpinner weightSpinner;
    private javax.swing.JComboBox weightTypeCombo;
    // End of variables declaration//GEN-END:variables

   
}
