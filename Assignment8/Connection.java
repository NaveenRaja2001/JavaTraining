package jdbcproj;

import java.sql.*;

class MakeConnection {
	
	java.sql.Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/acedb", "root", "rootroot");
			stmt = con.createStatement();
			int i = stmt.executeUpdate("create table employe(empno integer,ename varchar(20),deptno integer)");
			stmt = con.createStatement();
			int i1 = stmt.executeUpdate(" insert into employe values (001,'Naveen',34)");
			int i2 = stmt.executeUpdate(" insert into employe values (001,'Hari',1)");
			int i3 = stmt.executeUpdate(" insert into employe values (001,'Ranjith',3)");
			rs = stmt.executeQuery("select * from employe");
			while (rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
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