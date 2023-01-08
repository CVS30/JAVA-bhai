/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("TELL UR NAME");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.print("Hello ");
		System.out.print(name);
		System.out.println(" nice to meet you");
	}
}
