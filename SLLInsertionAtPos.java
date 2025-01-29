
public class SLLInsertionAtPos {
    Node head;

    SLLInsertionAtPos() {
        this.head = null; // Indicating an empty linked list
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position <= 0) {
            System.out.println("Invalid position. Position should be greater than 0.");
            return;
        }

        if (position == 1) {

            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int currentPosition = 1;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            System.out.println("Position is out of bounds. Inserting at the end.");
            return;
        }

        // Link the new node to the next node
        newNode.next = temp.next;

        // Link the previous node to the new node
        temp.next = newNode;
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
        SLLInsertionAtPos list = new SLLInsertionAtPos();

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
        
        // Inserting 25 at position 3
        list.insertAtPosition(25, 3);
        list.display();
        
        // Inserting 5 at position 1
        list.insertAtPosition(5, 1);
        list.display();
        
        // Inserting 60 at position 7 (end)
        list.insertAtPosition(60, 7);
        list.display();
    }
}
