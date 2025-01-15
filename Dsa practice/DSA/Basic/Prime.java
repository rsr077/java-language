public class Prime {

  public static void main(String[] args) {
    int n = 12;
    if(n<=1){
     int c=2;
      while (c*c<=n) {
        if(n%c==0){
          System.out.println("Not prime");
          c++;
        }else{
          System.out.println("prime");
        }
      }
    }
  }
}