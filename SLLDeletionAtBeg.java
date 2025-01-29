

public class SLLDeletionAtBeg {
    Node head;

    SLLDeletionAtBeg() {
        this.head = null; // Indicating an empty linked list
    }

    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }

        System.out.println("Deleting node with data: " + head.data);
        head = head.next;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SLLDeletionAtBeg list = new SLLDeletionAtBeg();

        Node n = new Node(10);
        list.head = n;
        Node n1 = new Node(20);
        n.next = n1;
        Node n2 = new Node(30);
        n1.next = n2;
        Node n3 = new Node(40);
        n2.next = n3;
        Node n4 = new Node(50);
        n3.next = n4;

        list.display();
        list.deleteAtBeginning();
        list.display();
        list.deleteAtBeginning();
        list.display();
    }
}
