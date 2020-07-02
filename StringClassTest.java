package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Class strClass=Class.forName("java.lang.String");
		
		Constructor[] cons=strClass.getConstructors();
		
		for(Constructor t : cons) {
			System.out.println(t);
		}
		System.out.println();
		
		Method[] methods =strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		Field[] fields=strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
	}

}
