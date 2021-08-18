package day11_set_get;

public class Ex01_This {
	public int a = 10;
	public void func01() {
		int a = 12345;
		System.out.println("01 a : "+ this.a );
		System.out.println("this : " + this);
	}
	public void func02() {
		System.out.println("02 a : "+a);
	}
}


