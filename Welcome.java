//p1
/*import java.io.*;
import java.lang.*;
class Welcome
{
	public static void main(String[]args)
	{
	String greeting = "Welcome to core Java";
	System.out.println(greeting);
	}
}*/


//p2
// Java code to illustrate String
/*import java.io.*;
import java.lang.*;
 
class Welcome {
    public static void main(String[] args)
    {
        // Declare String without using new operator
        String s = "GeeksforGeeks";
 
        // Prints the String.
        System.out.println("String s = " + s);
 
        // Declare String using new operator
        String s1 = new String("GeeksforGeeks");
 
        // Prints the String.
        System.out.println("String s1 = " + s1);
    }
}*/

//p3

/*public class Welcome
{
	public static void main(String[]args)
	{
	String greeting="Welcome to Core java!";
	System.out.println(greeting);
	for(int i=0; i<greeting.length();i++)
		System.out.println("=");
	System.out.println();
	}
}*/

//p4
/*public class Welcome
{
	public static void main(String[] args)
	{
		System.out.println("We will not use Hello World");
		System.out.println();
		System.out.println("Hi");
	}
}*/


//p5
//Variables
/*public class Welcome
{
	public static void main(String[] args)
	{
		int a=2;
		System.out.println(a);
	}
}*/

//p6
/*public class Welcome
{
	public static void main(String[] args)
	{
		char a;
		System.out.println(a);
	}
}*/

//p7
/*public class Welcome
{
	public static void main(String[] args)
	{
		byte b=3;
		b+=3;
		System.out.println(b);
		
	}
}*/

//p8
/*public class Welcome
{
	public static void main(String[] args)
	{
		byte b=3;
		int c=3;
		b=(byte)c;//It will work but b=b+(byte)c will not work
		System.out.println(b);
	}
}*/
//p9
/*public class Welcome 
{  
public static void main(String args[])  
{  
double d = 166.66;  
//converting double data type into long data type  
long l = (long)d;  
//converting long data type into int data type  
int i = (int)l;  
System.out.println("Before conversion: "+d);  
//fractional part lost  
System.out.println("After conversion into long type: "+l);  
//fractional part lost  
System.out.println("After conversion into int type: "+i);  
}  
}*/ 

/*public class Welcome
{
	public static void main(String []args)
	{
		float a=5.4f;
		int b=5;
		b=(int)a;
		System.out.println(b);
	}
}*/



/*class Welcome{
  public static void main(String[] args){
    int x = 3+'d';
    System.out.println((char)x);
  }
}*/

/*class Welcome{
  public static void main(String[] args){
    double y = 6.2;
    int x=5;
    x = x+(int)y;
    System.out.println(x);
  }
}*/



//new p
/*class Welcome{
  public static void main(String[] args){
    int y = 6;
    byte x=3;
    x = (byte)(x+(byte)y);//would work but x=x+(byte)y wouldn't work.
    System.out.println(x);
  }
}*/


/*class Welcome{
  public static void main(String[] args){
    short y = 6;
    byte x=3;
    x = (byte)(x+(byte)y);//would work but x=x+(byte)y wouldn't work.
    System.out.println(x);
  }
}*/


/*class Welcome{
  public static void main(String[] args){
    short y = 6;
    byte x=3;
    x = (x+(byte)y);//compile error
    System.out.println(x);
  }
}*/

/*class Welcome{
  public static void main(String[] args){
    char y = 'c';
    int z=(int)y;
    y=(char)z; 	
    System.out.println(y);
  }
}*/



/*class Welcome{
  public static void main(String[] args){
    char y = 098;
    //int z=(int)y;
    //y=(char)z; 	
    System.out.println(y);
  }
}*/


// Java program to illustrate the
// application of char literals

/*public class Welcome {
	public static void main(String[] args)
	{
		// single character literl within single quote
		char ch = 'a';
		// It is an Integer literal with octal form
		char b = 075;
		// Unicode representation
		char c = '\u0061';
	
		System.out.println(ch);
		System.out.println(b);
		System.out.println(c);
	
		// Escape character literal
		System.out.println("\" is a symbol");
	}
}*/




/*class Welcome{
  public static void main(String[] args){
    byte y = 23; 
    y+=2;// will print 25
    System.out.println(y);
  }
}*/














		