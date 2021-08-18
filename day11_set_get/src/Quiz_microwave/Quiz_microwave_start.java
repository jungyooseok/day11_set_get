package Quiz_microwave;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz_microwave_start {
	public static String nowPow;
	public static int nowTimer;
	
	public void start() {
		if(nowPow != null && nowTimer != 0) {
			System.out.println("출력 : " + nowPow + ", 타이머 : " + nowTimer + "로 시작하겠습니다. 약 " + (nowTimer/60) + "분 후 완료됩니다.");
			System.exit(0);
		}else {
			System.out.println("출력 혹은 타이머가 설정되지 않았습니다.");
		}
		
	}
	

}
