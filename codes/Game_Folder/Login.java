package Game_Folder;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener {

	JFrame window = new JFrame();
	GridLayout gl = new GridLayout(2,2);
	
	JLabel password = new JLabel("                           PASSWORD");
	JPasswordField pass = new JPasswordField();
	JLabel empty = new JLabel(); 
	JButton enter = new JButton("ENTER");
	
	
	public Login(){
		
		window.setLayout(gl);
		window.add(password);
		window.add(pass);
		window.add(empty);
		window.add(enter);
		
		window.setTitle("ENTER PASSWORD TO PLAY");
		window.setSize(500,150);
		window.setLocation(600, 200);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);
		
		enter.addActionListener(this);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==enter){
			
			
			String p= pass.getText();
			
			
			
			File f = new File("list.txt");
			try{
				Scanner input = new Scanner(f);
				while(input.hasNextLine()){
				if(input.nextLine().equals(p)){
					window.dispose();
					Menu_Screen ms = new Menu_Screen();
					continue;
				}
					
			
						
				}	
					
				}
			
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			 }
	}
	
}
