public class List {
    int length;
    Node head;

    void init(){
        length = 0;
        head = new Node();
    }

    void insert(Node node){
        if(head.front != null){
        Node front = head.front;
        head.front = node;
        node.back = head;
        node.front = front;
        front.back = node;
        length++;}
        else {
            head.front = node;
            node.back = head;
            length++;
        }
    }
    boolean delete(int element){
        Node tmp = head;
        for(int i=0;i < length;i++){
            tmp = tmp.front;
            if(tmp.element==element){
                if(tmp.front==null){
                    tmp = null;
                    length--;
                    return true;
                }
                tmp.front.back = tmp.back;
                tmp.back.front = tmp.front;
                tmp = null;
                length--;
                return true;
            }
        }
        return false;
    }
    void print(){
        Node tmp = head;
        for(int i = 0; i<length; i++) {
            tmp = tmp.front;
            System.out.println(tmp.element);
        }
    }
}