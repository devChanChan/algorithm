public class SumLists {
  public static void main(String[] args) {

    // Sum List Forward
    Node n1 = new Node("6", new Node("1", new Node("7")));
    Node n2 = new Node("2", new Node("9", new Node("5")));
    n1.printAll();
    n2.printAll();
    Node sumForward = sumListForward(n1, n2);
    sumForward.printAll();

    // Sum List Backward
    Node n3 = new Node("7", new Node("1", new Node("6")));
    Node n4 = new Node("5", new Node("9", new Node("2")));
    n3.printAll();
    n4.printAll();
    Node sumBackward = sumListBackward(n3, n4);
    sumBackward.printAll();
  }

  public static Node sumListForward(Node n1, Node n2) {
    String str1 = n1.data;
    String str2 = n2.data;

    while (n1.next != null) {
      str1 += n1.next.data;
      n1 = n1.next;
    }

    while (n2.next != null) {
      str2 += n2.next.data;
      n2 = n2.next;
    }

    Integer intResult = Integer.valueOf(str1) + Integer.valueOf(str2);
    String strResult = String.valueOf(intResult);
    Node nodeResult = new Node(String.valueOf(strResult.charAt(0)));

    for (int i = 1; i < strResult.length(); i++) {
      nodeResult.append(String.valueOf(strResult.charAt(i)));
    }
    return nodeResult;
  }

  public static Node sumListBackward(Node n1, Node n2) {
    String str1 = n1.data;
    String str2 = n2.data;

    while (n1.next != null) {
      str1 = n1.next.data + str1;
      n1 = n1.next;
    }

    while (n2.next != null) {
      str2 = n2.next.data + str2;
      n2 = n2.next;
    }

    Integer intResult = Integer.valueOf(str1) + Integer.valueOf(str2);
    String strResult = String.valueOf(intResult);
    strResult = new StringBuilder(strResult).reverse().toString();

    Node nodeResult = new Node(String.valueOf(strResult.charAt(0)));

    for (int i = 1; i < strResult.length(); i++) {
      nodeResult.append(String.valueOf(strResult.charAt(i)));
    }
    return nodeResult;
  }
  
  public static class Node {
    String data;
    Node next;

    public Node(String d) {
      this.data = d;
      this.next = null;
    }

    public Node(String d, Node n) {
      this.data = d;
      this.next = n;
    }

    public void append(String d) {
      Node n = this;
      Node end = new Node(d);
      while (n.next != null) {
        n = n.next;
      }
      n.next = end;
    }

    public void delete(String d) {
      Node n = this;
      while (n.next != null) {
        if (n.next.data == d) {
          n.next = n.next.next;
        } else {
          n = n.next;
        }
      }
    }

    public void printAll() {
      Node n = this;
      while (n.next != null) {
        System.out.print(n.data + " -> ");
        n = n.next;
      }
      System.out.println(n.data);
    }
  }
}
