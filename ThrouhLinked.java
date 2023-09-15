package DataStructure.Stacks;

public class ThrouhLinked {
   Node head;
        public static class Node{
             int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }}
   public static class Stacks {
            private Node top;
            public Stacks(){
                this.top=null;
            }


        public  boolean empty() {
            return top==null;
        }
        public  void push(int data){
            Node node= new Node(data);
            node.next= top;
            top=node;
        }
        public int pop(){
            if(empty()){
                System.out.println("Stacks is empty");
            }
            int data=top.data;
            top=top.next;
            return data;

            }
            public  int peek(){
            if(empty()){
                System.out.println("stack is empty.");
            }
            return top.data;
            }
    }
    public static void main(String[] args) {
        Stacks st= new Stacks();
       st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("top element is "+ st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
                }

}
