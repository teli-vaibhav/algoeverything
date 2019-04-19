package com.blog.algoeverything;

/**
 * Find the unique element in an array where all other elements are repeated
 * twice.
 * @author Teli
 *
 */
public class UniqueElementInTwiceDuplicateBruteForce {

	public Integer getUniqueElement(int[] inputArray) {

		if (inputArray == null || inputArray.length <= 0)
			return null;
		boolean isUnrepeated = false;
		for (int outIndex = 0; outIndex < inputArray.length; outIndex++) {
			isUnrepeated = true;
			for (int inIndex = 0; inIndex < inputArray.length; inIndex++) {
				if (outIndex != inIndex && inputArray[outIndex] == inputArray[inIndex]) {
					isUnrepeated = false;
				}
			}
			if (isUnrepeated)
				return inputArray[outIndex];
		}
		return null;
	}
}
