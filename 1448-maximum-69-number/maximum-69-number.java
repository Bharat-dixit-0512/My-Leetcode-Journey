class Solution {
    public int maximum69Number (int num) {
        int x=num;
        HashMap<Integer,Integer> freq=new HashMap<>();

        while(x!=0){
            int rem=x%10;
            freq.put(rem,freq.getOrDefault(rem,0)+1);
            x/=10;
        }
        if(freq.size()==1 && freq.containsKey(9)){
            return num;
        }

        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '6'){
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}