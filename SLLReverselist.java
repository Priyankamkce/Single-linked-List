
public class SLLReverselist {
    Node head;

    SLLReverselist() {
        this.head = null; // Indicating an empty linked list
    }

    void reverse() {
        if (head == null) {
            System.out.println("List is empty. No nodes to reverse.");
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev one step forward
            current = next;      // Move current one step forward
        }

        head = prev; 
    
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SLLReverselist list = new SLLReverselist();

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

        System.out.println("Original list:");
        list.display();

        list.reverse();

        System.out.println("Reversed list:");
        list.display();
    }
}

