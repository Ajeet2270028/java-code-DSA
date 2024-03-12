//import java.util.*;

public class Link_list {
  Node head;
  private int size;

  Link_list() {
    this.size = 0;
  }

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
      size++;
    }

  }

  // add first element
  public void addFistElement(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // add last element
  public void addLastElement(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node currentNode = head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
  }

  // delete first element
  public void deleteFistElement() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    head = head.next;
  }

  // Delete Last Element
  public void deleteLastElement() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
      return;
    }
    Node SecondlastElement = head;
    Node lastElement = head.next;
    while (lastElement.next != null) {
      lastElement = lastElement.next;
      SecondlastElement = SecondlastElement.next;
    }
    SecondlastElement.next = null;
  }

  public int getSize() {
    return size;
  }

  // reverse LinkList
  public void reverseIterate() {
    if (head == null || head.next == null) {
      return;
    }

    Node preNode = head;
    Node currentNode = head.next;
    while (currentNode != null) {
      Node nextNode = currentNode.next;
      currentNode.next = preNode;

      // update
      preNode = currentNode;
      currentNode = nextNode;
    }
    head.next = null;
    head = preNode;
  }

  // recursive linklist

  public Node reverseRecursive(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node newHead = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
  }

  // print
  public void printList() {
    if (head == null) {
      System.out.println("list is Empty");
      return;
    }
    Node currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.data + "->");
      currentNode = currentNode.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    Link_list list = new Link_list();
    list.addFistElement(3);
    list.addFistElement(4);
    list.addFistElement(5);
    // list.printList();

    list.addLastElement(2);
    list.addLastElement(1);
    list.printList();

    // list.deleteFistElement();
    // list.printList();

    // list.deleteLastElement();
    // list.printList();

    // System.out.println(list.getSize());
    // list.reverseIterate();

    list.head = list.reverseRecursive(list.head);
    list.printList();

  }
}
