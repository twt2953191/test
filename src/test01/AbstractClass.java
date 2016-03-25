package test01;

public abstract class AbstractClass {
	
	public AbstractClass() {
		super();
		System.out.println("this is a abstract's constructor");
	}

	public abstract void abstract_method01();

	public abstract void abstract_method02();

	public void method01() {
		System.out.println("this is a normal method01 in abstract class");
	}
	
	public void method02() {
		System.out.println("this is a normal method02 in abstract class");
	}
}
