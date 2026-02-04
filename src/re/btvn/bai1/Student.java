package re.btvn.bai1;

public class Student extends Person {
    private String id;
    private double avg;

    public Student(String name, int age, String id, double avg) {
        super(name, age);
        this.id = id;
        this.avg = avg;
    }

    public Student() {
    }


    @Override
    public void display() {
        super.display();
        System.out.println("name: "+getName());
        System.out.println("age: "+getAge());
        System.out.println("id: "+id);
        System.out.println("avg: "+avg);
    }

    public static void main(String[] args) {
        Person student = new Student("dung",18,"B001",9.5);
        student.display();
    }
}
