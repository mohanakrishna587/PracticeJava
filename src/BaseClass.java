public class BaseClass {

    public int age = 20;

    public BaseClass() {
        System.out.println("From BaseClass constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "";
    protected String gender = "";

    public void display(){
        System.out.println("age "+age);
        System.out.println("name "+name);
        System.out.println("gender "+gender);
    }


}
