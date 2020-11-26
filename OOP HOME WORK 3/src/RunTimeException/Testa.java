package RunTimeException;

public class Testa {
	
	public static void main(String[] args) {
		try{
			int a = 1;
			int b = 0;
			int c = a / b;
			System.out.println(1 + " / " + 0 + " = " + c);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception cannot be divided by Zero ");
		}
	}
}
