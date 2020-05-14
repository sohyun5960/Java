
/*
 	Date : 2020.05.13
 	Author : sohyun
 	Description : 구구단
 	Version : 1.1
 */

package Java0513;

public class ex05_multTable {

	public static void main(String[] args) {
		
		// 중첩 for문을 이용하여
		// 구구단을 작성해라
		// 2단부터 9단까지
		
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.print(j+"*"+i+"="+i*j);
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
		
		
		// 응용문제
		// 홀수 단만 출력하기
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {

				if(j%2==0) { // j가 짝수
					continue;
				}
				System.out.print(j+"*"+i+"="+i*j);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
