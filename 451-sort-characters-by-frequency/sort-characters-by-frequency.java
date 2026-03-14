class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        Set<Character> used = new HashSet<>();

        for(int freq : list){
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue() == freq && !used.contains(entry.getKey())){
                    char a = entry.getKey();
                    used.add(a);
                    for(int j = 0; j < freq; j++){
                        sb.append(a);
                    }
                }
            }
        }
        return sb.toString();
    }
}