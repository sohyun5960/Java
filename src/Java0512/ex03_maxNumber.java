
/*
 *	Date : 2020.05.12 
 * 	Author : sohyun
 * 	Description : 최댓값구하기(maxNumberEx)
 * 	Version : 1.0
 * 
*/

package Java0512;

import java.util.Scanner;

public class ex03_maxNumber {
	public static void main(String[] args) {
		// 두 수를 입력받아 큰수를 출력하기

		Scanner sc = new Scanner(System.in);

//		int num1, num2, max;
//		
//		System.out.print("첫번째 숫자 >> ");
//		num1 = sc.nextInt();
//		System.out.print("두번째 숫자 >> ");
//		num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		
//		System.out.println("최댓값 : "+max);

		// 숫자 3개를 입력받아서 최댓값 구하기
		int max = 0;

		System.out.print("첫번째 숫자 >>");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 >>");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자 >>");
		int num3 = sc.nextInt();

//		if (num1 > num2) {
//			if (num1 > num3) {
//				max = num1;
//			} else {
//				max = num3;
//			}
//		} else if (num2 > num1) { // 위에서 비교했으므로 필요없는 코드
//			if (num2 > num3) {
//				max = num2;
//			} else {
//				max = num3;
//			}
//		} else {
//			max = num3;
//		}
//
//		System.out.println("최댓값 : " + max);
		
		if(num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println("최댓값 : " + max);
	}

}
