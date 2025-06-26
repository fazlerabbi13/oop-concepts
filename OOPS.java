class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writting something");
    }
}

public class OOPS {
   public static void main(String[] args) {
        Pen pen = new Pen();
        pen.color="red";
        pen.type="gel";
        pen.write();
   }
}
