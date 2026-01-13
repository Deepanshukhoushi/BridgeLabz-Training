class FindMedianOfArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index = 0;
        int merge[] = new int [nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++){
            merge[index++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++){
            merge[index++] = nums2[i];
        }
        Arrays.sort(merge);
        int mid = merge.length/2;
        if (merge.length%2==0){
            return ((merge[mid]) + merge[mid-1]) / 2.0;
        }else{
            return merge[mid];
        }
    }
}