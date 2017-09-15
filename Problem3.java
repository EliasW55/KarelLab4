 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        closeWallOne();
        turnLeft();
        closeWallTwo();
        turnLeft();
        closeWallThree();
        turnLeft();
        closeWallFour();
    }
    
    public void closeWallOne() {
        while(frontIsClear()) {
            findWall();
            if(findWall()==false) {
                faceEast();
                putBeeper();
                move();
            }
            else {
                faceEast();
                move();
            }
        }
    }
    
    public void closeWallTwo() {
        while(frontIsClear()) {
            findWall();
            if(findWall()==false) {
                faceNorth();
                putBeeper();
                move();
            }
            else {
                faceNorth();
                move();
            }
        }
    }
    
    public void closeWallThree() {
        while(frontIsClear()) {
            findWall();
            if(findWall()==false) {
                faceWest();
                putBeeper();
                move();
            }
            else {
                faceWest();
                move();
            }
        }
    }
    
    public void closeWallFour() {
        while(frontIsClear()) {
            findWall();
            if(findWall()==false) {
                faceSouth();
                putBeeper();
                move();
            }
            else {
                faceSouth();
                move();
            }
        }
    }
    
    public boolean findWall() {
        for(int i=0; i<4; i++) {
            turnLeft();
            if(!frontIsClear()) {
               return true; // wall
            }
        }
        return false;
    }
    
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }
    }
    
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
}

