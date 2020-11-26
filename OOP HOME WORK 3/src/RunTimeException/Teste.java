package RunTimeException;

public class Teste {

	public static void main(String[] args) {
		try{
			String o = null;
			System.out.println(o.toString());
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception "); 

            }
      }
 }
