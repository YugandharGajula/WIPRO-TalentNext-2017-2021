public class Box {
    double h,w,d;

     Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { 
	double v;
    	v=h*w*d;
    	return v;
    }
   
    public static void main(String[] args) {
       
    Box bc = new Box(9.5,70.3,9.2);
    System.out.println(bc.volume());

    }

}
