class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb=new StringBuilder();
        while(head!=null){
            sb.append(head.val);
            head=head.next;
        }
        return palindrome(sb.toString());
    }
    private boolean palindrome(String str){
        int s=0,l=str.length()-1;
        while(s<=l){
            if(str.charAt(s)!=str.charAt(l)){
                return false;
            }
            s++;
            l--;
        }
        return true;
    }
}