package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Hello world");
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello "+name);
		
	}
	
	
		
	
}
