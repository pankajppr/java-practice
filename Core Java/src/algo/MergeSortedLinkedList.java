package algo;

import java.util.StringJoiner;

class ListNode {

  ListNode(int data) {
    this.data = data;
    this.next = null;
  }

  int data;
  ListNode next;
}


public class MergeSortedLinkedList {

  public static void main(String args[]) {

    // data creation

    ListNode head1 = new ListNode(1);
    head1.next = new ListNode(3);
    head1.next.next = new ListNode(8);

    ListNode head2 = new ListNode(5);
    head2.next = new ListNode(11);


    // This will be the head of merged linked list head
    ListNode mergedListHead = mergeList(head1, head2);

    // Print data of merged linkedList

    ListNode curr = mergedListHead;

    StringJoiner joindata = new StringJoiner(",", "[", "]");

    while (curr != null) {
      joindata.add(String.valueOf(curr.data));
      curr = curr.next;
    }

    System.out.print(joindata);
  }


  static ListNode mergeList(ListNode head1, ListNode head2) {

    ListNode lowPtr, highPtr = null;

    if (head1.data < head2.data) {
      lowPtr = head1;
      highPtr = head2;
    } else {
      lowPtr = head2;
      highPtr = head1;
    }

    ListNode mergedListHead = lowPtr;

    while (lowPtr.next != null) {
      if (lowPtr.next.data <= highPtr.data) {
        lowPtr = lowPtr.next;
      } else {
        ListNode temp = lowPtr.next;
        lowPtr.next = highPtr;
        highPtr = temp;
      }
    }

    if (highPtr != null) {
      lowPtr.next = highPtr;
    }


    return mergedListHead;
  }

}
