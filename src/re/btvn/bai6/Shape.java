package re.btvn.bai6;
import java.util.Scanner;

public class Shape {
    private double c;
    private double s;

    public Shape(double c, double s) {
        this.c = c;
        this.s = s;
    }

    public Shape(){}

    public void calculatePerimeter(){};

    public void calculateArea(){};

    public void setC(double c) {
        this.c = c;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getC() {
        return c;
    }

    public double getS() {
        return s;
    }

    public static void main(String[] args) {
        Shape[] arr = new Shape[4];
        arr[0] = new Rectangle(4,5);
        arr[1] = new Circle(3);
        arr[2] = new Circle(4);
        arr[3] = new Rectangle(6,7);

        for (int i = 0 ; i < 4 ; i++){
            Shape s = arr[i];
            s.calculatePerimeter();
            s.calculateArea();
            String type = s.getClass().getSimpleName();
            System.out.printf("Hình %d : %s(%s - chu vi : %.2f - diện tích : %.2f)\n",(i+1) , type , s.toString() , s.getC() , s.getS());

        }
    }
}
