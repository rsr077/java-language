import java.util.*;

public class Function {
   public static int calculateMul(int a, int b){
    int mul =a*b;
    return mul;
   }
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
       int a= SC.nextInt();
       int b= SC.nextInt();

     int mul =calculateMul(a, b);
     System.out.println("sum of 2 nubers is :"+mul);
    }
}
