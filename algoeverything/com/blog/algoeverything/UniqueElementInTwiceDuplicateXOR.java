package com.blog.algoeverything;

/**
 * Find the unique element in an array where all other elements are repeated
 * twice.
 * @author Teli
 *
 */
public class UniqueElementInTwiceDuplicateXOR {

	public static Integer getUniqueElement(int[] inputArray) {
		if (inputArray == null || inputArray.length <= 0)
			return null;
		int unrepeatedElement = 0;
		for (int index = 0; index < inputArray.length; index++) {
			unrepeatedElement ^= inputArray[index];
		}
		return unrepeatedElement;
	}
}
