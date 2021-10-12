import java.util.*;

abstract class decide {
    abstract void result();
}

class student extends decide {
    String studentname;
    int rollno;
    int marks;
    Scanner scan = new Scanner(System.in);

    public void getdetails() {
        System.out.println("enter the student name,rollno:");
        studentname = scan.nextLine();
        rollno = scan.nextInt();
    }

    public void result() {
        System.out.println("enter the student marks:");
        marks = scan.nextInt();
        System.out.println("Student name: " + studentname + "\nStudent Rollno: " + rollno);
        if (marks > 50) {
            System.out.println("Exam results:Pass");
        } else {
            System.out.println("Exam results:Fail");
        }
    }

}

class Abstraction extends student {
    public static void main(String args[]) {
        Abstraction a = new Abstraction();
        a.getdetails();
        a.result();
    }
}
