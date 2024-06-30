package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOperations {

	static String url = "jdbc:mysql://localhost:3306";
	static String username = "root";
	static String password = "2002";

	public static ResultSet getValuesFromSQL(String query) throws SQLException {

		ResultSet resultset = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			resultset = statement.executeQuery(query);
		} catch (Exception e) {
			System.out.println(e);
		}
		return resultset;
	}

	public static String getOneValue(String query) throws SQLException {

		ResultSet resultset = null;
		String output = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			resultset = statement.executeQuery(query);

			while (resultset.next()) {
				output = resultset.getString(1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return output;
	}

	public static boolean executeStatement(String query) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			connection.close();

			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}
}
