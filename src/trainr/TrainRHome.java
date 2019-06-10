package trainr;
//Imports TrainRLogin Class from different file.
import trainr.TrainRBMI;

//Get todays date and formats it mm/dd/yyyy
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//File imports
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TrainRHome extends javax.swing.JFrame {

    /*Gets new instance of TrainRBMI class so it can be referenced 
    in this class.*/
    static TrainRBMI TrainRBMI = new TrainRBMI();
    
    //Gets todays date and formats in mm/dd/yyyy, then stores in variable
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    LocalDate localDate = LocalDate.now();
    String date = (dtf.format(localDate)); //05/28/2019
    
    /*
    //Creates an array to store file values
    String[] filelines;
    filelines = new String[4];
    //Creates a counter to append values to array
    int i = 0;

    //Sets reader for the file and reads it
    BufferedReader br = null; 
    try {
        // Pulls/find the text file to get values
        File file = new File("SignUp" + "_" + txtUserLogin.getText() + ".txt");
        br = new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException ex) {
        Logger.getLogger(TrainRLogin.class.getName())
                .log(Level.SEVERE, null, ex);
    }

    //String to temp store file lines into
    String st;
    try {
        //Reads all lines up until there are no more lines
        while ((st = br.readLine()) != null){
            //Stores file lines into array
            filelines[i] = st;
            i += 1;
        }
    } catch (IOException ex) {
        /*Displays popup message that there is an invalid username
          becuase they can not find file or one doesn't match.
        JOptionPane.showMessageDialog(null,
                "Please enter a valid username!");
    }
    */
    
    
    // Creates new form TrainRHome
    public TrainRHome() {
        initComponents();
    }

    //Initialized when form and program are loaded
    //This info is auto generated, do not change.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCal = new javax.swing.JLabel();
        txtGoal = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        lblGoal = new javax.swing.JLabel();
        panSettings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSunday = new javax.swing.JList<>();
        progbar = new javax.swing.JProgressBar();
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
        setSize(new java.awt.Dimension(773, 600));
        getContentPane().setLayout(null);

        lblCal.setText("Kcal.");
        getContentPane().add(lblCal);
        lblCal.setBounds(310, 10, 31, 14);

        txtGoal.setText("jTextField1");
        getContentPane().add(txtGoal);
        txtGoal.setBounds(240, 10, 59, 20);

        lblName1.setText("NAME");
        getContentPane().add(lblName1);
        lblName1.setBounds(10, 10, 31, 14);

        lblGoal.setText("Goal:");
        getContentPane().add(lblGoal);
        lblGoal.setBounds(200, 10, 31, 14);

        panSettings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Settings");
        panSettings.add(jLabel1);

        getContentPane().add(panSettings);
        panSettings.setBounds(390, 10, 190, 100);

        lstSunday.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sunday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstSunday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstSunday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstSunday.setPreferredSize(new java.awt.Dimension(100, 75));
        jScrollPane1.setViewportView(lstSunday);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(660, 130, 110, 260);

        progbar.setString("50%");
        getContentPane().add(progbar);
        progbar.setBounds(190, 40, 146, 14);

        lblProgress.setText("Progress:");
        getContentPane().add(lblProgress);
        lblProgress.setBounds(130, 40, 50, 14);

        lstMonday.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Monday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstMonday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstMonday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstMonday.setPreferredSize(new java.awt.Dimension(100, 75));
        jScrollPane2.setViewportView(lstMonday);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 130, 110, 260);

        lstTuesday.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tuesday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstTuesday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstTuesday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstTuesday.setPreferredSize(new java.awt.Dimension(100, 75));
        jScrollPane3.setViewportView(lstTuesday);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(110, 130, 110, 260);

        lstWednesday.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Wednesday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstWednesday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstWednesday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstWednesday.setPreferredSize(new java.awt.Dimension(100, 75));
        jScrollPane4.setViewportView(lstWednesday);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(220, 130, 110, 260);

        lstThursday.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Thursday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstThursday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstThursday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstThursday.setPreferredSize(new java.awt.Dimension(100, 75));
        jScrollPane5.setViewportView(lstThursday);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(330, 130, 110, 260);

        lstFriday.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Friday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstFriday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstFriday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstFriday.setPreferredSize(new java.awt.Dimension(100, 75));
        jScrollPane6.setViewportView(lstFriday);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(440, 130, 110, 260);

        lstSaturday.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Saturday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstSaturday.setMaximumSize(new java.awt.Dimension(100, 75));
        lstSaturday.setMinimumSize(new java.awt.Dimension(100, 75));
        lstSaturday.setPreferredSize(new java.awt.Dimension(100, 75));
        jScrollPane7.setViewportView(lstSaturday);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(550, 130, 110, 260);

        btnNextWeek.setText("Next Week");
        getContentPane().add(btnNextWeek);
        btnNextWeek.setBounds(650, 460, 90, 23);

        btnLastWeek.setText("Last Week");
        btnLastWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastWeekActionPerformed(evt);
            }
        });
        getContentPane().add(btnLastWeek);
        btnLastWeek.setBounds(20, 470, 80, 23);
        getContentPane().add(txtCalInput);
        txtCalInput.setBounds(350, 400, 60, 20);

        jLabel2.setText("Kcal Input:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 400, 60, 14);

        lblBMRInfo.setText("BMR:");
        getContentPane().add(lblBMRInfo);
        lblBMRInfo.setBounds(270, 480, 31, 14);

        lblBMR.setText("0");
        getContentPane().add(lblBMR);
        lblBMR.setBounds(310, 480, 6, 14);

        lblBMIInfo.setText("BMI:");
        getContentPane().add(lblBMIInfo);
        lblBMIInfo.setBounds(270, 450, 22, 14);

        lblBMI.setText("0");
        getContentPane().add(lblBMI);
        lblBMI.setBounds(310, 450, 6, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLastWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastWeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastWeekActionPerformed

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
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JList<String> lstFriday;
    private javax.swing.JList<String> lstMonday;
    private javax.swing.JList<String> lstSaturday;
    private javax.swing.JList<String> lstSunday;
    private javax.swing.JList<String> lstThursday;
    private javax.swing.JList<String> lstTuesday;
    private javax.swing.JList<String> lstWednesday;
    private javax.swing.JPanel panSettings;
    private javax.swing.JProgressBar progbar;
    private javax.swing.JTextField txtCalInput;
    private javax.swing.JTextField txtGoal;
    // End of variables declaration//GEN-END:variables
}
