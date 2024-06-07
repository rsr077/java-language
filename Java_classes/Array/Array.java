import java.util.*;
public class Array {
    public static void main(String[] args) {
        //int [] marks =new int[3];
       // int marks[]=new int [3];
  Scanner SC =new Scanner(System.in);
  int size =SC.nextInt();
  int numbers[]=new int [size];
      // int marks [] ={97,98,95};
       // marks[0] =97;
       // marks[1]=98;
       // marks[2]=95;
       // System.out.println(marks[0]);
       // System.out.println(marks[1]);
       // System.out.println(marks[2]);

       // input
       for(int i=0; i<size; i++){
        numbers[i]=SC.nextInt();
       }
       // output
       for (int i=0; i<size; i++){
       // for (int i=0;i<3; i++){
           // System.out.println(marks[i]);
           System.out.println(numbers[i]);
        }
    }
   
   
   
   
   
}
