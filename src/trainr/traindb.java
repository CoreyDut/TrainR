/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainr;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author cdutkiewicz
 */
public class traindb {
    public traindb() throws ClassNotFoundException
    {
     Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL="jdbc:sqlserver://trainrserver.database.windows.net:1433;databaseName=traindata;user=trainrproject;password=Password123;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
        try{
        con =DriverManager.getConnection(connectionURL);
        System.out.println("Connection Is Good!");
        PreparedStatement st= con.prepareStatement("insert into traindata(username,fullname)values(?,?)");
        st.setString(1, "david115");
        st.setString(2,"jacob camp");
        int a = st.executeUpdate();
        if(a>0)
        {
            System.out.println("Row Update");
        }
        }      
        catch(SQLException e){
            System.out.println(e);
        }
        //return con;
        
        
    }
    
}
