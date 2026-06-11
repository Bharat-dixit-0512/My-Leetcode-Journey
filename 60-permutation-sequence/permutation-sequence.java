class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= n; i++) num.add(i);
        List<List<Integer>> ans = new ArrayList<>();
        fun(num, k, ans, new ArrayList<>());
        List<Integer> kthPermutation = ans.get(k - 1);
        StringBuilder sb = new StringBuilder();
        for (int val : kthPermutation) {
            sb.append(val);
        }
        return sb.toString();
    }
    void fun(List<Integer> list, int k, List<List<Integer>> ans, List<Integer> p) {
        if (list.size() == 0) {
            ans.add(new ArrayList<>(p));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            p.add(num);
            list.remove(i);
            fun(list, k, ans, p);
            p.remove(p.size() - 1);
            list.add(i, num);
        }
    }
}