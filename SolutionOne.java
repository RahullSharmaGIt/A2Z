import java.util.*;

class SolutionOnene {
  public static List<Integer> majorityElement(int[] nums) {
    int cnt1 = 0;
    int cnt2 = 0;
    int n = nums.length;
    int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;

    // Phase 1: Find potential candidates
    for (int num : nums) {
      if (num == ele1)
        cnt1++;
      else if (num == ele2)
        cnt2++;
      else if (cnt1 == 0) {
        ele1 = num;
        cnt1 = 1;
      } else if (cnt2 == 0) {
        ele2 = num;
        cnt2 = 1;
      } else {
        cnt1--;
        cnt2--;
      }
    }

    // Phase 2: Verify actual counts
    cnt1 = cnt2 = 0;
    for (int num : nums) {
      if (num == ele1)
        cnt1++;
      else if (num == ele2)
        cnt2++;
    }

    List<Integer> result = new ArrayList<>();
    if (cnt1 > (n / 3))
      result.add(ele1);
    if (cnt2 > (n / 3))
      result.add(ele2);

    return result;
  }

  public static void main(String[] args) {
    int[] arr = {3, 2, 3};
    System.out.println("The majority elements are: " + majorityElement(arr));
  }
}



// 🔍 Examples
// Array	n	n/3	Elements > n/3 times	Result
// [3, 2, 3]	3	1	3 → appears 2 times	[3]
// [1,1,1,3,3,2,2,2]	8	2	1 (3x), 2 (3x)	[1, 2]
// [1,2,3,4,5,6]	6	2	none	[]
// ✅ Summary

// More than n/2 → at most 1 element

// More than n/3 → at most 2 elements

// More than n/4 → at most 3 elements

// and so on…

// That’s why the > n/3 version of the algorithm tracks two candidates (ele1, ele2), but no more.