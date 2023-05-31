import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World{
    ShaderBox[][] sb;
    private CoordMap mp;
    
    public MainWorld(){
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1, false);
        sb = new ShaderBox[20][11];
        mp = new CoordMap(Statics.getLevel(), 20, 11, 1200, 675);
        for(int i=0; i<20; i++){
            for(int j=0; j<11; j++){
                addObject(sb[i][j] = new ShaderBox(mp.getSz()[0]-1, mp.getSz()[1]-1), mp.getPixX(i), mp.getPixY(j));
            }
        }
        addObject(new MainCh(), 400, 300);
    }
    
    private void update(){
        
    }
}
