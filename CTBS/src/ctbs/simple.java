/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctbs;
import java.sql.*;  

/**
 *
 * @author ujwal
 */
public class simple {
    
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/datab","root","password");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from test");  
while(rs.next())  
System.out.println(rs.getString(1));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  