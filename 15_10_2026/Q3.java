// sample class and object program
class Student {
    String name = "Rahul";
    int age = 20;

    void display() {
        IO.println("Name: " + name);
        IO.println("Age: " + age);
    }
}

public class Q3 {
    void main() {
        Student s1 = new Student();

        s1.display();
    }
}