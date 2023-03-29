package jdbcproj;

import java.sql.*;

class MakeConnection {
	
	java.sql.Connection connection;
	Statement statement;
	ResultSet resultSet;

	MakeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb", "root", "rootroot");
			statement = connection.createStatement();
			connection.setAutoCommit(false);
			int statementOneStatus = statement.executeUpdate("create table Iemploye(empno integer,ename varchar(20),deptno integer)");
			statement = connection.createStatement();
			int statementTwoStatus = statement.executeUpdate(" insert into employe values (001,'Naveen',34)");
			int statementThreeStatus = statement.executeUpdate(" insert into employe values (001,'Hari',1)");
			int statementFourStatus = statement.executeUpdate(" insert into employe values (001,'Ranjith',3)");
			resultSet = statement.executeQuery("select * from Iemploye");
			System.out.println(statementFourStatus);
			while (resultSet.next())
			{
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Connection {
	public static void main(String args[]) {
		new MakeConnection();
	}
}