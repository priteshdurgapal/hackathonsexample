package packageone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cardGame {

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		List<String> cardDetails = Arrays.asList("A", "K", "Q", "J", "T", "9", "8", "7", "6", "5", "4", "3", "2");
		String input1 = "23A84Q";
		String input2 = "K2Q25J";
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < input1.length(); i++) {
			/*
			 * if((cardDetails.indexOf(Character.toString(input2.charAt(i))))<cardDetails.
			 * indexOf(Character.toString(input1.charAt(i)))){ count2=count2+1; } else
			 */
			if ((cardDetails.indexOf(Character.toString(input2.charAt(i)))) > cardDetails
					.indexOf(Character.toString(input1.charAt(i)))) {
				count1 = count1 + 1;
			}
		}
		if (count1 > count2) {
			System.out.println(count1);
		} else
			System.out.println(count2);
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}

}
