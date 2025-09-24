import java.util.Scanner;
public class comparisonoperator{
    public static void main(String []args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter the num1 : ");

int num1 =sc.nextInt();
System.out.print("Enter the num2 : ");
int num2= sc.nextInt();


System.out.println(" equal  --> (==)   num1==num2 : " + (num1==num2));
System.out.println("Not equal --> (!=)  num1 != num2 : " + (num1 != num2));
System.out.println("greater than--> (>)  num1>num2 : " + (num1>num2));
System.out.println(".less than  --> (<) num1<num2 : " + (num1<num2));
System.out.println("Greater than or equal (>=) num1>=2 : " + (num1>=num2));

System.out.println("less than or equal(<=) num1<=num2: " + (num1<=num2));

    }
}