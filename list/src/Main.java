public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.init(4);

        queue.push(1);
        queue.push(2);
        queue.push(3);

        for(int i=0; i<3; i++)
            System.out.println(queue.pop());
    }
}
