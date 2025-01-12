# Daily LeetCode challenge

## Day - 2 : 29-12-2024

### 1. Replace Elements with Greatest Element on Right Side
- **MEDIUM**

```
public class ReplaceElementswithGreatestElementonRightSide {
    public int[] replaceElements(int[] arr) {
        int last = -1;
        int preLast;
        for(int i = arr.length-1; i >= 0; i--){
            preLast = arr[i];
            arr[i] = last;
            if(preLast > last)last = preLast;
        }
        return arr;
    }
}

```

### 2. Single Element in a Sorted Array
- **MEDIUM**

```
class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];

        if(nums[0] != nums[1]) return nums[0];

        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];

        int start = 1;
        int end = nums.length - 2;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) return nums[mid];

            if((mid % 2 == 0 && nums[mid] == nums[mid+1])|| (mid % 2 != 0 && nums[mid] == nums[mid-1])) start = mid + 1;

            else end = mid - 1;
        }
        return -1;
    }
}

```

### 3. Two Sum II - Input Array Is Sorted
- **MEDIUM**

```
class TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        
        while(i < j){
            int sum = numbers[i] + numbers[j];

            if(sum == target){
                return new int[]{i + 1, j + 1};
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }  
        return new int[]{i + 1, j + 1};     
    }
} 

```

### 4. Find the Duplicate Number
- **MEDIUM**

```
public class FindtheDuplicateNumber {

        public void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        public int findDuplicate(int[] nums) {
            int i = 0;
            while(i < nums.length){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                   swap(nums, i, correct);
                }else i++;
            }
    
            for(int j = 0; j < nums.length; j++){
                if(j+1 != nums[j]){
                    return nums[j];
                }
            }
            return nums[nums.length-1];
        }
}

```

### 5. Find All Duplicates in an Array
- **MEDIUM**

```
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public List<Integer> findDuplicates(int[] nums) {
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
                arr.add(nums[j]);
            }
        }
        return arr;
    }
}

```

### 6. Find First and Last Position of Element in Sorted Array
- **MEDIUM**

```
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public List<Integer> findDuplicates(int[] nums) {
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
                arr.add(nums[j]);
            }
        }
        return arr;
    }
}

```