class ArithmeticOperation {
	public static int getRemainder(String val1, String val2) {
		int rem = -1;
		try {
			System.out.println("-- getRemainder method started --");
			System.out.println("Values of ab and bc \t:" + val1 + "\t" + val2);
			System.out.println("-- Converting into int type --");
			int ab = Integer.parseInt(val1);
			System.out.println("-- val 1 is converted --");
			int bc = Integer.parseInt(val2);
			System.out.println("-- val 2 is converted --");
			System.out.println("-- Accessing remainder --");
			rem = ab % bc;
			System.out.println("-- Remainder \t: " + rem);

			return rem;

		} catch (ArithmeticException e) {
			System.out.println("-- catch in getRemainder with ArithmeticException --");
		}

		finally {
			System.out.println("-- Finally Block in getRemainder --");

		}

		return rem;

	}

	public void println() {
		System.out.println("-- Here we have overright the println () --");
	}

	public int myGrade(int i) {
		System.out.println("-- This is myGrade () in class ArithmeticOperation --");
		return i;
	}

}

public class Jtc4 {

	public static void main(String[] args) {
		ArithmeticOperation ao = new ArithmeticOperation();
		ao.getRemainder("100", "10");
		ao.myGrade(10);
		ao.println();
	}

}
