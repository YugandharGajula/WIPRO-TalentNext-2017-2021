import java.util.*;
import java.lang.*;
import java.io.*;
class BMI{
    String name;
    double height,weight;
    Main(double w,double h)
    {
        weight=w;
        height=h;
    }
        double BMI()
  {
      return ((weight/(height*height))*703);
    }

  public static void main (String[] args)
    {
        Main m=new Main(69,178);
        System.out.println("The BMI:"+m.BMI());
    }
}
