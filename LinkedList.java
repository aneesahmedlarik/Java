package DataStructure;
public class LinkedList {
Node head;
   public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }



//method to delete the value
    public Node deleteFirst(){
       if(head==null){
           return null;
       }
       Node temp=head;
       head=head.next;
       temp.next=null;

    return temp;
            }


            //method to tell the size
    public void size(){
       int count=0;
       Node current= head;
       while(current!=null){
           count++;
           current=current.next;
       }
        System.out.println("length of node is "+count);
   }


   //method to print node
   public void printList(){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.data+" --> ");
            temp=temp.next;
       }
       System.out.println("null");
   }


   //method to insert at the first
    public void InsertFirst(int data){
       Node newNode= new Node(data);  // create new node at runtime
       newNode.next=head;
       head=newNode;
   }

   //method to insert in the last
   public void InsertLast(int data){
        Node newNode= new Node(data);  // create new node at runtime
        if(head==null){
            head=newNode;
        return;
        }
        Node tempNode= head;
        while(tempNode.next!=null){
            tempNode=tempNode.next;

        }
        tempNode.next=newNode;
    }

    //main method
public static  void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.InsertFirst(3);
        ll.InsertFirst(2);
        ll.InsertFirst(1);
        ll.printList();
        ll.InsertLast(0);
        ll.printList();
        ll.size();



    System.out.println("after deleting in the beginning");
        ll.deleteFirst();
        ll.printList();

        ll.size();
    }
}
