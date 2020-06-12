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
}
