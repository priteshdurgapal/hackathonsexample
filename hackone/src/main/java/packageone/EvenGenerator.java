package packageone;

public class EvenGenerator implements Runnable{
	OddEvenThread oet;
	
	public EvenGenerator(OddEvenThread oet) {
		super();
		this.oet = oet;
	} 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int evenNumber = 1;
		 for(int i=2;i<10;i=+2) {
			 oet.printEven(i);
		 }
		
	}
	



}
