import java.util.*;
public class Switch {
    public static void main(String args []){
        Scanner SC =new Scanner(System.in);
        int Button =SC.nextInt() ;
        switch(Button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default :System.out.println("Invalid");
        }
}
}