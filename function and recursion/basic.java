
import java.util.*;
public class basic {
    public static void main(String[] args){
        // int ans = sum2();

        // System.out.println(ans);

        // String message=greet();
        // System.out.println((message));
        int ans=sum3(40,30);
        System.out.println((ans));

    
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }

    static int sum2(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number 1 - ");
        int num1=in.nextInt();
        System.out.println("Enter number 2 - ");
        int num2= in.nextInt();
        int sum=num1+num2;
        return sum;
    }

    static String greet(){
        String greeting="How are you";
        return  greeting;
    }
}
