package database.java.application;

public class StartProgram {
	
	private static startGui init;
	private static DataBaseConection connect;

	public static void main(String[] args) {
		init = new startGui();
		connect = new DataBaseConection();
	}		
}