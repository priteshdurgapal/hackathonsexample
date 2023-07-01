package packagetwo;

public class BinarySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long binary1 = 10101;
		long binary2 = 10001;
		
		int carry = 0;
		int[] result  = new int[10];
		int i=0;
		
		while(binary1!=0 || binary2!=0) {
			
			result[i++] =   (int)(carry + (binary1%10 + binary2%10)%2);
			carry = (int) ((binary1%10 + binary2%10 + carry)/2);
			binary1=binary1/10;
			binary2=binary2/10;
			
			
		}
		
		if (carry != 0) {
			   result[i++] = carry;
			  }
		--i;
		
		while(i>=0) {
			System.out.print(result[i--]);
		}
		
		System.out.println("===========");
			String j="99";
		System.out.println(10+10+j+10);
		
	}

}
