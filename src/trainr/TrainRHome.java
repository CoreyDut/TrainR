package trainr;
//Imports TrainRLogin Class from different file.
import java.text.SimpleDateFormat;
import trainr.TrainRBMI;

//Get todays date and formats it mm/dd/yyyy
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.DefaultListModel;


public class TrainRHome extends javax.swing.JFrame {

    /*Gets new instance of TrainRBMI class so it can be referenced 
    in this class.*/
    static TrainRBMI TrainRBMI = new TrainRBMI();
    
    //Gets todays date and formats in mm/dd/yyyy, then stores in variable
    Date now = new Date();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    LocalDate localDate = LocalDate.now();
    String date = (dtf.format(localDate)); //05/28/2019
    // the day of the week spelled out completely
    SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); 
    
    //This is to append elements to list boxes
    DefaultListModel objMonday = new DefaultListModel();
    DefaultListModel objTuesday = new DefaultListModel();
    DefaultListModel objWednesday = new DefaultListModel();
    DefaultListModel objThursday = new DefaultListModel();
    DefaultListModel objFriday = new DefaultListModel();
    DefaultListModel objSaturday = new DefaultListModel();
    DefaultListModel objSunday = new DefaultListModel();
    
    // Creates new form TrainRHome
    public TrainRHome() {
        initComponents();
        lblName.setText("name"); //Name from database store here
        txtGoal.setText("0"); //Goal from database / from Goal_calculate 
        //stored here
        prgGoal.setString("0"); //for now this will be 0. It will update as
        //goal is being completed.
        lblBMI.setText("0"); //BMI from database. will update too
        lblBMR.setText("0"); //BMR from database. will uddate too
        
        //simpleDateformat.format(now)
        
        //Starts all list box with the days below
        objMonday.addElement("Monday");
        lstMonday.setModel(objMonday);
        
        objTuesday.addElement("Tuesday");
        lstTuesday.setModel(objTuesday);
        
        objWednesday.addElement("Wednesday");
        lstWednesday.setModel(objWednesday);
        
        objThursday.addElement("Thursday");
        lstThursday.setModel(objThursday);

        objFriday.addElement("Friday");
        lstFriday.setModel(objFriday);

        objSaturday.addElement("Saturday");
        lstSaturday.setModel(objSaturday);

        objSunday.addElement("Sunday");
        lstSunday.setModel(objSunday);
       
    }

    //Initialized when form and program are loaded
    //This info is auto generated, do not change.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCal = new javax.swing.JLabel();
        txtGoal = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblGoal = new javax.swing.JLabel();
        panSettings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnComment = new javax.swing.JButton();
        txtComment = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSunday = new javax.swing.JList<>();
        prgGoal = new javax.swing.JProgressBar();
        lblProgress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMonday = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstTuesday = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstWednesday = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstThursday = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstFriday = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstSaturday = new javax.swing.JList<>();
        btnNextWeek = new javax.swing.JButton();
        btnLastWeek = new javax.swing.JButton();
        txtCalInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblBMRInfo = new javax.swing.JLabel();
        lblBMR = new javax.swing.JLabel();
        lblBMIInfo = new javax.swing.JLabel();
        lblBMI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrianR");
        setPreferredSize(new java.awt.Dimension(773, 600));
        setSize(new java.awt.Dimension(773, 650));
        getContentPane().setLayout(null);

        lblCal.setText("Kcal.");
        getContentPane().add(lblCal);
        lblCal.setBounds(310, 10, 31, 13);

        txtGoal.setText("jTextField1");
        getContentPane().add(txtGoal);
        txtGoal.setBounds(240, 10, 57, 19);

        lblName.setText("NAME");
        getContentPane().add(lblName);
        lblName.setBounds(10, 10, 31, 13);

        lblGoal.setText("Goal:");
        getContentPane().add(lblGoal);
        lblGoal.setBounds(200, 10, 31, 13);

        panSettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panSettings.setLayout(null);

        jLabel1.setText("Settings");
        panSettings.add(jLabel1);
        jLabel1.setBounds(69, 11, 36, 13);

        btnComment.setText("Comment");
        btnComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentActionPerformed(evt);
            }
        });
        panSettings.add(btnComment);
        btnComment.setBounds(110, 70, 90, 21);
        panSettings.add(txtComment);
        txtComment.setBounds(0, 50, 100, 40);

        btnDelete.setText("Delete Comment");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panSettings.add(btnDelete);
        btnDelete.setBounds(80, 30, 120, 21);

        getContentPane().add(panSettings);
        panSettings.setBounds(390, 10, 210, 100);

        lstSunday.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstSunday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstSunday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstSunday.setPreferredSize(new java.awt.Dimension(100, 75));
        lstSunday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstSundayMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(lstSunday);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(660, 130, 110, 260);

        prgGoal.setString("50%");
        getContentPane().add(prgGoal);
        prgGoal.setBounds(190, 40, 146, 11);

        lblProgress.setText("Progress:");
        getContentPane().add(lblProgress);
        lblProgress.setBounds(130, 40, 50, 13);

        lstMonday.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMonday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstMonday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstMonday.setPreferredSize(new java.awt.Dimension(100, 75));
        lstMonday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstMondayMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(lstMonday);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 130, 110, 260);

        lstTuesday.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstTuesday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstTuesday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstTuesday.setPreferredSize(new java.awt.Dimension(100, 75));
        lstTuesday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstTuesdayMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(lstTuesday);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(110, 130, 110, 260);

        lstWednesday.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstWednesday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstWednesday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstWednesday.setPreferredSize(new java.awt.Dimension(100, 75));
        lstWednesday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstWednesdayMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(lstWednesday);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(220, 130, 110, 260);

        lstThursday.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstThursday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstThursday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstThursday.setPreferredSize(new java.awt.Dimension(100, 75));
        lstThursday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstThursdayMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(lstThursday);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(330, 130, 110, 260);

        lstFriday.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFriday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstFriday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstFriday.setPreferredSize(new java.awt.Dimension(100, 75));
        lstFriday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstFridayMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(lstFriday);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(440, 130, 110, 260);

        lstSaturday.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstSaturday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstSaturday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstSaturday.setPreferredSize(new java.awt.Dimension(100, 75));
        lstSaturday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstSaturdayMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(lstSaturday);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(550, 130, 110, 260);

        btnNextWeek.setText("Next Week");
        btnNextWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextWeekActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextWeek);
        btnNextWeek.setBounds(650, 460, 90, 21);

        btnLastWeek.setText("Last Week");
        btnLastWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastWeekActionPerformed(evt);
            }
        });
        getContentPane().add(btnLastWeek);
        btnLastWeek.setBounds(20, 470, 80, 21);
        getContentPane().add(txtCalInput);
        txtCalInput.setBounds(350, 400, 60, 19);

        jLabel2.setText("Kcal Input:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 400, 60, 13);

        lblBMRInfo.setText("BMR:");
        getContentPane().add(lblBMRInfo);
        lblBMRInfo.setBounds(270, 480, 31, 13);

        lblBMR.setText("0");
        getContentPane().add(lblBMR);
        lblBMR.setBounds(310, 480, 6, 13);

        lblBMIInfo.setText("BMI:");
        getContentPane().add(lblBMIInfo);
        lblBMIInfo.setBounds(270, 450, 22, 13);

        lblBMI.setText("0");
        getContentPane().add(lblBMI);
        lblBMI.setBounds(310, 450, 6, 13);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLastWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastWeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastWeekActionPerformed

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentActionPerformed
        if (lstMonday.getSelectedIndex() != -1){
            objMonday.addElement(txtComment.getText());
            lstMonday.setModel(objMonday);
        } else if (lstTuesday.getSelectedIndex() != -1){
            objTuesday.addElement(txtComment.getText());
            lstTuesday.setModel(objTuesday);
        } else if (lstWednesday.getSelectedIndex() != -1){
            objWednesday.addElement(txtComment.getText());
            lstWednesday.setModel(objWednesday);
        } else if (lstThursday.getSelectedIndex() != -1){
            objThursday.addElement(txtComment.getText());
            lstThursday.setModel(objThursday);
        } else if (lstFriday.getSelectedIndex() != -1){
            objFriday.addElement(txtComment.getText());
            lstFriday.setModel(objFriday);
        } else if (lstSaturday.getSelectedIndex() != -1){
            objSaturday.addElement(txtComment.getText());
            lstSaturday.setModel(objSaturday);
        } else if (lstSunday.getSelectedIndex() != -1){
            objSunday.addElement(txtComment.getText());
            lstSunday.setModel(objSunday);
        }
    }//GEN-LAST:event_btnCommentActionPerformed

    private void lstMondayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMondayMousePressed
        //Clears all selection from list box except current selected
        lstTuesday.clearSelection();
        lstWednesday.clearSelection();
        lstThursday.clearSelection();
        lstFriday.clearSelection();
        lstSaturday.clearSelection();
        lstSunday.clearSelection(); 
    }//GEN-LAST:event_lstMondayMousePressed

    private void lstTuesdayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstTuesdayMousePressed
        //Clears all selection from list box except current selected
        lstMonday.clearSelection();
        lstWednesday.clearSelection();
        lstThursday.clearSelection();
        lstFriday.clearSelection();
        lstSaturday.clearSelection();
        lstSunday.clearSelection(); 
    }//GEN-LAST:event_lstTuesdayMousePressed

    private void lstWednesdayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstWednesdayMousePressed
        //Clears all selection from list box except current selected
        lstMonday.clearSelection();
        lstTuesday.clearSelection();
        lstThursday.clearSelection();
        lstFriday.clearSelection();
        lstSaturday.clearSelection();
        lstSunday.clearSelection(); 
    }//GEN-LAST:event_lstWednesdayMousePressed

    private void lstThursdayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstThursdayMousePressed
        //Clears all selection from list box except current selected
        lstMonday.clearSelection();
        lstTuesday.clearSelection();
        lstWednesday.clearSelection();
        lstFriday.clearSelection();
        lstSaturday.clearSelection();
        lstSunday.clearSelection(); 
    }//GEN-LAST:event_lstThursdayMousePressed

    private void lstFridayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstFridayMousePressed
        //Clears all selection from list box except current selected
        lstMonday.clearSelection();
        lstTuesday.clearSelection();
        lstWednesday.clearSelection();
        lstThursday.clearSelection();
        lstSaturday.clearSelection();
        lstSunday.clearSelection();
    }//GEN-LAST:event_lstFridayMousePressed

    private void lstSaturdayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSaturdayMousePressed
        //Clears all selection from list box except current selected
        lstMonday.clearSelection();
        lstTuesday.clearSelection();
        lstWednesday.clearSelection();
        lstThursday.clearSelection();
        lstFriday.clearSelection();
        lstSunday.clearSelection(); 
    }//GEN-LAST:event_lstSaturdayMousePressed

    private void lstSundayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSundayMousePressed
        //Clears all selection from list box except current selected
        lstMonday.clearSelection();
        lstTuesday.clearSelection();
        lstWednesday.clearSelection();
        lstThursday.clearSelection();
        lstFriday.clearSelection();
        lstSaturday.clearSelection();
    }//GEN-LAST:event_lstSundayMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        
        if (lstMonday.getSelectedIndex() != -1){
            objMonday.remove(lstMonday.getSelectedIndex());
            lstMonday.remove(lstMonday.getSelectedIndex());
        } else if (lstTuesday.getSelectedIndex() != -1){
            objTuesday.remove(lstTuesday.getSelectedIndex());
            lstTuesday.remove(lstTuesday.getSelectedIndex());
        } else if (lstWednesday.getSelectedIndex() != -1){
            objWednesday.remove(lstWednesday.getSelectedIndex());
            lstWednesday.remove(lstWednesday.getSelectedIndex());
        } else if (lstThursday.getSelectedIndex() != -1){
            objThursday.remove(lstThursday.getSelectedIndex());
            lstThursday.remove(lstThursday.getSelectedIndex());
        } else if (lstFriday.getSelectedIndex() != -1){
            objFriday.remove(lstFriday.getSelectedIndex());
            lstFriday.remove(lstFriday.getSelectedIndex());
        } else if (lstSaturday.getSelectedIndex() != -1){
            objSaturday.remove(lstSaturday.getSelectedIndex());
            lstSaturday.remove(lstSaturday.getSelectedIndex());
        } else if (lstSunday.getSelectedIndex() != -1){
            objSunday.remove(lstSunday.getSelectedIndex());
            lstSunday.remove(lstSunday.getSelectedIndex());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNextWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextWeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextWeekActionPerformed

    
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
            java.util.logging.Logger.getLogger(TrainRHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainRHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainRHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainRHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TrainRHome().setVisible(true);
            }
        });
    }

    //auto generated dont touch
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComment;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLastWeek;
    private javax.swing.JButton btnNextWeek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblBMIInfo;
    private javax.swing.JLabel lblBMR;
    private javax.swing.JLabel lblBMRInfo;
    private javax.swing.JLabel lblCal;
    private javax.swing.JLabel lblGoal;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JList<String> lstFriday;
    private javax.swing.JList<String> lstMonday;
    private javax.swing.JList<String> lstSaturday;
    private javax.swing.JList<String> lstSunday;
    private javax.swing.JList<String> lstThursday;
    private javax.swing.JList<String> lstTuesday;
    private javax.swing.JList<String> lstWednesday;
    private javax.swing.JPanel panSettings;
    private javax.swing.JProgressBar prgGoal;
    private javax.swing.JTextField txtCalInput;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtGoal;
    // End of variables declaration//GEN-END:variables
}
