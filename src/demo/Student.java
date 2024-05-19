package demo;

public class Student {
    String name;
    int roll;
    String address;
//    public Student(){}

//    public Student(String address, String name, int roll) {
//        this.address = address;
//        this.name = name;
//        this.roll = roll;
//    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.address);

//        Student s1 = new Student("Liluah",  "Gunjan", 10);
//        System.out.println(s1.name);
//        System.out.println(s1.roll);
//        System.out.println(s1.address);
    }
}
