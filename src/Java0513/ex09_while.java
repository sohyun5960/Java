
/*
 	Date : 2020.05.13
 	Author : sohyun
 	Description : while
 	Version : 1.0
 */

package Java0513;

public class ex09_while {

	public static void main(String[] args) {
		
		
		// while
		
		/*
			while(반복조건) {
				실행내용
			}
		*/
		
		int i = 3;
		int sum = 0;
		
		while(i<=10) {
			sum +=i;
			System.out.println(i + " ");
			i++;
		}
		System.out.println("\nsum : "+sum);
	}
	
		/* for(초기화식;조건식;증감식) {
			초기화식
			while(조건식) {
				증감식
			}
		}
		 */
}
