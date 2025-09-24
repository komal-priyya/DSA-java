public class ifelse{
    public static void main(String[] args) {
        String password="Admin123";
        String input="Admin1234";


        if(password.equals(input)){
            System.out.print("Password is correcct");

        }
        else{
            System.out.println("Invalid password");
        }
    }
}