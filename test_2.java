package hello_world;


/***
 * 2. Add Two Numbers
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode(int x) { val = x; }
 *  * }
 */



public class test_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int up = 0;
        return addNumbers(l1, l2, up);
    }

    public ListNode addNumbers(ListNode l1, ListNode l2, int num){

        ListNode node;

        if(l1 == null && l2 == null) {
            if(num == 0){
                return null;
            }else{
                node = new ListNode(num);
                return node;
            }
        }else if(l1 == null && l2 != null){
            if(num == 0){
                return l2;
            }else{
                int sum = l2.val + num;
                num = sum/10;
                node = new ListNode(sum - (num*10));
                node.next = addNumbers(null,l2.next,num);
            }
        }else if( l1 != null && l2 == null){
            if(num == 0){
                return l1;
            }else{
                int sum = l1.val + num;
                num = sum /10;
                node = new ListNode(sum - (num*10));
                node.next = addNumbers(l1.next,null,num);
            }
        }else{
            int sum = l1.val + l2.val + num;
            num = sum/10;
            node = new ListNode(sum - (num*10));
            node.next = addNumbers(l1.next,l2.next,num);
        }

        return node;

    }

}
