public class thisa {
    public static class Student {
        String name;  // instance variable

        // Constructor with parameter 'name'
        public Student(String name) {
            this.name = name;  // 'this.name' refers to instance variable, 'name' refers to constructor parameter
            System.out.println("Student name1: " + name);
        }

        public void display() {
            String name = "komal";
            System.out.println("Student name2: " + this.name);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.display();
    }
}
