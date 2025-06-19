class Student {
    int roll;
    String name;
    int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{roll=" + roll + ", name='" + name + "', age=" + age + "}";
    }
}

public class AK_05_Classes {
    public static void main(String[] args) {
        Student st = new Student(22, "Aanand", 20);
        Student st2 = new Student(32, "Ayush", 22);

        System.out.println(st);
    }
}