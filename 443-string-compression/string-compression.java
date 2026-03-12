import java.util.*;

class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < chars.length) {
            char current = chars[i];
            HashMap<Character, Integer> map = new HashMap<>();
            int count = 0;
            while (i < chars.length && chars[i] == current) {
                map.put(current, map.getOrDefault(current, 0) + 1);
                i++;
                count++;
            }
            sb.append(current);

            if (count > 1) {
                sb.append(count);
            }
        }
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
    }
}