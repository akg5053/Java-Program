
    class Calculator {

        public void show(){
            System.out.println("In Calculator: ");
        }
        public void add(int a, int b) {
            System.out.println(a + b);

        }
    }
    // class AdvCalc extends Calculator{

    // }
    class AdvCalc extends Calculator{
        public void show(){
            System.out.println("In advanced Calculator");
        }
    }
    public class FinalDemo{
        public static void main(String[] args) {
            final int sum=8;

            AdvCalc obj= new AdvCalc();
            obj.show();
            obj.add(2, 6);
        }
    }
