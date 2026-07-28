import java.util.*;

class Solution {
    public String smallestPalindrome(String s) {
        // Use TreeMap so keys are automatically sorted 'a' -> 'z'
        Map<Character, Integer> fre = new TreeMap<>(); 
        for (char i : s.toCharArray()) {
            fre.put(i, fre.getOrDefault(i, 0) + 1); 
        } 
        
        int i = 0; 
        int j = s.length() - 1; 
        char[] pos = new char[s.length()]; 

        for (Map.Entry<Character, Integer> ent : fre.entrySet()) {
            char key = ent.getKey();
            int count = ent.getValue();

            // 1. Process ALL available pairs for this character
            while (count >= 2) {
                pos[i++] = key;
                pos[j--] = key;
                count -= 2;
            }

            // 2. If 1 character remains, place it right in the middle
            if (count == 1) {
                pos[pos.length / 2] = key;
            }
        } 

        // Build the result string
        StringBuilder res = new StringBuilder();
        for (char l : pos) {
            res.append(l);
        } 
        return res.toString(); 
    } 
}