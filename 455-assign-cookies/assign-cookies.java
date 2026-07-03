class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int m=g.length;
        int l=s.length;
        while(i<m && j<l)
        {
            if(g[i]<=s[j])
            {
                i++;
            }
            j++;
        }
        return i;
    }
}