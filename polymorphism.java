class Student {
    void role() {
        System.out.println("I am a student");
    }
}

class EngineeringStudent extends Student {
    @Override
    void role() {
        System.out.println("I am an Engineering Student");
    }
}

class MedicalStudent extends Student {
    @Override
    void role() {
        System.out.println("I am a Medical Student");
    }
}

public class polymorphism {
    public static void main(String[] args) {

        Student s;

        s = new EngineeringStudent();
        s.role();

        s = new MedicalStudent();
        s.role();
    }
}