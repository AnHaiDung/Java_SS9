package re.inherit;

public class Parent {
    protected int a;
    private String b;

    public Parent(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public Parent() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void say(){
        System.out.println("Hi");
    }

}
