package trainr;

//Popup display imports
import javax.swing.JOptionPane;

//File imports
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrainRLogin extends javax.swing.JFrame {
    
    //Creates new login form and stores into new class instance
    static TrainRLogin l = new TrainRLogin();
    
    //Creates new BMI form and stores into new class instance
    public TrainRBMI b = new TrainRBMI();
    
    //Creates new home form and stores into new class instance
    public TrainRHome h = new TrainRHome();

    //Creates new form TrainR
    public TrainRLogin() {
        initComponents();
    }

    //Initialized when form and program are loaded
    //This info is auto generated, do not change.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        lblUserLogin = new javax.swing.JLabel();
        lblPasswordLogin = new javax.swing.JLabel();
        txtPasswordLogin = new javax.swing.JTextField();
        txtUserLogin = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        lblCreateAccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrainR Login");
        setBackground(new java.awt.Color(0, 0, 250));
        setName("frmLogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        btnLogin.setText("Login");
        btnLogin.setName("btnLogin"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(477, 160, 70, 21);

        lblUserLogin.setText("Username: ");
        lblUserLogin.setName("lblUserLogin"); // NOI18N
        getContentPane().add(lblUserLogin);
        lblUserLogin.setBounds(310, 50, 70, 13);

        lblPasswordLogin.setText("Password: ");
        lblPasswordLogin.setName("lblPasswordLogin"); // NOI18N
        getContentPane().add(lblPasswordLogin);
        lblPasswordLogin.setBounds(310, 100, 70, 13);

        txtPasswordLogin.setFont(new java.awt.Font("Symbol", 0, 10)); // NOI18N
        txtPasswordLogin.setName("txtPasswordLogin"); // NOI18N
        txtPasswordLogin.setNextFocusableComponent(btnLogin);
        getContentPane().add(txtPasswordLogin);
        txtPasswordLogin.setBounds(400, 100, 150, 30);

        txtUserLogin.setName("txtUserLogin"); // NOI18N
        txtUserLogin.setNextFocusableComponent(lblPasswordLogin);
        getContentPane().add(txtUserLogin);
        txtUserLogin.setBounds(400, 50, 100, 30);

        btnSubmit.setText("Submit");
        btnSubmit.setName("btnSubmit"); // NOI18N
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(160, 250, 90, 21);

        lblName.setText("Full Name: ");
        lblName.setName("lblName"); // NOI18N
        getContentPane().add(lblName);
        lblName.setBounds(10, 50, 70, 13);

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblLogin.setText("Login");
        lblLogin.setToolTipText("");
        lblLogin.setName("lblLogin"); // NOI18N
        getContentPane().add(lblLogin);
        lblLogin.setBounds(310, 10, 30, 13);

        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.setMaximumSize(new java.awt.Dimension(50, 50));
        txtName.setMinimumSize(new java.awt.Dimension(1, 1));
        txtName.setName("txtName"); // NOI18N
        txtName.setNextFocusableComponent(lblEmail);
        txtName.setPreferredSize(new java.awt.Dimension(7, 25));
        getContentPane().add(txtName);
        txtName.setBounds(100, 50, 100, 30);

        lblEmail.setText("Email: ");
        lblEmail.setName("lblEmail"); // NOI18N
        getContentPane().add(lblEmail);
        lblEmail.setBounds(10, 100, 40, 13);

        txtEmail.setName("txtEmail"); // NOI18N
        txtEmail.setNextFocusableComponent(lblUser);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(100, 100, 150, 30);

        lblUser.setText("Username: ");
        lblUser.setName("lblUser"); // NOI18N
        getContentPane().add(lblUser);
        lblUser.setBounds(10, 150, 70, 13);

        lblPassword.setText("Password: ");
        lblPassword.setName("lblPassword"); // NOI18N
        getContentPane().add(lblPassword);
        lblPassword.setBounds(10, 200, 70, 13);

        txtPassword.setFont(new java.awt.Font("Symbol", 0, 10)); // NOI18N
        txtPassword.setName("txtPassword"); // NOI18N
        txtPassword.setNextFocusableComponent(btnSubmit);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(100, 200, 150, 30);

        txtUser.setName("txtUser"); // NOI18N
        txtUser.setNextFocusableComponent(lblPassword);
        getContentPane().add(txtUser);
        txtUser.setBounds(100, 150, 100, 30);

        lblCreateAccount.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblCreateAccount.setText("Create Account");
        lblCreateAccount.setToolTipText("");
        lblCreateAccount.setName("lblCreateAccount"); // NOI18N
        getContentPane().add(lblCreateAccount);
        lblCreateAccount.setBounds(10, 10, 90, 13);

        getAccessibleContext().setAccessibleName("frmLogin");
        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
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
              becuase they can not find file or one doesn't match.*/
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid username!");
        }
        
        //Create boolean to show if there are errors
        boolean error = false;
        
        //This checks to see if user in file matches user in textbox
        if(!filelines[2].equals(txtUserLogin.getText())){
            /*Displays popup message that there is an invalid username
              The invalid username will not match.*/
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid username!");
            //This shows that there is an error
            error = true;

        
        //This checks to see if password in file matches password in textbox
        } if(!filelines[3].equals(txtPasswordLogin.getText())){
            /*Displays popup message that there is an invalid password
              The invalid password will not match.*/
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid password!");
            //This shows that there is an error
            error = true;
        
        //If there are not any errors then it will continue to the next form.
        } if (error == false){
            //This will get rid of the login form
            l.dispose();
            //This will open bmi form
            h.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        //Create boolean to show if there are errors
        boolean error = false;
        
        /*Limits between 4-50 characters, allowing one space and 
          lower, upper case letters. */
        if(!txtName.getText().matches("^[a-zA-Z ]*{4,50}$")){
            /*Displays popup message that there is an invalid name
              The invalid name will contain a field that is not listed in
              above comment.*/
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid name!");
            //This shows that there is an error
            error = true;
            
        /*Limits between 2-50 characters, only allowing email formats similar
          to user.name@host.com .*/
        }else if(!txtEmail.getText().matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,50}$")){
            /*Displays popup message that there is an invalid email
              that it is improper format*/
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid email!");
            //This shows that there is an error
            error = true;
            
        /*Limits between 6-15 characters, allowing one space and 
          lower, upper case letters. */
        }else if(!txtUser.getText().matches("^[a-zA-Z0-9]{6,15}$")){
            /*Displays popup message that there is an invalid username
              The invalid username will contain a field that is not listed in
              above comment.*/
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid username!");
            //This shows that there is an error
            error = true;
            
        /*Limits between 8-15 characters, must have at least one
          lower and upper case letter, special character "@","#","$","%","^",
          "&","+","=","!", no space, and one number. */
        }else if(!txtPassword.getText().matches("^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=!])(?=\\S+$).{8,15}$")){
            /*Displays popup message that there is an invalid password
              The invalid password will contain a field that is not listed in
              above comment.*/
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid password!");
            //This shows that there is an error
            error = true;
            
        /*If all field are checked and no errors came up then make sure it stays
        no errors. */
        }else {
            error = false;
        }
        
        //If there are not any errors then it will continue to the next form.
        if (error == false){
            //This will get rid of the login form
            l.dispose();
            //This will open bmi form
            b.setVisible(true);
        }
        
        //This will save the text information into a file
        PrintWriter printWriter = null;
        
        try {
            //Creates new file each time
            printWriter = new PrintWriter("SignUp" + "_" + txtUser.getText() + ".txt");
            
            //Takes in all textbox fields and saves into file
            printWriter.println(txtName.getText());
            printWriter.println(txtEmail.getText());
            printWriter.println(txtUser.getText());
            printWriter.print(txtPassword.getText());
            
            printWriter.close ();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TrainRLogin.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //Start of Database portion of this class 
       //this is the declaration of which values go to which dataset
       String username= txtUser.getText();
       String password= txtPassword.getText();
       String fullname= txtName.getText();
       String email= txtEmail.getText();
       PreparedStatement st= null;
       Connection conn= null;
       //end of declaration 
       
       //this inserts data, catches any errors that are thrown, and establishes a connection to the DB 
       try {
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/traindata","train","train");
        st= conn.prepareStatement("insert into trainlogin(username,fullname,email,password)values(?,?,?,?)");
        st.setString(1, username);
        st.setString(2,fullname);
        st.setString(3, email);
        st.setString(4, password);
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
       //End of Database portion of this class 
        
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(TrainRLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainRLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainRLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainRLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                l.setVisible(true);
            }
        });
    }
    
    //auto generated dont touch
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordLogin;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserLogin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPasswordLogin;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUserLogin;
    // End of variables declaration//GEN-END:variables
}
