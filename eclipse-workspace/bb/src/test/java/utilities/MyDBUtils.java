package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utilities.Environment;

public class MyDBUtils {
	public static void main(String[] args) {
		createConnection();
		String query = "select * from employees where department_id = 90;";
		System.out.println(getColumnData(query, "last_name"));
		destroy();
		
	}
	
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	
public static void createConnection() {
	String odbhost = Environment.DB_HOST;
	String odbuser = Environment.DB_USERNAME;
	String odbpwd = Environment.DB_PASSWORD;
	try {
		connection = DriverManager.getConnection(odbhost, odbuser, odbpwd);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static List<Object> getColumnData(String query, String column) {
	executeQuery(query);
	List<Object> rowList = new ArrayList<>();
	ResultSetMetaData rsmd;

	try {
		rsmd = resultSet.getMetaData();
		while (resultSet.next()) {
			rowList.add(resultSet.getObject(column));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return rowList;

}
private static void executeQuery(String query) {
	try {
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		resultSet = statement.executeQuery(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void destroy() {
	try {
		if (resultSet != null) {
			resultSet.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}

}
}
