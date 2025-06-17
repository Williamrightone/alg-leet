package com.william.leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public static void main(String[] args){
        // Example usage
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    /**
     * My solution
     * l1 = [2,4,3], l2 = [5,6,4]
     * [7,0,8]
     * 342 + 465 = 807
     * 取出來反轉放到 List, 相加後再反轉放回 ListNode
     * 但是會有 Integer.parseInt() 的限制，當數字過大時會出現 NumberFormatException
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List<Integer> nodeList1 = new ArrayList<>();
        List<Integer> nodeList2 = new ArrayList<>();

        int result = 0;

        while(l1!=null){

            nodeList1.add(l1.val);
            l1 = l1.next;

        }

        while(l2!=null){
            nodeList2.add(l2.val);
            l2 = l2.next;
        }

        StringBuffer sb1 = new StringBuffer();

        for(Integer i : nodeList1){
            sb1.append(i);
        }

        StringBuffer sb2 = new StringBuffer();

        for(Integer i : nodeList2){
            sb2.append(i);
        }

        int num1 = Integer.parseInt(sb1.reverse().toString());
        int num2 = Integer.parseInt(sb2.reverse().toString());

        result = num1 + num2;

        List<Integer> resultList = new ArrayList<>();

        String resultStr = String.valueOf(result);

        for(int i = resultStr.length() - 1; i >= 0; i--){
            resultList.add(Integer.parseInt(String.valueOf(resultStr.charAt(i))));
        }

        Collections.reverse(resultList);

        ListNode resultNode = new ListNode();

        for(Integer i : resultList){

            if(resultNode.val == 0 && resultNode.next == null){
                resultNode.val = i;
            } else {
                ListNode newNode = new ListNode(i);
                newNode.next = resultNode;
                resultNode = newNode;
            }

        }

        return resultNode;
    }


    /**
     * LeetCode solution
     * 主要認知是操作 ListNode.next
     * 清楚了就不用包來包去
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10; // 計算進位

            current.next = new ListNode(sum % 10);
            current = current.next;

            // 還有則加入, 沒有就停住
            if (l1 != null) {l1 = l1.next;}
            if (l2 != null) {l2 = l2.next;}

        }

        return dummy.next;
    }

    static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


}
