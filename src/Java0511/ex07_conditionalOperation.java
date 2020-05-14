/*
 *	Date : 2020.05.11 
 * 	Author : sohyun
 * 	Description : 조건연산자(conditionalOperation)
 * 	Version : 1.0
 * 
*/

package Java0511;

public class ex07_conditionalOperation {

	public static void main(String[] args) {
		//삼항연산자
		
		int inAge = 35;
		int hoonAge = 50;
		
		char resultChar;
		int resultInt;
		String resultStr;
		
		// (조건식) ? 참일때 값 : 거짓일때 값 ;
		// 35 > 50 ? 
		resultChar = (inAge > hoonAge) ? 'O':'X';
		System.out.println("resultChar : "+resultChar);
		
		resultInt = (inAge > hoonAge) ? 0:1;
		System.out.println("resultInt : "+resultInt);

		resultStr = (inAge > hoonAge) ? "참":"거짓";
		System.out.println("resultStr : "+resultStr);
		
		// 조건연산자를 사용하여 10이 짝수인 경우에는 true,
		// 홀수인 경우에는 false 출력하는 조건연산자를 작성하시오.
		
		int num = 10;
		boolean isEven;
		
		isEven = (num%2==0) ? true : false;
		System.out.println("isEven : "+isEven);
		
	}
}
