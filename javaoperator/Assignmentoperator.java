import java.util.Scanner;
public class Assignmentoperator{
    public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the a: ");
int a = sc.nextInt();
System.out.println("Enter the b: ");
int b = sc.nextInt();

System.out.println(".equal assignment(=) a=b : "+ (a=b));

System.out.println("Additive assignment opertor(+=) (a+=b: "+   (a+=b));
System.out.println("Subtractive assignment operator(-=)  (a-=b: "+ (a-=b));
System.out.println("Multiplicative assignment operator(*=) (a*=b: "+ (a*=b));
System.out.println("division assignment opertor(/=) (a/=b:  "+ (a/=b));
System.out.println("Modulus ASSIGNMENT OPERTOR(%=) (a%=b:  "+(a%=b));
System.out.println("Bitwise AND assignment operator (&=) (a&=b: " + (a&=b) +  "a: "+a);
System.out.println("Bitwise OR assignment operator (|=) (a|=b : " + (a|=b) +  "a: "+a);
System.out.println("Bitwise EX-OR assignment operator(^=) (a^=b : "+(a^=b)+  "a: "+a);
System.out.println("Bitwise left shift assignment operator(<<=) (a<<=b: "+ (a<<=b)+  "a: "+a);







    }
}