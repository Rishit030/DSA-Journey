class Solution {
    public String mergeAlternately(String s1, String s2) {
        String ans="";
        int n=Math.max(s1.length(),s2.length());
        for(int i=0;i<n;i++){
            if(i<s1.length()){
                ans=ans+s1.charAt(i);
            }
            if(i<s2.length()){
            ans=ans+s2.charAt(i);
            }
        }
        return ans;
    }
}