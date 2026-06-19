class Solution {
    public List<String> commonChars(String[] words) {
        int [] cnt = new int[26];

        for(int i=0; i<26; i++){
            cnt[i] = Integer.MAX_VALUE;
        }

        for(String s : words){
            int [] currCnt = new int[26];

            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);

                currCnt[ch-'a']++;
            }

            for(int i=0; i<26; i++){
                cnt[i] = Math.min(cnt[i], currCnt[i]);
            }
        }

        List<String> ans = new ArrayList<>();

        for(int i=0; i<26; i++){
            for(int j=0; j<cnt[i]; j++){
                ans.add(String.valueOf((char)('a'+i)));
            }
        }

        return ans;
    }
}