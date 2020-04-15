import java.util.Random;

class Productor implements Runnable {

	BufferLimitado b = null;
	
	public Productor( BufferLimitado initb ) {
		b = initb;
		new Thread( this ).start();
	}
	
	public void run() {
		double item;
		Random r = new Random();
		while( true ){
			item = r.nextDouble();
			System.out.printf( "Artículo producido %.2f \n", item );
			b.deposit( item );
			// * Original
			//Util.mySleep(200);
			// * A
			//Util.mySleep(20);
			// * B
			Util.mySleep(4000);
		}
	}
	
}