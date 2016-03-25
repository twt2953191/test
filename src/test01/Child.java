package test01;

public class Child extends Father{
	private String name = "child";
	
	static int age = 16;
	static {
		System.out.println(age);
	}

	public Child() {
		super();
		System.out.println("i am child");
	}

	public Child(String name) {
		super();
		this.name = name;
		System.out.println("i am child ,my name is "+name);
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

	public void eat() {
		System.out.println("child is eating");
	}
}
