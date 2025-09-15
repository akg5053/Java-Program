

   class Calculator{
    public final void show(){
        System.out.println("In Calcualtor:");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
   } 
//    class AdvCalc extends Calculator{

//    }

  class AdvCalc extends Calculator{
     public void show(){
        System.out.println("In advannced Calculator");
     }
    }
  public class FinalDemo{
  public static void main(String args[]){
     final int num=8;

     AdvCalc obj=new AdvCalc();
     obj.show();
     obj.add(2,3);

         
  }  
}
