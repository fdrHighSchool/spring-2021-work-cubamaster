import java.util.*;
public class Cell{
    private int DeadorAlive;

    public Cell(){
        if (Math.random() < 0.2)
            this.DeadorAlive = 1;
        else
            this.DeadorAlive = 0;
    }

    public int  getLiveorDead() {
        return this.DeadorAlive;
    }
    public void setLiveorDead(int LiveorDead){
        this.DeadorAlive = LiveorDead;
    }
    // can you make a set method please
}
