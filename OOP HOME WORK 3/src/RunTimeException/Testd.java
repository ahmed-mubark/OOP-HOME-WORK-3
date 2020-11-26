package RunTimeException;

public class Testd {
	
	public static void main(String[] args) {
		try{
			Object o = new Object();
			String d = (String)o;
			System.out.println(d);
		}
		catch(ClassCastException e){
			System.out.println("Class Cast Exception ");

            }
       }
 }
