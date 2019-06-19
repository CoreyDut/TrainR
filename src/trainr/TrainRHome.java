package trainr;
//Imports TrainRLogin Class from different file.
import java.text.SimpleDateFormat;
import trainr.TrainRBMI;
import trainr.Goal_Calculate;

//Get todays date and formats it mm/dd/yyyy
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class TrainRHome extends javax.swing.JFrame {

    /*Gets new instance of TrainRBMI class so it can be referenced 
    in this class.*/
    static TrainRBMI TrainRBMI = new TrainRBMI();
    
    /*Gets new instance of Goal_Calculate class so it can be referenced 
    in this class.*/
    static Goal_Calculate Goal_Calculate = new Goal_Calculate();
    
    //Gets todays date and formats in mm/dd/yyyy, then stores in variable
    Date now = new Date();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/dd/yy");
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
    
    int calories = 20000; //from database
    int weeks = 20; //from database
    int dailyCal = (calories / weeks) / 7; //calculates daily calorie value
    //Start with two so be 100% when complete
    int progressWeekly = 2;
    String dailyStrCal = Integer.toString(dailyCal);
    //Week Counter
    int weekCounter = 1;
    
    // Creates new form TrainRHome
    public TrainRHome() {
        initComponents();
        
        Start();
    }

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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSunday = new javax.swing.JList<String>();
        prgGoalWeekly = new javax.swing.JProgressBar();
        lblProgress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMonday = new javax.swing.JList<String>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstTuesday = new javax.swing.JList<String>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstWednesday = new javax.swing.JList<String>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstThursday = new javax.swing.JList<String>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstFriday = new javax.swing.JList<String>();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstSaturday = new javax.swing.JList<String>();
        btnNextWeek = new javax.swing.JButton();
        btnLastWeek = new javax.swing.JButton();
        lblBMRInfo = new javax.swing.JLabel();
        lblBMR = new javax.swing.JLabel();
        lblBMIInfo = new javax.swing.JLabel();
        lblBMI = new javax.swing.JLabel();
        lblProgress1 = new javax.swing.JLabel();
        prgGoalTotal = new javax.swing.JProgressBar();
        lblProgress2 = new javax.swing.JLabel();
        lblProgress3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrainR");
        setBounds(new java.awt.Rectangle(0, 23, 950, 800));
        setPreferredSize(new java.awt.Dimension(1078, 800));
        setSize(new java.awt.Dimension(864, 600));
        getContentPane().setLayout(null);

        lblCal.setText("Kcal.");
        getContentPane().add(lblCal);
        lblCal.setBounds(400, 10, 31, 14);

        txtGoal.setEnabled(false);
        getContentPane().add(txtGoal);
        txtGoal.setBounds(310, 0, 80, 40);

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblName.setText("NAME");
        getContentPane().add(lblName);
        lblName.setBounds(60, 10, 60, 24);

        lblGoal.setText("Goal:");
        getContentPane().add(lblGoal);
        lblGoal.setBounds(270, 10, 40, 14);

        panSettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panSettings.setLayout(null);

        jLabel1.setText("Settings");
        panSettings.add(jLabel1);
        jLabel1.setBounds(40, 10, 60, 14);

        btnComment.setForeground(new java.awt.Color(0, 204, 0));
        btnComment.setText("New Comment");
        btnComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentActionPerformed(evt);
            }
        });
        panSettings.add(btnComment);
        btnComment.setBounds(130, 40, 120, 23);
        panSettings.add(txtComment);
        txtComment.setBounds(10, 40, 100, 50);

        btnDelete.setForeground(new java.awt.Color(255, 51, 51));
        btnDelete.setText("Delete Comment");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panSettings.add(btnDelete);
        btnDelete.setBounds(130, 70, 120, 23);

        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Set New Goal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panSettings.add(jButton1);
        jButton1.setBounds(130, 10, 120, 23);

        getContentPane().add(panSettings);
        panSettings.setBounds(460, 10, 260, 100);

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
        jScrollPane1.setBounds(920, 130, 150, 260);

        prgGoalWeekly.setString("50%");
        getContentPane().add(prgGoalWeekly);
        prgGoalWeekly.setBounds(240, 40, 146, 14);

        lblProgress.setText("Weekly");
        getContentPane().add(lblProgress);
        lblProgress.setBounds(390, 40, 50, 14);

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
        jScrollPane2.setBounds(10, 130, 150, 260);

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
        jScrollPane3.setBounds(160, 130, 150, 260);

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
        jScrollPane4.setBounds(310, 130, 150, 260);

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
        jScrollPane5.setBounds(460, 130, 150, 260);

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
        jScrollPane6.setBounds(610, 130, 160, 260);

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
        jScrollPane7.setBounds(770, 130, 150, 260);

        btnNextWeek.setForeground(new java.awt.Color(0, 0, 255));
        btnNextWeek.setText("Next Week");
        btnNextWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextWeekActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextWeek);
        btnNextWeek.setBounds(780, 420, 110, 23);

        btnLastWeek.setForeground(new java.awt.Color(0, 0, 255));
        btnLastWeek.setText("Last Week");
        btnLastWeek.setEnabled(false);
        btnLastWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastWeekActionPerformed(evt);
            }
        });
        getContentPane().add(btnLastWeek);
        btnLastWeek.setBounds(170, 420, 100, 23);

        lblBMRInfo.setText("BMR:");
        getContentPane().add(lblBMRInfo);
        lblBMRInfo.setBounds(480, 430, 31, 14);

        lblBMR.setText("0");
        getContentPane().add(lblBMR);
        lblBMR.setBounds(520, 430, 50, 14);

        lblBMIInfo.setText("BMI:");
        getContentPane().add(lblBMIInfo);
        lblBMIInfo.setBounds(480, 400, 22, 14);

        lblBMI.setText("0");
        getContentPane().add(lblBMI);
        lblBMI.setBounds(520, 400, 50, 14);

        lblProgress1.setText("Progress:");
        getContentPane().add(lblProgress1);
        lblProgress1.setBounds(180, 40, 60, 14);

        prgGoalTotal.setString("50%");
        getContentPane().add(prgGoalTotal);
        prgGoalTotal.setBounds(240, 60, 146, 14);

        lblProgress2.setText("Total");
        getContentPane().add(lblProgress2);
        lblProgress2.setBounds(390, 60, 50, 14);

        lblProgress3.setText("Progress:");
        getContentPane().add(lblProgress3);
        lblProgress3.setBounds(180, 60, 60, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("-Type \"complete\" to \ncomplete daily goal.\n-Hit day of week to add\ncomment.\n-Select comment to delete.");
        jScrollPane9.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(730, 10, 230, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainr/home 3.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 500, 110, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainr/home 4.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 490, 140, 110);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainr/home 5.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 490, 100, 100);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainr/home2.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(930, 490, 100, 100);

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 40)); // NOI18N
        jLabel7.setText("Strive For Progress Not Perfection");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 610, 730, 52);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainr/home .png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 490, 100, 100);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 1140, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLastWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastWeekActionPerformed
        //This code will make a fresh start for the next week            
        weekCounter -= 1;
        
        Clear();
        
        if (weekCounter == 1){
            Start();
        } else{
            Next();
        }

        if (weekCounter < weeks){
            btnNextWeek.setEnabled(true);
        }
        
        if (weekCounter <= 1){
            btnLastWeek.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnLastWeekActionPerformed

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentActionPerformed
       if (lstMonday.getSelectedIndex() != -1){
            objMonday.addElement(txtComment.getText());
            lstMonday.setModel(objMonday);
            if (txtComment.getText().equals("complete")){
                progressWeekly += 14;
                prgGoalWeekly.setValue(progressWeekly);
            }
        } else if (lstTuesday.getSelectedIndex() != -1){
            objTuesday.addElement(txtComment.getText());
            lstTuesday.setModel(objTuesday);
            if (txtComment.getText().equals("complete")){
                progressWeekly += 14;
                prgGoalWeekly.setValue(progressWeekly);
            }
        } else if (lstWednesday.getSelectedIndex() != -1){
            objWednesday.addElement(txtComment.getText());
            lstWednesday.setModel(objWednesday);
            if (txtComment.getText().equals("complete")){
                progressWeekly += 14;
                prgGoalWeekly.setValue(progressWeekly);
            }
        } else if (lstThursday.getSelectedIndex() != -1){
            objThursday.addElement(txtComment.getText());
            lstThursday.setModel(objThursday);
            if (txtComment.getText().equals("complete")){
                progressWeekly += 14;
                prgGoalWeekly.setValue(progressWeekly);
            }
        } else if (lstFriday.getSelectedIndex() != -1){
            objFriday.addElement(txtComment.getText());
            lstFriday.setModel(objFriday);
            if (txtComment.getText().equals("complete")){
                progressWeekly += 14;
                prgGoalWeekly.setValue(progressWeekly);
            }
        } else if (lstSaturday.getSelectedIndex() != -1){
            objSaturday.addElement(txtComment.getText());
            lstSaturday.setModel(objSaturday);
            if (txtComment.getText().equals("complete")){
                progressWeekly += 14;
                prgGoalWeekly.setValue(progressWeekly);
            }
        } else if (lstSunday.getSelectedIndex() != -1){
            objSunday.addElement(txtComment.getText());
            lstSunday.setModel(objSunday);
            if (txtComment.getText().equals("complete")){
                progressWeekly += 14;
                prgGoalWeekly.setValue(progressWeekly);
            }
        }
        
        txtComment.setText("");
        
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
        if ((lstMonday.getSelectedIndex() != -1) && 
                (lstMonday.getSelectedIndex() != 0) && 
                (lstMonday.getSelectedIndex() != 1)){
            objMonday.remove(lstMonday.getSelectedIndex());
            lstMonday.remove(lstMonday.getSelectedIndex());
        } else if ((lstTuesday.getSelectedIndex() != -1) && 
                (lstTuesday.getSelectedIndex() != 0) && 
                (lstTuesday.getSelectedIndex() != 1)){
            objTuesday.remove(lstTuesday.getSelectedIndex());
            lstTuesday.remove(lstTuesday.getSelectedIndex());
        } else if ((lstWednesday.getSelectedIndex() != -1) && 
                (lstWednesday.getSelectedIndex() != 0) && 
                (lstWednesday.getSelectedIndex() != 1)){
            objWednesday.remove(lstWednesday.getSelectedIndex());
            lstWednesday.remove(lstWednesday.getSelectedIndex());
        } else if ((lstThursday.getSelectedIndex() != -1) && 
                (lstThursday.getSelectedIndex() != 0) && 
                (lstThursday.getSelectedIndex() != 1)){
            objThursday.remove(lstThursday.getSelectedIndex());
            lstThursday.remove(lstThursday.getSelectedIndex());
        } else if ((lstFriday.getSelectedIndex() != -1) && 
                (lstFriday.getSelectedIndex() != 0) && 
                (lstFriday.getSelectedIndex() != 1)){
            objFriday.remove(lstFriday.getSelectedIndex());
            lstFriday.remove(lstFriday.getSelectedIndex());
        } else if ((lstSaturday.getSelectedIndex() != -1) && 
                (lstSaturday.getSelectedIndex() != 0) && 
                (lstSaturday.getSelectedIndex() != 1)){
            objSaturday.remove(lstSaturday.getSelectedIndex());
            lstSaturday.remove(lstSaturday.getSelectedIndex());
        } else if ((lstSunday.getSelectedIndex() != -1) && 
                (lstSunday.getSelectedIndex() != 0) && 
                (lstSunday.getSelectedIndex() != 1)){
            objSunday.remove(lstSunday.getSelectedIndex());
            lstSunday.remove(lstSunday.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(null,
                    "You do not have permission to delete this value!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNextWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextWeekActionPerformed
        
        //This code will make a fresh start for the next week            
        weekCounter += 1;
        
        Next();

        if (weekCounter >= weeks){
            btnNextWeek.setEnabled(false);
        }
        
        if (weekCounter > 1){
            btnLastWeek.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnNextWeekActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Goal_Calculate gc = new Goal_Calculate();
        gc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
 
    private void Clear(){
        objMonday.clear();
        lstMonday.removeAll();
        objTuesday.clear();
        lstTuesday.removeAll();
        objWednesday.clear();
        lstWednesday.removeAll(); 
        objThursday.clear();
        lstThursday.removeAll();    
        objFriday.clear();
        lstFriday.removeAll();      
        objSaturday.clear();
        lstSaturday.removeAll();       
        objSunday.clear();
        lstSunday.removeAll();
    }
    
    private void Next(){
        prgGoalWeekly.setValue(2);
        txtComment.setText("");
        
        Clear();
        
        objMonday.addElement("Monday");
        objMonday.addElement(dailyStrCal);
        lstMonday.setModel(objMonday);

        objTuesday.addElement("Tuesday");
        objTuesday.addElement(dailyStrCal);
        lstTuesday.setModel(objTuesday);

        objWednesday.addElement("Wednesday");
        objWednesday.addElement(dailyStrCal);
        lstWednesday.setModel(objWednesday);

        objThursday.addElement("Thursday");
        objThursday.addElement(dailyStrCal);
        lstThursday.setModel(objThursday);

        objFriday.addElement("Friday");
        objFriday.addElement(dailyStrCal);
        lstFriday.setModel(objFriday);

        objSaturday.addElement("Saturday");
        objSaturday.addElement(dailyStrCal);
        lstSaturday.setModel(objSaturday);

        objSunday.addElement("Sunday");
        objSunday.addElement(dailyStrCal);
        lstSunday.setModel(objSunday);
    }
    
    private void Start() {
        lblName.setText("Seth"); //Name from database store here
        txtGoal.setText(Integer.toString(calories)); //Goal from database / from Goal_calculate 
        //stored here
        prgGoalWeekly.setString("0"); //for now this will be 0. It will update as
        //goal is being completed.
        lblBMI.setText("17"); //BMI from database. will update too
        lblBMR.setText("1000"); //BMR from database. will uddate too
        
        //simpleDateformat.format(now)
        
        //Starts all list box with the days below and the current day with date
        if (simpleDateformat.format(now).equals("Monday")){
            objMonday.addElement("Monday " + date);
            objMonday.addElement(dailyStrCal);
            objMonday.addElement("Today");
            lstMonday.setModel(objMonday);
        } else {
            objMonday.addElement("Monday");
            objMonday.addElement(dailyStrCal);
            lstMonday.setModel(objMonday);
        }
        
        if (simpleDateformat.format(now).equals("Tuesday")){
            objTuesday.addElement("Tuesday " + date);
            objTuesday.addElement(dailyStrCal);
            objTuesday.addElement("Today");
            lstTuesday.setModel(objTuesday);
        } else {
            objTuesday.addElement("Tuesday");
            objTuesday.addElement(dailyStrCal);
            lstTuesday.setModel(objTuesday);
        }
        
        if (simpleDateformat.format(now).equals("Wednesday")){
            objWednesday.addElement("Wednesday " + date);
            objWednesday.addElement(dailyStrCal);
            objWednesday.addElement("Today");
            lstWednesday.setModel(objWednesday);
        } else {
            objWednesday.addElement("Wednesday");
            objWednesday.addElement(dailyStrCal);
            lstWednesday.setModel(objWednesday);
        }
        
        if (simpleDateformat.format(now).equals("Thursday")){
            objThursday.addElement("Thursday " + date);
            objThursday.addElement(dailyStrCal);
            objThursday.addElement("Today");
            lstThursday.setModel(objThursday);
        } else {
            objThursday.addElement("Thursday");
            objThursday.addElement(dailyStrCal);
            lstThursday.setModel(objThursday);
        }
        
        if (simpleDateformat.format(now).equals("Friday")){
            objFriday.addElement("Friday " + date);
            objFriday.addElement(dailyStrCal);
            objFriday.addElement("Today");
            lstFriday.setModel(objFriday);
        } else {
            objFriday.addElement("Friday");
            objFriday.addElement(dailyStrCal);
            lstFriday.setModel(objFriday);
        }

        if (simpleDateformat.format(now).equals("Saturday")){
            objSaturday.addElement("Saturday " + date);
            objSaturday.addElement(dailyStrCal);
            objSaturday.addElement("Today");
            lstSaturday.setModel(objSaturday);
        } else {
            objSaturday.addElement("Saturday");
            objSaturday.addElement(dailyStrCal);
            lstSaturday.setModel(objSaturday);
        }
        
        if (simpleDateformat.format(now).equals("Sunday")){
            objSunday.addElement("Sunday " + date);
            objSunday.addElement(dailyStrCal);
            objSunday.addElement("Today");
            lstSunday.setModel(objSunday);
        } else {
            objSunday.addElement("Sunday");
            objSunday.addElement(dailyStrCal);
            lstSunday.setModel(objSunday);
        }
    }
    
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblBMIInfo;
    private javax.swing.JLabel lblBMR;
    private javax.swing.JLabel lblBMRInfo;
    private javax.swing.JLabel lblCal;
    private javax.swing.JLabel lblGoal;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JLabel lblProgress1;
    private javax.swing.JLabel lblProgress2;
    private javax.swing.JLabel lblProgress3;
    private javax.swing.JList<String> lstFriday;
    private javax.swing.JList<String> lstMonday;
    private javax.swing.JList<String> lstSaturday;
    private javax.swing.JList<String> lstSunday;
    private javax.swing.JList<String> lstThursday;
    private javax.swing.JList<String> lstTuesday;
    private javax.swing.JList<String> lstWednesday;
    private javax.swing.JPanel panSettings;
    private javax.swing.JProgressBar prgGoalTotal;
    private javax.swing.JProgressBar prgGoalWeekly;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtGoal;
    // End of variables declaration//GEN-END:variables
}