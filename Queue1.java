package DataStructure.Queue;


public class Queue1 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;
    public Queue1(int size)
    {
        this.maxSize = size;
        this.queueArray = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }
    public void insert(int item)
    {
        if(isQueueFull())
        {
            System.out.println("Queue is full!");
            return;
        }
        if(rear == maxSize - 1)
        {
            rear = -1;
        }
        queueArray[++rear] = item;
        currentSize++;

    }
    public int delete()
    {

        if(isQueueEmpty())
        {
            throw new RuntimeException("Queue is empty");
        }
        int temp = queueArray[front++];
        if(front == maxSize)
        {
            front = 0;
        }
        currentSize--;
        return temp;
    }
    public int peek()
    {
        return queueArray[front];
    }

    public boolean isQueueFull()
    {
        return (maxSize == currentSize);
    }

    public boolean isQueueEmpty()
    {
        return (currentSize == 0);
    }
    public void print(){
            if(isQueueEmpty())
            {
                throw new RuntimeException("Queue is empty");
            }
        int ext= front;
           while (ext!= (rear+1)){
               System.out.print(queueArray[ext]+"  ==> ");
           ext++;
           }
            System.out.println("Null");
        }
    public static void main(String[] args)
    {
        Queue1 q1 = new Queue1(10);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        q1.insert(5);
        q1.print();
        System.out.println("peek is "+q1.peek());
        q1.delete();
q1.print();
        System.out.println("peek is "+q1.peek());
    }
}