import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable{ //이름, 학번, 국영수점수, 평균
    String name;
    int sno;
    int kor;
    int eng;
    int math;
    double avg;

    Student(int sno){
        this.sno = sno;
    }

    Student(String name, int sno, int kor, int eng, int math){
        this.name = name;
        this.sno = sno;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        avg = (kor+eng+math)/3.0;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student student;
        if(obj instanceof Student){ //obj를 Student 형으로 형변환이 가능한지를 물어보는 연산자 (객체 instanceof 클래스)
            student = (Student)obj;
            return student.sno == sno; }
        else
            return false;
    }

    @Override
    public String toString() {
        return "학생 : "+name+", 평균 : "+avg;
    }

    @Override
    public int compareTo(Object o) {
        Student student;
        if(!(o instanceof Student))
            return 0;

        student = (Student) o;

        if(student.avg > avg)
            return -1;
        else if(student.avg == avg)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) { //1.입력(평균X) 2.수정 3.삭제 4.조회 5.종료
        Set<Student> studentSet = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        while(a){
            switch (scanner.nextInt()){
                case 1:
                    System.out.print("이름을 입력하시오 : ");
                    String name = scanner.next();
                    System.out.print("학번을 입력하시오 : ");
                    int sno = scanner.nextInt();
                    System.out.print("국어 점수 : ");
                    int kor = scanner.nextInt();
                    System.out.print("영어 점수 : ");
                    int eng = scanner.nextInt();
                    System.out.print("수학 점수 : ");
                    int math = scanner.nextInt();

                    studentSet.add(new Student(name, sno, kor, eng, math));
                    break;

                case 2: //학번을 기준으로 이름 수정
                    System.out.print("수정할 학번 입력 : ");
                    sno = scanner.nextInt();
                    Student tmp = new Student(sno);
                    if(studentSet.contains(tmp)){
                        System.out.print("수정할 이름 : ");
                        name = scanner.next();
                        for(Student s : studentSet){
                            if(s.equals(tmp)){
                                s.setName(name);
                                break;
                            }
                        }
                    }
                    else
                        System.out.println("정보를 찾을 수 없음");

                    break;

                case 3: //학번을 기준으로 학생 삭제
                    System.out.print("삭제할 학번 입력 : ");
                    sno = scanner.nextInt();
                    tmp = new Student(sno);
                    if(studentSet.contains(tmp)){
                        studentSet.remove(tmp);
                    }
                    else
                        System.out.print("정보를 찾을 수 없음");
                    break;

                case 4: //전체 조회 (평균 순으로)
                    for(Student s : studentSet)
                        System.out.println(s);
                    break;

                case 5: //종료
                    a = false;
                    break;


            }
        }
    }
}