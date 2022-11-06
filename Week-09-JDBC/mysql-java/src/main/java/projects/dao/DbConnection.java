package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {
	private static final String HOST = "localhost";
	private static final String PASSWORD = "project";
	private static final int PORT = 3306;
	private static final String SCHEMA = "project";
	private static final String USER = "project";
	
	public static Connection getConnection() {
		String uri = 
				String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",
						HOST, PORT, SCHEMA, USER, PASSWORD);
		System.out.println("Connecting with uri = " + uri);
		
		try {
			Connection conn = DriverManager.getConnection(uri);
			System.out.println("Successfully obtained connection!");
			return conn;
		} catch (SQLException e) {
			System.err.println("Error getting connection.");
			throw new DbException(e);
		}
	}
}
