package Practice_Problems_Generics;
import java.util.Scanner;

public class UC2_MaximumFloats {
		// creating a scanner object to get the input from user
		static Scanner sc = new Scanner(System.in);
		 // This method finds the maximum of three Integer objects. There is no return
		 // type or parameters passed.
		public static void findMaxInt() {
			// Initializing objects.
			Integer x, y, z;
			System.out.println("Enter three Integers");
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			// assuming x to be the maximum object.
			Integer max = x;
			if (max.compareTo(y) < 0) {
				max = y;
			}
			if (max.compareTo(z) < 0) {
				max = z;
			}
			System.out.println(max);
		}

		 // This method finds the maximum of three Float objects. There is no return type
		 // or parameters passed.
		public static void findMaxFloat() {
			// Initializing objects.
			Float x, y, z;
			System.out.println("Enter three Float values:");
			x = sc.nextFloat();
			y = sc.nextFloat();
			z = sc.nextFloat();
			// assuming x to be the maximum object.
			Float max = x;
			if (max.compareTo(y) < 0) {
				max = y;
			}
			if (max.compareTo(z) < 0) {
				max = z;
			}
			System.out.println(max);
		}
		public static void main(String[] args) {

			findMaxInt();
			findMaxFloat();
		}
	}