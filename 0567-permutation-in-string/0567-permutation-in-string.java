class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)
        return false;
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<n;i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b))
        return true;
        int left=0;
        for(int i=n;i<m;i++){
            b[s2.charAt(left++)-'a']--;
            b[s2.charAt(i)-'a']++;
            if(Arrays.equals(a,b))
            return true;
        }
        return false;
    }
}