public class Test4{
    public static void main(String[] args) {
        int bookCount=0;
        int totalPrice=100;

        if(bookCount == 0){
            throw new ArithmeticException("Cannot divide total price by zero");
        }
        int pricePerBook = totalPrice/bookCount;
        System.out.println("Eatch book costs "+ pricePerBook);
        
    }
}