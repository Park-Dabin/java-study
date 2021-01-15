public class Ex4_15 {
    public static void main(String[] args) {
        int num = 12321;
        int tmp = num;

        int result = 0;

        while (tmp != 0) { //tmp = num
            result = result * 10 + tmp % 10; //tmp%10이 한자리 수이고 반복될 때마다 10씩 곱해져야 함
            tmp /= 10; //tmp가 10으로 나눠진 몫이 또 다시 tmp가 됨
        }
        if (num == result)
            System.out.println(num + "은 회문수 입니다.");
        else
            System.out.println(num + "은 회문수가 아닙니다.");
    }
}