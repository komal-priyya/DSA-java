import java.util.Scanner;
public class logicaloperator{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the num1: ");
        int num = sc.nextInt();
    System.out.print("Enter the num2: ");
    int num1= sc.nextInt();
    System.out.println("Enter the num3");
    int num3= sc.nextInt();
    System.out.println("enter flag value");
    Boolean Flag=sc.nextBoolean();


    System.out.println(" AND operator(&&)--> num>num1 && num>num3 :"+ (num>num1 && num>num3) );
    System.out.println(" OR operator(||)--> num>num1 || num>num3 :"+ (num>num1 || num>num3));
    System.out.println(" NOT operator(&&)--> !Flag :"+ (!Flag));





    }
}