package test01;

public class Father {
	private String name = "father";
	static int age = 55;

	static {
		System.out.println(age);
	}

	public Father() {
		super();
		System.out.println("i am father");
	}

	public Father(String name) {
		super();
		this.name = name;
		System.out.println("i am father , my name is "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Father.age = age;
	}

	public void smoke() {
		System.out.println("father is smoking");
	}

	public void eat() {
		System.out.println("father is eating");
	}

}
