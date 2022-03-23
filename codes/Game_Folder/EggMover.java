package Game_Folder;

public class EggMover extends Thread {
	
	Game_board gb;
    Egg egg;	
	
    
    public EggMover(Game_board gb,Egg egg){
    	
    	this.gb = gb;
    	this.egg = egg;
    	
    	
    }
    
    public void run(){
    	
    	while(egg.getY_egg() < 700){
    		
    		egg.setY_egg(egg.getY_egg() + 1);
    		gb.repaint();
    		
    		try {
				Thread.sleep(7);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
    	}
    	
    	egg.setY_egg(200);
    	
    }
    
    
    

}
