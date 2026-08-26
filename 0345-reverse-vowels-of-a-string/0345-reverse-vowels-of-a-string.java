class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] ch=s.toCharArray();
        while(i<j){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||
            ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'){
                if(ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u'||
                ch[j]=='A' || ch[j]=='E' || ch[j]=='I' || ch[j]=='O' || ch[j]=='U'){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                    i++;
                    j--;

                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return new String(ch);
    }
}