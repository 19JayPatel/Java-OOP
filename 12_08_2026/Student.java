/*
 * QUE 1 // Create a java program which has a concept of class and object.
 * class name is student which has data members roll no and name .Consider by
 * default static value variable name as total.find out the percentage and
 * display student roll no , student name and percentage.
 * 
 */

class Student {
    int rollNo;
    String name;
    int total = 500; // Total marks

    int marks1, marks2, marks3, marks4, marks5;

    void calculatePercentage() {
        int obtained = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (obtained * 100.0) / total;

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.rollNo = 101;
        s.name = "Rahul";

        s.marks1 = 80;
        s.marks2 = 75;
        s.marks3 = 90;
        s.marks4 = 85;
        s.marks5 = 70;

        s.calculatePercentage();
    }
}
