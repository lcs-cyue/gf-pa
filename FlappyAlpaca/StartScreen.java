import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{ 
   
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        prepare();
        
    }
    
    public void prepare() 
    {
        Letters titleLetters= new Letters();
        addObject (titleLetters, 400, 300);
    }
    
    public void act()
    {
        //set the world after pressing enter
        if (Greenfoot.isKeyDown ("enter"))
        Greenfoot.setWorld(new Skyline());
    }
}
