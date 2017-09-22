
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends TreasureBot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        move();
        if (!nextToABeeper()){
            clearBallots();
        }
        else{
            fillBallots();
        }
        move();
        move();
        if (!nextToABeeper()){
            clearBallots();
        }
        else{
            fillBallots();
        }
        move();
        move();
        if (!nextToABeeper()){
            clearBallots();
        }
        else{
            fillBallots();
        }
        move();
        move();
        if (!nextToABeeper()){
            clearBallots();
        }
        else{
            fillBallots();
        }
        move();
        move();
        if (!nextToABeeper()){
            clearBallots();
        }
        else{
            fillBallots();
        }
        
    }
    public void clearBallots(){
        faceNorth();
        move();
        if (nextToABeeper()){
            while (nextToABeeper()){
                    pickBeeper();
                }
            turnLeft();
            turnLeft();
            move();
        }
        else{
            turnLeft();
            turnLeft();
            move();
        }
        move();
        if (nextToABeeper()){
            while (nextToABeeper()){
                    pickBeeper();
                }
            turnLeft();
            turnLeft();
            move();
        }
        else{
            turnLeft();
            turnLeft();
            move();
        }
        faceEast();
    }
    public void fillBallots(){
        faceNorth();
        move();
        if (nextToABeeper()){
              while (nextToABeeper()){
                    pickBeeper();
                }
                putBeeper();
                turnLeft();
                turnLeft();
                move();
            }
        
        else{
            putBeeper();
            turnLeft();
            turnLeft();
            move();
        }
        move();
        if (nextToABeeper()){
            
                while (nextToABeeper()){
                    pickBeeper();
                }
                putBeeper();
                turnLeft();
                turnLeft();
                move();
            }
        
        else{
            putBeeper();
            turnLeft();
            turnLeft();
            move();
        } 
        faceEast();
    }
}

