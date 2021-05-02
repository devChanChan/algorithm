
public class DeleteMiddleNode {
  public static void main(String[] args) {
    Node head = new Node("a");
    head.append("b");
    head.append("c");
    head.append("d");
    head.append("e");
    head.append("f");
    head.retrieve();

    head.delete("c");
    head.retrieve();
  }

  public static class Node {
    String data;
    Node next;

    Node(String d) {
      this.data = d;
      this.next = null;
    }
    Node(String d, Node n) {
      this.data = d;
      this.next = n;
    }

    void append(String d) {
      Node end = new Node(d);
      Node n = this;
      while(n.next != null) {
        n = n.next;
      }
      n.next = end;
    }

    void delete(String d) {
      Node n = this;
      while (n.next != null) {
        if (n.next.data.equals(d)) {
          n.next = n.next.next;
        } else {
          n = n.next; // Why isn't the original header is overriden by this phrase? 
        }
      }
    }

    void retrieve() {
      Node n = this;
      while(n.next != null) {
        System.out.print(n.data + " -> ");
        n = n.next;
      }
      System.out.println(n.data);
    }
  }
}
