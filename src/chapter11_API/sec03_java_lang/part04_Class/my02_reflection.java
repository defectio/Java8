package chapter11_API.sec03_java_lang.part04_Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class my02_reflection {

	/*
	 * [Class 클래스]
	 *   - 자바는 클래스와 인터페이스의 메타데이터를 java.lang 패키지에 소속된 Class 클래스로 관리한다.
	 *   - 메타 데이터란 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보를 말한다.
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		/*
		 * [Reflection]
		 *   - Class 객체를 이용해서 클래스의 생성자, 필드, 메소드 정보를 알아낼 수 있다. -> 이를 리플렉션(reflection)이라 한다.
		 */

		Class clazz = Class.forName("chapter11_API.sec03_java_lang.part04_Class.my02_Car");
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		/* Constructor, Field, Method 클래스는 모두 java.lang.reflect 패키지에 소속되어있다. */
		//Constructor[] constructor = clazz.getDeclaredConstructors();
		//해당 클래스에 선언된 생성자정보를 배열로 받아 온다.
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor temp : constructors) {
			System.out.print(temp.getName()+"(");
			Class[] parameters = temp.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		//Field[] fields = clazz.getDeclaredFields();
		//해당 클래스에 선언된 멤버만 가져오고 상속된 멤버는 가져오지 않는다. 
		//상속된 멤버 까지 얻고 싶다면 getFields() 메소드를 이용해야 한다. 단, getFields() 메소드는 public 멤버만 가져온다.
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName()+" "+field.getName());
		}
		System.out.println();
		
		//Method[] method = clazz.getDeclaredMethods();
		//해당 클래스에 선언된 멤버만 가져오고 상속된 멤버는 가져오지 않는다. 
		//상속된 멤버 까지 얻고 싶다면 getMethods() 메소드를 이용해야 한다. 단, getMethods() 메소드는 public 멤버만 가져온다.
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName()+"(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
	} //end main

	private static void printParameters(Class[] parameters) {
		for(int i=0 ; i<parameters.length ; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length - 1)) {
				System.out.print(", ");
			}
		}
		
	}

} //end class