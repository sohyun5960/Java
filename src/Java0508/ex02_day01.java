/*
 *	Date : 2020.05.08 
 * 	Author : sohyun
 * 	Description : 변수를 사용해서 자기소개서 만들기
 * 	Version : 1.0
 * 
*/

package Java0508;

public class ex02_day01 {

	public static void main(String[] args) {
		String name;
		name = "이소현";
		String birth;
		birth = "5월29일";
		int age;
		age = 28;
		String adr;
		adr = "부평";
		String phone;
		phone = "010-8788-5960";
		String email;
		email = "so_hyun501@naver.com";
		String hobby;
		hobby = "잠자기";
		String speciality;
		speciality = "숨쉬기";
		char blood;
		
		blood = 'O';
		String member1;
		member1 = "권택훈";
		String member2;
		member2 = "김도연"; 
		String member3;
		member3 = "차호정";
		
		System.out.println("제 이름은 "+name+"입니다. "+birth+"생이고,나이는 "
				+age+"살 입니다. "+adr+"에 살고있어요.");
		System.out.println("제 핸드폰 번호는 "+phone+"이고, 메일 주소는 "+email+"이에요."); 
		System.out.println("취미는 "+hobby+"이며, 특기는 "+speciality+"입니다."); 
		System.out.println("혈액형은 "+blood+"형 이구요."); 
		System.out.println(member1+" "+member2+" "+member3+"과 한팀으로 지내고 있습니다.");
	}

}
