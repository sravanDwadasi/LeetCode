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

### 2 valid Anagram
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

### 3 Contains Duplicate
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