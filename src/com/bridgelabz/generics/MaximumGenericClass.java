package com.bridgelabz.generics;

/*
 * Refactor 1
 * Create a Generic Class that accepts three values
 * and finds the maximum using a Generic Method.
 */

public class MaximumGenericClass<T extends Comparable<T>> {

	// Instance variables
	private T firstValue;
	private T secondValue;
	private T thirdValue;

	// Parameterized Constructor
	public MaximumGenericClass(T firstValue, T secondValue, T thirdValue) {

		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	// Instance method that calls the static generic method
	public T testMaximum() {

		return testMaximum(firstValue, secondValue, thirdValue);
	}

	// Static Generic Method
	public static <T extends Comparable<T>> T testMaximum(T firstValue,
			T secondValue, T thirdValue) {

		if (firstValue.compareTo(secondValue) > 0 &&
				firstValue.compareTo(thirdValue) > 0) {

			return firstValue;
		}

		else if (secondValue.compareTo(firstValue) > 0 &&
				secondValue.compareTo(thirdValue) > 0) {

			return secondValue;
		}

		else {

			return thirdValue;
		}
	}

	public static void main(String[] args) {

		// Integer Object
		MaximumGenericClass<Integer> integerObject =
				new MaximumGenericClass<>(25, 15, 35);

		System.out.println("Maximum Integer : "
				+ integerObject.testMaximum());

		// Float Object
		MaximumGenericClass<Float> floatObject =
				new MaximumGenericClass<>(22.4f, 50.8f, 30.6f);

		System.out.println("Maximum Float : "
				+ floatObject.testMaximum());

		// String Object
		MaximumGenericClass<String> stringObject =
				new MaximumGenericClass<>("Apple", "Peach", "Banana");

		System.out.println("Maximum String : "
				+ stringObject.testMaximum());
	}
}