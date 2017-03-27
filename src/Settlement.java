import java.awt.*;
import java.util.ArrayList;

public class Settlement {
    private ArrayList<Point> pointsInSettlement;
    private boolean containsTotoro;
    private boolean containsTiger;

    public Settlement(){
        containsTotoro = false;
        containsTiger = false;
        pointsInSettlement = new ArrayList<>();
    }

    public void addPointToSettlement(Point point){
        pointsInSettlement.add(point);
    }

    public boolean contains(Point point){
        for(Point p : pointsInSettlement){
            if(p.getX() == point.getX() && p.getY() == point.getY()){
                return true;
            }
        }
        return false;
    }

    public boolean containsTotoro(){ return containsTotoro; }

    public boolean containsTiger(){ return containsTiger; }

    public void setTiger(){ containsTiger = true; }

    public void setTotoro(){ containsTotoro = true; }

    public ArrayList<Point> getSettlement(){
        return pointsInSettlement;
    }
}
