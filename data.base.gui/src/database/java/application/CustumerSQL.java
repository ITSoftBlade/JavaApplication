package database.java.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextArea;

public class CustumerSQL {
	private String sql = new String();
	private ResultSet rs;
	private JTextArea textArea = new JTextArea(20, 80);

	public JTextArea CustumerDataSQL() {
		try {
			Connection conn = DataBaseConection.getDataBaseConection();
			Statement stmt = conn.createStatement();
			sql = "SELECT ID_CUSTUMER, FIRST_NAME, LAST_NAME, EMAIL, PHONE,ADDRESS FROM CUSTUMERS";
			rs = stmt.executeQuery(sql);
			textArea.setTabSize(15);
			textArea.append("ID\t");
			textArea.append("First name\t");
			textArea.append("Last name\t");
			textArea.append("e-mail\t");
			textArea.append("Phone\t");
			textArea.append("Adress\n");
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
