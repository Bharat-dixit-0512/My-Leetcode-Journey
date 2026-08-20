class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,Set<Integer>> map=new HashMap<>();
        for(int r[]:reservedSeats){
            map.computeIfAbsent(r[0],k->new HashSet<>()).add(r[1]);
        }
        int ans=(n-map.size())*2;
        for(int row:map.keySet()){
            Set<Integer> seat=map.get(row);
            boolean left=!seat.contains(2) && !seat.contains(3) && !seat.contains(4) && !seat.contains(5);
            boolean middle=!seat.contains(4) && !seat.contains(5) && !seat.contains(6) && !seat.contains(7);
            boolean right=!seat.contains(6) && !seat.contains(7) && !seat.contains(8) && !seat.contains(9);

            if(left && right)ans+=2;
            else if(left|| right|| middle)ans+=1;
        }
        return ans;
    }
}