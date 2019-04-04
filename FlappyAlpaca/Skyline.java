import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skyline here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skyline extends World
{
    int counter = 0;
    GreenfootSound backgroundMusic;
    Score score = new Score();
    
    /**
     * Constructor for objects of class Skyline.
     * 
     */
    public Skyline()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 

        // Play background music
        backgroundMusic = new GreenfootSound("1.mp3");
        backgroundMusic.playLoop();

        //Create alpaca object
        Alpaca RJ = new Alpaca();

        //add it into the skyline world
        addObject(RJ,85,200);
        
        //add score counter
        addObject(score, 100, 40);
    }

    public void act() {
        // Increment counter (roughly 60 counts per second)
        counter = counter + 1;

        
        if (counter % 100 == 0) {

            // debug
            //showText("added a cloud", 100, 100);

            //add cloud every 1.67 second
            Cloud cloudObject = new Cloud();

            GreenfootImage image = cloudObject.getImage();

            addObject(new Cloud(),600,Greenfoot.getRandomNumber(550)-50);


        }
        
         
             
        if (counter % 120 == 0) {
            //add clover every 2 second
            Clover cloverObject = new Clover();

            GreenfootImage image = cloverObject.getImage();

            addObject(new Clover(),Greenfoot.getRandomNumber(600)-0,Greenfoot.getRandomNumber(600)-0);

            
        }
 
        // Every 60 frames, update the time
        if ((counter % 60) == 0)
        {
            String timeElapsed = Integer.toString(counter / 60);
            showText(timeElapsed, 50, 370);

            
        }
        
        //I've changed winning the game after 60 seconds since it's not that challenging
        if ((counter % 3600) == 0)
        {
            Win Hahaha = new Win();
            addObject(Hahaha,300,200);
            Greenfoot.stop();

        }

    }
    
    public Score getScore()
    {
        return score;
    }
    
    

}
