package RunTimeException;

public class Testb {

	public static void main(String[] args) {
		try{
			int [] list = new int[5];
			System.out.println(list[5]);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println ("Array Index is Out Of Bounds ");
		}
	}

}
