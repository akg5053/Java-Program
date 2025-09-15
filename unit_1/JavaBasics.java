
import java.util.*;

public class JavaBasics{
    public static void main(String[] args) {
        float radius;
        double area;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius=SC.nextFloat();
        area= 3.14 * radius * radius ;
        System.out.println("Area of circle = "+ area);
    }
}