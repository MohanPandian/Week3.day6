package week3.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Trainnames {

	public static void main(String[] args) {

		List<String> trainame = Arrays.asList("TCN", "KAN", "MAD", "POD", "TCN");
		Collections.sort(trainame);
		System.out.println("**Sorted**");
		System.out.println(trainame);

		int size = trainame.size();
		System.out.println(trainame.get(size - 1));

	}

}
