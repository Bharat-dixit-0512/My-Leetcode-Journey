class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans=0;
        int curcapa=capacity;
        for(int i=0;i<plants.length;i++){
            if(curcapa>=plants[i]){
                ans++;
                curcapa-=plants[i];
            }
            else {
                ans+=2*i+1;
                curcapa=capacity-plants[i];
            }
        }
        return ans;
    }
}