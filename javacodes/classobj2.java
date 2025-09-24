public class classobj2{
    public static void  main(String[]args){
        Student random2= new Student();
        System.out.println(random2);
    }
  static  class Student{
        int id;
 
        String name;
        float marks;


Student(){
    this(13, "default person", 100);
}
Student(int id, String name,float marks) {
 this.id=id;  
    this.name=name;
    this.marks=marks;
}
@Override
 public String toString() {
        return "Student{id=" + id + ", name=" + name + ", marks=" + marks + "}";
    }
}
}