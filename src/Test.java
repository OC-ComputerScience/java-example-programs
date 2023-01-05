
public class Test {

  public static void main(String[] args) {
   
    System.out.println("Shape Test");
    System.out.println("Triangle Test");
    Triangle t= new Triangle(10,8);
    t.setColor("red");
    System.out.println(t.toString());
    System.out.println("Area = "+t.getArea());
    System.out.println("Rectangle Test");
    Rectangle r= new Rectangle(10,8);
    r.setColor("green");
    System.out.println(r.toString());
    System.out.println("Area = "+r.getArea());
    

  }

}
