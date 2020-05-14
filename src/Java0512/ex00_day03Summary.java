/*
 	Date : 2020.05.13
 	Author : sohyun
 	Description : Java 3일차 정리
 	Version : 1.0
 */

package Java0512;

public class ex00_day03Summary {

	public static void main(String[] args) {
		// 1.랜덤메소드 : 0보다 크거나 같고, 1보다 작은수를 무작위로 발생
		// 0.0000 ~ 0.9999...
		
		int rNum = (int)(Math.random()*10)+1;
		// 1부터 10까지의 숫자중 랜덤으로 발생
		//(int)(Math.random()*N)+S
		// N:시작값 , S:끝나는값
		
		double dNum = Math.random();
		System.out.println("dNum : " + dNum);
		// 실행결과1 : 0.1177 =>> 1.117 =>> 1 =>> 2
		// 실행결과2 : 0.6978 =>> 6.978 =>> 6 =>> 7
		// 실행결과3 : 0.6482 =>> 6.482 =>> 6 =>> 7
		
		// 2. 조건문 switch-case
		/*
			switch(조건변수) {
			case 변수값1:
				해당조건이 참일때 실행 :1
				break;
			case 변수값2:
				해당조건이 참일때 실행 :2
				break;
			case 변수값3:
				해당조건이 참일때 실행 :3
				break;
			~~~~~~~~
			default:
				case에서 어떤 조건도 맞지 않을때 실행
				break;
			}
			
			//break가 실행될때까지 다음 case문을 실행
			
		*/
		
		// 3. 반복문 For
		
		/*
		 	for(초기화식;조건식;증감식) {
		 		반복할 수행문		 	
		 	}
		 
		 */
	}

}
