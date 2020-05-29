class PrimeOrNot {
  public static void main(String[] args) {
    Scanner reader=new Scanner(System.in);
    System.out.println("enter number:");
    int num=reader.nextInt();
    boolean prime=false;
    for(int i = 2; i <= num/2; ++i)
        {
            
            if(n % i == 0)
            {
                prime= true;
                break;
            }
        }

        if (!prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
