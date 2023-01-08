/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("MULTIDIMENSIONAL ARRAY");
		System.out.println("print 2 D array using for loop");
		int[][]flats;
		flats = new int[2][3];
		flats [0][0]=101;
		flats[0][1]=102;
		flats[0][2]=103;
		flats[1][0]=201;
		flats[1][1]=202;
		flats[1][2]=203;
		for (int i = 0;i<flats.length;i++){
		for(int j = 0; j<flats[i].length;j++){
		    System.out.print(flats[i][j]);
		    System.out.print(" ");
		}
		System.out.println(" ");
		}
	}
}
