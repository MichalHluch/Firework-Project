import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Firework here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Firework extends Actor {
    /**
     * Act - do whatever the Firework wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int steps;
    
    public Firework() {
        steps = 20;
    }
    
    public void act() {
        myMove();
        World world = getWorld();
        if(world == null) return;
        
        if(isAtEdge()) world.removeObject(this);
        
        if(steps == 0) {
         for(int i = 0; i <= 2; i++) {
            Firework ball = new Firework();
            world.addObject(ball, getX() + 10, getY());
            
            ball.turn(i == 1 ? 30 : -30);
        }
       }
    }
    
    
    private void myMove() {
        steps--;
     
        move(10);
    }
}
