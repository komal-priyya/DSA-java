public class wrapperfinalfinalise{
    public static void main(String[]args){
        
        final A kunal=new A("komal PRIYA");
kunal.name="other name";
              System.out.print(kunal.name);
    }

   static class A {
        final int num=10;
        String name;


       A(String name){
         this.name=name;
         System.out.println(name +"2");
        }
    }
}