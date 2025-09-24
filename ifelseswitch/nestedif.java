public class nestedif{
    public static void main(String[] args) {
        
        String username= "komalPriya";
        String password="kom1234";
        Boolean isAccountActive=false;

        if(username.equals("komalPriya")){
            System.out.println(" username is correct");
            if(password.equals("kom1234")){
                System.out.println("password is correct");
                if(isAccountActive.equals(true)){
                    System.out.println("Account is active");
                }
                else{
                    System.out.println("Account is deactivated");
                }

            }else{
                System.out.println("password is incorrect");
            }

        } else{
            System.out.println("username is  incorrect");
        }

    }
}