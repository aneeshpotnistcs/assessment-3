package com.tcs.assessment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Account {
	private static final Logger logger = LoggerFactory.getLogger(Account.class);

	public static void main(String[] args) {

		String DB_URL = "jdbc:mysql://localhost/practice4";
		String DB_USER = "root";
		String DB_PASSWORD = "Nuvelabs123$";

		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement();) {
//			create(statement);
//			update(statement);
//			delete(statement);
			retrieve(statement);
			List<String> account = retrieveWithCondition(statement, "A%");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void delete(Statement statement) throws SQLException {
		statement.executeUpdate("Delete from Account where ACCOUNT_NUMBER=3");
	}

	private static List<String> retrieveWithCondition(Statement statement, String string) throws SQLException {
		ResultSet resultSet = statement.executeQuery("SELECT * from ACCOUNT where CUSTOMER_NAME LIKE 'A%'");
		List<String> account = new ArrayList<String>();
		while (resultSet.next()) {

			logger.debug("AccountNumber={}", resultSet.getInt(1));
			logger.debug(resultSet.getNString("CUSTOMER_NAME"));

		}
		return null;
	}

	private static void update(Statement statement) throws SQLException {
		statement.executeUpdate("Update ACCOUNT set CUSTOMER_NAME='ABC' where ACCOUNT_NUMBER=2");
	}

	private static void retrieve(Statement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery("SELECT * from ACCOUNT");
		List<String> account = new ArrayList<String>();
		while (resultSet.next()) {
			logger.debug("AccountNumber={}", resultSet.getInt(1));
			logger.debug("Balance={}", resultSet.getInt(4));
			logger.debug("CustomerNamer={}", resultSet.getNString("CUSTOMER_NAME"));
			account.add(resultSet.getNString("CUSTOMER_NAME"));
		}
	}

	private static void create(Statement statement) throws SQLException {
		statement.execute("INSERT INTO ACCOUNT VALUES(4,'Aneesh','Demat',200)");

	}
}
