
/*
 	Date : 2020.05.13
 	Author : sohyun
 	Description : 별찍기 예제
 	Version : 1.0
 */


package Java0513;

public class ex06_forStar {

	public static void main(String[] args) {
		

		// *
		// **
		// ***
		// ****
		// *****
		
		// i = 1	j = 1		
		// i = 2	j = 2
		// i = 3	j = 3
		// i = 4	j = 4
		// i = 5	j = 5
		
		for(int i=1;i<=5;i++) {		
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
				
			System.out.println();
		}
	}
}
