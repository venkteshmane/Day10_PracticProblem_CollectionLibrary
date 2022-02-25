package Practice_Problems_Generics;
import java.util.Scanner;

public class Refactor2<Z extends Comparable<Z>> {
	Z first, second, third;

	public Refactor2(Z first, Z second, Z third) {
		this.first = first;
		this.second = second;
		this.third = third;
		// calling the static method inside constructor
		testMaximum(first, second, third);
	}
	 // This method uses the concept of Generics and finds the maximum of three of
     //param first,second and third of any data type.
	 // return returns the maximum object.
	public static <Z extends Comparable<Z>> void testMaximum(Z first, Z second, Z third) {
		// assuming first to be maximum
		Z maximum = first;
		if (second.compareTo(maximum) > 0)
			maximum = second;
		if (third.compareTo(maximum) > 0)
			maximum = third;
		System.out.println(maximum);

	}

	public static void main(String[] args) {

		new Refactor2(11, 28, 35);
		new Refactor2("Apple", " Orange", "Banana");
		new Refactor2(1.3, 11.3, 111.3);
	}
}