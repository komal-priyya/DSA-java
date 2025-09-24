import java.util.Scanner;

public class unaryoperator{
    public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the a: ");
int i= sc.nextInt();

int sum= ++i;
System.out.println("pre-increment(++i) " +   "value of i: " +(++i) +  "   value of sum: "+sum);
int res=i++;
System.out.println("post-increment(i++) " + "value of i: "+ (i++)+   "   value of res: "+res);
int sub=--i;

System.out.println("pre-decrement(i--)"  + "value of i: "+ (--i) +   "     value of sub: "+sub);
int sub1=i--;
System.out.println("post-decrement(--i)"  + "value of i: "+ (i--) +    "    value of sub1: "+ sub1);





    }
}