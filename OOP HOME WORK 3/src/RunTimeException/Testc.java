package RunTimeException;

public class Testc {

	public static void main(String[] args) {
		try{
			String s = "abc";
			System.out.println(s.charAt(3));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String Index Out Of Bounds Exception ");

          }
     }

  }
