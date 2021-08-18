package Quiz_microwave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz_microwave_userScreen {
	//���ڷ����� ��ɸ����
	private HashMap map;
	private ArrayList funcList;
	Quiz_microwave_power powerfunc = new Quiz_microwave_power();//�Ŀ�����
	Quiz_microwave_timer timerfunc = new Quiz_microwave_timer();//Ÿ�̸ӱ��
	Quiz_microwave_defrost defrostfunc = new Quiz_microwave_defrost();//�ص����
	Quiz_microwave_cook cookfunc = new Quiz_microwave_cook();//�������
	Quiz_microwave_start startfunc = new Quiz_microwave_start();//���۱��
	Scanner input = new Scanner(System.in);
	
	public void userScreen() {
		while(true) {
			System.out.println("=========================");
			System.out.println("���� ��� : " + startfunc.nowPow + ", Ÿ�̸� : " + startfunc.nowTimer + "��");
			System.out.println("======== ���ڷ����� ========");
			System.out.println("1. �������");
			System.out.println("2. Ÿ�̸�");
			System.out.println("3. �ص��ɼ�");
			System.out.println("4. �����ɼ�");
			System.out.println("5. ����");
			System.out.print("��ɼ��� >>>> ");
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
				System.out.println("���� ����Դϴ�.");
			}
			
		}
		
	}
//��������ϴ� ���(��, ��, ��)
//�⺻�ɼ� : Ÿ�̸� (�ʴ����� ���������� Ÿ�̸�)
//�ص��ɼ� : 200g������ ���Ժ� �ڵ� �ص��ð� ������(200g => 6��, 400g => 13��, 600g => 20��, 800g => 27��)
//�����ɼ� : ����(��, Ÿ�̸� 3600��), ��(��, Ÿ�̸� 1800��), ������(��, 3600��)
//������� : �� ����� �����ϸ� ���ڷ������� ������尡 �˴ϴ�.
	
	
	

}
