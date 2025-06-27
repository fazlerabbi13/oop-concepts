
abstract class Animal{
    abstract void walk();
}

class Tiger extends Animal{
    public void walk(){
        System.out.println("walk by 4 legs");
    }
}

public class AbstractionInOOP {
    public static void main(String args[]){
        Tiger tiger = new Tiger();
        tiger.walk();
    }
}
