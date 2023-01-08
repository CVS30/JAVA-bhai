/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello sir , pls tell me your name");
		Scanner sc = new Scanner(System.in);
	//	String name = sc.next();
	//	System.out.print(name);
	//	System.out.println(" welcome to our show");
/*	String p =" Dear sir , \n \t this is fun . \n Thanking you \n yours sincerely chinmay ."; 
	System.out.println(p);*/
	System.out.println("tell your age ");
	int age = sc.nextInt();
	/*if(age>=18){
	    System.out.println("you can drive");
	}
	else {
	    System.out.println("you cannot drive ");
	}*/
	if(age>=60){
	    System.out.println("u must retire");
	}
	 else if(age>=25){
	    System.out.println("get a job ");
	 }
	 else if (age>=18){
	    System.out.println("go to college");
	 }
	 else if (age>=6){
	    System.out.println("go t school");
	 }
	 else if (age>0){
	     System.out.println("enjoy life");
	 }
	  
	}    
	 }  
	
	
		
		
		
	

