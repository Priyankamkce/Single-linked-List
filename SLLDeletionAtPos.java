
public class SLLDeletionAtPos {
    Node head;

    SLLDeletionAtPos() {
        this.head = null; 
    }

    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }

        if (position <= 0) {
            System.out.println("Invalid position. Position should be greater than 0.");
            return;
        }

        if (position == 1) {
            System.out.println("Deleting node with data: " + head.data);
            head = head.next;
            return;
        }

        Node temp = head;
        int currentPosition = 1;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp.next == null) {
         
            System.out.println("Position is out of bounds. No nodes to delete.");
            return;
        }

        System.out.println("Deleting node with data: " + temp.next.data);
        temp.next = temp.next.next;
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
        SLLDeletionAtPos list = new SLLDeletionAtPos();

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
        list.deleteAtPosition(3);
        list.display();
        list.deleteAtPosition(1);
        list.display();
        list.deleteAtPosition(10);
        list.display();
    }
}
