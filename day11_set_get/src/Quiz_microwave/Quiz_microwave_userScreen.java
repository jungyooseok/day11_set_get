package Quiz_microwave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz_microwave_userScreen {
	//전자레인지 기능만들기
	private HashMap map;
	private ArrayList funcList;
	Quiz_microwave_power powerfunc = new Quiz_microwave_power();//파워조절
	Quiz_microwave_timer timerfunc = new Quiz_microwave_timer();//타이머기능
	Quiz_microwave_defrost defrostfunc = new Quiz_microwave_defrost();//해동기능
	Quiz_microwave_cook cookfunc = new Quiz_microwave_cook();//조리기능
	Quiz_microwave_start startfunc = new Quiz_microwave_start();//시작기능
	Scanner input = new Scanner(System.in);
	
	public void userScreen() {
		while(true) {
			System.out.println("=========================");
			System.out.println("설정 출력 : " + startfunc.nowPow + ", 타이머 : " + startfunc.nowTimer + "초");
			System.out.println("======== 전자레인지 ========");
			System.out.println("1. 출력조절");
			System.out.println("2. 타이머");
			System.out.println("3. 해동옵션");
			System.out.println("4. 조리옵션");
			System.out.println("5. 시작");
			System.out.print("기능선택 >>>> ");
			int i = input.nextInt();
			
			if(i>0 && i<6) {
				switch(i) {
				case 1:
					powerfunc.power();
					break;
				case 2:
					timerfunc.timer();
					break;
				case 3:
					defrostfunc.defrost();
					break;
				case 4:
					cookfunc.cookmode();
					break;
				case 5:
					startfunc.start();
					break;
				}
			}else {
				System.out.println("없는 기능입니다.");
			}
			
		}
		
	}
//출력조절하는 기능(약, 중, 강)
//기본옵션 : 타이머 (초단위로 조절가능한 타이머)
//해동옵션 : 200g단위로 무게별 자동 해동시간 정해줌(200g => 6분, 400g => 13분, 600g => 20분, 800g => 27분)
//조리옵션 : 제과(중, 타이머 3600초), 찜(약, 타이머 1800초), 오븐기능(강, 3600초)
//절전기능 : 이 기능을 선택하면 전자레인지가 절전모드가 됩니다.
	
	
	

}
