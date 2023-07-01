package packageone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TargetIndices {

	public static void main(String[] args) {

		TargetIndices target = new TargetIndices();
		int[] arr = { 1, 2, 5, 2, 3 };
		Queue<Integer> loi = target.targetIndices(arr, 2);
		loi.stream().forEach(System.out::println);
	}

	public Queue<Integer> targetIndices(int[] nums, int target) {
		Queue<Integer> numGiven = new LinkedList<Integer>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		int first = searchNumTargetF(nums, 0, nums.length - 1, target);
		int last = searchNumTargetL(nums, 0, nums.length - 1, target);
		System.out.println("first-->" + first);
		return numGiven;
	}

	public int searchNumTargetF(int[] nums, int l, int r, int target) {
		// List<Integer> result = new ArrayList<Integer>();

		if (l <= r) {

			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				// numGiven.add(mid);
				if (mid - 1 >= 0 && nums[mid - 1] == target) {
					 searchNumTargetF(nums, l, mid-1 , target);
					//return mid;
				}
				return mid;

			}

		}

		return -1;
	}

	public int searchNumTargetL(int[] nums, int l, int r, int target) {
		// List<Integer> result = new ArrayList<Integer>();

		if (l <= r) {

			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				if (mid + 1 < nums.length && nums[mid + 1] == target)

					searchNumTargetL(nums, mid + 1, r, target);
				return mid;

			}
			// searchNumTargetL( nums, l, mid-1, target);

		}

		return -1;
	}
}
