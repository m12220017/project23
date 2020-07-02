package pk23;

public class StBufferTest {

	public static void main(String[] args) {

		StringBuffer buf=new StringBuffer("Nice Day ");
		System.out.println(buf);
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		buf.ensureCapacity(100);
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! ");
		buf.insert(13, "Everybody^^");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);
		
		

	}

}
