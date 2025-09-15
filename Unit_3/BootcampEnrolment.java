// class TooYoungException{
//     public TooYoungException(String message){
//         super(message);
//     }
// }

// class TooOldException extends RuntimeException{
//     public TooOldException(String message){
//         super(message);
//     }
// }




// public class BootcampEnrolment {
//     public static void enroll(String name, int age) throws  {
        
//     }
    
// }

// BootcampEnrolment.java

class SeatFullException extends Exception {
    public SeatFullException(String message) {
        super(message);
    }
}

class Bootcamp {
    private int totalSeats;
    private int enrolled = 0;

    public Bootcamp(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    // synchronized ensures thread safety
    public synchronized void enroll(String studentName) throws SeatFullException {
        if (enrolled < totalSeats) {
            enrolled++;
            System.out.println(studentName + " enrolled successfully. Seat no: " + enrolled);
        } else {
            throw new SeatFullException("Sorry " + studentName + ", no seats available!");
        }
    }
}

class Student extends Thread {
    private String name;
    private Bootcamp bootcamp;

    public Student(String name, Bootcamp bootcamp) {
        this.name = name;
        this.bootcamp = bootcamp;
    }

    @Override
    public void run() {
        try {
            bootcamp.enroll(name);
        } catch (SeatFullException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

public class BootcampEnrolment {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp(3); // only 3 seats available

        // Creating multiple student threads
        Student s1 = new Student("Ayush", bootcamp);
        Student s2 = new Student("Sarah", bootcamp);
        Student s3 = new Student("Kumar", bootcamp);
        Student s4 = new Student("Neha", bootcamp);

        // Start threads
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
