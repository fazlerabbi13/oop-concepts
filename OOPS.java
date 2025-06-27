class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writting something");
    }

}

class Student{
    String name;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non parameterize constructor

    // Student(){
    //     System.out.println("constructor");
    // }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
}

public class OOPS {
   public static void main(String[] args) {
        // Pen pen = new Pen();
        // pen.color="red";
        // pen.type="gel";
        // pen.write();
        Student s1 = new Student("rabbi",23);
        // s1.name="rabbi";
        // s1.age=23;
        s1.info();
   }
}
