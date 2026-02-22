class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sGas=0,sCost=0;
        for(int i=0;i<gas.length;i++){
            sGas+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            sCost+=cost[i];
        }
        if(sGas<sCost) return -1;
        int si=0,fuel=0;
        for(int i=0;i<gas.length;i++){
            fuel+=gas[i]-cost[i];
            if(fuel<0){
                si=i+1;
                fuel=0;
            }
        }
        return si;
    }
}