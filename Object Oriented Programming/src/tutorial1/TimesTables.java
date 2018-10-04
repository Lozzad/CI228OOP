package tutorial1;

public class TimesTables {

	public static void main(String[] args) {
		int num = 0;
		while (num < 1 || num > 25) {
			System.out.println( "input desired number 1 - 25" );
			num = BIO.getInt();
		}
		
		int mult = 0;
		for ( int i = 1; i < 13; i++ ) {
			mult = num * i;
			System.out.printf("\n%2d * %2d = %3d", i, num, mult);
		}
	}

}
