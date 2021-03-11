import javax.swing.text.Element;

public class Queue {
    int length;
    int elements[];
    int front;
    int rear; //제일 먼저 들어온 값

    boolean isFull(){
        return (front+1) % elements.length == rear;
    }

    boolean isEmpty(){
        return front == rear;
    }

    void init(int length){
        this.length = 0;
        elements = new int[length];
        front = 0;
        rear = 0;
    }

    boolean push(int element){
        if(isFull())
            return false;
        else{
            elements[front] = element;
            length++;
            front = (front+1)%elements.length;
            return true;
        }
    }

    int pop(){
        if(isEmpty())
            return 0;
        else{
            int result = elements[rear];
            if (rear == elements.length-1)
                rear = 0;
            else
                rear++;
            length--;
            return result;
        }
    }
}