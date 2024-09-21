package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnect {
	
	public static void get_particulardata () throws SQLException {
		
		String Url = "jdbc:mysql://localhost:3306/employees";
        String userName = "root";
        String password = "Root@123";
        String query = "select * from employees";
        
	Connection connect = DriverManager.getConnection(Url, userName, password);
	
	Statement statement = connect.createStatement();
	
	ResultSet executeQuery = statement.executeQuery(query);
	
	executeQuery.next();
	
	//int employeeNumber = executeQuery.getInt(1);
	
	String firstName = executeQuery.getString(3);
	
	
	System.out.println(employeeNumber);
	
	return firstName;
	
	
	}
	
	
	
    public static void get_alldata () throws SQLException {
		
		String Url = "jdbc:mysql://localhost:3306/employees";
        String userName = "root";
        String password = "Root@123";
        String query = "select * from employees limit 10";
        
        //"select * from employees 
        
	Connection connect = DriverManager.getConnection(Url, userName, password);
	
	Statement statement = connect.createStatement();
	
	ResultSet executeQuery = statement.executeQuery(query);
	
	executeQuery.next();
	
	int employeeNumber = executeQuery.getInt(1);
	System.out.println(employeeNumber);
	}



	
	public static void main(String[] args) throws SQLException {
	//	get_particulardata ();
		get_alldata();
	}

}
