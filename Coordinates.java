package Module4_1_2;


public class Coordinates {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double dist;

    Coordinates(int x1, int y1, int x2, int y2){

        this.x1 = x1;
        this.x1 = y2;
        this.x1 = x2;
        this.x1 = y2;
        this.dist =  Math.sqrt(Math.pow((x2-x1 ),2) + Math.pow((y2-y1 ),2));


    }
    public double getdist(){
        return this.dist;
    }
}







