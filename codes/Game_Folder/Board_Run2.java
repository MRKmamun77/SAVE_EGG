package Game_Folder;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board_Run2 extends JFrame{

	
	Game_Board2 b = new Game_Board2();
	
	
	public Board_Run2(){
		
		
		add(b);
		
		
		setSize(1000, 720);
		setResizable(false);
		b.setFocusable(true);setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Catch The Egg");
		setVisible(true);

		
		
		
		
		//JOptionPane.showMessageDialog(null, "WelCome");
		
	}
		
	}
	