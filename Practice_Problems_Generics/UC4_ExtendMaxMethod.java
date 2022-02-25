package Practice_Problems_Generics;
import java.util.Arrays;
public class UC4_ExtendMaxMethod<Z extends Comparable<Z>> {
	// initializing array
		Z[] elements;

		public UC4_ExtendMaxMethod(Z[] elements) {
			this.elements = elements;
			testMaximum(elements);
		}
		 // This method uses the concept of Generics and finds the maximum of three of
		 // @param array of objects
		public static <Z extends Comparable<Z>> void testMaximum(Z[] elements) {
			/*
			 * Calling the sort method from Arrays class.
			 */
			Arrays.sort(elements);
			printMax(elements[elements.length - 1]); // calling the printMax method to display output to console
		}
		 // A simple generic method that prints object and a message.
		public static <Z> void printMax(Z max) {
			System.out.println(max + " is the largest element");
		}

		public static void main(String[] args) {

			Integer[] intelements = { 11, 16, 45, 89, 56 };
			new UC4_ExtendMaxMethod(intelements);
			Float[] floatelements = { 11.22f, 14.56f, 85.9f, 111.23f, 45.98f };
			new UC4_ExtendMaxMethod(floatelements);
			String[] values = { "Apple", "Peach", "Banana", "Mango", "Strawberry" };
			new UC4_ExtendMaxMethod(values);
		}
	}