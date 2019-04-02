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

    }
    public void act() {
        counter++;

        if (counter == 80) {
            //add cloud every count to 80
            Cloud cloudObject = new Cloud();

            GreenfootImage image = cloudObject.getImage();

            addObject(new Cloud(),600,Greenfoot.getRandomNumber(550)-50);
            counter = 0;

            
        }

            
        if (counter == 300) {
            //add clover every count to 100
            Clover cloverObject = new Clover();

            GreenfootImage image = cloverObject.getImage();

            addObject(new Clover(),Greenfoot.getRandomNumber(600)-0,Greenfoot.getRandomNumber(600)-0);
            counter = 0;

            
        }
    }

}
