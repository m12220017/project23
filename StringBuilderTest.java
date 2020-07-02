package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		//immutable
		String java=new String("java");
		//ó�� ��ü�� �ν��Ͻ�ȭ�� �޸𸮰�
		System.out.println("java�� �޸� �ּ�: "+ System.identityHashCode(java));
		//String���κ��� StringBuilder�� ��ü ����
		StringBuilder builder=new StringBuilder(java);
		//������ �̷������ �� ���� hash�� 
		System.out.println("���� �� builder�� �޸� �ּ�: "+ System.identityHashCode(builder));
		builder.append(" and ");
		builder.append("android");
		builder.append(" Programming is fun!");
		System.out.println("���� �� builder�� �޸� �ּ�: "+ System.identityHashCode(builder));
		
		java=builder.toString();
		
		System.out.println("���� ������� java�� �޸� �ּ�: "+ System.identityHashCode(java));
	
	}

}
