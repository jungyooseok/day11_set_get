package Quiz_microwave;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz_microwave_start {
	public static String nowPow;
	public static int nowTimer;
	
	public void start() {
		if(nowPow != null && nowTimer != 0) {
			System.out.println("��� : " + nowPow + ", Ÿ�̸� : " + nowTimer + "�� �����ϰڽ��ϴ�. �� " + (nowTimer/60) + "�� �� �Ϸ�˴ϴ�.");
			System.exit(0);
		}else {
			System.out.println("��� Ȥ�� Ÿ�̸Ӱ� �������� �ʾҽ��ϴ�.");
		}
		
	}
	

}
