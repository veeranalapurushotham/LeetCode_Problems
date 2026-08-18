class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        HashMap<Character,Character> m=new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
        for(char i:s.toCharArray())
        {
            if(stk.isEmpty())
            {
                stk.push(i);
                continue;
            }
            if(stk.peek()==m.get(i))
            {
                stk.pop();
            }
            else
            {
                stk.push(i);
            }
        }
        if(stk.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}