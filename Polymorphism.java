import java.util.*;

class parent {

    public Scanner scan = new Scanner(System.in);

    public void add() {
        int z, x;
        System.out.println("enter the two a,b values:");
        z = scan.nextInt();
        x = scan.nextInt();
        z = z + x;
        System.out.println(z);
    }

    public void add(int a, int b) {
        int z;
        z = a + b;
        System.out.println("a+b:" + z);
    }
}

class Polymorphism extends parent {
    public void add() {
        int z, x;
        System.out.println("enter the two  z,x values:");
        z = scan.nextInt();
        x = scan.nextInt();
        z = z + x;
        System.out.println(z);
    }

    public static void main(String args[]) {
        Polymorphism p = new Polymorphism();
        parent p1 = new parent();
        p.add();// over ridding
        System.out.println("addition of default given valuses:");
        p.add(5, 6);// over loading
        p1.add();// accessing parent class method
    }
}