public class MemoryDemo {
    static int schoolcode = 101;
    int rollno;
    
    static void showSchool(){
        System.out.println(schoolcode);
    }
    void showRoll(){
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        showSchool();
        MemoryDemo m1 = new MemoryDemo();
        m1.rollno=12;
        m1.showRoll();
    }
}
