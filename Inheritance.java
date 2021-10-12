import java.util.*;

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
        i.getpassengerdetails();
        i.gettraindetails();
        i.displaypassengerdetails();
        i.displaytraindetails();
    }
}
