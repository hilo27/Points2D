
package javaapplication13;

public class Points2D {
    
    static {
        System.out.println("hello!"); //сработает когда обратись к CENTER
    }
    
    public final static Point2D CENTER = new Point2D(0, 0);
    
    public static Point2D addPoints(Point2D p1, Point2D p2) {
        return new Point2D(p1.getX()+p2.getX(), p1.getY()+p2.getY());
    }
}
