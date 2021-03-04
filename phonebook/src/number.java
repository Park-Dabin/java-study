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
    number(int num) { //오버로딩 한 거
        this.num = num;
    }

    number(String name) { //22
        this.name = name;
    }

    number(int num, String name) { //33
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ":" + num;
    }

    @Override
    public boolean equals(Object obj) {
        number a;

        if (!(obj instanceof number))
            return false;

        a = (number) obj;
        return name.equals(a.name);

    }

    public void setNum(int num) {
        this.num = num;
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

                    number tmp = new number(num, name);
                    list.add(tmp);

                    break;

                case 2:

                    System.out.print("수정할 이름 : ");
                    name = scanner.next();
                    tmp = new number(name);
                    if (list.contains(tmp)) {
                        System.out.println("수정할 번호");
                        num = scanner.nextInt();
                        list.remove(tmp);
                        tmp.setNum(num);
                        list.add(tmp);
                    } else
                        System.out.println("정보가 없습니다.");

                    break;

                case 3:
                    System.out.print("삭제할 이름 : ");
                    name = scanner.next();

                    tmp = new number(name);
                    if (list.contains(tmp))
                        list.remove(tmp);
                    else {
                        System.out.println("존재하지 않습니다.");
                    }

            break;

            case 4:

                for (number t : list)
                    System.out.println(t);
                break;

            case 5:
                a = false;
                break;
        }
    }
}
}
