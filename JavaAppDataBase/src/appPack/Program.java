package appPack;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Program extends JFrame  {
	
	JTextField fNameField = new JTextField(10);
	JTextField lNameField = new JTextField(10);
	JTextField addressField = new JTextField(10);
	JTextField phField = new JTextField(10);
	JTextField artField = new JTextField(10);
	JTextField cenaField = new JTextField(10);
	JTextField markaField = new JTextField(10);
	JTextField cenaField1 = new JTextField(10);
	
	String[] marka = {"Mercedes","Opel","BMW"};
	JComboBox mCombo = new JComboBox(marka);

	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel upPanel = new JPanel();
	JPanel downPanel = new JPanel();
	JPanel upPanel1 = new JPanel();
	JPanel downPanel1 = new JPanel();
	JPanel upPanel2 = new JPanel();
	JPanel downPanel2 = new JPanel();
	
	JLabel fNameLabel = new JLabel("First name");
	JLabel lNameLabel = new JLabel("Last name");
	JLabel addressLabel = new JLabel("Address");
	JLabel phLabel = new JLabel("Phone Number");
	JLabel artLabel = new JLabel("artikuli");
	JLabel cenaLabel = new JLabel("cena");
	JLabel cenaLabel1 = new JLabel("cena");
	JLabel markaLabel = new JLabel("marka");
	
	JButton addButton = new JButton("Add");
	JButton updButton = new JButton("Update");
	JButton delButton = new JButton("Delete");
	JButton addButton1 = new JButton("Add");
	JButton updButton1 = new JButton("Update");
	JButton delButton1 = new JButton("Delete");
	JButton addButton2 = new JButton("Add");
	JButton updButton2 = new JButton("Update");
	JButton delButton2 = new JButton("Delete");
	
	JTabbedPane jtp=new JTabbedPane();
	
	public void init(){
		this.setLayout(new GridLayout(1,1));
		this.setSize(701, 601);
		
		jtp.setBounds(0, 0, 700, 600);
		p1.add(fNameLabel);
		p1.add(lNameLabel);
		p1.add(addressLabel);
		p1.add(phLabel);
		p1.add(upPanel);
		p1.add(downPanel);
		
		upPanel.setLayout(new GridLayout(4,1));
		upPanel.add(fNameLabel);
		upPanel.add(fNameField);
		upPanel.add(lNameLabel);
		upPanel.add(lNameField);
		upPanel.add(addressLabel);
		upPanel.add(addressField);
		upPanel.add(phLabel);
		upPanel.add(phField);
		
		
		downPanel.add(addButton);
		//addButton.addActionListener(new AddAction());
		downPanel.add(updButton);
		//printButton.addActionListener(new PrintAction());
		downPanel.add(delButton);
		
		p2.add(artLabel);
		p2.add(cenaLabel);
		p2.add(upPanel1);
		p2.add(downPanel1);
		
		upPanel1.setLayout(new GridLayout(2,1));
		upPanel1.add(artLabel);
		upPanel1.add(artField);
		upPanel1.add(cenaLabel);
		upPanel1.add(cenaField);
		
		downPanel1.add(addButton1);
		//addButton.addActionListener(new AddAction());
		downPanel1.add(updButton1);
		//printButton.addActionListener(new PrintAction());
		downPanel1.add(delButton1);

		p3.add(markaLabel);
		p3.add(cenaLabel1);
		p3.add(upPanel2);
		p3.add(downPanel2);
		
		upPanel2.add(markaLabel);
		upPanel2.add(mCombo);
		upPanel2.add(cenaLabel1);
		upPanel2.add(cenaField1);
		
		downPanel2.add(addButton2);
		//addButton.addActionListener(new AddAction());
		downPanel2.add(updButton2);
		//printButton.addActionListener(new PrintAction());
		downPanel2.add(delButton2);

		
		this.add(jtp);
		jtp.add(p1,"Clients");
		jtp.add(p2,"Sell");
		jtp.add(p3,"Cars");
		
	}
	
	public Program(){
		init();
	}
	public static void main(String[] args) {
		Program tc=new Program();
		tc.setVisible(true);
		tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}