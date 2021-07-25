package corejava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		/*Class c= Class.forName("corejava.Test");		
		Test t= (Test)c.newInstance();
		Method m= c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);*/
		Class c= Class.forName("corejava.Z");
		System.out.println(c.isInterface());
		c.getSuperclass();
	}

}

interface Z{
	
}
