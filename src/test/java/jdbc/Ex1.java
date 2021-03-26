package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
String  url="jdbc:mysql://localhost:3306/world";
String  username="root";
String password="Root";
String query="select * from world.employee";
//load the driver
Class.forName("com.mysql.cj.jdbc.Driver");
//create the connection
Connection connect = DriverManager.getConnection(url, username, password);
	//create statement object for query
Statement state = connect.createStatement();
//execute query
ResultSet rS = state.executeQuery(query);
while(rS.next()) {
	String string = rS.getString(3);
	if (string.equalsIgnoreCase("thenkasi")) {
		System.out.println(string);
	}
}
	
	
	}

}
