package week3.day6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Findduplicate {

	public static void main(String[] args) {
		/*
		 * 
		 * int[] num = { 10, 24, 32, 64, 85, 37, 12, 10 }; int length = num.length;
		 * System.out.println("The size of the length " + length);
		 * System.out.println("for loop"); for (int i = 0; i < num.length; i++) { for
		 * (int j = 0; i < num.length; i++) { if (num[i] == num[j]) {
		 * System.out.println("Duplicate number is " + num[i]); } } }
		 * 
		 * }
		 */
		int[] num = { 10, 24, 32, 64, 85, 37, 12, 10 };
		boolean bdup = false;
		Set<Integer> uniq = new LinkedHashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (!uniq.add(num[i])) {
				System.out.println("Duplicate vlaue is " + num[i]);
				bdup = true;
				break;
			}
		}
		if (!bdup) {
			System.out.println("All valuse are unique");
		}
	}

}
