
/*
 	Date : 2020.05.14
 	Author : sohyun
 	Description : while문을 사용한 예제2
 	Version : 1.0
 */

package Java0514;

import java.util.Scanner;

public class Ex01_WhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int account = 0; // 통장만들기 0원
		int sum = 0;
		int menu = 0;

		boolean run = true; // while문 사용하기 위해서
							// run(조건변수) 선언 , true 초기화	 
		
		while (run) {

			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");

			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("입금 할 금액을 입력하세요 >> ");
				account = sc.nextInt();
				sum += account;
				System.out.println("현재 잔고 : " + sum);
				break;

			case 2:
				System.out.print("출금 할 금액을 입력하세요 >> ");
				account = sc.nextInt();
				sum -= account;
				System.out.println("현재 잔고 : " + sum);
				break;
			case 3:
				System.out.println("현재 잔고 : " + sum);
				break;

			case 4:
				run = false;
				break;
				
			default:
				System.out.println("다시 입력하세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
