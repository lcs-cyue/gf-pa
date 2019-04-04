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
    int counter = 0;
    /**
     * Act - do whatever the Alpaca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        counter = counter + 1;
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

        if (getY() < -20 ) {

            displayGameOver ();

        }
        
        if (isTouching(Clover.class))
        {
            removeTouching(Clover.class);
            //create counter
            Skyline skyline = (Skyline)getWorld();
            Score score = skyline.getScore();
            score.addScore();
        }
   
        dy = dy + g;
    }    

    
    private void displayGameOver () {
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver,400,200);
        Greenfoot.stop();
    }
}
