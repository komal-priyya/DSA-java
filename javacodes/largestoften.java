import java.util.Scanner;
public class largestoften{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

int arr[]= new int[10];
for (int i = 0; i < 10; i++) {
    System.out.print("ENTER THE NUMBER " + (i+1) +":");
    arr[i]=sc.nextInt();
}
int largest=arr[0];
for(int j=0; j<10; j++){
    if(arr[j]>largest){
        largest=arr[j];
    }
}
sc.close();
System.out.print("The largest number is:"+largest);
    }
}