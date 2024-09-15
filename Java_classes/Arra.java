import java.util.*;

  public class Arra {

  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int rows =SC.nextInt();
    int cols = SC.nextInt();

    int[][] numbers = new int [rows] [cols];

    // input

    for(int i=0; i<rows; i++) {
      
      for(int j=0; j<=cols; j++){
        numbers[i][j] = SC.nextInt();
      
      }
    }
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.println(numbers[i][i] +" ");
      }
      System.out.println();
    }
  }
}




