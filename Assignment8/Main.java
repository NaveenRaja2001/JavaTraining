package jdbcproj;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String args[]) throws java.lang.ClassNotFoundException, SQLException {
		Connection connection = null;
		Statement statement = null;
		PreparedStatement updateSales;
		PreparedStatement updateTotal;
		String updateString = "update COFFEES " + "set SALES = ? where COF_NAME like ?";
		String updateStatement = "update COFFEES " + "set TOTAL = TOTAL + ? where COF_NAME like ?";
		String query = "select COF_NAME, SALES, TOTAL from COFFEES";

		try 
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb", "root", "rootroot");
			updateSales = connection.prepareStatement(updateString);
			updateTotal = connection.prepareStatement(updateStatement);
			int[] salesForWeek = { 150, 60, 155, 90 };
			String[] coffees = {  "French_Roast", "Espresso", "Colombian_Decaf", "French_Roast_Decaf" };
			int coffeelength = coffees.length;
			connection.setAutoCommit(false);
			
			for (int i = 0; i < coffeelength; i++) 
			{
				updateSales.setInt(1, salesForWeek[i]);
				updateSales.setString(2, coffees[i]);
				updateSales.executeUpdate();
				
				updateTotal.setInt(1, salesForWeek[i]);
				updateTotal.setString(2, coffees[i]);
				updateTotal.executeUpdate();
				
				connection.commit();
			}
			
			updateSales.close();
			updateTotal.close();
			
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			while (resultSet.next())
			{
				String coffeeName = resultSet.getString("COF_NAME");
				int sales = resultSet.getInt("SALES");
				int total = resultSet.getInt("TOTAL");
				System.out.println(coffeeName + "     " + sales + "    " + total);
			}
			
			
			
		} 
		catch (SQLException exception) 
		{
			System.err.println("SQLException: " + exception.getMessage());
			if (connection != null)
			{
				try 
				{
					System.err.print("Transaction is being ");
					System.err.println("rolled back");
					connection.rollback();
				} 
				
				catch (SQLException e) 
				{
					System.err.print("SQLException: ");
					System.err.println(e.getMessage());
				}
			}
		}
		finally {
			statement.close();
			connection.close();
		}
	}
}