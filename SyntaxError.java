public class SyntaxError
{
 public static void main(String[] args)
 {
   System.out.println( "Enter two numbers to multiply.") ;
   Scanner170 keyboard = new Scanner170(System.in);
   int n1, n2 ;
   
   n1 = keyboard.nextInt();
   n2 = keyboard.nextInt();
   
   System.out.println("The product is ");
   System.out.println( n1* n2) ;
 }
}
