package com.po.p18.p3;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

public class MethodParameterTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<Tester> clazz = Tester.class;
		Method replace = clazz.getMethod("replace", String.class, List.class);
		System.out.println("relapce��������������" + replace.getParameterCount());
		Parameter[] params = replace.getParameters();
		int index = 1;
		for (Parameter parameter : params) {
			if (parameter.isNamePresent()) {

				System.out.println("---��" + index + "��������Ϣ---");
				System.out.println("��������" + parameter.getName());
				System.out.println("�β����ͣ�" + parameter.getType());
				System.out.println("�������ͣ�" + parameter.getParameterizedType());
				index++;
			}
		}

	}

}

class Tester {
	public void replace(String str, List<String> list) {

	}
}