/*public class HelloWorld{
public static void main(String[]args){
System.out.println("hello world");
}
}
*/
//Sum of Number//
/*import java.util.scanner;
public class SumOfNumbers{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter firsr number":);
int a = sc.nextInt();
System out.print("Enter second number":);
int b = sc.nextInt();
int Sum = a+b;
System.out.println("Sum = " +Sum);
}
}
*/

//Largest of TwoNumbers//
/*Import Java.util.scanner;
public class LargestOfNumber{
Public static void main(String[]args){
Scanner sc = new scanner (System.in);
System.out.print("Enter first number":);
int a= sc.nextInt();
System.out.print("Enter second number":):
int b = sc.nextInt();
if(a>b){
system.out.println(a + " is largest")
} else {
system.out.println(b + " is largest");
}
}
}
*/

//Larget of three numbers//
/*Import java.util.scanner;
public class LargestOfNumbers{
public static void main(String[]args){
Scanner sc = new scanner(System.in);
System.out.print("Enter three number":);
int a = sc.nextInt();
int b = sc.nextInt();
Int c = sc.nextInt();
if (a>=b && a>=c) {
System.out.println(a + " is largest");
}
else if ( b>=a && b>=c){
System.out.println(b + " is largest");
}else {
System.out.println(c + " is largest");
}
}
}
*/

//Even or Odd//
/*Import java.util.scanner;
public class EvenOrOdd{
public static void main(String[]args){
Scanner sc = new scanner(System.in);
int n = sc.nextInt();
if( n % 2 ==0){
System.out.print("Even");
}else{
System.out.print("Odd");
}
}
}*/
//Leap year//
/*Import java.util.scanner;
public class LeapYear{
public static void main(String[]args){
scanner sc = new scanner(system.in);
System.out.print("Enter a year")
Int year = sc.nextInt();
If(year%400==0)||(year%4==0 && year%100!=0)
System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
}
}
}
*/
import java.util.scanner;
public class calculator{
public static void main(String[]args){
scanner sc = new scanner(system.in);
system.out.print("Enter first number")
int a = sc.nextInt();
system.out.print("Enter operator (+,-,",/):);
char op = sc.next().charAt(0);
system.out.print("Enter second number");
int b = sc.nextInt();
Switch (op){
case '+':
system.out.println("Result = " + (a+b));
break;
case '-':
system.out.println("Result = "+ (a-b));
break;
case '*':
system.out.println("Result = "+ (a*b));
break;
case'/':
system.out.println("Result = "+ (a/b));
break;
default:
}
}
}
system.out.println("Invalid operator");







