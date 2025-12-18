package javaprograms;

public class Merge2SortedLists {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		Node list1 = new Node(1);
		list1.next = new Node(3);
		list1.next.next = new Node(5);

		Node list2 = new Node(2);
		list2.next = new Node(4);
		list2.next.next = new Node(6);

		Node dummy = new Node(-1);
		Node temp = dummy;

		Node l1 = list1;
		Node l2 = list2;

		while (l1 != null && l2 != null) {
			if (l1.data <= l2.data) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}

		if (l1 != null) {
			temp.next = l1;
		} else {
			temp.next = l2;
		}

		Node curr = dummy.next;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("null");

	}
}
