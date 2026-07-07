class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> fre=new HashMap<>();
        for(char i:s.toCharArray())
        {
            fre.put(i,fre.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray())
        {
            fre.put(i,fre.getOrDefault(i,0)-1);
        }
        for(Map.Entry<Character,Integer> entry:fre.entrySet())
        {
            if(entry.getValue()>0)
            {
                return false;
            }
        }
        return true;
    }
}