package day11_set_get;

public class Ex05_set_get {
	private int kor, eng, math, sum;
	private double avg;
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int k,int e, int m) {
		sum = k+e+m;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		//this.avg = getSum() / 3.0 ;
		this.avg = sum / 3.0 ;
	}
	
}
