import javax.sound.midi.Soundbank;

public class ChildClass extends BaseClass {
    public static String name;

    public ChildClass() {
        System.out.println("age from Base Class" +super.age);
        System.out.println("From ChildClass constructor");
    }

    public static void main(String[] args) {
        ChildClass ch = new ChildClass();
        ch.gender = "Female";
        ch.name = "bhavya";
        ch.setName(ch.name);

        ch.display();
    }

    void method(){
        System.out.println("method() method from Child class");
    }

    //overloading at compile time
    void method(String s){
        System.out.println();
    }

    void method(int num){

    }
}
