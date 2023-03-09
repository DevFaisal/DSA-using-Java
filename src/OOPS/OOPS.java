package OOPS;
public class OOPS {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Faisal";
        s1.rollNo = 15;
        s1.age = 23;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // S1 is copied to S2
        s1.marks[0] = 60; // a Single change in S1
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // Change in S1 reflects to S2 because it is referencing now creating new
                                             // Marks[] }
        }
    }
}

class Student {
    String name;
    int rollNo;
    int age;
    int marks[];

    // Shallow Copy Constructor

    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.rollNo = s1.rollNo;
    // this.age = s1.age;
    // this.marks = s1.marks;
    // }

    // Deep Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        System.out.println("Constructor Called");
        marks = new int[3];
    }

}
