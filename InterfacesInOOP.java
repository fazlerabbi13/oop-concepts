interface Animal{
   public void walk();
}

class Tiger implements Animal{
    public void walk(){
        System.out.println("wlaks by 4 legs");
    }
}

public class InterfacesInOOP {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.walk();
    }
}
