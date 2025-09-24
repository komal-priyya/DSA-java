// traffic light code

public class ifelseif {

    public static void main(String[] args) {

        String lightColor = "yellow";

        if (lightColor.equals("green")) {
            System.out.println(" You can go");
        } else if (lightColor.equals("yellow")) {
            System.out.println("get ready to go");
        } else if (lightColor.equals("red")) {
            System.out.println(" stop");
        } else {
            System.out.println("UNKNOWN  traffic lightcolor malfunction");
        }
    }
}
