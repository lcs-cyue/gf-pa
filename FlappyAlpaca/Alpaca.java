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

        if (getOneIntersectingObject (Cloud.class) != null) 
        {

            displayGameOver ();

        }

        setLocation( getX(), getY() + dy);

        //launch RJ upwards when pressing space bar
        if (Greenfoot. isKeyDown("space") ==true) {
            dy = -8;
        }

        //gameover if RJ goes out of the boundaries
        if (getY() > getWorld().getHeight() ) {

            displayGameOver ();

        }

        if (getY() < -20 ) {

            displayGameOver ();

        }

        //score+1 if touching the clover class
        if (isTouching(Clover.class))
        {
            removeTouching(Clover.class);
            Skyline skyline = (Skyline)getWorld();
            Score score = skyline.getScore();
            score.addScore();
            //Greenfoot.playSound("2.wav");
        }

        //derivative of y = derivative of y + gravity
        dy = dy + g;
    }    
    
     public Alpaca()
    {
        Greenfoot.setWorld(new Skyline());  
        Greenfoot.delay(300);

    }
    

    private void displayGameOver () {
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver,400,200);
        Greenfoot.stop();
    }
}
