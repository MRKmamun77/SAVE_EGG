package Game_Folder;

public class EggMover2 extends Thread {
	
	Game_Board2 gb;
    Egg egg;	
	
    
    public EggMover2(Game_Board2 gb,Egg egg){
    	
    	this.gb = gb;
    	this.egg = egg;
    	
    	
    }
    
    public void run(){
    	
    	while(egg.getY_egg() < 700){
    		
    		egg.setY_egg(egg.getY_egg() + 1);
    		gb.repaint();
    		
    		try {
				Thread.sleep(5);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
    	}
    	
    	egg.setY_egg(200);
    	
    }
    
    
    

}
