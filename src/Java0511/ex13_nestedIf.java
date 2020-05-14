/*
 *	Date : 2020.05.11 
 * 	Author : sohyun
 * 	Description : 중첩if문(nestedIf)
 * 	Version : 1.0
 * 
*/

package Java0511;

import java.util.Scanner;

public class ex13_nestedIf {

	public static void main(String[] args) {
		// 중첩 if문 : if문 안에 if문
		
		// 학점 출력 프로그램
		// 1.100점을 초과하면
		// "입력범위를 초과했습니다." 출력
		// 2. 학점 처리
		// A+ : 95~100
		// A : 90~94 
		// B+ : 85~89
		// B : 80~84
		// C+ : 75~79
		// C : 70~74
		// D+ : 65~69
		// D : 60~64
		// F : 60미만
		// 3. print문은 1번만 사용
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.println("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score <= 100) {
			if(score >= 90) { 	 	// 90~100
				if(score>=95 ) { 	// 95~100
					grade = "A+";
				}else {			 	// 90~94
					grade = "A";					
				}
			} else if (score >= 80) { // 80~89
				if (score >= 85) {    // 85~89
					grade = "B+";
				} else {
					grade = "B"; 	  // 80~84
				}			
			} else if (score >= 70) { // 70~79
				if(score >= 75) { 	  // 75~79
					grade = "C+";
				} else {			  // 70~74
					grade = "C";
				}
			} else if (score >= 60) { // 60~69
				if(score >= 65) {	  // 65~69
					grade = "D+";
				} else {			  // 60~64
					grade = "D";
				} 
			} else {
				grade = "F";
			}
			System.out.println("학점은 : "+ grade);
		
			} else {
			System.out.println("입력범위를 초과했습니다.");		
		}
	}
}
