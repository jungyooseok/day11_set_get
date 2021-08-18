package day11_set_get;

public class Ex05_MainClass {
	public static void main(String[] args) {
		int k=100, e=90, m=80;
		// 객체 생성 후 각각의 값(kor, eng, math, sum, avg)을 저장하세요
		Ex05_set_get ex = new Ex05_set_get();
		ex.setKor(k); ex.setEng(e); ex.setMath(m);
		//int sum = k + e + m;
		//double avg = sum / 3.0;
		//ex.setSum(sum); ex.setAvg(avg);
		ex.setSum(ex.getKor(), e, m);
		ex.setAvg();
		// 출력 하세요(국,영,수,합,평균)
		System.out.println( ex.getKor() );
		System.out.println( ex.getEng() );
		System.out.println( ex.getMath() );
		System.out.println( ex.getSum() );
		System.out.println( ex.getAvg() );
	}
}
