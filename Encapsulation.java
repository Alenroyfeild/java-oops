import java.util.*;

class Student1 {
    private String name;

    public void displayName() {
        System.out.println("Student:" + name);
    }

    public void getName(String name) {
        this.name = name;
    }
}

class Encapsulation extends Student1 {
    public static void main(String[] args) {
        Encapsulation s = new Encapsulation();
        s.getName("vijay");
        s.displayName();
    }
}