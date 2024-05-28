import java.util.*;
public class Whil {
    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) {
            int n =SC.nextInt();

            int sum =0;
            for(int i =0; i<=n;i++){
                sum =sum +i;
            }
            System.out.println(sum);
        }
    }
}
