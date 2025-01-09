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