
/*
 *	Date : 2020.05.12 
 * 	Author : sohyun
 * 	Description : switchCase2
 * 	Version : 1.0
 * 
*/

package Java0512;

import java.util.Scanner;

public class ex05_switchCase2 {

	public static void main(String[] args) {
		// switch-case문 사용해서 월별 날짜 계산하기

		int month;
		int day = 0;
		// ㄴ지정한 값 이외에는 값이 지정되어있지않기 때문에 초기값을 주어서 오류 해결

		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요 >> ");
		month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("값을 잘못 입력했습니다.");
			break;
		}

		if (month < 13 && month > 0) 
			System.out.println("입력하신 " + month + "월은 " + day + "일까지 있습니다.");
		// if문 사용시 {}가 없으면 바로 아래의 한줄만 if문으로 실행
	}

}
