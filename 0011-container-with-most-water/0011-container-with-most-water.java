class Solution {
    public int maxArea(int[] a) {
        int i=0,j=a.length-1,max=0;
        while(i<j){
            int min=Math.min(a[i],a[j]);
            int cap=min*(j-i);
            max=Math.max(max,cap);
            if(a[i]<a[j])
            i++;
            else
            j--;
        }
        return max;
    }
}