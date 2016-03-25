package test01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Demo01 {
	@Test
	public void test01() {
		String dire = "E:\\Picture\\动态图\\";
		File directory = new File(dire);
		String[] list = directory.list();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmddss");
		String s = sdf.format(new Date());
		int i = 0;
		for (String str : list) {
			File f = new File(dire + str);
			if (f.isFile()) {
				String suffix = str.substring(str.lastIndexOf("."));
				i++;
				f.renameTo(new File(dire + s + "_" + i + suffix));
			}
		}
	}

	@Test
	public void test02() {
		System.out.println("1234.gif".substring("1234.gif".lastIndexOf(".")));
	}

	@Test
	public void test03() {
		Father p = new Child();
		p.smoke();
		p.eat();
		System.out.println("----------------------");
		Father p1 = new Child("小孩AA");
		p1.eat();

	}
	
	@Test
	public void test04() {
		SuberClass a = new SuberClass();
		System.out.println("--------------");
		a.abstract_method01();
		a.abstract_method02();
		System.out.println("-------------");
		a.method01();
		a.method02();
		a.method03();
	}

}
