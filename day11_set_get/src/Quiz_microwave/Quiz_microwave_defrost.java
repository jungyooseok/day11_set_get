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
		simp = new SimpleDateFormat("hh시 mm분 ss초");
		System.out.println("====== 해동 기능 ======");
		System.out.println("해동하시고자 하는 음식의 무게를 입력해주세요.");
		System.out.println("1. 200g");
		System.out.println("2. 400g");
		System.out.println("3. 600g");
		System.out.println("4. 800g");
		System.out.print(">>>> ");
		int i = input.nextInt();
		
		if(i>0 && i<5) {
			switch(i) {
			case 1:
				System.out.println("선택하신 200g의 소요시간은 " + getfuncList().get(i-1) + "초이며 현재시간은 " + simp.format(date) + "입니다.");
				start.nowTimer = (int)getfuncList().get(i-1);
				start.nowPow = "강";
				break;
			case 2:
				System.out.println("선택하신 400g의 소요시간은 " + getfuncList().get(i-1) + "초 입니다.");
				start.nowTimer = (int)getfuncList().get(i-1);
				start.nowPow = "강";
				break;
			case 3:
				System.out.println("선택하신 600g의 소요시간은 " + getfuncList().get(i-1) + "초 입니다.");
				start.nowTimer = (int)getfuncList().get(i-1);
				start.nowPow = "강";
				break;
			case 4:
				System.out.println("선택하신 800g의 소요시간은 " + getfuncList().get(i-1) + "초 입니다.");
				start.nowTimer = (int)getfuncList().get(i-1);
				start.nowPow = "강";
				break;
			}
		}else {
			System.out.println("없는 기능입니다.");
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
