package com.blog.algoeverything;

/**
 * Find the unique element in an array where all other elements are repeated
 * twice.
 * @author Teli
 *
 */
public class UniqueElementInTwiceDuplicate {

	/**
	 * The naive or the straight forward way to just solve this would be using brute
	 * force. What is the brute force way? We pick each individual element in the
	 * array starting from the first and simply compare it with all the remaining
	 * elements in the array. This gives us an O(n^2) time complexity & O(1) space
	 * complexity (no additional space).
	 * 
	 * @param inputArray
	 * @return
	 */
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
