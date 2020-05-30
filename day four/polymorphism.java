2.polymorphism
public class Poly {

	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
	}

}
public class Shape {
	
	
	public void draw() {
		System.out.println("Drawing Shape");
	}
	
	public void erase() {
		System.out.println("Erasing Shape");
	}
	

}
public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Circle");
	}
}

public class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Square");
	}
}
public class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
3.polymorphism
class Fruits

{    

  protected char name, taste, size  ;

 scanner sc = new scanner ( system. in );

 

  public void eat ( ) // overridden method.

 {

       scanner sc = new scanner ( system. in );

       system. out. println ( "enter the name of the fruit " ) ;

       name = nextChar ( ) ;

       system. out. println ( " please provide the taste of the fruit " ) ;

       taste = nextChar ( ) ;

       system. out. println ( " Name of the fruit is: " + name ) ;

       system. out. println ( " Taste of the fruit is: " + taste ) ;  

    }

}

class apple extends fruit

{

  void eat ( ) // overriding method

  {

       system. out. println ( " Name of the fruit is Apple " ) ;

       system. out. println ( " Taste of the fruit is sweet " ) ;

    }  

}

class orange extends fruit

{

   public void eat ( ) // overriding method

  {

       system. out. println ( " Name of the fruit is Orange " ) ;

       system. out. println ( " Taste of the fruit is sour " ) ;

    }

}

class Main

{

 public static void main ( string args )

  {

    apple A = new apple ( ) ;

     A . eat ( ) ;

    orange O = new orange ( ) ;

    O . eat ( ) ;

  }

}

