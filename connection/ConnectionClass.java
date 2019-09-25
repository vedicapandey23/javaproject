package com.nucleus.connection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionClass {
	Connection conn=null;
	public Connection getconnection()
	{ 
		
	// using property file for connections
			try {
				FileReader fileReader=new FileReader("C:\\Users\\temp\\Desktop\\propertyfile.properties");//location of.properties file
				Properties properties=new Properties(); //creating object of Properties class
				properties.load(fileReader); //method of Properties class
				String string1=properties.getProperty("connection"); //key value
				String string2=properties.getProperty("driver");//key value
				Class.forName(string1); 
				conn=DriverManager.getConnection(string2,properties.getProperty("username"),properties.getProperty("password"));
				
			} 
			catch (IOException| SQLException |ClassNotFoundException e3)
			{
	
				e3.printStackTrace();
			}


		
		return conn;
	}
	
	public void closeDBConnection()
	{
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
