/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("learning JAVA");
		Scanner sc = new Scanner(System.in);
/*System.out.println("hello sir whats ur name?");
String name = sc.next();
System.out.println("welcome "+name+" to our hotel");*/
String nam = sc.nextLine();
int val = nam.length();
System.out.println(val);
String hh = nam.toLowerCase();
System.out.println(hh);
String dd = nam.toUpperCase();
System.out.println(dd);
String aa = nam.trim();
System.out.println(aa);

		
	}
}
