public class typecasting{
    public static void main(String[]args){
        double doubleValue=123.45;
        float floatValue= (float) doubleValue;
        long longValue= (long)floatValue;
        int intValue= (int)longValue;


        System.out.println("doubleValue: "+ doubleValue);
        System.out.println("floatValue: "+ floatValue);
        System.out.println("longValue: "+ longValue);
        System.out.println("intValue: "+ intValue);
    System.out.println(doubleValue);
    }
}