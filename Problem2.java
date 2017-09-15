
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        doFirstWall();
        reposition();
    }
    
    public void reposition() {
        if(findWall()==false) {
            faceEast();
            turnLeft();
            move();
            turnLeft();
            move();
        }
    }
    
    public void repositionSecond() {
        if(findWall()==false) {
            faceNorth();
            turnLeft();
            move();
            turnLeft();
            move();
        }
    }
    
    public void repositionThird() {
        if(findWall()==false) {
            faceEast();
            turnLeft();
            move();
            turnLeft();
            move();
        }
    }
    
    public void doFirstWall()  {
        findWall();
        while(findWall()==true) {
            findWall();
            if(findWall()==true) {
                putBeeper();
                faceEast();
                move();
            } 
        }
    }
    
    public void doSecondWall()  {
        findWall();
        while(findWall()==true) {
            findWall();
            if(findWall()==true) {
                putBeeper();
                faceWest();
                if(!frontIsClear()) {
                    faceNorth();
                    move();
                }
                else {
                move();
                }
            } 
        }
    }
    
    public void doFourthWall()  {
        findWall();
        while(findWall()==true) {
            findWall();
            if(findWall()==true) {
                putBeeper();
                faceSouth();
                if(!frontIsClear()) {
                    faceWest();
                    move();
                }
                else {
                move();
                }
            } 
        }
    }
    
    public void doFifthWall()  {
        findWall();
        while(findWall()==true) {
            findWall();
            if(findWall()==true) {
                putBeeper();
                faceWest();
                if(!frontIsClear()) {
                    faceNorth();
                    move();
                }
                else {
                move();
                }
            } 
        }
    }
    
    public void doSixthWall() {
        findWall();
        while(findWall()==true) {
            findWall();
            if(findWall()==true) {
                putBeeper();
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
                    