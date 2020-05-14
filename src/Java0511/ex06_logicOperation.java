/*
 *	Date : 2020.05.11 
 * 	Author : sohyun
 * 	Description : 논리연산자(logicOperation)
 * 	Version : 1.0
 * 
*/

package Java0511;

public class ex06_logicOperation {

	public static void main(String[] args) {
		
		// 논리연산자 AND연산, OR연산, NOT연산
		
		// AND연산: &&
		// A && B 일때, A,B 모두 true여야 결과가 true
		// A,B 중에 하나라도 false가 있으면 결과는 false
		
		// OR연산: ||
		// A || B 일때, A,B 중에 하나라도 true가 있으면 true
		// A,B 모두 false여야 결과가 false
		
		// NOT연산: !
		// boolean 변수 앞에 사용하면 true가 false로 
		// false가 true로 바뀜
		
		boolean result;
		
		// AND
		result = true && true;
		System.out.println("true && true = "+result);
		
		result = true && false;
		System.out.println("true && false = "+result);
		
		result = false && false;
		System.out.println("false && false = "+result);
		
		System.out.println("================================");
		
		// OR
		result = true || true;
		System.out.println("true || true = "+result);
		
		result = true || false;
		System.out.println("true || false = "+result);
		
		result = false || false;
		System.out.println("false || false = "+result);
		
		System.out.println("================================");
		
		// NOT
		result = true;
		result = !result;
		System.out.println("!result : "+ result);
		
		result = !result;
		System.out.println("!!result : "+ result);
		
		
		result = !false;
		System.out.println("!false : "+ result);

	}

}
