# Daily LeetCode challenge

## Day - 2 : 29-12-2024

### 1. Replace Elements with Greatest Element on Right Side
- **Medium**

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