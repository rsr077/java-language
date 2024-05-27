import java.util.Scanner;

public class Conti {
     public static void main(String args []){
     Scanner SC =new Scanner(System.in);
     int Button =SC.nextInt() ;
     if(Button==1){
       System.out.println("hello");
     }
       else if(Button==2){
           System.out.println("nameste");
       
     }
     else if (Button==3){
   System.out.println("Bonjour");
     }
     else {
       System.out.println("Invailed");
     }
}
}