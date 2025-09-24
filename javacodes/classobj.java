

// //WITH THIS KEYWORD
// public class classobj{
// public static void main(String[]args){
//     Student komal = new Student();
// //     komal.id=23;
// // komal.name="komal priya";
// // komal.marks=88.9f;
//     System.out.print(komal);
// }
//  static class Student {
//     int id;
//     String name;
//     float marks;

//     Student() {
//     this.id=12;
//       this.name ="komal Priya";
//       this.marks=90.0f;
//     }

//     @Override
//     public String toString() {
//         return "Student{id=" + id + ", name=" + name + ", marks=" + marks + "}";
//     }
// }
// }




public class classobj{
    public static void main(String[] args) {
        Student komal=new Student();
        Student hsl=new Student(45,"pilla",80.90f);
                Student random =new Student(komal);
        Student arpit=new Student(34,"arpit",89);

        System.out.println("my info as komal  " + komal);
        System.out.println("my info as hsl  "    + hsl);
        System.out.println("my info as arpit  " + arpit);
        komal.changeName("shoe lover");

        komal.greeting();
        System.out.println("my info as random   "+ random);
    // komal.changeName(newName:"shoe lover");

    }

    static class Student{
        int id;
        String name;
        float marks;
    
void changeName(String newName){
   System.out.println( this.name=newName);
}
void greeting(){
    System.out.println("my name is"+ this.name);
}
Student(Student other){
this.id=other.id;
this.name=other.name;
this.marks=other.marks; 
}
    Student(){
        this.id=12;
        this.name="komal PRIYA";
        this.marks=80.67f;
    }
    Student(int id, String name,float marks){
        this.id=id;
this.name=name;
this.marks=marks;

    }
   
     // void changeName(String newName){
    //     name=newName;
    // }
 @Override
    public String toString() {
        return "Student{id=" + id + ", name=" + name + ", marks=" + marks + "}";
    }

    }
static class Student1 {
    int id;
    String name;
    float marks;
// u can create new class, constructor nand new obj to give this value like Student1 hello=newStudent1()
    // Student1() {
    //     this.id = 1;
    //     this.name = "hsl";
    //     this.marks = 80.67f;
    // }

    @Override
    public String toString() {
        return "Student1{id=" + id + ", name=" + name + ", marks=" + marks + "}";
    }
}
}

