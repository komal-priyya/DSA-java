public class method{

public static int logic(int a,int b){
    int z;
    if(a>b){
        z=a*b+b;
    }else{
        z=a+b;
    }
    return z;
}
    public static void main(String[] args) {
        


        int a=3;
        int b=4;
        int c;
        c= logic(a,b);

        System.out.println("c: "+ c);

    }
}