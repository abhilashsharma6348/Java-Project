package package1;

import java.util.*;

public class Left_Rotation {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int j = 0;
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newarr = new int[arr.length];
		System.out.println("Enter the no of rotations of the array");
		int rotation = kb.nextInt();
		for (int i = rotation; i < arr.length; i++, j++) {
			newarr[j] = arr[i];
		}
		for (int i = 0; j < newarr.length && i < rotation; j++,i++) {
			newarr[j] = arr[i];
		}
		for (int i : arr)
			System.out.print(i+" ");
		System.out.println();
		for (int i : newarr)
			System.out.print(i+" ");
		kb.close();
	}
}
