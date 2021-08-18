package day11_set_get;

public class Ex03_set_get {
	private int num;
	private int age;
	private String name;
	public void setNum(int num) {
		this.num = num;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() { return num; }
	public String getName() { return name; }

	public void print() {
		System.out.println("num : "+num);
	}
}
