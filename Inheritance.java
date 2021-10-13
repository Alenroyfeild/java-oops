import java.util.*;

/*(base class )Passenger
                    |
                  Train
                    |
    (derived class)Inheritance*/
class Passenger {
    private String passengername;
    private long cellno;
    Scanner scan = new Scanner(System.in);

    public void getpassengerdetails() {
        System.out.println("enter the passenger name and cell number:");
        passengername = scan.nextLine();
        cellno = scan.nextLong();
    }

    public void displaypassengerdetails() {
        System.out.println("Passenger name:" + passengername + "\nPassenger cellno:" + cellno);
    }
}

class train extends Passenger {
    private String trainname;
    private int trainno;

    public void gettraindetails() {
        System.out.println("enter the train name and number:");
        trainname = scan.next();
        trainno = scan.nextInt();
    }

    public void displaytraindetails() {
        System.out.println("Train name:" + trainname + "\nTrain no:" + trainno);
    }
}

class Inheritance extends train {
    public static void main(String args[]) {
        Inheritance i = new Inheritance();
        i.getpassengerdetails();// accessing passenger class method through inheritance class object
        i.gettraindetails();// accessing train class method through inheritance class object
        i.displaypassengerdetails();// accessing passenger class method through inheritance class object
        i.displaytraindetails();// accessing train class method through inheritance class object
    }
}
