
package javaapplication13;


public class JavaApplication13 {
   
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Point2D p1 = new Point2D();
        p1.setX(1);
        p1.setY(1);
        
        System.out.println("Distance to 0 = " + p1.distance());
        
        Point2D p2 = new Point2D();
        p2.setX(1);
        p2.setY(1);
               
        System.out.println("Distance between = "+p1.distanceTo(p2));
        
       //p1.distanceTo(p2); //правильно
       // destanceBetween(p1,p2); не верно
       
       if(p1.equalTo(p2)) System.out.println("OK");
       
        Point2D p3 = new Point2D(10, 10);
        System.out.println(p3);
        
        p3=Points2D.CENTER;
        p3=Points2D.addPoints(p1, p2);
        
        Class.forName("javaapplication13.Points2D"); // обращения к блоку статик.Points2D чотбы выполнить код единожды
    }
    
}
