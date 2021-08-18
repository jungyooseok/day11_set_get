package Quiz_microwave;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz_microwave_timer {
	Quiz_microwave_start start = new Quiz_microwave_start();
	Scanner input = new Scanner(System.in);
	private Date date;
	private SimpleDateFormat simp;
	private int inputTime;
	
	public void timer() {
		System.out.println("====== 타이머 설정 ======");
		System.out.println("1. 타이머 입력");
		System.out.println("2. 취소");
		System.out.print(">>>> ");
		int i = input.nextInt();
		
		if(i>0 && i<3) {
			switch(i) {
			case 1: inputT();
				break;
			case 2: return;
			}
		}else {
			System.out.println("없는 기능입니다.");
		}
		
		
	}
	
	public void inputT() {
		System.out.print("타이머를 설정해주세요 : ");
		inputTime = input.nextInt();
		System.out.println("설정하신 시간은 " + inputTime + "초 입니다.");
		start.nowTimer = inputTime;
	}

}
