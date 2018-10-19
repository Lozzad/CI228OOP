package exOne.Three;

class Main {
	public static void main( String args[] ) {
		AccountBetter1 mike = new AccountBetter1();
		AccountBetter1 cori = new AccountBetter1();
		Account        miri = new Account();
		mike.deposit( 100.00 );
		cori.deposit( 100.00 );
		miri.deposit( 100.00 ); 								//Transfer 10.00 from miri's account to mike's account
		boolean res = mike.transferFrom( miri, 10.00 );
		if ( !res ) System.out.println("Transfer from failed");	//Transfer 10.00 from mike's account to cori's account
		res = mike.transferTo( cori, 10.00 );
		if ( !res )
			System.out.println( "Transfer to failed" );
			System.out.printf( "Mike = %5.2f\n", mike.getBalance() );
			System.out.printf( "Miri = %5.2f\n", miri.getBalance() );
			System.out.printf( "Cori = %5.2f\n", cori.getBalance() );
	}
}