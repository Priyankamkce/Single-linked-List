public class SLLInsertAtEnd {
        Node head;
        SLLInsertAtEnd(){
            this.head=null; //indicating an empty linked list
        }
        
        void insertAtEnd(int data){
            Node nb=new Node(data);
            if(head==null){
                head=nb;
                return;
            }
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = nb;
        }
        void display(){
            if(head==null){
                System.out.println("List is empty");
            }else{
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" -->");
                    temp=temp.next;
                }
                System.out.println("null");
            }
        }
        public static void main(String[] args) {
            SLLInsertAtEnd list = new SLLInsertAtEnd();
            Node n=new Node(10);
            list.head=n;
            Node n1=new Node(20);
            n.next=n1;
            Node n2=new Node(30);
            n1.next=n2;
            Node n3=new Node(40);
            n2.next=n3;
            Node n4=new Node(50);
            n3.next=n4;
            list.display();
            list.insertAtEnd(57);
            list.display();
        }   
    }
    
