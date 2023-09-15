package DataStructure.Queue;

import java.util.NoSuchElementException;

public class Queue {
    private Node front;
    private Node rear;

    Queue(int size){
       this.rear=null;
        this.front=null;

    }
     int length;


    public boolean isempty(){
        return length==0;
    }


    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
           }
    }
    public void enqueue(int data){
        Node temp= new Node(data);
        if(isempty()){
            front=temp;
        }
        else{
            rear.next=temp;
        }
        rear=temp;
        length++;
    }
    public int dequeue(){
        if(isempty()){
            throw new NoSuchElementException();

        }
int result= front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }



    public void Print(){
        if(isempty()){
            return ;
        }
        Node cur=front;
        while(cur!=null){
            System.out.print(cur.data+" ==> ");
            cur=cur.next;
        }
        System.out.println("null");

    }
    public int rear(){
        if(isempty()){
            throw new NoSuchElementException();

        }
        return rear.data;
    }
    public int front(){
        if(isempty()){
            throw new NoSuchElementException();

        }
        return front.data;
    }

    public static void main(String[] args) {
    Queue q= new Queue(10);
    q.enqueue(5);
    q.enqueue(4);
    q.enqueue(3);
     q.enqueue(2);
     q.enqueue(1);
        System.out.println("front or first is= "+q.front());

        q.Print();
        System.out.println("Last or rear is= "+ q.rear());
        q.dequeue();
        q.Print();
        System.out.println("front or first is= "+q.front());
        System.out.println("Last or rear is= "+ q.rear());



    }
}
