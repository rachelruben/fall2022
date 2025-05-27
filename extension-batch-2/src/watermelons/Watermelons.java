package watermelons;

import java.util.Arrays;

import support.cse131.NotYetImplementedException;

public class Watermelons {
	/**
	 * @param array an array of integers
	 * @return the number of pairs of elements in the specified array
	 */
	public static int pairCount(int[] array) {
		
			// TODO: Delete the line below and implement this method
		int count = 0;
			
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j])
					count++;
			}
		}
		return count;		
	}

	/**
	 * Computes the sum of each distinct pair of entries in the incoming array.
	 * A given pair of entries has its sum computed only once. So if you
	 * compute the sum for entries 2 and 4, and that sum appears in your answer
	 * array, then you do not also compute the sum of entries 4 and 2.
	 * Depending on the input, the same sum value may appear multiple times in the
	 * result.
	 * For example, if all of the incoming values are 0, then so are all of the
	 * returned values.
	 * 
	 * @param weights an array of integers, possibly containing duplicates
	 * @return an array containing the sums of pairs as described above
	 */
	public static int[] allPairSums(int[] weights) {
		
			// TODO: Delete the line below and implement this method
		int[] sum = new int[weights.length * (weights.length - 1) / 2];
		
		int k = 0;
		
		for(int i = 0; i < weights.length; i++) {
			for(int j = i + 1; j < weights.length; j++) {
				sum[k++] = weights[i] + weights[j];
			//	k++;
			}
		}
		if(weights.length % 2 == 1) {
			sum[sum.length - 1] = weights[weights.length - 1];
		}
		return sum;
	}
		
		//int index = 0;
//		for(int i = 0, j = 0; i < weights.length - 1; i += 2, j++) {
//			sum[j] = weights[i] + weights[i + 1];
//			}
//			if(weights.length % 2 == 1) {
//				sum[sum.length - 1] = weights[weights.length - 1];
//			}
//		
//		return sum;		
//	}
//	public static int[] helperPairSums(int[] weights, int n) {
//		int sum = 0;
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = i + 1; j < n; j++) {
//				sum += weights[i] + weights[j];
//			}
//		}
//	}


	

	/**
	 * @param array: an array, not to be mutated
	 * @return a sorted copy of the specified array
	 * 
	 */
	public static int[] toSortedCopy(int[] array) {
		int[] aCopy = Arrays.copyOf(array, array.length);
		Arrays.sort(aCopy);
		return aCopy;
	}

	/**
	 * @param a: an array, not to be mutated
	 * @param b: another array, not to be mutated
	 * @return true if the arrays' contents are the same, otherwise false
	 */
	public static boolean equalsIgnoringOrder(int[] a, int[] b) {
		if (a.length == b.length) {
			// They must first be sorted, so Arrays.equals can compare element by element.
			// The caller may not want the arrays to be disturbed?
			// We therefore copy the arrays before we perform the sort and compare.
			int[] aCopy = toSortedCopy(a);
			int[] bCopy = toSortedCopy(b);
			return Arrays.equals(aCopy, bCopy);
		} else {
			return false;
		}
	}

	/**
	 * The method below must COMPUTE and return a solution as described
	 * on the web page for this extension.
	 * 
	 * You must compute the solution by trying lots of possibilities, and finding
	 * the one that yields the right answer.
	 * 
	 * @param pairSums is array of watermelon pairwise sums. In other words,
	 *                 each element of pairSums represents the sum of one pair of
	 *                 watermelons in our puzzle.
	 * @return the weights of the watermelons
	 */
	public static int[] findWeightsOf5Watermelons(int[] pairSums) {
		int expectedLength = 10;
		if (pairSums.length != expectedLength) {
			throw new IllegalArgumentException(
					"pairSums must be an array of length " + expectedLength + " " + Arrays.toString(pairSums));
		}
		
			// TODO: Delete the line below and implement this method
		Arrays.sort(pairSums);
		int[] weights = new int[5];
		int[] nums = new int[10];
		int count = 0;
		
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += pairSums[i];
		}
		sum /= 4;
		
		weights[2] = sum - pairSums[0] - pairSums[9];
		
		boolean[] test = new boolean[10];
		int[] weights1 = new int[5];
		
		for(int i = 1; i < pairSums[0]; i++) {
			weights[0] = i;
			weights[1] = pairSums[0] - i;
			for(int j = weights[2]; j < pairSums[9]; j++) {
				weights[3] = pairSums[9] - j;
				weights[4] = j;
				nums[0] = weights[0] + weights[1];
				nums[1] = weights[0] + weights[2];
				nums[2] = weights[0] + weights[3];
				nums[3] = weights[0] + weights[4];
				nums[4] = weights[1] + weights[2];
				nums[5] = weights[1] + weights[3];
				nums[6] = weights[1] + weights[4];
				nums[7] = weights[2] + weights[3];
				nums[8] = weights[2] + weights[4];
				nums[9] = weights[3] + weights[4];
				
				for(int c = 0; c < pairSums.length; c++) {
					test[c] = false;
				}
				for(int a = 0; a < pairSums.length; a++) {
					if(!test[a] && nums[a] == pairSums[a]) {
						test[a] = true;
					}
					for(int b1 = 0; b1 < test.length; b1++) {
						if(!test[b1]) {
							count++;
						}
						if(count == 0) {
							for(int l = 0; l < weights.length; l++) {
								weights1[l] = weights[l];
							}
						}
					}
				}
			}
		}
		//for(int a = 0; a < )
		return weights1;
		//	throw new NotYetImplementedException();
		
	}
}
