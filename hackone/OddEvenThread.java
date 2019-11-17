package hackone;

public class OddEvenThread {

		boolean evenFlag = false;
		
		public synchronized void printEven(int num) {
			
				while(!evenFlag) {
					try {
						System.out.println("am here even");
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("about to print even");
				System.out.println(num);
				evenFlag = false;
				notify();
			
		}
		
		public  synchronized void printOdd(int num) {
			
				while(evenFlag) {
					try {
						System.out.println("am here odd");
						wait();
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				System.out.println("about to print odd");
				System.out.println(num);
				evenFlag=true;
				notify();
			}
		
}

