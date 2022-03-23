package Game_Folder;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;



public class Basket {
	
	int x,y; 
	
	public Basket(){
		
	}
	
	public Basket(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	
public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

public void moveRight(){
		
		if(x <914){
			
			x=x+15;
		}
	}

	public void moveLeft(){
		
		if(x>10){
			
			x=x-15;
		}
	}
	
public void draw(Graphics g){
		
	Image basket  = new ImageIcon("images\\basket.png").getImage();
		g.drawImage(basket,x,y,null);
	   
		
	  }
}
