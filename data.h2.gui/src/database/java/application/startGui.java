package database.java.application;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class startGui extends JFrame {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//tab panels
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	
	//tab layout
	private JPanel upPanel1 = new JPanel();
	private JPanel downPanel1 = new JPanel();
	private JPanel tablePanel= new JPanel();
	private JPanel upPanel2 = new JPanel();
	private JPanel downPanel2 = new JPanel();
	private JPanel tablePanel2= new JPanel();
	private JPanel upPanel3 = new JPanel();
	private JPanel downPanel3 = new JPanel();
	private JPanel tablePanel3= new JPanel();
	
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel emailLabel = new JLabel("E-mail");
	JLabel phoneLabel = new JLabel("Phone");
	JLabel addressLabel = new JLabel("Address");
	JLabel makeLabel = new JLabel("Make");
	JLabel modelLabel = new JLabel("Model");
	JLabel numberLabel = new JLabel("No");
	JLabel priceLabel = new JLabel("Price");
	JLabel yearLabel = new JLabel("Year");
	JLabel idLabel = new JLabel("ID Orders");
	JLabel custumerLabel = new JLabel("Custumer");
	JLabel carLabel = new JLabel("Car");
	JLabel freeLabel = new JLabel();
	JLabel free1Label = new JLabel();
	
	JTextField firstName = new JTextField();
	JTextField lastName = new JTextField();
	JTextField emailName = new JTextField();
	JTextField phoneName = new JTextField();
	JTextField addressName = new JTextField();
	JTextField make = new JTextField();
	JTextField model = new JTextField();
	JTextField number = new JTextField();
	JTextField price = new JTextField();
	JTextField year = new JTextField();
	JTextField idOrder = new JTextField();
	JTextField custumer = new JTextField();
	JTextField car = new JTextField();
	
	//buttons for tabs
	private JButton addButton = new JButton("ADD");
	private JButton upDateButton = new JButton("UPDATE");
	private JButton deleteButton = new JButton("DELETE");
	private JButton addButton2 = new JButton("ADD");
	private JButton upDateButton2 = new JButton("UPDATE");
	private JButton deleteButton2 = new JButton("DELETE");
	private JButton addButton3 = new JButton("ADD");
	private JButton upDateButton3 = new JButton("UPDATE");
	private JButton deleteButton3 = new JButton("DELETE");
	private JTabbedPane tabs = new JTabbedPane();
	
	Connection conn;
	JTable myTable = new JTable();
	JScrollPane scroler = new JScrollPane(myTable);
	
	public startGui() {
	//Create and set up main frame
		
	JFrame frame = new JFrame("Title");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1000, 600);
	frame.setLayout(new GridLayout(1,1));
	frame.add(tabs);
	frame.setVisible(true);
	//add tabs
	tabs.addTab("Custumers", panel1);
	tabs.addTab("Cars", panel2);
	tabs.addTab("Orders", panel3);
	
	//tab1 set
	panel1.setLayout(new GridLayout(3, 1));
	panel1.add(upPanel1);
	panel1.add(downPanel1);
	panel1.add(tablePanel);
	//tab1 add upPanel content
	upPanel1.setLayout(new GridLayout(7, 2));
	upPanel1.add(firstNameLabel);
	upPanel1.add(firstName);
	upPanel1.add(lastNameLabel);
	upPanel1.add(lastName);
	upPanel1.add(emailLabel);
	upPanel1.add(emailName);
	upPanel1.add(phoneLabel);
	upPanel1.add(phoneName);
	upPanel1.add(addressLabel);
	upPanel1.add(addressName);
	//tab1 add downPanel content
	downPanel1.add(addButton);
	downPanel1.add(upDateButton);
	downPanel1.add(deleteButton);
	//tab1 tablePanel
	scroler.setPreferredSize(new Dimension(900, 200));
	tablePanel.add(scroler);
	myTable.setModel(selectAll());
	//tab2 create
	panel2.setLayout(new GridLayout(3, 1));
	panel2.add(upPanel2);
	panel2.add(downPanel2);
	panel2.add(tablePanel2);
	//tab2 add content
	upPanel2.setLayout(new GridLayout(7, 2));
	upPanel2.add(makeLabel);
	upPanel2.add(make);
	upPanel2.add(modelLabel);
	upPanel2.add(model);
	upPanel2.add(numberLabel);
	upPanel2.add(number);
	upPanel2.add(priceLabel);
	upPanel2.add(price);
	upPanel2.add(yearLabel);
	upPanel2.add(year);	
	downPanel2.add(addButton2);
	downPanel2.add(upDateButton2);
	downPanel2.add(deleteButton2);
	downPanel2.add(tablePanel2);
	//tab3 create
	panel3.setLayout(new GridLayout(3, 1));
	panel3.add(upPanel3);
	panel3.add(downPanel3);
	panel3.add(tablePanel3);
	
	upPanel3.setLayout(new GridLayout(7, 2));
	upPanel3.add(idLabel);
	upPanel3.add(idOrder);
	upPanel3.add(custumerLabel);
	upPanel3.add(custumer);
	upPanel3.add(carLabel);
	upPanel3.add(car);
	upPanel3.add(freeLabel);
	upPanel3.add(free1Label);
	
	downPanel3.add(addButton3);
	downPanel3.add(upDateButton3);
	downPanel3.add(deleteButton3);
	downPanel3.add(tablePanel3);
	}//end constructor

	public CustumerTableModel selectAll(){
		String sql = "select * from custumers";
		conn = DataBaseConection.getDataBaseConection();
		
		try {
			PreparedStatement prep = conn.prepareStatement(sql);
			ResultSet result = prep.executeQuery();
			CustumerTableModel model = new CustumerTableModel(result);
			return model;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}// end selectAll()
	
}//end class
