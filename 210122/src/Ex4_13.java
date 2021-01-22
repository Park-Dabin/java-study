public class Ex4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        for(int i=0;i<value.length();i++) {
            ch = value.charAt(i); //하나하나의 값을 ch에 저장

            if ('a' < ch && ch < 'z' || 'A' < ch && ch < 'Z') { //0~9까지를 !로 부정하면 더 간단
                isNumber = false;
                break; //return이 아니라 break로 종료
            }
        }
            if(isNumber)
                System.out.println(value+"는 숫자입니다.");
            else
                System.out.println(value+"는 숫자가 아닙니다.");

        }
    }

