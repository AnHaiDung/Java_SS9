package re.inherit;

public class Child extends Parent {
    // Lop child thua huong cac thuoc tinh va phuong thuc cua lop parent
    private double c;

    public Child(int a, String b, double c) {
        super(a, b);
        this.c = c;
    }

    public Child() {
        super();
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void say(){
        /*
        Dieu kien de ghi de:
        + Phai ke thua
        + Ten phuong thuc va tham so phai giong o lop cha
        + kieu tra ve cua phuong thuc o lop con giong hoac la supper kieu tra ve cua lop cha
        + Pham vi truy cap o lop con phai lon hon hoac bang o lop cha
         */
        System.out.println("Hello");

    }

    // thuoc tinh
    public void printf(){
        System.out.println("a = "+super.a);
    }

    // phuong thuc
    public void say1(){
        super.say();
    }




}
