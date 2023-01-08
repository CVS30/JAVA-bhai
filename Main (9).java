
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("put name of ur website ");
		String web = sc.next();
		if(web.endsWith(".com")){
		    System.out.println("commercial website");
		}
		else if(web.endsWith(".org")){
		    System.out.println("organisational website");
		}
		else if(web.endsWith(".in")){
		System.out.println("indian website");
		}
}}
