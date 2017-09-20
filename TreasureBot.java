
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends DangerousBot
{
    public boolean foundTreasure;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while (foundTreasure==false){
                if (nextToABeeper()){
                    beeperNum=0;
                    countBeepers();
                    checkClue();
                }
                else{
                    findBeeper();
                    beeperNum=0;
                    countBeepers();
                    checkClue();
                }
        }
        
    }
    public void checkClue(){
        
        if (beeperNum==5){
            foundTreasure=true;
        }
        else if (beeperNum==1){
            foundTreasure=false;
            faceNorth();
            findBeeper();
        }
        else if (beeperNum==2){
            foundTreasure=false;
            faceEast();
            findBeeper();
        }
        else if (beeperNum==3){
            foundTreasure=false;
            faceSouth();
            findBeeper();
        }
        else if (beeperNum==4){
            foundTreasure=false;
            faceWest();
            findBeeper();
        }
    }
    public void faceNorth(){
        while (!facingNorth()){
            turnLeft();
        }
    }
    public void faceSouth(){
        while (!facingSouth()){
            turnLeft();
        }
    }
    public void findBeeper(){
        while (!nextToABeeper()){
            move();
        }
    }
}

