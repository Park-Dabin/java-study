import java.util.Scanner;

public class Car {
    String carNum;
    int carFront;
    char carMid;
    int carLast;

    public Car(String carNum, int carFront, char carMid, int carLast) {
        this.carNum = carNum;
        this.carFront = carFront;
        this.carMid = carMid;
        this.carLast = carLast;
    }

    public int getFrontCnt(char[] carNum) { //앞자리 숫자 세는 함
        for (int i = 0; i < 3; i++) {
            if (!('0' <= carNum[i] && carNum[i] <= '9')) {
                if (i < 2)
                    return -1;
                else
                    return i;
            }
        }
        return 3;
    }



    public int getCarFront(char[] carNum) {
        int cnt = getFrontCnt(carNum);//2 아니면 3
        String result = "";

        for (int i = 0; i < cnt; i++) {
            if (i == 0 && carNum[i] == '0') {
                System.out.println("잘못된 입력");
                return 0;
            } else if ('가' <= carNum[i] && '힣' >= carNum[i]) {
                System.out.println("잘못된 입력");
                return 0;
            }
            result += carNum[i];
        }

        return Integer.parseInt(result); //int형 변환
    }

    public int getCarLast(char[] carNum){
        int result;
        int index = carNum.length-1;
        char[] carLast = new char[];

        for(int i=0;i<4;i++){
            if(!('0'<=carNum[index] && carNum[index]<='9')){
                return 0;
            }
            carLast[3-i] = carNum[index--];
        }

        result = Integer.parseInt(carLast.toString());
        if (result<100)
            return 0;
        else
            return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("차량 번호를 입력하세요 : ");
        String carNum = s.next();


    }
}

