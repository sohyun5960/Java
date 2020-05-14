
/*
 	Date : 2020.05.13
 	Author : sohyun
 	Description : S부터 N까지 합 구하기
 	Version : 1.1
 */

package Java0513;

import java.util.Scanner;

public class ex02_forSnumToNnum {

	public static void main(String[] args) {
		
		// for문을 사용해서 
		// 두개의 정수를 입력 받아서
		// 총합을 구하는 프로그램을 만들어 보시오.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		int sum=0;
//		
//		for(int i=num1;i<=num2;i++) {
//			sum += i;
//		}
//		System.out.println(num1+"부터 "+num2+"까지의 합은 : "+sum);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum=0;
		
		for(int i=num1;i<=num2;i++) {
			sum += i;
			// 1+2+3+4+5+6+7+8+9+10=55
			System.out.print(i);
			// 12345678910
			// System.out.println("+");
			// 1+2+3+4+5+6+7+8+9+10+
			if(i<num2) {
				System.out.print("+");				
			} else { // i >= num2
				System.out.println("="+sum);
			}
			
		}
		System.out.println(num1+"부터 "+num2+"까지의 합은 : "+sum);

	}
}
