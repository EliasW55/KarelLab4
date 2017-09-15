
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        getToWall();
        findDoorOne();
        findDoorTwo();
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
    
    public void findDoorOne() {
        while(frontIsClear()) {
            findWall();
            if(findWall()==false) {
                faceWest();
                move();
            }
            else {
                faceSouth();
                move();
            }
        }
        faceEast();
        move();
    }
    
    public void findDoorTwo() {
        findWall();
        while(frontIsClear()) {
            if(findWall()==false) {
                faceSouth();
                move();
            }
            else {
                faceEast();
                move();
            }
        }
    }
    
    public void getToWall() {
        while(frontIsClear()) {
            move();
        }
        turnLeft();
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
