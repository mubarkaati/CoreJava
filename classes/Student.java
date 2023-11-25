package classes;

public class Student {

    int rollNumber;
    String name;
    String phoneNumber;
    static String schoolName;

    public Student(int rollNumber, String name, String phoneNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

class EmployeeN {

}

class StudentApplication {

    static {
        System.out.println("Hello");
        System.out.println("Hello Again");
    }

    public static void main(String[] args) {
        Student.schoolName = "XYZ";
        Student student1 = new Student(1, "abc1", "12345");
        Object object = new Student(1, "jdsj", "887438");
        Student student2 = new Student(2, "abc2", "12346");
        Student student3 = new Student(3, "abc3", "12347");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }

    static {
        System.out.println("Hello");
        System.out.println("Hello Again");
    }
}