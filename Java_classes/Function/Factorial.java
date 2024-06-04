import java.util.*;
public class Factorial {
    public static void printFactoril(int n){
        // loop
       //if(n<0){
       //    System.out.println("Invalid Number");
       //    return ;
       //}
        int factorial =1;
        for(int i=n; i>=1; i--){
            factorial =factorial *1;
        }
        System.out.println(factorial);
        return;
    }
    public static void main (String arg []){
        Scanner SC = new Scanner(System.in);
        int n=SC.nextInt();

        printFactoril(n);
    }
}
