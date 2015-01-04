package database.java.application;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustumerTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResultSet result;
	private int columnCount;
	private int rowCount;
	private ArrayList<Object> data=new ArrayList<Object>();
	
	//constructor
	public CustumerTableModel(ResultSet rs) throws Exception {
		setRS(rs);
	}
	
	//fill ArrayList with values at ResultSet 
	public void setRS(ResultSet rs) throws Exception {
		this.result = rs;
		ResultSetMetaData metaData = rs.getMetaData();
		rowCount = 0;
		columnCount = metaData.getColumnCount();
		
		while (rs.next()) {
			Object[] row = new Object[columnCount];
			for (int i = 0; i < columnCount; i++) {
				row[i] = rs.getObject(i+1);
			}
			data.add(row);
			rowCount++;
		}
	}
	@Override
	public int getColumnCount() {
		return columnCount;
	}

	@Override
	public int getRowCount() {
		return rowCount;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object[] row = (Object[]) data.get(rowIndex);
		return row[columnIndex];
	}
	
	public String getColumnName(int columnIndex) {
		 try{
		 ResultSetMetaData metaData=result.getMetaData();
		 return metaData.getColumnName(columnIndex+1);
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 return null;
		 }
	}
}
