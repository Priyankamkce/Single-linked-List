import java.util.Scanner;

public class ReversedLinked {
    public static Node reverseLink(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nodes in the linked list: ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("The linked list is empty.");
            return;
        }
        System.out.println("Enter the data for node 1: ");
        int data=sc.nextInt();
        Node head=new Node(data);
        Node current=head;
        for(int i=2;i<=n;i++){
            System.out.print("Enter the data for node "+i+": ");
            data=sc.nextInt();
            current.next=new Node(data);
            current=current.next;
        }
        System.out.print("Linked List :");
        display(head);
        Node reverse=reverseLink(head);
        System.out.print("Reversed List :");
        display(reverse);

    }
}