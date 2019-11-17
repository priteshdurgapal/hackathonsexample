package hackone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EnhancingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileReader fin = new FileReader("/Users/priteshdurgapal/documents/Names.txt");
			FileReader fpara = new FileReader("/Users/priteshdurgapal/documents/TextPara.txt");
			
			BufferedReader bis = new BufferedReader(fin);
			BufferedReader bparareader = new BufferedReader(fpara);
			String str = null;// = bis.readLine();
			String strpara = null;// = bparareader.readLine();
			Map<String,Integer> mp = new HashMap<String,Integer>();
			Map<String,Integer> mpOfPara = new HashMap<String,Integer>();
			String[] strParray = null;
			while((str=bis.readLine())!=null) {
			
				mp.put(str, 0);
			
			}
				
			for(Map.Entry<String, Integer> entry : mp.entrySet()) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
				
			while((strpara=bparareader.readLine())!=null) {
				
				strParray = strpara.split(" ");
				for(String s:strParray) {
					
				}
				
			}
				
				
				
				/*int count = 0;
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
			}*/
			bis.close();
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
