
/*
 *	Date : 2020.05.12 
 * 	Author : sohyun
 * 	Description : ifExample2
 * 	Version : 1.0
 * 
*/

package Java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {

		// 스캐너를 사용해서 국어, 영어, 수학점수를 입력받아서
		// 총점, 평균을 구하시오/
		// 평균점수를 이용하여 A+,A,B+,B,C+,C,D+,D,F
		// 프로그램을 만들어보시오.
		// 총점과 평균은 실수형으로

		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int mat = sc.nextInt();

		double tot = kor + eng + mat;
		double avg = tot / 3;
		String grade;

		if (avg >= 90) {
			if (avg >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}

		} else {
			grade = "F";
		}

		System.out.println("총점 : " + tot + " 평균: " 
		+ avg + " 당신의 학점은  " + grade + " 입니다.");
	}
}
