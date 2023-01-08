/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
  
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*String po = sc.nextLine();
	int value = po.indexOf("don");
	System.out.println(value);*/
	int age = sc.nextInt();
	switch(age){
	    case 18 :
	        System.out.println("u r mature ");
	        break;
	case 23 :
	    System.out.println("go to work ");
	    break ;
	case 27 :
	    System.out.println("get married ");
	    break;
	default : 
	     System.out.println("enjoy life");
	     break;
	     
	
	}
	
		
	}
}
