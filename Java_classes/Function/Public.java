import java.util.*;

public class Public {
    public static int calculateProduct(int a, int b){
 return a*b;
    }

   
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
       int a= SC.nextInt();
       int b= SC.nextInt();

       System.out.println("Product of 2 numbers is : "+calculateProduct(a, b));
    }
}