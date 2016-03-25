package test01;

public class SuberClass extends AbstractClass {
	public SuberClass() {
		super();
		System.out.println("this is a normal constructor");
	}
	@Override
	public void abstract_method02() {
		System.out.println("this is a abstract_method02");
	}

	@Override
	public void abstract_method01() {
		System.out.println("this is a abstract_method01");
	}

	public void method02() {
		System.out.println("this is a normal method02 in normal class");
	}
	
	public void method03() {
		System.out.println("this is a normal method03 in normal class");
	}
}
