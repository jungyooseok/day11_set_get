package Quiz_microwave;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz_microwave_cook {
	Scanner input = new Scanner(System.in);
	private HashMap map1;
	private HashMap map2;
	
	private ArrayList funcList1;
	private ArrayList funcList2;
	private ArrayList funcList3;
	
	public void setMap() {
		map1 = new HashMap();
		map1.put("제과", "중");
		map1.put("찜", "약");
		map1.put("오븐", "강");
		map2 = new HashMap();
		map2.put("제과", 3600);
		map2.put("찜", 1800);
		map2.put("오븐", 3600);
		
	}
	public ArrayList getfuncList3() {
		setMap();
		funcList3 = new ArrayList<>();
		Iterator it = map1.keySet().iterator();
		while(it.hasNext()) {
			funcList3.add(it.next());
		}
		return funcList3;
	}
	public ArrayList getfuncList1() {
		setMap();
		funcList1 = new ArrayList<>();
		Iterator it = map1.values().iterator();
		while(it.hasNext()) {
			funcList1.add(it.next());
		}
		return funcList1;
	}
	public ArrayList getfuncList2() {
		setMap();
		funcList2 = new ArrayList<>();
		Iterator it = map2.values().iterator();
		while(it.hasNext()) {
			funcList2.add(it.next());
		}
		return funcList2;
	}
	
	public void cookmode() {
		Quiz_microwave_start start = new Quiz_microwave_start();
		System.out.println("====== 조리 기능 ======");
		System.out.println("원하시는 기능을 선택해주세요.");
		for(int j = 0; j<getfuncList3().size(); j++) {
			System.out.println(j + 1 + ". " + getfuncList3().get(j));
		}
		System.out.println("4. 취소");
		System.out.print(">>>> ");
		int i = input.nextInt();
		
		if(i<5 && i>0) {
			switch(i) {
			case 1:
				System.out.println("선택하신 " + getfuncList3().get(i-1) + "기능은 출력 : " + getfuncList1().get(i-1) + ", 타이머 : " + getfuncList2().get(i-1) + "초로 실행됩니다.");
				start.nowPow = (String)getfuncList1().get(i-1);
				start.nowTimer = (int)getfuncList2().get(i-1);
				break;
			case 2:
				System.out.println("선택하신 " + getfuncList3().get(i-1) + "기능은 출력 : " + getfuncList1().get(i-1) + ", 타이머 : " + getfuncList2().get(i-1) + "초로 실행됩니다.");
				start.nowPow = (String)getfuncList1().get(i-1);
				start.nowTimer = (int)getfuncList2().get(i-1);
				break;
			case 3:
				System.out.println("선택하신 " + getfuncList3().get(i-1) + "기능은 출력 : " + getfuncList1().get(i-1) + ", 타이머 : " + getfuncList2().get(i-1) + "초로 실행됩니다.");
				start.nowPow = (String)getfuncList1().get(i-1);
				start.nowTimer = (int)getfuncList2().get(i-1);
				break;
			case 4:
				System.out.println("취소");
				break;
			}
		}else {
			System.out.println("없는 기능입니다.");
		}
		
	}
	
	

}
