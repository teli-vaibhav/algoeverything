package com.blog.algoeverything;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Find the unique element in an array where all other elements are repeated
 * twice.
 * @author Teli
 *
 */
public class UniqueElementInTwiceDuplicateHashing {

	public Integer getUniqueElement(int[] inputArray) {
		if (inputArray == null || inputArray.length <= 0)
			return null;
		Set<Integer> hash = new HashSet<>();
		for(int currentVal:inputArray)
		{
			if(hash.contains(currentVal))
				hash.remove(currentVal);
			else
				hash.add(currentVal);
		}
		Iterator<Integer> iterator = hash.iterator();
		while (iterator.hasNext()) {
			return iterator.next();
		}
		return null;
	}
}
