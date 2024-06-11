import java.util.*;

public class Solution {
public static void main(String[] args) {
    Scanner SC = new Scanner (System.in);
    int rows = SC.nextInt();
    int cols = SC.nextInt();

    int [][] numbers =new int [rows][cols];
    // input 
    // rows

    for (int i=0; i<rows ; i++){
        // colums 
        for (int j=0;j<cols;j++){
     numbers[i][j]= SC.nextInt();
        }
    }
   int x =SC. nextInt();

    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
           if(numbers[i][j]==x){
            System.out.println("x found at locations (" + i + ","+j+")");
           }
        }
     
    }
}
    
}









