import java.util.Scanner;

class LinkedList {

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        // Type in 5 numbers separated by spaces
        Scanner sc = new Scanner(System.in);

        list.head = new ListNode(sc.nextInt());
        list.head.next = new ListNode(sc.nextInt());
        list.head.next.next = new ListNode(sc.nextInt());
        list.head.next.next.next = new ListNode(sc.nextInt());
        list.head.next.next.next.next = new ListNode(sc.nextInt());

        sc.close();

        System.out.println("Initial LinkedList: ");
        // Calling the print method
        list.print(head);
        // Calling the reverseSinglyLinkedList method
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed LinkedList: ");
        // Calling the print method
        list.print(head);
    }

    static ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int number) {
            data = number;
            next = null;
        }
    }

    // Reversing the LinkedList
    private ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    // Printing the LinkedList
    private void print(ListNode head)
    {
        while (head != null) {
            // Printing the node value on the screen
            System.out.print(head.data + " ");
            // Traversing the LinkedList
            head = head.next;
        }
    }
}
