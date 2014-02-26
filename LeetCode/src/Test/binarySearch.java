package Test;

public class binarySearch {
    public int search(int A[], int target) {
        int start = 0;
        int end = A.length - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            
            if (A[mid] == target)
                return mid;
            if ((A[start] <= target && target < A[mid]) || (A[mid] < A[end] && (target < A[mid] || A[end] < target)))
                end = mid -1;
            else
                start = mid + 1;
        }
        
        if (A[start] == target)
            return start;
        return -1;
    }
    public static void main(String[] args) {
    	int A[] = new int[]{ 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5};
    	binarySearch bs = new binarySearch();
    	int idx = bs.search(A, 4);
    	idx = bs.search(A, 5);
    	idx = bs.search(A, 6);
    	idx = bs.search(A, 15);
    	idx = bs.search(A, 1);
    }
}
