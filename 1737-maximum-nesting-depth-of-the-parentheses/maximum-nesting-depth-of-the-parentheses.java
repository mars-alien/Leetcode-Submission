class Solution {
    public int maxDepth(String s) {
        Deque<Character> st = new ArrayDeque<>();
          int max=0;

        for(char c: s.toCharArray()){
            if(c == '(') {
                st.push(c);
                max= Math.max(max, st.size());
            } else if(c ==')') {
                st.pop();
            }
        }  
        return max;
    }
}