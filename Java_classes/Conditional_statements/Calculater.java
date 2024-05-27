
import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner("System.in");

System.out.println("Enter first nuber:");
Double num1 =Scanner.nextDouble();

System.out.println("Enter first nuber:");
char operator =Scanner.next().charAT(0);

System.out.println("Enter Second nuber:");
Double num2 =Scanner.nextDouble();

double result;
switch (operator) {
    case '+':
        result =num1 + num2;
        break;
        case '-':
        result =num1 - num2;
        break;
        case '*':
        result =num1 * num2;
        break;
        case '/':
       if(num2 !=0){
        result = num1 /num2;

       }
       else{
        System .out.println("Error!Division by zero is not allowed");
        return;
       }
       break;
       default:
       System.out.println("Error ! Invalid operator");
       return;
       
      
      
      

  
  
}
System.out.println("The result is : =result");
    }
}
