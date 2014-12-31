package data.base.gui;

import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class AppGUI extends JFrame{
	
	private JFrame mainFrame = new JFrame();
	private JTabbedPane tabPannel = new JTabbedPane();
	private JComponent tabComponent;
	private JPanel panel = new JPanel();
	
	public AppGUI() {
		initUI();
	}

	private void initUI() {
		
		mainFrame.setTitle("data base java");
		mainFrame.setSize(700, 500);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		//add tabs
		panel.add(tabPannel);
		tabPannel.setBounds(0, 0, 700, 500);
		tabComponent.setVisible(true);
		tabPannel.add(new JPanel(),"first");
		tabPannel.add(new JPanel(),"2");
	}
}
