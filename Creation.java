public class Creation {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printSLL(head);
    }
    public static void printSLL(Node headNode){
          if(headNode== null) 
              return;
        System.out.print(headNode.data+"-->");
        printSLL(headNode.next);
    }
}
