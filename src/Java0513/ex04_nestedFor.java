
/*
 	Date : 2020.05.13
 	Author : sohyun
 	Description : 중첩For문
 	Version : 1.1
 */


package Java0513;

public class ex04_nestedFor {

	public static void main(String[] args) {
		// 중첩For문
		
		/*
			for(①초기화식;②조건식;④증감식) {
				
				| for(①초기화식;②조건식;④증감식) {
			  ③	| 	③실행할 반복문
				| }
			}
			
		*/
		
		
		for(int i=1;i<=2;i++) {
			
			for(int j=1;j<=3;j++) {
				// 실행할 반복문
				System.out.print("i값 : "+i);
				System.out.println(" j값 : "+j);
			}
			System.out.println("===============================");
		}
	}

}
