# Daily LeetCode challenge

## Day -  : 02-01-2025

### 1. Median of Two Sorted Arrays
- **HARD**
```
import java.util.Arrays;

public class MedianofTwoSortedArrays {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median; 
        int c = nums1.length + nums2.length;
        int[] sum = new int[c];
        for(int i = 0; i < nums1.length; i++){
            sum[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            sum[nums1.length + i] = nums2[i];
        }
        Arrays.sort(sum);
        if(sum.length % 2 == 0){
            median  = (sum[(sum.length-1)/2] + sum[((sum.length-1)/2)+1])/2.0;
            return median;
        }else{
            median = sum[(sum.length)/2];
            return median;
        }
    }
}

```

### 2. First Missing Positive
- **HARD**
```
import java.util.Arrays;

public class MedianofTwoSortedArrays {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median; 
        int c = nums1.length + nums2.length;
        int[] sum = new int[c];
        for(int i = 0; i < nums1.length; i++){
            sum[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            sum[nums1.length + i] = nums2[i];
        }
        Arrays.sort(sum);
        if(sum.length % 2 == 0){
            median  = (sum[(sum.length-1)/2] + sum[((sum.length-1)/2)+1])/2.0;
            return median;
        }else{
            median = sum[(sum.length)/2];
            return median;
        }
    }
}

```