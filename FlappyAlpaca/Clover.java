import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clover extends Actor
{
    
    public void act() 
    {
        setLocation (getX()-4, getY());
        
        
        //avoid overlapping with the cloud and getting out of the boundaries
        if( isAtEdge())
        {
           removeTouching(Clover.class);
           
        }
        
        if( isTouching(Cloud.class))
        {
           removeTouching(Clover.class); 
           
        }
    } 
    
   
        
}
