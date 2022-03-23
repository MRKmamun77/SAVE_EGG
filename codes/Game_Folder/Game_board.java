package Game_Folder;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;

import Game_Folder.GameSound;


public class Game_board extends JPanel implements KeyListener{
JFrame window = new JFrame();
Basket basket = new Basket (222,640);
Egg egg = new Egg();

Border border = new Border(0,695);

JLabel points;

int point = 0;
int miss = 0;
EggMover em = new EggMover(this,egg);

Image gamebackimage = new ImageIcon("images\\gamebkg.png").getImage();
Image gameOverimage= new ImageIcon("images\\gameOverbkg.jpg").getImage();
Image  reprint;
boolean gameOver = false;


public Game_board(){
	
	setFocusable(true);
	points = new JLabel("Points: 0");
	points.setBounds(100,10,100,20);
	
	
	add(points);
	super.addKeyListener(this);
	reprint = gamebackimage;
	int xx = ((int)(Math.random()*1000)) % 900;
	egg.setX_egg(xx); 
	egg.setY_egg(50);
	
	em.start();
		
}

Random rn = new Random();
public void detectMiss(){
	Rectangle borderRect = new Rectangle(border.getX(),border.getY(),1000,10); 
	Rectangle eggRect    = new Rectangle(egg.getX_egg(),egg.getY_egg(),45,67); 
	
	int xx = rn.nextInt(4) + 1;
	if(eggRect.intersects(borderRect)==true){
		GameSound.smashBricksSound();
		miss++;
		egg.setY_egg(50); 
		egg.setX_egg(xx*200) ;
		super.repaint();
		}	
}
	


public void detectCollision(){
	Rectangle basketRect = new Rectangle(basket.getX(),basket.getY(),100,65); 
	Rectangle eggRect    = new Rectangle(egg.getX_egg(),egg.getY_egg(),45,67); 
	int xx = rn.nextInt(4) + 1;
	if(eggRect.intersects(basketRect)==true){
		GameSound.eatGhostSound();
		point=point+10; 
		egg.setY_egg(50); 
		egg.setX_egg(xx*200) ;
		super.repaint();
		}	
	
}


	
@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_LEFT){
			basket.moveLeft();
			
				}
		
		else if(e.getKeyCode() == e.VK_RIGHT){
			basket.moveRight();
				}
		super.repaint();
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	void checkGameOver(){
		if(miss==5 )
		{GameSound.gameOverSound();
		reprint = gameOverimage;
		
		gameOver = true;
		
		}}
	
	public void paint(Graphics g){
		
		Graphics2D g2D = (Graphics2D)g;
		g2D.drawImage(reprint,0,0,null); 
		checkGameOver();
		
		if(gameOver == false){
			setFocusable(true);
			grabFocus();
			
			
			detectCollision();
			detectMiss();
		
			egg.draw(g2D); 
			basket.draw(g2D);
			g2D.drawString("Score : " + point, 730, 20);
			g2D.drawString("Miss : " + miss, 130, 20);
					
		}
		
		repaint();	
		g2D.drawString("Score : " + point, 730, 20);
	}
	
	
}