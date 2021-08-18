package day11_set_get;

import java.util.*;
class Login{
	private String userId=null,userPw=null;
	public int compare(String userId,String userPw){
		if(getUserId() != null  && getUserPw() != null)
			if(getUserId().equals(userId) && getUserPw().equals(userPw)) return 0;
			else return 1;
		return 1;
	}
	public boolean out(){	return false;	}
	public String getUserId() {	return userId;	}
	public void setUserId(String userId) {	this.userId = userId;	}
	public String getUserPw() {	return userPw;	}
	public void setUserPw(String userPw) {	this.userPw = userPw; }
}
public class Quiz01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num=0,result=0; String inputId=null,inputPw=null;
		Login lo = new Login(); boolean flag=true;
		while(flag){
			System.out.print("1.로그인  2.가 입  3.로그아웃 \n>>>"); num = input.nextInt();
			switch(num){
			case 1:System.out.print("아이디 입력 : ");inputId = input.next();
			System.out.print("비밀번호 입력 : "); inputPw = input.next();
			result = lo.compare(inputId,inputPw);
			if(result == 0) System.out.println("인증 통과");
			else  System.out.println("인증 실패");
			break;
			case 2: System.out.print("가입 id : "); inputId = input.next();
			System.out.print("가입 pw : "); inputPw = input.next();
			lo.setUserId(inputId);
			lo.setUserPw(inputPw);
			System.out.println("저장 완료");
			break;
			case 3:flag=lo.out();System.out.println("종료 합니다");
			}
		}
	}

}


