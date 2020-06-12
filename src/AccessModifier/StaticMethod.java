package AccessModifier;

public class StaticMethod {
    public static class Student {
        private int number;
        private String name;
        private static String college = "BBDIT";

        Student (int number, String name){
            this.number = number;
            this.name = name;
        }

        static void chang (){
            college = "CODEGYM";
        }

        void display(){
            System.out.println(number + " " + name + " " + college);
        }
    }
    public static class TestStaticMethod {
        public static void main(String[] args) {
            Student.chang();
            Student s1 = new Student(1, "Thanh");
            Student s2 = new Student(2, "Hai");
            Student s3 = new Student(3, "Nam");

            s1.display();
            s2.display();
            s3.display();
        }
    }



}
