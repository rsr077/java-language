import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int n =SC.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");
        if(n>1){
            for(int i=2; i<=n;i++){
                System.out.print(b+" ");
                // the concept below is called swapping 
                int temp =b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
    }
}
