package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyProgram {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject",
						"root","Padhu@12456");
				Statement s= con.createStatement();
				s.executeUpdate("create table emp(eno int primary key,ename varchar(40),esal int)");
				String name="Ramesh";
				int esal=30000;
				String Query="insert into emp(ename,esal)values("+name+","+esal+")";
				System.out.println(Query);
				
				s.close();
				con.close();			
			} catch (ClassNotFoundException e) {
				
				System.out.println("You forgot to attache driver class");
			} catch (SQLException e) {
				System.out.println("Check database or credentials of database");
			}
			
		
		
		 
	}

}
