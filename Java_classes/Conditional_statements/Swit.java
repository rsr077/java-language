import java.util.*;
public class Swit {
  

    public static void main(String args []){
        Scanner SC =new Scanner(System.in);
        int n = SC.nextInt();
        switch(n){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wed");
            break;
            case 4: System.out.println("Thr");
            break;
            case 5: System.out.println("fri");
            break;
            case 6: System.out.println("Sat");
            break;
            case 7: System.out.println("Sun");
            break;
            default :System.out.println("Invalid");
        }
}
}

