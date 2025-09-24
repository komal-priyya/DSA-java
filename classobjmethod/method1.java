public class method1{
    public static void main(String[] args) {
        
student komal =new student();
komal.name="komal";
komal.id=12;
komal.marks=90;
        System.out.println(komal+"komal");

    }
   static  class student{
        String name;
        int id;
        float marks;
        

// public student(){
//     id=12;
//     name="komal";
// marks=89;
// }
//         public student(int i, String n, float m){
//             id=i;
//             name=n;
//             marks=m;
//         }


      public void  info(){
    System.out.println(" id:"+id+"name"+name);

}
@Override
 public String toString() {
        return "Student{id=" + id + ", name=" + name + ", marks=" + marks + "}";
    }
    }
    
    
    }
