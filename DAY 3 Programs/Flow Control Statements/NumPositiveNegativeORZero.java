import java.util.*;
class NumPositiveNegativeORZero {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter number 1:");
    int input1=sc.nextInt();
    
    if(input1>0)
      System.out.println("The number"+input1+"is positive");
    else if(input1<0)
      System.out.println("The number"+input1+"is negative");
    else
      System.out.println("The number"+input1+"is equal to 0");
  }
}
