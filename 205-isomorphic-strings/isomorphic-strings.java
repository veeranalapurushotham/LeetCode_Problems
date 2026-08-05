class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ch=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char c1=t.charAt(i);
            if(ch.containsKey(c))
            {
                if(ch.get(c)!=c1)
                {
                    return false;
                }
            }
            else
            {
                for(Map.Entry<Character,Character> ent:ch.entrySet())
                {
                    if(ent.getValue()==c1)
                    {
                        return false;
                    }
                }
                ch.put(c,c1);
            }
        }
        return true;
    }
}