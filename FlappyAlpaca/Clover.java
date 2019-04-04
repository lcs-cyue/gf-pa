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
    } 
    
    private void avoid () {
        
        //avoid overlapping with the cloud and getting out of the boundaries
        if( isAtEdge())
        {
           turn(Greenfoot.getRandomNumber(360)); 
           
        }
        
        if( isTouching(Cloud.class))
        {
           turn(Greenfoot.getRandomNumber(360)); 
           
        }
    }
    
    
   
        
}
