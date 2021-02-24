import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class number {
    int num;
    String name;
    /*
    * name, num 수정하는 것 메소드로 바꿀 것
    * 전체조회 toString 오버라이드해서 출력해주는 거로 바꾸기
    * 수정, 삭제할 때 찾는 거 equals 오버라이드해서 list.contain()으로 찾는 것으로 바꾸기
    * */

    number(int num, String name){
        this.num = num;
        this.name = name;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<number> list = new ArrayList<>();
        boolean a = true;
        while (a) {
            switch (scanner.nextInt()) {
                case 1: //1.입력 2.수정 3.삭제 4.전체조회 5.종료
                    System.out.print("이름 : ");
                    String name = scanner.next();
                    System.out.print("번호 : ");
                    int num = scanner.nextInt();

                    number tmp = new number(num,name);
                    list.add(tmp);

                    break;

                case 2:
                    System.out.print("수정할 이름 : ");
                    name = scanner.next();

                    for(number t : list){
                        if(t.name.equals(name)){
                            System.out.print("변경할 번호 : ");
                            num = scanner.nextInt();
                            t.num = num;


                            break;
                        }
                        else {
                            System.out.println("존재하지 않습니다.");
                            break;
                        }

                    }
                    break;

                case 3:
                    System.out.print("삭제할 이름 : ");
                    name = scanner.next();

                    for(number t : list){
                        if(t.name.equals(name)){
                            list.remove(t);
                            break;
                        }
                        else {
                            System.out.println("존재하지 않습니다.");
                            break;
                        }
                    }
                    break;

                case 4:
                    for(number t : list)
                        System.out.println(t.name+" : "+t.num);
                    break;

                case 5:
                    a = false;
                    break;
            }
        }
    }
}
