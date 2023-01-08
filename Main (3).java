/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println ("finding out HSC results ");
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter physics marks ");
    float a = sc.nextFloat ();
      System.out.println ("enter chemistry marks");
    float b = sc.nextFloat ();
      System.out.println ("enter maths marks");
    float c = sc.nextFloat ();
    float d = (a + b + c) / 3;
    if (d >= 40 && a > 33, b > 33, c > 33)
      {
	System.out.println ("congrats you are PASSED");

      }
    else
      {
	System.out.println ("Sorry you are FAILED");

      }
  }
}

System.out.print ("hence ur HSC result is ");
System.out.println (d);





}
}
