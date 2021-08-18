package Quiz_microwave;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz_microwave_defrost {
	Quiz_microwave_start start = new Quiz_microwave_start();
	Scanner input = new Scanner(System.in);
	private HashMap map;
	private ArrayList funcList;
	private Date date;
	private SimpleDateFormat simp;
	
	public void defrost() {
		date = new Date();
		simp = new SimpleDateFormat("hh�� mm�� ss��");
		System.out.println("====== �ص� ��� ======");
		System.out.println("�ص��Ͻð��� �ϴ� ������ ���Ը� �Է����ּ���.");
		System.out.println("1. 200g");
		System.out.println("2. 400g");
		System.out.println("3. 600g");
		System.out.println("4. 800g");
		System.out.print(">>>> ");
		int i = input.nextInt();
		
		if(i>0 && i<5) {
			switch(i) {
			case 1:
				System.out.println("�����Ͻ� 200g�� �ҿ�ð��� " + getfuncList().get(i-1) + "���̸� ����ð��� " + simp.format(date) + "�Դϴ�.");
				start.nowTimer = (int)getfuncList().get(i-1);
				start.nowPow = "��";
				break;
			case 2:
				System.out.println("�����Ͻ� 400g�� �ҿ�ð��� " + getfuncList().get(i-1) + "�� �Դϴ�.");
				start.nowTimer = (int)getfuncList().get(i-1);
				start.nowPow = "��";
				break;
			case 3:
				System.out.println("�����Ͻ� 600g�� �ҿ�ð��� " + getfuncList().get(i-1) + "�� �Դϴ�.");
				start.nowTimer = (int)getfuncList().get(i-1);
				start.nowPow = "��";
				break;
			case 4:
				System.out.println("�����Ͻ� 800g�� �ҿ�ð��� " + getfuncList().get(i-1) + "�� �Դϴ�.");
				start.nowTimer = (int)getfuncList().get(i-1);
				start.nowPow = "��";
				break;
			}
		}else {
			System.out.println("���� ����Դϴ�.");
		}
		
	}
	public void setMap() {
		map = new HashMap();
		map.put("1", 360);
		map.put("2", 780);
		map.put("3", 1200);
		map.put("4", 2800);
	}
	public ArrayList getfuncList() {
		setMap();
		funcList = new ArrayList<>();
		Iterator it = map.values().iterator();
		while(it.hasNext()) {
			funcList.add(it.next());
		}
		return funcList;
	}
	

}
