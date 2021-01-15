public class Ex4_9 {
    public static void main (String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i=0; i < str.length(); i++){
            sum += str.charAt(i) - '0'; //문자열에서 '0'을 뺴면 charAt(i)의 값
        }
        System.out.println("sum = "+sum);
    }
}
