package Game_Folder;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Border {
int x;
int y;
/**
 * @param x
 * @param y
 */
public Border(int x, int y) {
	
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

public void draw(Graphics g){
	
	Image border  = new ImageIcon("images\\border.gif").getImage();
	g.drawImage(border,x,y,null);
	}



}