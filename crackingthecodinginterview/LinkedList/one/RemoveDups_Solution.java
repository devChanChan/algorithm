package LinkedList.one;

import java.util.HashSet;

public class RemoveDups_Solution {
  public static void main(String[] args) {

  }

  static class Node {
    Node next;
    int data;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  void deleteDups(Node n) {
    HashSet<Integer> set = new HashSet<Integer>();
    Node previousNode = null;

    while(n != null) {
      if (set.contains(n.data)) {
        previousNode.next = n.next;
      } else {
        set.add(n.data);
        previousNode = n;
      }
      n = n.next;
    }

  }
}