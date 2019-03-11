package test_21;

import java.util.List;


public class test_21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args){
        ListNode l1 ,l2;

       // System.out.println(mergeTwoLists(l1,l2));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;  //当l1为空的时候，将L2的剩余部分返回。
        if(l2 == null) return l1;   // 同上道理

        ListNode res;
        if(l1.val < l2.val){
            // 当大小比较出现结果时，小的Listnode给到result，
            // result.next指向下一个比较的结果，
            // 当其中一个为空的时候，我们首先会让result.next指向返回值（一个或多个），
            // （接上）然后result的值会拿到，return result
            // 重复来了，result.next(此处的result是上面result的父结点，是空仓result.next 的爷爷）继续拿值。
            res = l1;
            res.next = mergeTwoLists(l1.next,l2);
        }else{
            res = l2;
            res.next= mergeTwoLists(l1,l2.next);
        }
        return res;

    }
}

