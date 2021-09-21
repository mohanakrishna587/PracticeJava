public class GrandChild extends ChildClass {
void method(){
    System.out.println("method() from GC class");
}

    public GrandChild() {

        System.out.println("From GrandChildClass constructor");
    }

    public static void main(String[] args) {

    new GrandChild();

    }
}
