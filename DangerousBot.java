
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends DoubleBot
{
    public boolean evenNum;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        countBeepers();
        pickDirection();
        enterSafeRoom();
    }
    public void pickDirection(){
        if (beeperNum%2==0){
            evenNum=true;
        }
        else{
            evenNum=false;
        }
    }
    public void enterSafeRoom(){
        if (evenNum==true){
            faceEast();
            move();
            pickPile();
        }
        else{
            faceWest();
            move();
            pickPile();
        }
    }
    public void pickPile(){
        while (nextToABeeper()){
            pickBeeper();
        }
    }
    public void faceEast(){
        while (!facingEast()){
            turnLeft();
        }
    }
    public void faceWest(){
        while (!facingWest()){
            turnLeft();
        }
    }
}

