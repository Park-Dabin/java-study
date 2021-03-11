import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable { //이름, 학번, 국, 영, 수, 평균
    String name;
    int sno;
    int kor;
    int eng;
    int math;
    double average;

    public Student (String name, int sno, int kor, int eng, int math) {
        this.name = name;
        this.sno = sno;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        average = (double)kor+eng+math/3;
    }

    public Student (int sno) {this.sno = sno; }
    public void setName (String name) { this.name = name; }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student student = (Student)obj;
            return student.sno == sno;}
        else
            return false;
        }

    @Override
    public String toString() {
        return "학생 : " + name + "학번 : " + sno + "평균 : " + average;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student student = (Student)o;
            if (student.average > average)
                return -1;
            else if (student.average == average)
                return 0;
            else
                return 1;
        }
        else
            return 0; //error 처리 안하므로 아무 값을 반환한다.
    }

    public static void main(String[] args) {
        Set<Student> studentset = new TreeSet<>();
        Scanner s = new Scanner(System.in);

        boolean a = true;
        while (a){
            int num = s.nextInt();
            switch (num) {  //1. 추가 2. 삭제 3. 수정 4. 조회 5. 종료
                case 1:
                    System.out.print("학생의 이름을 입력하세요 : ");
                    String name = s.next();
                    System.out.print("학생의 학번을 입력하세요 : ");
                    int sno = s.nextInt();
                    System.out.print("학생의 국어 점수를 입력하세요 : ");
                    int kor = s.nextInt();
                    System.out.print("학생의 영어 점수를 입력하세요 : ");
                    int eng = s.nextInt();
                    System.out.print("학생의 수학 점수를 입력하세요 : ");
                    int math = s.nextInt();

                    Student tmp = new Student(name, sno,  kor, eng, math);
                    studentset.add(tmp);
                    break;

                case 2:
                    System.out.print("삭제할 학생의 학번 : ");
                    sno = s.nextInt();
                    tmp = new Student(sno);
                    if(studentset.contains(tmp))
                        studentset.remove(tmp);
                    else
                        System.out.print("삭제 불가능");
                    break;

                case 3:
                    System.out.print("이름을 수정할 학생의 학번 : ");
                    sno = s.nextInt();
                    tmp = new Student(sno);
                    if(studentset.contains(tmp)){
                        System.out.print("수정할 이름 : ");
                        name = s.next();
                        for(Student t : studentset) {
                            if (t.equals(tmp)) {
                                t.setName(name);
                                break;
                            }
                        }

                    }
                    else
                        System.out.print("수정 불가능");
                    break;

                case 4:
                    for(Student t : studentset){
                        System.out.print(t);
                    }
                    break;

                case 5:
                    a = false;
                    break;
            }
        }
    }
}

