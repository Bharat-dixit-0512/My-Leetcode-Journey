public class Solution {
    public bool IsAnagram(string s, string t) {
        int[] f1=new int[26];
        if(s.Length!=t.Length)return false;
        int[] f2=new int[26];
        foreach(char ch in s.ToCharArray()){
            f1[ch-'a']++;
        }
        foreach(char ch in t.ToCharArray()){
            f2[ch-'a']++;
        }
        return f1.SequenceEqual(f2);
    }
}