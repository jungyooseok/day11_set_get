package Quiz_microwave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz_microwave_power {
	Quiz_microwave_start start = new Quiz_microwave_start();
	private HashMap map;
	private ArrayList funcList;
	
	public ArrayList getFuncList() {
		funcList = new ArrayList();
		Iterator it = map.values().iterator();
		while(it.hasNext()) {
			funcList.add(it.next());
		}
		return funcList;
	}
	
	public void setMap() {
		map = new HashMap();
		map.put("1", "��");
		map.put("2", "��");
		map.put("3", "��");
	}

	public void power() {
		setMap();
		ArrayList list = null;
		Scanner input = new Scanner(System.in);
		System.out.println("====== ��� ���� ======");
		for(int j = 0; j<getFuncList().size(); j++) {
			System.out.println(j + 1 + " : " + getFuncList().get(j));
		}
		System.out.print(">>>> ");
		int i = input.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("����� " + getFuncList().get(i-1) + "���� �����մϴ�.");
			start.nowPow = (String)getFuncList().get(i-1);
			break;
		case 2:
			System.out.println("����� " + getFuncList().get(i-1) + "���� �����մϴ�.");
			start.nowPow = (String)getFuncList().get(i-1);
			break;
		case 3:
			System.out.println("����� " + getFuncList().get(i-1) + "���� �����մϴ�.");
			start.nowPow = (String)getFuncList().get(i-1);
			break;
		}
	}
	
}
