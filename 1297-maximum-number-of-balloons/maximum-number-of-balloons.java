class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> fre=new HashMap<>();
        for(char i: text.toCharArray())
        {
            fre.put(i,fre.getOrDefault(i,0)+1);
        }
        String b="balon";
        int min=Integer.MAX_VALUE;
        int count=0;
        for(char i:b.toCharArray())
        {
            if(fre.containsKey(i))
            {
                
                int curr;
            if(i=='l' || i=='o')
               curr=fre.get(i)/2;
            else 
                curr=fre.get(i);
                if(min>curr)
                {
                    min=curr;
                }
            }
            else
            {
                return 0;
            }
        }
        
            return min;
    }
}