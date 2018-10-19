package exOne.Two;

public class TimesTables {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num = BIO.getInt();
		
		for (int i = 1; i < 13; i++) {
			int mult = i * num;
			System.out.printf("%n %2d * %d = %3d", i, num, mult);
		}
	}
}
