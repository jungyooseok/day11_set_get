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
		System.out.println("====== Ÿ�̸� ���� ======");
		System.out.println("1. Ÿ�̸� �Է�");
		System.out.println("2. ���");
		System.out.print(">>>> ");
		int i = input.nextInt();
		
		if(i>0 && i<3) {
			switch(i) {
			case 1: inputT();
				break;
			case 2: return;
			}
		}else {
			System.out.println("���� ����Դϴ�.");
		}
		
		
	}
	
	public void inputT() {
		System.out.print("Ÿ�̸Ӹ� �������ּ��� : ");
		inputTime = input.nextInt();
		System.out.println("�����Ͻ� �ð��� " + inputTime + "�� �Դϴ�.");
		start.nowTimer = inputTime;
	}

}
