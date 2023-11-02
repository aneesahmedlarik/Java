package DataStructure;

public class listLinked {
    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }}

        public void InsertNode(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printlist(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" --> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void InsetLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

        }

    public Node deleteFirst(){
        if(head==null){
            return null;
        }
       Node temp=head;
        head=head.next;
        temp.next=null;

        return temp;
    }
    public Node deleteLast(){
        if(head==null || head.next==null){
            return head;
        }
        Node current= head;
        Node previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }


    public static void main(String[] args) {
        listLinked l1 = new listLinked();
        l1.InsertNode(45);
        l1.InsertNode(54);
        l1.InsertNode(2);
        l1.InsertNode(4);
        l1.InsertNode(5);
        l1.printlist();
        l1.deleteFirst();
        l1.printlist();
        l1.deleteLast();
        l1.printlist();
    }

}

