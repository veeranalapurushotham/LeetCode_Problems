class Solution {
    public String removeDuplicateLetters(String s) {

        HashMap<Character, Integer> last = new HashMap<>();

        // Store last occurrence
        for (int i = 0; i < s.length(); i++) {
            last.put(s.charAt(i), i);
        }

        Stack<Character> res = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);

            // Already present
            if (res.contains(curr)) {
                continue;
            }

            // Remove larger characters if they occur again later
            while (!res.isEmpty()
                    && res.peek() > curr
                    && last.get(res.peek()) > i) {

                res.pop();
            }

            res.push(curr);
        }

        StringBuilder k = new StringBuilder();

        while (!res.isEmpty()) {
            k.append(res.pop());
        }

        return k.reverse().toString();
    }
}