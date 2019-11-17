package hackone;

public class OddEvenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEvenThread oet = new OddEvenThread();
		Thread t1 = new Thread(new EvenGenerator(oet));
		Thread t2 = new Thread(new OddGenerator(oet));
		t1.start();
		t2.start();
	}

}
