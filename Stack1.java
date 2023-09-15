package DataStructure.Stacks;

public class Stack1 {

    int size;
    int [] stack;
    int top;
    Stack1(){
        size=5;
        top=-1;
        stack = new int[size];


    }


    public boolean isEmpty() {
        return top==-1;
    }
    public boolean isfull() {
        return top==size-1;
    }

    public int push(int data){
        if (isfull()){
            System.out.println("stack is full.");
        }
    return  stack[++top]=data;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("stack is empty.");
        }
    return stack[top--];
    }
public int peek(){

        return stack[top];
}
    public static void main(String[] args) {


        Stack1 s = new Stack1();
        s.push(0);
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);

        System.out.println("peek element is--> "+s.peek());
        s.pop();
        System.out.println("after removing top element. ");
        System.out.println("peek element is--> "+s.peek());





    }

}
