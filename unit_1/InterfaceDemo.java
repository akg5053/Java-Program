interface chess{
    void moves();
}
class King implements chess{
    public void moves(){
        System.out.println("vertical, diagonal, horizontal");
    }
}

class Rook implements chess{
    public void moves(){
        System.out.println("Vertical , horizontal");
    }
}

class Queen implements chess{
    public void moves(){
        System.out.println("vertical, horizontal, diagonal");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
