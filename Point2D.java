
package javaapplication13;

public class Point2D {
    
    private double x,y;
    private double distance;
    
    public Point2D() {
        this(0,0); //this отсылка к public Point2D(double x, double y)
    }
    
    public Point2D(double x, double y){
        this.x=x;
        this.y=y;
        calcDistance();
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        calcDistance();
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        calcDistance();
    }
    
    public double distance(){
        return distance;
    }
    
    public double distanceTo(Point2D end){
        return Math.sqrt((x-end.x)*(x-end.x)+(y-end.y)*(y-end.y));
    }
    
     public boolean equalTo(Point2D toP2){
        double temp = (x-toP2.x)+(y-toP2.y);
        return temp ==0;       
    }
    
    private void calcDistance() {
        distance=Math.sqrt(x*x+y*y);
    }         
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }     
   
}
