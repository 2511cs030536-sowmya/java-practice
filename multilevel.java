class Person {
    void display() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("I am a Manager");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.display();
        m.work();
        m.manage();
    }
}