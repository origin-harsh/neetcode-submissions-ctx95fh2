class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        int[] temp = new int[n+m];
        while(n > i && m > j){
            if(nums1[i]>=nums2[j]){
                temp[k] = nums2[j];
                k++;
                j++;
            }else{
                temp[k] = nums1[i];
                i++;
                k++;
            }
        }
        while(n > i){
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while(m> j){
            temp[k] = nums2[j];
            j++;
            k++;
        }
        int mid = (n+m)/2;
        if((n+m)%2==1) return (double)temp[mid];
        return (temp[mid]+temp[mid-1])/2.0;


    }
}
