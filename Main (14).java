/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	System.out.println("ARRAYS is a collection of similar types of data.");
	int[]marks = {98,88,77,66,55};
/*	System.out.println(marks[3]);
	System.out.println(marks.length);
	String[]names = {"raju","ram","shaam","john","jack",};
	Scanner sc = new Scanner(System.in);
	int gg = sc.nextInt();
	System.out.println(names[gg]);
	System.out.println(names.length);*/
/*	float[]ages = {1.1f,2.1f,3.3f,4.4f,5.5f};
	//System.out.println(ages[0]);
	for(int i = ages.length-1;i>=0;i--){
	    System.out.println(ages[i]);
	}*/
/*	int[]money = {100,200,300,400,500};
	for(int h = money.length-1;h>=0;h--){
	System.out.println(h);
	}*/
	
	
	
	for(int i = 0;i<marks.length;i++){
	System.out.println(marks[i]);
	}
	
	
	
	for (int j = marks.length-1;j>=0;j--){
	    
	    System.out.println(marks[j]);
	}
	for(int element : marks){
	    System.out.println(element);
	}
	
	}
}
	

