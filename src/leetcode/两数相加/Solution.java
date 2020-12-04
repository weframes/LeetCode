package leetcode.两数相加;

/**
 * 题目描述： <br>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 <br>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。<br>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。<br>
 * 示例： <br>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)<br>
 * 输出：7 -> 0 -> 8<br>
 * 原因：342 + 465 = 807<br>
 * 
 * @author zhuxiaoliang
 * @date 2020年12月4日 下午3:59:49
 */
public class Solution {
	/**
	 * 解题思路：
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode rootNode = new ListNode(0);
		ListNode curNode = rootNode;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum > 9 ? 1 : 0;
			curNode.next = new ListNode(sum % 10);
			curNode = curNode.next;
		}
		if (carry > 0) {
			curNode.next = new ListNode(carry);
		}
		return rootNode.next;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}
}
