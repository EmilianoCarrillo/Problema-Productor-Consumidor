class Consumidor implements Runnable {

	BufferLimitado b = null;
	
	public Consumidor( BufferLimitado initb ) {

		b = initb;
		new Thread( this ).start();

	}
	
	public void run() {
		double item;
		while( true ){
			item = b.fetch();
			System.out.printf( "Artículo extraído %.2f \n", item);
			// * Original
			// Util.mySleep(200);
			// * A
			//Util.mySleep(2000);
			// * B
			Util.mySleep(40);
		}
	}

}