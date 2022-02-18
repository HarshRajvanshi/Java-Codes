class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }

}
class Rectangle{
    int length;
    int breadth;
    public void area(){
        System.out.println("area of rectangle");
        System.out.println(length*breadth);
    }
    public void parameter(){
        System.out.println("parameter of rectangle");
        System.out.println(2*(length+breadth));
    }
}

public class Shapes {
    public static void main(String[] args) {
        Square one=new Square();
        Rectangle two=new Rectangle();
        one.side=3;
        two.length=12;
        two.breadth=8;
        System.out.println(one.area());
        System.out.println(one.parameter());

        two.area();
        two.parameter();

    }
}
