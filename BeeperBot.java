
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()) {
            collectBeeperSteeple();
        }
    }
    
    public void collectBeeperSteeple() {
        findBeepers();
        getBeepers();
        
    }
    
    public void findBeepers() {
        faceEast();
        while(!nextToABeeper()) {
            move();
        }
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    public void leaveRow() {
        turnLeft();
        turnLeft();
        while(frontIsClear()) {
            move();
        }
        turnLeft();
    }
    
    public void getBeepers() {
        turnLeft();
        while(nextToABeeper()) {
            pickBeeper();
            move();
        }
        leaveRow();
    }
}