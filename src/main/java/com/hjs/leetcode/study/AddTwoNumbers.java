package com.hjs.leetcode.study;


import java.util.ArrayList;
import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode l1= new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2= new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //感觉得递归啊
        List<Integer> num1 = new ArrayList<>();
        setIntVal(l1,num1);
        List<Integer> num2 = new ArrayList<>();
        setIntVal(l2,num2);
        int val1 = getVal(num1);
        int val2 = getVal(num2);
        int val = val1 + val2;



        return null;
    }

    private void setIntVal(ListNode ln, List<Integer> allNum){
        if(ln != null){
            allNum.add(ln.val);
            ln = ln.next;
            setIntVal(ln,allNum);
        }
    }


    private int getVal(List<Integer> allNum){
        int val = 0;
        int j = 0;
        for (int i = allNum.size()-1; i >=0 ; i--) {
            val += allNum.get(i) * j;
            j ++ ;
        }
        return val;
    }

    private ListNode getListNode(int val){



    }




    public static class ListNode{

        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }

    }

}
