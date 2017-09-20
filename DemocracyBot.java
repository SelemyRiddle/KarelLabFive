
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
            //fillBallots();
        }
    }
    public void clearBallots(){
        faceNorth();
        
    }
}

