class Solution {
    public int lengthOfLongestSubstring(String s) {

     HashMap<Character,Integer>mapp=new HashMap <Character,Integer>();
     int l=0;
     int r=0;
     int n= s.length();
     int len=0;
     while(r<n)
     {
        if(mapp.containsKey(s.charAt(r)))
        l=Math.max(mapp.get(s.charAt(r))+1,l);
        mapp.put(s.charAt(r),r);
        len=Math.max(len,r-l+1);
        r++;
     }  
    return len;
    }

}
