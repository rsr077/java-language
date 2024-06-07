import java.lang.String;
import java.util.*;

public class Question {
    public static void main(String[] args) {
         Scanner SC =new Scanner(System.in);
 int size =SC.nextInt();
 int numbers[]=new int [size];
 for(int i=0; i<size; i++){
    numbers[i]=SC.nextInt();
   }
    int x =SC.nextInt();
   
       // output
       for (int i=0; i<numbers.length; i++){
        if(numbers[i]==x){
            System.out.println("x found at Index:"+i);
        }
       
}
}
}