package pk23;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//��ü�� �����ؼ� Ŭ���� �̸��� ȹ��
		Person p=new Person();
		//Object��getClass()�޼ҵ� ���
		Class pClass1=p.getClass();
		System.out.println(pClass1.getName());
		//Ŭ������ �����ؼ� Ŭ�����̸��� ȹ��
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//Ŭ���� �̸����� ��������
		Class pClass3=Class.forName("pk23.Person");
	}

}
