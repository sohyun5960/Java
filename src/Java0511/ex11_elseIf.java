/*
 *	Date : 2020.05.11 
 * 	Author : sohyun
 * 	Description : 조건문(elseIf)
 * 	Version : 1.0
 * 
*/

package Java0511;

public class ex11_elseIf {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 5;
		
//		if(num1>num2) {
//			System.out.println("num1이 크다.");
//		} else {
//			System.out.println("num2가 크다.");			
//		}
		
		if(num1 > num2) {
			System.out.println("num1이 크다.");
		} else if(num1 > num2) {
			System.out.println("num2이 크다.");	
		} else {
			System.out.println("num1과 num2이 같다.");				
		}
		
		// if(조건식1) {
		//		조건식1이 참일때 실행
		// } else if(조건식2) {
		// 		조건식2가 참일떄 실행
		// } else {
		//		조건식1,2가 모두 거짓일때 실행
		// }
	}
}
