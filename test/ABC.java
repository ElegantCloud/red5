import org.junit.Test;



public class ABC {
	
	@Test
	public void testBitOperation(){
		int b = 0x01010101;
		System.out.println(b);
		System.out.println(b >> 8);
		System.out.println(b >>> 8);
	}

}
