	package database.java.application;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.swing.JTextArea;

	public class CarSQL {
		private String sql = new String();
		private ResultSet rs;
		private JTextArea textArea = new JTextArea(20, 80);

		public JTextArea CarDataSQL() {
			try {
				Connection conn = DataBaseConection.getDataBaseConection();
				Statement stmt = conn.createStatement();
				sql = "SELECT ID_CAR , MAKE , MODEL, PRICE, NO , YEAR  FROM CARS, MAKES , MODELS";
				rs = stmt.executeQuery(sql);
				textArea.setTabSize(15);
				textArea.append("ID\t");
				textArea.append("Make\t");
				textArea.append("Models\t");
				textArea.append("Price\t");
				textArea.append("No\t");
				textArea.append("Year\n");
				while (rs.next()) {
					textArea.append(rs.getString(1));
					textArea.append("\t");
					textArea.append(rs.getString(2));
					textArea.append("\t");
					textArea.append(rs.getString(3));
					textArea.append("\t");
					textArea.append(rs.getString(4));
					textArea.append("\t");
					textArea.append(rs.getString(5));
					textArea.append("\t");
					textArea.append(rs.getString(6));
					textArea.append("\n");
					
				}
				rs.close();
				}	
				catch(SQLException e) {
					e.printStackTrace();
				}
				finally {
				}
			return this.textArea;
		}
	}
