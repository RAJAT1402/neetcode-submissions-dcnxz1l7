class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;

        while(j < s.length()){
            char ch = s.charAt(j);

            if(map.containsKey(ch) && map.get(ch) >= i){
                i = map.get(ch) + 1;
            }

            int cans = j - i + 1;
            ans = Math.max(cans, ans);

            map.put(ch, j);

            j++;
        }

        return ans;
    }
}
