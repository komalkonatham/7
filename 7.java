import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandlingExample {
public static void main(String[] args) {
// Write required scanner class and variables a, and b
 try {
 Scanner sr=new Scanner(System.in);
 System.out.print("Enter the value of 'a': ");
 int a=sr.nextInt();
 System.out.print("Enter the value of 'b': ");
 int b=sr.nextInt();
 int r=divide(a,b);
 System.out.println("Result of a/b: "+r);
 // write your code here

 } catch (ArithmeticException e ) {
 System.out.println(e.getMessage());
 // write your code here

 } catch ( InputMismatchException e ) {
 System.out.println("Input Mismatch Exception: Please enter valid
integer values.");
 // write your code here

 }
 }
 public static int divide(int a,int b ) {
 if(b==0)
 throw new ArithmeticException("Arithmetic Exception: / by zero");
 // write your code here
 else
 return a/b;
 }
}
