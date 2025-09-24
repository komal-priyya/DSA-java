// calculator code with switch statement
import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        double num1= inp.nextDouble();
        System.out.print("Enter number2: ");
        double num2=inp.nextDouble();
        System.out.print("enter operator: ");
        char operator = inp.next().charAt(0);
double result;


switch (operator) {
    case '+':

    result=num1+num2;
    System.out.println("sum of num1+num2: "+ result );
    break;
case '-':
    result=num1-num2;
    System.out.println("subtraction of num1-num2: "+result );
    break;
    case '*':
    result=num1*num2;
    System.out.println("multiplication of num1*num2: "+ result );
    break;
        case '/':
    if(num2!=0){
      
    result=num1/num2;
    System.out.println("divisio of num1/num2: "+result );
    break;
    }else{
  
            System.out.println("error:division error");

    }
case '%':
    result=num1%num2;
    System.out.println("modulo of num1-num2: "+result );
    break;
     
    default:
        System.out.println("Invalid operator"+"'"+operator+"'");
}
}}