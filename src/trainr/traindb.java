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
class traindb {
    public traindb() throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/traindata","train","train");
        PreparedStatement st= con.prepareStatement("insert into trainlogin(username,fullname)values(?,?)");
        st.setString(1, "david115");
        st.setString(2,"jacob camp");
        int a = st.executeUpdate();
        if(a>0)
        {
            System.out.println("ROW UPDATE");
        }
    }
    
}
