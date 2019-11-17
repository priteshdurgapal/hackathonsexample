package hackone;

public class OddGenerator implements Runnable{
	OddEvenThread oet;
	
	public OddGenerator(OddEvenThread oet) {
		super();
		this.oet = oet;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int oddNumber = 1;
		 for(int i=1;i<10;i=+2) {
			oet.printOdd(i);
		 }
		
	}

}
