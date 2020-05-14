
/*
 	Date : 2020.05.13
 	Author : sohyun
 	Description : Continue
 	Version : 1.1
 */

package Java0513;

public class ex03_continue {

	public static void main(String[] args) {
		
		// Continue문은 반복문과 함께 사용
		// 반복문 안에서 Continue문을 만나면
		// 이후 문장은 수행하지 않고
		// for문의 증감식을 수행한다.
		
		/*		
			for(①초기화식;②조건식;④증감식) {
				
			|	특정조건
			|	 ㄴ 조건이 참일때 Continue 실행 -> 증감식으로 이동
			③	 ㄴ 조건이 거짓일때 Continue 건너뛰고 반복문 수행
			|	Continue;
			| 
			|	반복문 수행;
			
			}
		
		*/
		
		for(int i=1; i<=10;i++) {
			if(i%2 == 0) { 
				continue;
			} // 2 4 6 8 10
			System.out.print(i+" ");
			// 1 3 5 7 9
		}
		System.out.println();
		
		// 1부터 100까지 숫자중에
		// 짝수의 합을 구하는 문제
		
		int sum=0;
		
		for(int i=1; i<=100;i++) { 
			if(i%2 != 0) {	// 짝수만 구하는 조건
				continue;
			} // 홀수값은 실행되지 않는다.
			sum += i;
		}
		System.out.println("1부터 100까지 짝수들의 합은 : "+sum);
		
		
		
		
	}

}
