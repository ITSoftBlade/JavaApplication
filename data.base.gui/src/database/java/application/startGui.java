package database.java.application;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class startGui {
	
	private JTabbedPane tabs = new JTabbedPane();
	
	//tab panels
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	
	//tab layout
	private JPanel upPanel1 = new JPanel();
	private JPanel downPanel1 = new JPanel();
	private JPanel downPanel11= new JPanel();
	private JPanel upPanel2 = new JPanel();
	private JPanel downPanel2 = new JPanel();
	private JPanel downPanel22= new JPanel();
	private JPanel upPanel3 = new JPanel();
	private JPanel downPanel3 = new JPanel();
	private JPanel downPanel33= new JPanel();
	
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
	
	private static ResultSet rs;
	private static String sql;
	private JTextArea textArea1 = new JTextArea(20, 80);

	
	
	
	public startGui() {
	//Create and sewt up windiw
	
	JFrame frame = new JFrame("Title");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1000, 600);
	
	//add tabs
	frame.add(tabs);
	frame.setLayout(new GridLayout(1,1));
	tabs.addTab("Custumers", panel1);
	tabs.addTab("Cars", panel2);
	tabs.addTab("Orders", panel3);
	
	//tab1 set
	panel1.setLayout(new GridLayout(2, 1));
	panel1.add(upPanel1);
	panel1.add(downPanel1);
	panel1.add(downPanel11);
	CustumerSQL sql = new CustumerSQL();
	//tab1 add content
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
	downPanel1.add(addButton);
	downPanel1.add(upDateButton);
	downPanel1.add(deleteButton);
	downPanel1.add(downPanel11);
	downPanel11.add(sql.CustumerDataSQL());
	
	//tab2 create
	panel2.setLayout(new GridLayout(2, 1));
	panel2.add(upPanel2);
	panel2.add(downPanel2);
	panel2.add(downPanel22);
	CarSQL sqlCar = new CarSQL();
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
	downPanel2.add(downPanel22);
	downPanel22.add(sqlCar.CarDataSQL());
	
	//tab3 create
	panel3.setLayout(new GridLayout(2, 1));
	panel3.add(upPanel3);
	panel3.add(downPanel3);
	panel3.add(downPanel33);
	
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
	downPanel3.add(downPanel33);
	downPanel3.add(new JTextArea("Ha", 20, 90));
	//Display the window
	frame.setVisible(true);
	}
	
	
}
