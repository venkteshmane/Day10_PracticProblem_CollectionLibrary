package Practice_Problems_Generics;

import java.util.Arrays;
import java.util.Scanner;

public class UC5_MoreThanThreeParameters<Z extends Comparable<Z>> {
	// initializing array
	Z[] elements;

	public UC5_MoreThanThreeParameters(Z[] elements) {
		this.elements = elements;
		// calling the static method inside constructor
		testMaximum(elements);
	}
	 //This method uses the concept of Generics and finds the maximum of three of

	public static <Z extends Comparable<Z>> void testMaximum(Z[] elements) {
		 // Calling the sort method from Arrays class.
		Arrays.sort(elements);
		
		System.out.println(elements[elements.length - 1] + " is the maximum");
	}
	public static void main(String[] args) {

		Integer[] intelements = { 11, 16, 45, 89, 56 };
		new UC5_MoreThanThreeParameters(intelements);
		Float[] floatelements = {11.22f,14.56f,85.9f,111.23f,45.98f};
		new UC5_MoreThanThreeParameters(floatelements);
		String[] values= {"Apple","Peach","Banana","Mango","Strawberry"};
		new UC5_MoreThanThreeParameters(values);
	}
}