package packageone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDuplicate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		try {
			FileReader fin = new FileReader("/Users/priteshdurgapal/documents/Names.txt");
			//FileReader fpara = new FileReader("/Users/priteshdurgapal/documents/TextPara.txt");
			
			BufferedReader bis = new BufferedReader(fin);
			//BufferedReader bparareader = new BufferedReader(fpara);
			String str = null;// = bis.readLine();
			String strpara = null;// = bparareader.readLine();
			
			String[] strParray = null;
			while((str=bis.readLine())!=null) {
				
				int count = 0;
				//System.out.println("hello==============");
				FileReader fpara = new FileReader("/Users/priteshdurgapal/documents/TextPara.txt");
				BufferedReader bparareader = new BufferedReader(fpara);
				while((strpara=bparareader.readLine())!=null) {
				
				 strParray = strpara.split(" ");
				 //System.out.println("=="+str);
					for(String s : strParray) {
						//System.out.println(s + "-");
						if(str.equals(s)) {
							count++;
						}
					}
					
				}
				System.out.println(str + "=" + count);
				bparareader.close();
			}
			bis.close();
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
