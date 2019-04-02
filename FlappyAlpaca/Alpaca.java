import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alpaca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alpaca extends Actor
{
    int dy = 0;
    int g = 1;
    /**
     * Act - do whatever the Alpaca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         // Game over if bumps into a cloud, 
        if (getOneIntersectingObject (Cloud.class) != null) {
           
            displayGameOver ();
            
        }
        
        setLocation( getX(), getY() + dy);
        
        //launch RJ upwards when pressing space bar
        if (Greenfoot. isKeyDown("space") ==true) {
            dy = -8;
        }
        
        if (getY() > getWorld().getHeight() ) {
            
            displayGameOver ();
            
        }
        
        if (getY() < -15 ) {
            
            displayGameOver ();
            
        }
        dy = dy + g;
    }    
    
    private void displayGameOver () {
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver,400,200);
        Greenfoot.stop();
    }
}
