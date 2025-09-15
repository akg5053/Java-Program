

public class basic2 {
    public static void main(String [] arg){
        int a=20;
        int b=30;

        // swap(a,b);
        // System.out.println(a + " " + b);
    }
    
    //no pass by reference in java ,,,,only pass by value.....
    static void swap(int a, int b){
        int temp=a;
        a=b; 
        b=temp;
        System.out.println("new" +a + " " + b);
    }
    static void random(int marks){
        int num=90;
        System.out.println(num);
        System.out.println(marks);
    }

}
