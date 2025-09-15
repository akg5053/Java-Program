
public class outer {
    class Inner {
        void greet(){
            System.out.println("Hello from inner class ");
        }
    }
    public static void main(String[] args) {
        outer outerobj = new outer();
        outer.Inner innerObj = outerobj.new Inner();
        innerObj.greet();;


        
    }
}
