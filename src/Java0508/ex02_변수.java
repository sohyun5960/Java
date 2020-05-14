/*
 *	Date : 2020.05.08 
 * 	Author : sohyun
 * 	Description :
 * 	Version : 
 * 
*/

package Java0508;

public class ex02_변수 {

	public static void main(String[] args) {
		
		// 변수 : 프로그램 실행에 필요한 데이터를 저장하기위해
		//		메모리 공간을 할당하고, 이름을 부여한것
		
		// var num = 0;
		// [변수타입] [변수명] = [변수값];
		
		int age = 35;
		
		int age1;  //변수선언
		age1 = 35; //변수초기화
		
		// 1byte : 8bit -128 ~ 127
		//              -2^7 ~ (2^7)-1
		// 1  1  1  1  1 1 1 1
		// +- 64 32 16 8 4 2 1
		
		byte bnum1 = -128;
		byte bnum2 = 127;
		
		int bnum4 = 128;
		int bnum3 = -129;
		
		// int : -2,147,483,648 ~ 2,147,483,647

		int inum1 = -2147483648;
		int inum2 = 2147483647;

		// 변수값에는 L을 썼지만 출력은 되지않는다.
		long inum3 = -2147483649L;
		long inum4 = 2147483648L;
		
		System.out.println(inum1);
		System.out.println(inum4);
		
		
		// 실수형
		// double > float
		
		float pi1 = 3.14f;
		double pi2 = 3.14;
		
		// long L 추가
		// float f 추가
		
		// 변수타입	1byte 2byte 3byte 4byte 8byte
		// 1. 정수형	 byte		 int   long	
		// 2. 실수형					  float double
		// 3. 문자형		   char
		// 4. 논리형
		
		
		
	}

}
