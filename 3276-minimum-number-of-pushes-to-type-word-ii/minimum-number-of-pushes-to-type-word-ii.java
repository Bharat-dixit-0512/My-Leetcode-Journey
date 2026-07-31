class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);
        int res = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            res += freq[i] * (((25-i) / 8) + 1);
        }
        return res;
    }
}

// abcde
// a-1 b-1 c-1 d-1 e-1

// 1*(0+1)=1 res=1 idx=1;
// 1*(0+1)=1 res=2 idx=2;
// 1*(0+1)=1 res=3 idx=3;
