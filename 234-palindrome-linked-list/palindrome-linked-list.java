class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder stb=new StringBuilder();
        while(head!=null){
            stb.append(head.val);
            head=head.next;
        }

        return checkPalindrome(stb.toString());
        
    }
    public boolean checkPalindrome(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}