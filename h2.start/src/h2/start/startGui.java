package h2.start;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class startGui extends JFrame {
	private static final long serialVersionUID = 1L;
	int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
	private JTabbedPane tabs = new JTabbedPane();
	//tab panels
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	//tab layout
	private JPanel upPanel1 = new JPanel();
	private JPanel downPanel1 = new JPanel();
	private JPanel upPanel2 = new JPanel();
	private JPanel downPanel2 = new JPanel();
	private JPanel tablePanel2= new JPanel();
	private JPanel upPanel3 = new JPanel();
	private JPanel downPanel3 = new JPanel();
	private JPanel tablePanel3= new JPanel();
	
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel newNameLabel = new JLabel("New Name");
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
	JTextField newName = new JTextField();
	JTextField lastName = new JTextField();
	JTextField eMail = new JTextField();
	JTextField phone = new JTextField();
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
	private JButton viewCustumers = new JButton("VIEW CUSTUMERS");
	private JButton addButton = new JButton("ADD");
	private JButton upDateButton = new JButton("UPDATE");
	private JButton deleteButton = new JButton("DELETE");
	private JButton viewCars = new JButton("VIEW CARS");
	private JButton addButton2 = new JButton("ADD");
	private JButton upDateButton2 = new JButton("UPDATE");
	private JButton deleteButton2 = new JButton("DELETE");
	private JButton viewOrders = new JButton("VIEW ORDERS");
	private JButton addButton3 = new JButton("ADD");
	private JButton upDateButton3 = new JButton("UPDATE");
	private JButton deleteButton3 = new JButton("DELETE");
	
	Connection conn;
	JTable myTable = new JTable();
	JTable myTable2 = new JTable();
	JTable myTable3 = new JTable();
	
	JScrollPane scroler = new JScrollPane(myTable, v, h);
	JScrollPane scroler2 = new JScrollPane(myTable2, v, h);
	JScrollPane scroler3 = new JScrollPane(myTable3, v, h);
	
	//constructor
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
	panel1.add(scroler);
	//tab1 add upPanel content
	upPanel1.setLayout(new GridLayout(6, 2));
	upPanel1.add(firstNameLabel);
	upPanel1.add(firstName);
	
	upPanel1.add(lastNameLabel);
	upPanel1.add(lastName);
	upPanel1.add(emailLabel);
	upPanel1.add(eMail);
	upPanel1.add(phoneLabel);
	upPanel1.add(phone);
	upPanel1.add(addressLabel);
	upPanel1.add(addressName);
	//tab1 add downPanel content
	downPanel1.add(viewCustumers);
	
	viewCustumers.addActionListener(new ViewAllCustumers());
	downPanel1.add(addButton);
	addButton.addActionListener(new AddCustumer());
	downPanel1.add(upDateButton);
	upDateButton.addActionListener(new UpdateCustumer());
	downPanel1.add(deleteButton);
	deleteButton.addActionListener(new DeleteCustumer());
	//table panel
	scroler.setSize(900, 200);
	scroler.setBorder(new LineBorder(Color.WHITE));
	myTable.getModel();
	myTable.addMouseListener(new MouseAdapter() {

		public void mouseClicked(MouseEvent evt) {
		myTable.getColumnCount();
		int row = myTable.getSelectedRow();
		firstName.setText((String) myTable.getModel().getValueAt(row, 0));
		lastName.setText((String) myTable.getModel().getValueAt(row, 1));
		eMail.setText((String) myTable.getModel().getValueAt(row, 2));
		Object pn = myTable.getModel().getValueAt(row, 3);
		pn = pn.toString();
		phone.setText((String) pn);
		Object ad = myTable.getModel().getValueAt(row, 4);
		ad = ad.toString();
		addressName.setText((String)ad);
		}
	});
	
	
	//tab2 create
	panel2.setLayout(new GridLayout(3, 1));
	panel2.add(upPanel2);
	panel2.add(downPanel2);
	panel2.add(scroler2);
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
	
	
	downPanel2.add(viewCars);
	viewCars.addActionListener(new ViewAllCars());
	downPanel2.add(addButton2);
	addButton2.addActionListener(new AddCars());
	myTable2.repaint();
	downPanel2.add(upDateButton2);
	upDateButton2.addActionListener(new UpdateCar());
	downPanel2.add(deleteButton2);
	downPanel2.add(tablePanel2);
	
	//table2 panel2
	scroler2.setSize(900, 200);
	scroler2.setBorder(new LineBorder(Color.WHITE));
	myTable2.addMouseListener(new MouseAdapter() {
		
		public void mouseClicked(MouseEvent evt) {
		myTable2.getColumnCount();
		int row = myTable2.getSelectedRow();
		make.setText((String) myTable2.getModel().getValueAt(row, 0));
		model.setText((String) myTable2.getModel().getValueAt(row, 1));
		Object pri = myTable2.getModel().getValueAt(row, 2);
		pri = pri.toString();
		number.setText((String)pri);
		Object pr = myTable2.getModel().getValueAt(row, 3);
		pr = pr.toString();
		price.setText((String) pr);
		Object y = myTable2.getModel().getValueAt(row, 4);
		y = y.toString();
		year.setText((String) y);
		}
	});
	
	//tab3 create
	panel3.setLayout(new GridLayout(3, 1));
	panel3.add(upPanel3);
	panel3.add(downPanel3);
	panel3.add(scroler3);
	
	upPanel3.setLayout(new GridLayout(7, 2));
	upPanel3.add(idLabel);
	upPanel3.add(idOrder);
	upPanel3.add(custumerLabel);
	upPanel3.add(custumer);
	upPanel3.add(carLabel);
	upPanel3.add(car);
	upPanel3.add(freeLabel);
	upPanel3.add(free1Label);
	downPanel3.add(viewOrders);
	downPanel3.add(addButton3);
	downPanel3.add(upDateButton3);
	downPanel3.add(deleteButton3);
	downPanel3.add(tablePanel3);
	
	//table3 for tab3
	scroler3.setSize(900, 200);
	scroler3.setBorder(new LineBorder(Color.WHITE));
	myTable3.addMouseListener(new MouseAdapter() {
		
		public void mouseClicked(MouseEvent evt) {
		myTable3.getColumnCount();
		int row = myTable3.getSelectedRow();
		Object id = myTable3.getModel().getValueAt(row, 0);
		id = id.toString();
		idOrder.setText((String)id);
		custumer.setText((String) myTable3.getModel().getValueAt(row, 1));
		car.setText((String) myTable3.getModel().getValueAt(row, 2));
		}
	});
	
	}//end constructor
	
	public void refreshContent(){
		try{
			MyTableModel model = selectAll();
			model.fireTableDataChanged();
			myTable.setModel(model);
			System.out.println("888");
		}
		catch(Exception ex){}
	}// end refreshContent()
	
	public MyTableModel selectAll(){
		String sql = "select FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS from CUSTUMERS";
		conn = DataBaseConection.getDataBaseConection();
		
		try {
			PreparedStatement prep = conn.prepareStatement(sql);
			ResultSet result = prep.executeQuery();
			MyTableModel model = new MyTableModel(result);
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
	
	public void refreshContent2(){
		try{
			MyTableModel model = selectAllCar2();
			model.fireTableDataChanged();
			myTable2.setModel(model);
			myTable2.repaint();
		}
		catch(Exception ex){}
	}// end refreshContent()
	
	public MyTableModel selectAllCar2(){
		String sql = "select MAKE, MODEL, NO, PRICE, YEAR from CARS";
		conn = DataBaseConection.getDataBaseConection();
		
		try {
			PreparedStatement prep = conn.prepareStatement(sql);
			ResultSet result = prep.executeQuery();
			MyTableModel model = new MyTableModel(result);
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
	
	
	
	
	class ViewAllCustumers implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		String sql = "select FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS from CUSTUMERS";
		conn = DataBaseConection.getDataBaseConection();
		System.out.println("44");
		try {
			PreparedStatement prep = conn.prepareStatement(sql);
			ResultSet result = prep.executeQuery();
			MyTableModel model = new MyTableModel(result);
			model.fireTableDataChanged();
			myTable.setModel(model);
			myTable.repaint();
			
			prep.close();
			conn.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	}//end class
	
	class AddCustumer implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String fName = firstName.getText();
			String lName = lastName.getText();
			String email = eMail.getText();
			int ph = Integer.parseInt(phone.getText());
			String address = addressName.getText();
			if ((fName == null) || (fName == "")) return;
			if ((lName == null) || (lName == "")) return;
			if ((email == null) || (email == "" )) return;
			conn = DataBaseConection.getDataBaseConection();
			String sql = "insert into CUSTUMERS values(null,?,?,?,?,?)";
			try {
				PreparedStatement prep = conn.prepareStatement(sql);
				prep.setString(1, fName);
				prep.setString(2, lName);
				prep.setString(3, email);
				prep.setInt(4, ph);
				prep.setString(5, address);
				prep.execute();
				refreshContent();
				prep.close();
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}// end actionPerformed
		
	}// end AddAction
	
	class UpdateCustumer implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String fName = firstName.getText();
			String lName = lastName.getText();
			String email = eMail.getText();
			int ph = Integer.parseInt(phone.getText());
			String address = addressName.getText();
			
			conn = DataBaseConection.getDataBaseConection();
			String sql = "update CUSTUMERS set FIRST_NAME = ?, LAST_NAME = ?, EMAIL = ?, PHONE = ?, ADDRESS = ? where EMAIL = ?";
			try {
				PreparedStatement prep = conn.prepareStatement(sql);
				prep.setString(1, fName);
				prep.setString(2, lName);
				prep.setString(3, email);
				prep.setInt(4, ph);;
				prep.setString(5, address);
				prep.setString(6, email);
				prep.execute();
				refreshContent();
				prep.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
			
		}//end class
	
	class DeleteCustumer implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String fName = firstName.getText();
			String lName = lastName.getText();
			conn = DataBaseConection.getDataBaseConection();
			String sql = "delete from CUSTUMERS where FIRST_NAME = ? AND LAST_NAME = ?";
			try {
				PreparedStatement prep = conn.prepareStatement(sql);
				prep.setString(1, fName);
				prep.setString(2, lName);
				prep.execute();
				refreshContent();
				prep.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	
	}//end class delete
	class ViewAllCars implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		String sql = "select MAKE, MODEL, NO, PRICE, YEAR from CARS";
		conn = DataBaseConection.getDataBaseConection();
		try {
			PreparedStatement prep = conn.prepareStatement(sql);
			ResultSet result = prep.executeQuery();
			MyTableModel model = new MyTableModel(result);
			model.fireTableDataChanged();
			myTable2.setModel(model);
			myTable2.repaint();
			prep.close();
			conn.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
	
	class AddCars implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String mod = make.getText();
			String mak = model.getText();
			String no = number.getText();
			double pr = Double.parseDouble(price.getText());
			int yr = Integer.parseInt(year.getText());
			if ((mod == null) || (mod == "")) return;
			if ((mak == null) || (mak == "")) return;
			if ((no == null) || (no == "" )) return;
			if ((pr <= 0.0)) return;
			if ((yr <= 1920) || (yr >= 2015)) return;
			conn = DataBaseConection.getDataBaseConection();
			String sql = "insert into CARS values(null,?,?,?,?,?)";
			try {
				PreparedStatement prep = conn.prepareStatement(sql);
				prep.setString(1, mod);
				prep.setString(2, mak);
				prep.setString(3, no);
				prep.setDouble(4, pr);
				prep.setInt(5, yr);
				prep.execute();
				refreshContent2();
				prep.close();
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}// end actionPerformed
	}
	
	class UpdateCar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String mk = make.getText();
			String mo = model.getText();
			String n = number.getText();
			double pr = Double.parseDouble(price.getText());
			int yr = Integer.parseInt(year.getText());
			
			conn = DataBaseConection.getDataBaseConection();
			String sql = "update CARS set MAKE = ?, MODEL = ?, NO = ?, PRICE = ?, YEAR = ? where NO = ?";
			try {
				PreparedStatement prep = conn.prepareStatement(sql);
				prep.setString(1, mk);
				prep.setString(2, mo);
				prep.setString(3, n);
				prep.setDouble(4, pr);
				prep.setInt(5, yr);
				prep.setString(6, n);
				prep.execute();
				refreshContent2();
				prep.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
			
	}
}