package Game_Folder;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board_Run extends JFrame{

	
	Game_board b = new Game_board();
	
	
	public Board_Run(){
		
		
		add(b);
		
		
		setSize(1000, 720);
		setResizable(false);
		b.setFocusable(true);setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Catch The Egg");
		setVisible(true);

		
		
		
		
		//JOptionPane.showMessageDialog(null, "WelCome");
		
	}
		
	}
	
	



