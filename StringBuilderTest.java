package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		//immutable
		String java=new String("java");
		//처음 객체의 인스턴스화시 메모리값
		System.out.println("java의 메모리 주소: "+ System.identityHashCode(java));
		//String으로부터 StringBuilder의 객체 생성
		StringBuilder builder=new StringBuilder(java);
		//연산이 이루어지기 전 원본 hash값 
		System.out.println("연산 전 builder의 메모리 주소: "+ System.identityHashCode(builder));
		builder.append(" and ");
		builder.append("android");
		builder.append(" Programming is fun!");
		System.out.println("연산 후 builder의 메모리 주소: "+ System.identityHashCode(builder));
		
		java=builder.toString();
		
		System.out.println("새로 만들어진 java의 메모리 주소: "+ System.identityHashCode(java));
	
	}

}
