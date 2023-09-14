
public class tryCatchBlock {
	
	public static void demo() {
		System.out.println("Hello World.....");
//		int i = 10/0;
//		System.out.println("Completed");	
	}

	public static void main(String[] args) throws Exception  {
		try {
			demo();	
			throw new ArithmeticException("throws arithmetic exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
