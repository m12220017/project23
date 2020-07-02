package pk23;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//객체를 생성해서 클래스 이름을 획득
		Person p=new Person();
		//Object의getClass()메소드 사용
		Class pClass1=p.getClass();
		System.out.println(pClass1.getName());
		//클래스가 접근해서 클래스이름을 획득
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Class pClass3=Class.forName("pk23.Person");
	}

}
