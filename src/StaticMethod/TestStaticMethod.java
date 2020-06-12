package StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.Student.chang();
        StaticMethod.Student s1 = new StaticMethod.Student(1, "Thanh");
        StaticMethod.Student s2 = new StaticMethod.Student(2, "Hai");
        StaticMethod.Student s3 = new StaticMethod.Student(3, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
