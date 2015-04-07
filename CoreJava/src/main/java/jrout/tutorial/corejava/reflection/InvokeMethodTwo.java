package jrout.tutorial.corejava.reflection;

import java.lang.reflect.Method;

public class InvokeMethodTwo {

	public static void main(String...args) throws Exception {
		Class classObj = ReflectionOne.class;

		Method[] methods = classObj.getMethods();
		for (Method method : methods) {
			if (method.getName().equals("callMe")) {
//				ReflectionOne one = new ReflectionOne();
				ReflectionOne ref = (ReflectionOne) classObj.newInstance();
//				ref.callMe();
				
				Method meth = classObj.getMethod("callMe", null);
				meth.invoke(ref, null);
				break;
			}
		}
		
		InvokeMethodTwo.calculate(10, 20, 30);
		InvokeMethodTwo.calculate(10, 20, 30, 40);
	}
	
	public static void calculate(int...values){
		System.out.println(values.length);
		
	}
}