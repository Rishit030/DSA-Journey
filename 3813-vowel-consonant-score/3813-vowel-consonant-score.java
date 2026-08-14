class Solution {
    public int vowelConsonantScore(String s) {
      s=s.replaceAll("[0-9]","");
      s=s.replaceAll(" ","");
      int c=0;
      int v=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
            v++;
        }
        else
            c++;
        }
        
      if(c>0){
        return v/c;
      }
      else{
        return 0;
      }
    
    }
}