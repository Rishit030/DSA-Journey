class Solution {
    public boolean isPalindrome(int x) {
        int on=x;
        int revrse=0;
         if(x<0){
            return false;
        }
        while(x!=0){
            int digit=x%10;
            revrse=revrse*10+digit;
            x=x/10;
        }
        
        if(revrse==on){
            return true;
        }
        else{
            return false;
        }
        
            }
}