package Game_Folder;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Egg {

	
	int x_egg,y_egg; 

public Egg (){
	x_egg = 0;
	y_egg = 0;
}

public int getX_egg() {
	return x_egg;
}

public void setX_egg(int x_egg) {
	this.x_egg = x_egg;
}

public int getY_egg() {
	return y_egg;
}

public void setY_egg(int y_egg) {
	this.y_egg = y_egg;
}

public void draw(Graphics g){
	
	Image egg  = new ImageIcon("images\\egg.png").getImage();
	g.drawImage(egg,x_egg,y_egg,null);
	Image stand  = new ImageIcon("images\\stand.gif").getImage();
	g.drawImage(stand,0,100,null);
	Image chicken  = new ImageIcon("images\\chicken.png").getImage();
	g.drawImage(chicken,0,0,null);
	g.drawImage(chicken,180,0,null);
	g.drawImage(chicken,380,0,null);
	g.drawImage(chicken,580,0,null);
	g.drawImage(chicken,780,0,null);
	
	}

}

