import java.util.Scanner;
public class Ex5_7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오 : ");

        int money = scanner.nextInt();
        System.out.println("money="+money);
        int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
        for(int i=0;i<coinUnit.length;i++) {
            int coinNum = 0;

            coinNum = money/coinUnit[i];

            if (coinNum>coin[i])
                coinNum = coin[i]; //coin[i]는 최대 5이기 떄문에 Num이 클 경우 무조건 coin[i]의 값
                money -= coinUnit[i] * coinNum;
                coin[i] -= coinNum;

            System.out.println(coinUnit[i]+"원: "+coinNum);
        }
        if(money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0); // 프로그램을 종료한다.
        }
        System.out.println("=남은 동전의 개수 =");
        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i]+"원:"+coin[i]);
        }
    }
}
