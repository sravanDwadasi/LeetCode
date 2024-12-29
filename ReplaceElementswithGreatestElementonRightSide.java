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
