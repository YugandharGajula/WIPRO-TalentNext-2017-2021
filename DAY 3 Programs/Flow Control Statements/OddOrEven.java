import java.util.*;
class OddOrEven {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter number 1:");
    int input1=sc.nextInt();
    
    if(input1%2==0)
      System.out.println("The number"+input1+"is even");
    else 
      System.out.println("The number"+input1+"is odd");
    
  }
}
