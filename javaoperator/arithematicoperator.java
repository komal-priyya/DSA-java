import java.util.Scanner;
public class arithematicoperator{
    public  static void main(String[]args){
         
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter the num1 : ");
         int num1= sc.nextInt();
       System.out.print("Enter the num2 : ");

         int num2= sc.nextInt();
 System.out.println("num1 : "   +   num1   + "n num2  : "+num2);


// ARITHMETIC OPERATOR-----
         System.out.println(" Addition ->  num1 + num2 : "+ (num1+num2));
         System.out.println("Subtraction ->  num1-num2 : "+   (num1-num2));
         System.out.println("Multiplication->  num1*num2 : "+ (num1*num2));
         System.out.println("Division-> num1/num2 : "+ (num1/num2));
         System.out.println("Modulo -> : num1%num2 : "+ (num1%num2));
         
    }
}