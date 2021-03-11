public class Stack{
    int elements[];
    int length;

    boolean push(int element){
        if(elements.length>length){
            elements[length] = element;
            length++;
            return true;
        }
        else
            return false;
    }

    int pop(){
        if(length == 0){
            return 0;
        }
        else {
            length--;
            return elements[length];
        }
    }
    void init(int length){
        this.length = 0;
        elements = new int[length];
    }

}
