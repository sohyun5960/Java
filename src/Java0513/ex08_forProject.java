
/*
 	Date : 2020.05.13
 	Author : 이소현,김도연,차호정
 	Description : 별찍기 조별과제
 	Version : 1.0
 */

package Java0513;

public class ex08_forProject {

	public static void main(String[] args) {

//		    *
//		   ***
//		  *****
//		 *******

		for (int i = 1; i <= 4; i++) {
			for (int j =1; j <= 4-i; j++) {
				System.out.print(" ");	
			}
			for(int k=1;k<=(i*2-1);k++) {
				System.out.print("*");
			}
			for (int j =1; j <= 4-i; j++) {
				System.out.print(" ");	
			}
			System.out.println();
		}
	}

}
