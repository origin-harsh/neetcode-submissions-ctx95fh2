class Solution {
    public int[] sortArray(int[] nums) {
        int right = nums.length -1;
        int left = 0;
        Quick_sort(nums,left,right);
        return nums;
    }
    static void Quick_sort(int[] nums,int left,int right){
        if(left<right){
            int p = partition(nums,left,right);
            Quick_sort(nums,left,p-1);
            Quick_sort(nums,p+1,right);
        }
       
    } 
    static int partition(int[] nums,int left,int right){
        int pivot = nums[right];
        int i = left -1;
        for(int j = left;j<=right;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums,i,j);
                
            }
        }
        swap(nums,i+1,right);
        return i+1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}