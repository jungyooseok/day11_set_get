package day11_set_get;

public class Ex03_MainClass {
	public static void main(String[] args) {
		Ex03_set_get ex = new Ex03_set_get();
		ex.setNum(12345); ex.print();
		int num = ex.getNum() - 1000;
		System.out.println("연산 결과 : "+num);
	}
}
