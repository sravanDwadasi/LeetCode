# Daily LeetCode challenge

## Day - 1 : 28-12-2024

### 1. Two Sum
- **EASY**
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}

```
## Day - 2 : 29-12-2024


### 2. Valid Anagram
- **EASY**
```
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray(); 
        char[] charT = t.toCharArray(); 

        Arrays.sort(charS);
        Arrays.sort(charT);
        
        return Arrays.equals(charS, charT);
    }
}

```

### 3. Contains Duplicate
- **EASY**
```
import java.util.Arrays;
public class ContainsDuplicate {
     public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}


```

### 4. Concatenation of Array
- **EASY**
```
class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
```

### 5. Length of Last Word
- **EASY**
```
class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int n = arr.length-1;
        return arr[n].length();

    
    }
}
```

### 6. Binary Search
- **EASY**
```
public class BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) start = mid + 1;
            else end = mid - 1;
            
        }
        return -1;
    }
}

```

### 7. Reverse String, Valid Palindrome
- **EASY**
```
public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int last = s.length-1;

        while(start < last){
            char temp = s[start];
            s[start] = s[last];
            s[last] = temp;

            start++;
            last--;
        }
    }
}

```

### 8. Valid Palindrome
- **EASY**
```
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int last = s.length()-1;

        while(start < last){
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))) return false;
                start++;
                last--;
        }
        return true;
    }
}

```

### 9. Remove Duplicates from Sorted Array
- **EASY**
```
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int last = s.length()-1;

        while(start < last){
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))) return false;
                start++;
                last--;
        }
        return true;
    }
}

```

### 10. Merge Strings Alternately
- **EASY**
```
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int last = s.length()-1;

        while(start < last){
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))) return false;
                start++;
                last--;
        }
        return true;
    }
}

```

### 11. Sort Array By Parity
- **EASY**
```
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end){
            if(nums[start]%2 == 0){
                start++;
            }else{
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end--] = temp;
            }
        }
        return nums;
    }
}

```

### 12. Missing Number
- **EASY**
```
class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    public void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        } 
    }
}

```

### 13. Find All Numbers Disappeared in an Array
- **EASY**
```
import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
               swap(nums, i, correct);
            }else i++;
        } 

        List<Integer> arr = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(j+1 != nums[j]){
                arr.add(j+1);
            }
        }
        return arr;
    }
}

```

### 14. Set Mismatch
- **EASY**
```
public class SetMismatch {
        public int[] findErrorNums(int[] nums) {
            int[] arr = new int[2];
            int i = 0;
             int l = nums.length;
            while(i < l){
                int correct = nums[i] - 1;
                if(nums[i] <= l && nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }else{
                    i++;
                }
            } 
            for(int j = 0; j < l; j++){
                if(nums[j] - 1 != j){
                    arr[0] = nums[j];
                    arr[1] = j + 1;
                    break;
                } 
            }
            return arr;
        }
}

```

### 15. Find Numbers with Even Number of Digits
- **EASY**
```
public class FindNumberswithEvenNumberofDigits {
        public int findNumbers(int[] nums) {
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                int temp = 0;
                int n = nums[i];
                while(n != 0){
                    n = n/10;
                    temp++;
                }
                if(temp%2 == 0){
                    count++;
                }
            }
            return count;
        }
    }

```

### 16. Richest Customer Wealth
- **EASY**
```
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}

```

### 17. Find Smallest Letter Greater Than Target
- **EASY**
```
public class FindSmallestLetterGreaterThanTarget {
        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
    
            while(start <= end){
                int mid = (start + end)/2;
    
                if(letters[mid] <= target) start = mid + 1;
                else end = mid - 1;
            }
            return letters[start % letters.length];
        }
    }
    
```

### 18. Valid Parentheses
- **EASY**
```
public class FindSmallestLetterGreaterThanTarget {
        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
    
            while(start <= end){
                int mid = (start + end)/2;
    
                if(letters[mid] <= target) start = mid + 1;
                else end = mid - 1;
            }
            return letters[start % letters.length];
        }
    }
    
```

### 19. Merge Sorted Array
- **EASY**
```
public class MergeSortedArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int index = (m + n) - 1;
            int i = m -1;
            int j = n-1;
    
            while(i >=0 && j >=0){
                if(nums1[i] > nums2[j]){
                    nums1[index] = nums1[i];
                    i--;
                }else if(nums1[i] <= nums2[j]){
                    nums1[index] = nums2[j];
                    j--;
                }
                index--;
            }
    
            while(i>=0){
                nums1[index] = nums1[i];
                i--;
                index--;
            }
            while(j>=0){
                nums1[index] = nums2[j];
                j--;
                index--;
            }
        }
}
    
```

### 20. Best Time to Buy and Sell Stock
- **EASY**
```
public class BestTimetoBuyandSellStock {
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxPrice = 0;
    
            for(int currentPrice : prices){
                minPrice = Math.min(currentPrice, minPrice);
                maxPrice = Math.max(maxPrice, currentPrice - minPrice);
            }
            return maxPrice;
        }
    }
    
```