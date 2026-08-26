class Solution {
    public void rotate(int[] a, int k) {
        int n=a.length;
        k=k%n;
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);
    }
    public void reverse(int[] nums,int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}