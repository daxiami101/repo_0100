package com.po.p18.p1;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		classLoader.loadClass("com.po.p18.p1.Tester");
		System.out.println("ϵͳ����Tester");
		System.out.println("-----------------------");
		Class.forName("com.po.p18.p1.Tester");
	}

}

class Tester {
	static {
		System.out.println("���ʼ��");
	}
}