

public class SLLDeletionAtEnd {
    Node head;

    SLLDeletionAtEnd() {
        this.head = null; // Indicating an empty linked list
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }

        if (head.next == null) {
            System.out.println("Deleting node with data: " + head.data);
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Deleting node with data: " + temp.next.data);
        temp.next = null;
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
        SLLDeletionAtEnd list = new SLLDeletionAtEnd();

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
        list.deleteAtEnd();
        list.display();
        list.deleteAtEnd();
        list.display();
        list.deleteAtEnd();
        list.display();
    }
}

