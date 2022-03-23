package Game_Folder;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
	

public class Level extends JPanel implements ActionListener{

		JButton easy = new JButton("EASY");
		JButton hard = new JButton("HARD");
		
		JPanel upper = new JPanel(); 
		JPanel lower = new JPanel(); 
		
		JFrame window = new JFrame();
		
		JLabel imageLabel = new JLabel();
		String imagePaths = "images\\levelbkg.jpg";
		
		public Level(){
			
			initUpperPanel();
			initLowerPanel();
			
			
			
			window.setLayout(null);
			
			upper.setBounds(0, 0, 1008, 600);
			lower.setBounds(0,600,1008,100);
			
			window.add(upper);
			window.add(lower);
			window.setTitle("SELECT LEVEL");
			window.setSize(1024, 750);
			window.setVisible(true);	
			
			ImageIcon icon = new ImageIcon(imagePaths);
			imageLabel.setIcon(icon);
		
			
			
		}
		
public void initUpperPanel(){
			
	GridLayout upperLayout = new GridLayout(1,1);
	upper.setLayout(upperLayout);
	upper.add(imageLabel);
			
		}
		
		public void initLowerPanel(){
			
			GridLayout lowerLayout = new GridLayout(1,2,10,10);
			lower.setLayout(lowerLayout);
			
			lower.add(easy);
			lower.add(hard);
			
			easy.addActionListener(this);
			hard.addActionListener(this);
			
		}
		
		
			
			public void actionPerformed(ActionEvent e){
				if(e.getSource()== easy){
					
				Board_Run br = new Board_Run();
				window.dispose();
				}
				
				else if(e.getSource()== hard){
					Board_Run2 br2 = new Board_Run2(); 
					window.dispose();
				}
			}
		
		
		
					
	}

