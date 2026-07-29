class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] let=s.split(" ");
        if (pattern.length() != let.length) {
            return false;
        }
        HashMap<Character,String> fre=new HashMap<>();
        int ind=0;
        for(char i:pattern.toCharArray())
        {
            if(fre.containsKey(i) )
            {
                if(!fre.get(i).equals(let[ind]))
                    return false;
            }
            else
            {
                if(fre.containsValue(let[ind])) {
                    return false;
                }
                fre.put(i,let[ind]);
            }
            ind++;
        }
        return true;
    }
}