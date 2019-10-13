package package1;

import java.util.*;

public class Sorted_Character {
	public static void main(String[] args) {

		System.out.println("Enter any String");
		Scanner kb = new Scanner(System.in);
		String s1 = kb.nextLine();
        System.out.println(new Sorted_Character().sorted_string(s1));
	}

	String sorted_string(String s1) {
		ArrayList<String> arr = new ArrayList<String>();
		char[] ch = s1.toCharArray();
		for (char c1 : ch)
			arr.add(c1 + "");
		arr.sort(null); // We have to define our custom logic for the sorting
		String str = "";
		for (String a1 : arr)
			str += a1;
		return str;
	}
}
