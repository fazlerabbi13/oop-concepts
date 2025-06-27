class Shape{
    String color;

    public void area(){
        System.out.println("Area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

public class InheritanceInOOP {
    public static void main(String args[]){
        Triangle t = new Triangle();
        t.area(5,10);
    }
}
