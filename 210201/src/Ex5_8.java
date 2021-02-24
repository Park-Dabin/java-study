public class Ex5_8 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {
            counter[answer[i]- 1]++; //if, if else 문으로 길게 적어도 실행은 되지만,
                                    //자세히 보면 규칙이 있기 때문에 한줄로 작성 가능
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);
            for (int j = 0; j < counter[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}