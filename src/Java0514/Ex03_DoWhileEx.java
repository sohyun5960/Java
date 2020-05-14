
/*
 	Date : 2020.05.14
 	Author : sohyun
 	Description : do-while문 예제(up&down게임)
 	Version : 1.0
 */

package Java0514;

import java.util.Scanner;

public class Ex03_DoWhileEx {

	public static void main(String[] args) {
		// 3번 안에 맞추면 통과!
		// 그 이후에 맞추면 벌칙!

		int answer = (int) (Math.random() * 45) + 1; // 1~45 사이의 랜덤 숫자 발생
		int input = 0; // 입력받은 숫자를 저장할 변수
		int cnt = 0; // 카운트에 사용될 변수

		boolean run = true; //

		Scanner sc = new Scanner(System.in); // 스캐너 호출
		System.out.println("Up & Down Game 시작!");

		do { // do-while문 시작
			System.out.println("1부터 45까지의 숫자중 하나를 말하세요!");
			input = sc.nextInt(); // 사용자에게 숫자를 입력받음
			cnt++; // 한번 입력시 카운트를 1증가 시킴
			if (input <= 45 && input >= 0) {

				if (answer > input) { // 입력받은 숫자보다 정답이 클때
					System.out.println("Up!더 큰 수를 말하세요!");
				} else if (answer < input) { // 입력받은 숫자보다 정답이 작을때
					System.out.println("Down!더 작은 수를 말하세요!");
				} else {
					System.out.println("정답입니다!"); // 입력받은 숫자와 정답이 같을 때
					System.out.println("시도한 횟수는 " + cnt + "번 입니다.");

					if (cnt <= 3) {
						System.out.println("통과입니다!");
					} else {
						System.out.println("벌칙당첨!");
					}

					run = false; // while문을 종료시킴
				}
			} else {
				System.out.println("다시 입력하세요!");
			}
		} while (run);

	}
}
